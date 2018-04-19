/**
 * generated by Xtext 2.12.0
 */
package dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.impl;

import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.NumberedList;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.NumberedListItem;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SlideOMaticPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numbered List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.impl.NumberedListImpl#getListItems <em>List Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumberedListImpl extends ListImpl implements NumberedList
{
  /**
   * The cached value of the '{@link #getListItems() <em>List Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListItems()
   * @generated
   * @ordered
   */
  protected EList<NumberedListItem> listItems;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumberedListImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SlideOMaticPackage.Literals.NUMBERED_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NumberedListItem> getListItems()
  {
    if (listItems == null)
    {
      listItems = new EObjectContainmentEList<NumberedListItem>(NumberedListItem.class, this, SlideOMaticPackage.NUMBERED_LIST__LIST_ITEMS);
    }
    return listItems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SlideOMaticPackage.NUMBERED_LIST__LIST_ITEMS:
        return ((InternalEList<?>)getListItems()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SlideOMaticPackage.NUMBERED_LIST__LIST_ITEMS:
        return getListItems();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SlideOMaticPackage.NUMBERED_LIST__LIST_ITEMS:
        getListItems().clear();
        getListItems().addAll((Collection<? extends NumberedListItem>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SlideOMaticPackage.NUMBERED_LIST__LIST_ITEMS:
        getListItems().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SlideOMaticPackage.NUMBERED_LIST__LIST_ITEMS:
        return listItems != null && !listItems.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NumberedListImpl
