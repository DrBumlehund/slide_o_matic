/**
 * generated by Xtext 2.12.0
 */
package dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numbered List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.NumberedList#getListItems <em>List Items</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SlideOMaticPackage#getNumberedList()
 * @model
 * @generated
 */
public interface NumberedList extends List
{
  /**
   * Returns the value of the '<em><b>List Items</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.NumberedListItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Items</em>' containment reference list.
   * @see dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SlideOMaticPackage#getNumberedList_ListItems()
   * @model containment="true"
   * @generated
   */
  EList<NumberedListItem> getListItems();

} // NumberedList
