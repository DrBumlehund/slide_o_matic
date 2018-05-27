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
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Slide
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Animation
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Text
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.TextType
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.URL
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Date
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.CompileDate

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class SlideOMaticValidator extends AbstractSlideOMaticValidator {

	public static val UNBLOCKABLE_CONTENT = 'unblockableContent'
	public static val FILE_NOT_FOUND = 'fileNotFound'
	public static val LINE_NUMBER_TOO_HIGH = 'lineNumberTooHigh'
	public static val SLIDE_NAME_IS_EMPTY = 'slideNameIsEnpty'
	public static val EQUAL_LOCATIONS = 'locationsAreEqual'
	
	@Check
	def checkUnblockableContent(Block block) {
		for (Content content : block.content) {
			if (content instanceof Code) {
				error('Unable to put Code in a block', SlideOMaticPackage.Literals.BLOCK__CONTENT, UNBLOCKABLE_CONTENT)
			}
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
				// TODO: Implement validation for line numbers to be within range.	
			}
		}
	}
	
	/*
	 * Check that manually written date is not empty
	 */
	@Check
	def checkDate(Date d){
		if (!(d instanceof CompileDate)){
			if (d.date.isEmpty()){
				warning('Date is empty', SlideOMaticPackage.Literals.DATE__DATE);
			}
		}
	}
	
	/*
	 * Check that a slide title is not empty
	 */
	@Check 
	def checkSlideTitleIsNotEmpty(Slide s){
		if (s.name.isEmpty){
			warning('Slide name is empty', SlideOMaticPackage.Literals.SLIDE__NAME, SLIDE_NAME_IS_EMPTY)
		}
	}
	
	/*
	 * Checks if url contains 'www'
	 * Checks if url contains min. 2x'.'
	 */
	@Check
	def checkText(Text txt){
		val types = txt.types;
		val t = txt.text; 
		
		for (TextType tt : types){
			if (tt instanceof URL){
				if (!t.contains('www')){
					warning('Url might be invalid. Check protocol', SlideOMaticPackage.Literals.TEXT__TEXT);
				}
				//Count number of dots 
				val count = t.length() - t.replace(".", "").length();
				if (count < 2){
					warning('Url might be invalid. Check number of dots', SlideOMaticPackage.Literals.TEXT__TEXT);
				}
			}
		}
	}
	
	/*
	 * Check that locations to, from, or via are not the same  
	 */
	@Check 
	def checkAnimationLocations(Animation a){
		val from = a.fromLocation; 
		val final = a.finalLocation; 
		val via = a.viaLocation;
		
		if (from.equals(final) || from.equals(via)){
			warning('One or more locations are the same', SlideOMaticPackage.Literals.ANIMATION__FINAL_LOCATION, EQUAL_LOCATIONS)
		}
		else if (final.equals(via)){
			warning('One or more locations are the same', SlideOMaticPackage.Literals.ANIMATION__FINAL_LOCATION, EQUAL_LOCATIONS)
		}
	}
	
	/* 
	 * Warn that original image alignment will be ignored
	 * */
	@Check 
	def checkAnimationSourceAlignment(Animation a){
		val img = a.target; 
		if (img.alignment !== null){
			warning('Original image alignment will be ignored', SlideOMaticPackage.Literals.ANIMATION__TARGET)
		}
	}
	
	/*
	 * Warn about no image alignment 
	 */
	 @Check 
	 def checkImageAlignment(Image i){
	 	if (i.alignment === null){
	 		warning('No alignment specified. Default will be center', SlideOMaticPackage.Literals.IMAGE__ALIGNMENT)
	 	}
	 }
	
	/*
	 * Check that image source cotains '.' for extension 
	 * Check if image source can be found
	 */ 
	@Check
	def checkImageSource(Image img) {
		val f = new File(img.src)
		if (!f.exists) {
			warning('Unable to find image source', SlideOMaticPackage.Literals.IMAGE__SRC, FILE_NOT_FOUND)
		}
		if (!img.src.contains('.')){
			warning('Image has no extension', SlideOMaticPackage.Literals.IMAGE__SRC)
		}
	}
	
}
