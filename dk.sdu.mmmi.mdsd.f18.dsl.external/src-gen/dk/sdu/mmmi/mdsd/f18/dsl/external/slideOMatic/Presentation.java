/**
 * generated by Xtext 2.12.0
 */
package dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Presentation#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Presentation#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Presentation#getTheme <em>Theme</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Presentation#getAuthors <em>Authors</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Presentation#getInstitute <em>Institute</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Presentation#getDate <em>Date</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Presentation#getSlides <em>Slides</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SlideOMaticPackage#getPresentation()
 * @model
 * @generated
 */
public interface Presentation extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SlideOMaticPackage#getPresentation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Presentation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Subtitle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subtitle</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subtitle</em>' attribute.
   * @see #setSubtitle(String)
   * @see dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SlideOMaticPackage#getPresentation_Subtitle()
   * @model
   * @generated
   */
  String getSubtitle();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Presentation#getSubtitle <em>Subtitle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subtitle</em>' attribute.
   * @see #getSubtitle()
   * @generated
   */
  void setSubtitle(String value);

  /**
   * Returns the value of the '<em><b>Theme</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Theme</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Theme</em>' containment reference.
   * @see #setTheme(Theme)
   * @see dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SlideOMaticPackage#getPresentation_Theme()
   * @model containment="true"
   * @generated
   */
  Theme getTheme();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Presentation#getTheme <em>Theme</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Theme</em>' containment reference.
   * @see #getTheme()
   * @generated
   */
  void setTheme(Theme value);

  /**
   * Returns the value of the '<em><b>Authors</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Authors</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Authors</em>' containment reference.
   * @see #setAuthors(Authors)
   * @see dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SlideOMaticPackage#getPresentation_Authors()
   * @model containment="true"
   * @generated
   */
  Authors getAuthors();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Presentation#getAuthors <em>Authors</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Authors</em>' containment reference.
   * @see #getAuthors()
   * @generated
   */
  void setAuthors(Authors value);

  /**
   * Returns the value of the '<em><b>Institute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Institute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Institute</em>' containment reference.
   * @see #setInstitute(Institute)
   * @see dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SlideOMaticPackage#getPresentation_Institute()
   * @model containment="true"
   * @generated
   */
  Institute getInstitute();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Presentation#getInstitute <em>Institute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Institute</em>' containment reference.
   * @see #getInstitute()
   * @generated
   */
  void setInstitute(Institute value);

  /**
   * Returns the value of the '<em><b>Date</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date</em>' containment reference.
   * @see #setDate(Date)
   * @see dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SlideOMaticPackage#getPresentation_Date()
   * @model containment="true"
   * @generated
   */
  Date getDate();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Presentation#getDate <em>Date</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date</em>' containment reference.
   * @see #getDate()
   * @generated
   */
  void setDate(Date value);

  /**
   * Returns the value of the '<em><b>Slides</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Slide}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Slides</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Slides</em>' containment reference list.
   * @see dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SlideOMaticPackage#getPresentation_Slides()
   * @model containment="true"
   * @generated
   */
  EList<Slide> getSlides();

} // Presentation
