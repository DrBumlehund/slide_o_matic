/*
 * generated by Xtext 2.13.0
 */
package dk.sdu.mmmi.mdsd.f18.dsl.external.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractSlideOMaticValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SlideOMaticPackage.eINSTANCE);
		return result;
	}
	
}
