/**
 * generated by Xtext 2.13.0
 */
package dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Authors#getNames <em>Names</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SlideOMaticPackage#getAuthors()
 * @model
 * @generated
 */
public interface Authors extends EObject
{
  /**
   * Returns the value of the '<em><b>Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Names</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Names</em>' attribute list.
   * @see dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SlideOMaticPackage#getAuthors_Names()
   * @model unique="false"
   * @generated
   */
  EList<String> getNames();

} // Authors
