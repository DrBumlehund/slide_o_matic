/**
 * generated by Xtext 2.12.0
 */
package dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.ListItem#getItem <em>Item</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.ListItem#getNestedList <em>Nested List</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.ListItem#getClick <em>Click</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SlideOMaticPackage#getListItem()
 * @model
 * @generated
 */
public interface ListItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Item</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Item</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item</em>' attribute.
   * @see #setItem(String)
   * @see dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SlideOMaticPackage#getListItem_Item()
   * @model
   * @generated
   */
  String getItem();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.ListItem#getItem <em>Item</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Item</em>' attribute.
   * @see #getItem()
   * @generated
   */
  void setItem(String value);

  /**
   * Returns the value of the '<em><b>Nested List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nested List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nested List</em>' containment reference.
   * @see #setNestedList(List)
   * @see dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SlideOMaticPackage#getListItem_NestedList()
   * @model containment="true"
   * @generated
   */
  List getNestedList();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.ListItem#getNestedList <em>Nested List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nested List</em>' containment reference.
   * @see #getNestedList()
   * @generated
   */
  void setNestedList(List value);

  /**
   * Returns the value of the '<em><b>Click</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Click</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Click</em>' attribute.
   * @see #setClick(String)
   * @see dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SlideOMaticPackage#getListItem_Click()
   * @model
   * @generated
   */
  String getClick();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.ListItem#getClick <em>Click</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Click</em>' attribute.
   * @see #getClick()
   * @generated
   */
  void setClick(String value);

} // ListItem
