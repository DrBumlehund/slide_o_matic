/*
 * generated by Xtext 2.12.0
 */
package dk.sdu.mmmi.mdsd.f18.dsl.external.validation

import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Content
import org.eclipse.xtext.validation.Check
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Block
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Code
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SlideOMaticPackage
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Image
import java.io.File
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.FileCode
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.LineSequence

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class SlideOMaticValidator extends AbstractSlideOMaticValidator {

	public static val UNBLOCKABLE_CONTENT = 'unblockableContent'
	public static val FILE_NOT_FOUND = 'fileNotFound'
	public static val LINE_NUMBER_TOO_HIGH = 'lineNumberTooHigh'

	@Check
	def checkUnblockableContent(Block block) {
		for (Content content : block.content) {
			if (content instanceof Code) {
				error('Unable to put Code in a block', SlideOMaticPackage.Literals.BLOCK__CONTENT, UNBLOCKABLE_CONTENT)
			}
		}
	}

	@Check
	def checkSource(Image img) {
		val f = new File(img.src)
		if (!f.exists) {
			warning('Unable to find image source', SlideOMaticPackage.Literals.IMAGE__SRC, FILE_NOT_FOUND)
		}
	}

	@Check
	def checkSource(FileCode code) {
		val f = new File(code.src)
		if (!f.exists) {
			warning('Unable to find Code source', SlideOMaticPackage.Literals.FILE_CODE__SRC, FILE_NOT_FOUND)
		}
	}

	@Check
	def checkLineSequence(FileCode fc) {
		if (fc.src !== null && fc.lines !== null) {
			val f = new File(fc.src)
			if (f.exists){
				System.out.println("the FileCode has lines")
			}
		}
	}

}
