/*
 * generated by Xtext 2.12.0
 */
package dk.sdu.mmmi.mdsd.f18.dsl.external.generator

import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Block
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Code
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Content
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.ExactSize
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Floats
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Image
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.List
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.NumberedList
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Presentation
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.ProportionalSize
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Sec
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Section
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Size
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Slide
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SubSec
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SubSubSec
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.TOC
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Table
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Text
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.UnNumberedList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SlideOMaticGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		resource.allContents.filter(Presentation).next.doGenerateTexFile(fsa)
	}

	def void doGenerateTexFile(Presentation p, IFileSystemAccess2 fsa){
		System.out.println(p.generateTexCode)
		fsa.generateFile(p.name+".tex", p.generateTexCode)
	}
	
	def CharSequence generateTexCode(Presentation p) {'''
	\documentclass{beamer}
	\usepackage[utf8]{inputenc}
	\usepackage[absolute,overlay]{textpos}
	\usepackage{graphicx}
	\usepackage[english]{babel}
	\usepackage{lastpage}
	\usepackage{minted}
	\setminted{autogobble, fontsize=\footnotesize}
	\usepackage{tabu}
	
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
	\date{�p.date.date�}
	�ENDIF�
	
	\begin{document}
	
	\begin{frame}
		\titlepage
	\end{frame}
	
	�FOR s: p.slides.filter(Slide)�
	�s.generateSlideCode�
	�ENDFOR�
	
	\end{document}
	
	'''		
	}

	def CharSequence generateSlideCode(Slide s) {'''
	�IF s.sec !== null�
	�s.sec.generateSectionsCode(s.name)�
	�ENDIF�
	\begin{frame}�IF s.hasCode�[fragile]�ENDIF��IF s.name !== null�{�s.name�}�ENDIF�
	�FOR c: s.contents�
	�c.generateContentsCode�
	�ENDFOR�
	\end{frame}
	'''
	}
	
	def CharSequence generateSectionsCode(Section s, String name){
		switch s{
			Sec: '''\section{'''
			SubSec: '''\subsection{'''
			SubSubSec: '''\subsubsection{'''	
		} + name + "}"
	}
	
	def CharSequence generateContentsCode(Content c) {
		switch c {
			TOC: '''
			\tableofcontents'''
			Text: '''
			{�c.text�}�IF c.click !== null�\pause�ENDIF�'''
			Block:'''
			\begin{block}�IF c.name !== null�{�c.name�}�ENDIF�
			�c.content.generateContentsCode�
			\end{block}�IF c.click !== null�\pause�ENDIF�'''
			List:
			c.generateListsCode
			Floats:
			c.generateFloatCode
			Code:'''
			\begin{minted}{�c.lang�}
			�c.code�
			\end{minted}
			'''	
		}
	}
	
	def dispatch CharSequence generateListsCode(NumberedList nl){'''
	\begin{enumerate}
	�FOR i: nl.items�
	\item �i.item��IF i.nestedList !== null��i.nestedList.generateListsCode��ENDIF� �IF i.click !== null�\pause�ENDIF�
	�ENDFOR�
	\end{enumerate}
	'''
	}
	def dispatch CharSequence generateListsCode(UnNumberedList nl){'''
	\begin{itemize}
	�FOR i: nl.items�
	\item �i.item��IF i.nestedList !== null��i.nestedList.generateListsCode��ENDIF� �IF i.click !== null�\pause�ENDIF�
	�ENDFOR�
	\end{itemize}
	'''
	}
	
	
	def dispatch CharSequence generateFloatCode(Image i){'''
	\includegraphics[�i.size.getString�]{�i.src�} �IF i.click !== null�\pause�ENDIF�
	'''
	}
	
	/**
	 * Function to convert the size of floats into the correct LaTeX string.
	 */
	def CharSequence getString(Size s){
		switch s{
			ProportionalSize: '''�IF s.way === "width"�width=�(s.scale/100)�\textwidth�ELSE�height=�(s.scale/100)�\textheight�ENDIF�'''
			ExactSize: '''�s.size��s.unit�'''
		}
	}
	
	def dispatch CharSequence generateFloatCode(Table t){'''
	\begin{tabular}{�FOR c: t.rows�|c�ENDFOR�|}
	\hline
	�FOR row: t.rows�
	�FOR v: row.values SEPARATOR " & "��v��ENDFOR� \\ \hline
	�ENDFOR�
	\end{tabular}
	'''
	}
	
	def dispatch CharSequence generateFloatCode(Code c){
	}
	
	/**
	 * Function to check if the slide contains code
	 * used to add the "[fragile]" to the slide, in order to support minted.
	 */
	def boolean hasCode(Slide s){
		for (c : s.contents){
			if(c instanceof Code){
				return true
			}
		}
		return false
	}
}
