/**
 * generated by Xtext 2.13.0
 */
package dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.impl;

import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Content;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SlideOMaticPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.impl.ContentImpl#getClick <em>Click</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentImpl extends MinimalEObjectImpl.Container implements Content
{
  /**
   * The default value of the '{@link #getClick() <em>Click</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClick()
   * @generated
   * @ordered
   */
  protected static final String CLICK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClick() <em>Click</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClick()
   * @generated
   * @ordered
   */
  protected String click = CLICK_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContentImpl()
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
    return SlideOMaticPackage.Literals.CONTENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClick()
  {
    return click;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClick(String newClick)
  {
    String oldClick = click;
    click = newClick;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlideOMaticPackage.CONTENT__CLICK, oldClick, click));
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
      case SlideOMaticPackage.CONTENT__CLICK:
        return getClick();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SlideOMaticPackage.CONTENT__CLICK:
        setClick((String)newValue);
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
      case SlideOMaticPackage.CONTENT__CLICK:
        setClick(CLICK_EDEFAULT);
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
      case SlideOMaticPackage.CONTENT__CLICK:
        return CLICK_EDEFAULT == null ? click != null : !CLICK_EDEFAULT.equals(click);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (click: ");
    result.append(click);
    result.append(')');
    return result.toString();
  }

} //ContentImpl
