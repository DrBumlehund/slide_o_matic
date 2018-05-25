/**
 * generated by Xtext 2.13.0
 */
package dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.impl;

import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Image;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.ShowImage;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SlideOMaticPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Show Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.impl.ShowImageImpl#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShowImageImpl extends ContentImpl implements ShowImage
{
  /**
   * The cached value of the '{@link #getImage() <em>Image</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImage()
   * @generated
   * @ordered
   */
  protected Image image;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ShowImageImpl()
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
    return SlideOMaticPackage.Literals.SHOW_IMAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Image getImage()
  {
    if (image != null && image.eIsProxy())
    {
      InternalEObject oldImage = (InternalEObject)image;
      image = (Image)eResolveProxy(oldImage);
      if (image != oldImage)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SlideOMaticPackage.SHOW_IMAGE__IMAGE, oldImage, image));
      }
    }
    return image;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Image basicGetImage()
  {
    return image;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImage(Image newImage)
  {
    Image oldImage = image;
    image = newImage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlideOMaticPackage.SHOW_IMAGE__IMAGE, oldImage, image));
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
      case SlideOMaticPackage.SHOW_IMAGE__IMAGE:
        if (resolve) return getImage();
        return basicGetImage();
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
      case SlideOMaticPackage.SHOW_IMAGE__IMAGE:
        setImage((Image)newValue);
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
      case SlideOMaticPackage.SHOW_IMAGE__IMAGE:
        setImage((Image)null);
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
      case SlideOMaticPackage.SHOW_IMAGE__IMAGE:
        return image != null;
    }
    return super.eIsSet(featureID);
  }

} //ShowImageImpl
