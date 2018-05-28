/*
 * generated by Xtext 2.12.0
 */
package dk.sdu.mmmi.mdsd.f18.dsl.external.generator

import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Block
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Code
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.CompileDate
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Content
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.CurrentSecToC
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Div
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.ExactSize
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Expression
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Image
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Let
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.List
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.MathExp
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Minus
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Mult
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Num
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.NumberedList
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Plus
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Pow
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Presentation
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.ProportionalSize
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Sec
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Section
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Size
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Slide
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SubSec
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SubSubSec
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Table
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Text
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.ToC
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Var
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Width
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.InlineCode
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.FileCode
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.TextType
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Bold
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Italic
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Underline
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.FootNote
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.URL
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Animation
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.ShowImage

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SlideOMaticGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		resource.allContents.filter(Presentation).next.doGenerateTexFile(fsa)
	}

	/**
	 * Shitty workaround for danish letters in the generated source
	 */
	def String dkLetters(CharSequence cs) {
		val str = cs.toString().replace("�", "\\ae{}").replace("�", "\\o{}").replace("�", "\\aa{}").replace("�",
			"\\AE{}").replace("�", "\\O{}").replace("�", "\\AA{}")
		str
	}
	
	/**
	 * Function to generate the .tex file
	 * Could also be used for calling the system pdfLaTeX function, in order to generate a pdf file in stead 
	 */
	def void doGenerateTexFile(Presentation p, IFileSystemAccess2 fsa) {
		fsa.generateFile(p.name + "/" + p.name + ".tex", dkLetters(p.generateTexCode))
	}

	/**
	 * Creates the main .tex file string
	 */
	def CharSequence generateTexCode(Presentation p) {
		'''
			\documentclass{beamer}
			\usepackage[utf8]{inputenc}
			\usepackage[absolute,overlay]{textpos}
			\usepackage{graphicx}
			\usepackage[english]{babel}
			\usepackage{lastpage}
			\usepackage{minted}
			\setminted{autogobble, fontsize=\footnotesize, linenos}
			\usepackage{tabu}
			\usepackage{mathtools}
			\usepackage[export]{adjustbox}
			
			�IF p.theme !== null�
				\usetheme{�p.theme.theme�}
				�IF p.theme.themeColor !== null�
					\usecolortheme{�p.theme.themeColor�}
				�ENDIF�
			�ENDIF�
			
			\title{�p.name�}
			�IF p.subtitle !== null�
				\subtitle{�p.subtitle�}
			�ENDIF�
			�IF p.authors !== null�
				\author{�FOR a: p.authors.names.filter(String) SEPARATOR " \\and "��a��ENDFOR�}
			�ENDIF�
			�IF p.institute !== null�
				\institute{�p.institute.name�}
			�ENDIF�
			�IF p.date !== null�
				�IF !(p.date instanceof CompileDate)�
					\date{�p.date.date�}
				�ENDIF�
			�ELSE�
				\date{�" "�}
			�ENDIF�
			
			\begin{document}
			
			\begin{frame}
				\titlepage
			\end{frame}
			
			�FOR s : p.slides.filter(Slide)�
				�s.generateSlideCode�
			�ENDFOR�
			
			\end{document}
		'''
	}

	/**
	 * Creates creates the latex code for slides
	 * if the frame (slide) contains code, it needsd to have the 'fragile' attribute, thats why there is an if check.
	 */
	def CharSequence generateSlideCode(Slide s) {
		'''
			�IF s.sec !== null�
				�s.sec.generateSectionsCode(s.name)�
			�ENDIF�
			\begin{frame}�IF s.hasCode�[fragile]�ENDIF��IF s.name !== null�{�s.name�}�ENDIF�
			�FOR c : s.contents�
				�c.generateContents(s)�
			�ENDFOR�
			\end{frame}
		'''
	}
	
	
	/**
	 * used to generate sections
	 */
	def CharSequence generateSectionsCode(Section s, String name) {
		switch s {
			Sec: '''\section{'''
			SubSec: '''\subsection{'''
			SubSubSec: '''\subsubsection{'''
		} + name + "}"
	}

	/**
	 * generates content code, calls the dispatch methods, and appends a '\pause' if needed. 
	 */
	def CharSequence generateContents(Content c, Slide s) {
		c.generateContentsCode(s) + '''�IF c.click !== null�\pause�ENDIF�'''
	}
	
	/**
	 * dispatch method for creating Table of Contents code
	 */
	def dispatch CharSequence generateContentsCode(ToC t, Slide s){
		'''\tableofcontents�IF t instanceof CurrentSecToC�[sections=\value{section}]�ELSE�[hideallsubsections]�ENDIF�'''
	}
	
	/**
	 * dispatch method for creating text code
	 */
	def dispatch CharSequence generateContentsCode(Text t, Slide s) {
		'''�FOR tt: t.types��tt.generateTextTypeStartCode��ENDFOR��t.text.sanitize��FOR tt: t.types�}�ENDFOR�'''
	}
	
	/**
	 * Helper function for creating the texttype code
	 */
	def CharSequence generateTextTypeStartCode(TextType tt){
		'''\�IF tt instanceof Bold�textbf�ELSEIF tt instanceof Italic�textit�ELSEIF tt instanceof Underline�underline�ELSEIF tt instanceof FootNote�footnote�ELSEIF tt instanceof URL�url�ENDIF�{'''
	}
	
	/**
	 * Some common characters, which needs to be sanitized in latex, in strings...
	 */
	def sanitize(String str) {
		str.replaceAll("#", "\\#").replaceAll("&", "\\&").replaceAll("%", "\\%").replaceAll("_", "\\_")
	}
	
	/**
	 * dispatch function to create block code, recursive call to generateContents, for the contents of the block
	 */
	def dispatch CharSequence generateContentsCode(Block b, Slide s) {'''
		\begin{block}�IF b.name !== null�{�b.name�}�ENDIF�
		�FOR bc : b.content�
			�bc.generateContents(s)�
		�ENDFOR�
		\end{block}'''
	}
	
	/** 
	 * dispatch function to create lists code, either numbered or unnumbered lists.
	 */
	def dispatch CharSequence generateContentsCode(List l, Slide s) {'''
		\begin{�IF l instanceof NumberedList�enumerate�ELSE�itemize�ENDIF�}
		�FOR i : l.items�
			\item �i.item��IF i.nestedList !== null��i.nestedList.generateContentsCode(s)��ENDIF��IF i.click !== null�\pause�ENDIF�
		�ENDFOR�
		\end{�IF l instanceof NumberedList�enumerate�ELSE�itemize�ENDIF�}'''
	}
	
	/*
	 * Method for generating animation code 
	 */
	def dispatch CharSequence generateContentsCode(Animation a, Slide s){
		val from = a.fromLocation; 
		val final = a.finalLocation;
		val via = a.viaLocation;    
		val target = a.target; 
	
		'''
		\only<1> {�generateAnimationImageCode(target, from)�}
		�IF a.viaLocation !== null�
			\only<2> {�generateAnimationImageCode(target, via)�}
			\only<3> {�generateAnimationImageCode(target, final)�}
		�ELSE�
			\only<2> {�generateAnimationImageCode(target, final)�}
		�ENDIF�
		'''
	}
	
	def generateAnimationImageCode(Image i, String alignment){
		'''
		\includegraphics[�i.size.getString�
		�IF i.angle !== 0�, angle=�i.angle��ENDIF�
		, �alignment�]{�i.src�}
		'''
	}
	
	/**
	 * Enables you to present a showImage. 
	 * The showimage enables image reference use
	 */
	def dispatch CharSequence generateContentsCode(ShowImage i, Slide s){
		val img = i.image;
		generateContentsCode(img, s);
	} 
	
	/**
	 * Dispatch function to create image code,
	 */
	def dispatch CharSequence generateContentsCode(Image i, Slide s){
		val src = i.src.replace("\\", "/")
		'''
		\begin{figure}
			\includegraphics[�i.size.getString�
			�IF i.angle !== 0�, angle=�i.angle��ENDIF�,
			�IF i.alignment === null� center�ELSE� �i.alignment��ENDIF�]{�src�}
		\end{figure}
		'''
	}
	
	/**
	 * Function to convert the size of floats into the correct LaTeX string.
	 */
	def CharSequence getString(Size s) {
		'''�IF s.way instanceof Width�width=�ELSE�height=�ENDIF�''' + switch s {
			ProportionalSize: '''�IF s.way instanceof Width��(s.scale/100f)�\textwidth�ELSE��(s.scale/100f)�\textheight�ENDIF�'''
			ExactSize: '''�s.size��s.unit�'''
		}
	}

	/**
	 * dispatch function to create table code, it is only possible to create 
	 */
	def dispatch CharSequence generateContentsCode(Table t, Slide s){
		'''
		\begin{tabular}{�FOR i : t.rows�|c�ENDFOR�|}
		\hline
		�FOR row : t.rows�
		�FOR v: row.values SEPARATOR " & "��v��ENDFOR� \\ \hline
		�ENDFOR�
		\end{tabular}
		'''
	}
	
	/**
	 * dispatch function to create LaTeX code for codehighlighting, using minted.
	 * it 
	 */
	def dispatch CharSequence generateContentsCode(Code c, Slide s){
		switch c {
			InlineCode: '''
			\begin{minted}{�c.lang�}
			�c.code�
			\end{minted}'''
			FileCode: '''
				�IF c.lines.length > 0��/*Weird workaround*/�
					�var i =0�
					�FOR l: c.lines�
						�IF i++ > 0�
							\begin{frame}[fragile]{�s.name�}
						�ENDIF�
						�/* TODO: Implement function for getting exact lines from file.
						 * make sure to include blank lines as \n, because it would look great */�
						\begin{minted}{py}
						print('The code line-by-line feature is not supported')
						\end{minted}
						�IF i < c.lines.length�
							\end{frame}
						�ENDIF�
					�ENDFOR�
				�ELSE�
					\inputminted{�c.lang�}{�c.src�}
				�ENDIF�
			'''
		}
	}

	/**
	 * Function to check if the slide contains code
	 * used to add the "[fragile]" to the slide, in order to support minted.
	 */
	def boolean hasCode(Slide s) {
		for (c : s.contents) {
			if (c instanceof Code) {
				return true
			}
		}
		return false
	}

	/**
	 * dispatch function to create equations code
	 */
	def dispatch CharSequence generateContentsCode(MathExp m, Slide s){
		'''
		\begin{equation}
		�m.display� �IF m.eval !== null�=�m.compute��ENDIF�
		\end{equation}
		'''
	}
	
	def Map<String, Integer> bind(Map<String, Integer> env1, String name, int value) {
		val env2 = new HashMap<String, Integer>(env1)
		env2.put(name, value)
		env2
	}

	/**
	 * function for cumputing the overall equation
	 */
	def int compute(MathExp math) {
		math.exp.computeExp(new HashMap<String, Integer>)
	}

	/**
	 * function for computing the actual math
	 */
	def int computeExp(Expression exp, Map<String, Integer> env) {
		switch exp {
			Plus: exp.left.computeExp(env) + exp.right.computeExp(env)
			Minus: exp.left.computeExp(env) - exp.right.computeExp(env)
			Mult: exp.left.computeExp(env) * exp.right.computeExp(env)
			Div: exp.left.computeExp(env) / exp.right.computeExp(env)
			Num: exp.value
			Var: env.get(exp.id)
			Let: exp.body.computeExp(env.bind(exp.id, exp.binding.computeExp(env)))
			Pow: Math.pow(exp.left.computeExp(env), exp.right.computeExp(env)) as int
			default: throw new Error("Invalid expression")
		}
	}

	/**
	 * function to show math
	 */
	def String display(MathExp math) {
		math.exp.displayExp
	}

	/**
	 * function to generate math symbols in latex
	 */
	def String displayExp(Expression exp) {
		switch exp {
			Plus: '''�exp.left.displayExp�+�exp.right.displayExp�'''
			Minus: '''�exp.left.displayExp�-�exp.right.displayExp�'''
			Mult: '''�exp.left.displayExp�\cdot�exp.right.displayExp�'''
			Div: '''\frac{�exp.left.displayExp�}{�exp.right.displayExp�}'''
			Num: '''�Integer.toString(exp.value)�'''
			Var: '''�exp.id�'''
			Let: '''let �exp.id� = �exp.binding.displayExp� in �exp.body.displayExp� end'''
			Pow: '''�exp.left.displayExp�^{�exp.right.displayExp�}'''
			default:
				throw new Error("Invalid expression")
		}
	}

}
