/**
 * generated by Xtext 2.12.0
 */
package dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.impl;

import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SlideOMaticPackage;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Theme;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Theme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.impl.ThemeImpl#getTheme <em>Theme</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.impl.ThemeImpl#getThemeColor <em>Theme Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThemeImpl extends SettingImpl implements Theme
{
  /**
   * The default value of the '{@link #getTheme() <em>Theme</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTheme()
   * @generated
   * @ordered
   */
  protected static final String THEME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTheme() <em>Theme</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTheme()
   * @generated
   * @ordered
   */
  protected String theme = THEME_EDEFAULT;

  /**
   * The default value of the '{@link #getThemeColor() <em>Theme Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThemeColor()
   * @generated
   * @ordered
   */
  protected static final String THEME_COLOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getThemeColor() <em>Theme Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThemeColor()
   * @generated
   * @ordered
   */
  protected String themeColor = THEME_COLOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ThemeImpl()
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
    return SlideOMaticPackage.Literals.THEME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTheme()
  {
    return theme;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTheme(String newTheme)
  {
    String oldTheme = theme;
    theme = newTheme;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlideOMaticPackage.THEME__THEME, oldTheme, theme));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getThemeColor()
  {
    return themeColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThemeColor(String newThemeColor)
  {
    String oldThemeColor = themeColor;
    themeColor = newThemeColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlideOMaticPackage.THEME__THEME_COLOR, oldThemeColor, themeColor));
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
      case SlideOMaticPackage.THEME__THEME:
        return getTheme();
      case SlideOMaticPackage.THEME__THEME_COLOR:
        return getThemeColor();
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
      case SlideOMaticPackage.THEME__THEME:
        setTheme((String)newValue);
        return;
      case SlideOMaticPackage.THEME__THEME_COLOR:
        setThemeColor((String)newValue);
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
      case SlideOMaticPackage.THEME__THEME:
        setTheme(THEME_EDEFAULT);
        return;
      case SlideOMaticPackage.THEME__THEME_COLOR:
        setThemeColor(THEME_COLOR_EDEFAULT);
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
      case SlideOMaticPackage.THEME__THEME:
        return THEME_EDEFAULT == null ? theme != null : !THEME_EDEFAULT.equals(theme);
      case SlideOMaticPackage.THEME__THEME_COLOR:
        return THEME_COLOR_EDEFAULT == null ? themeColor != null : !THEME_COLOR_EDEFAULT.equals(themeColor);
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
    result.append(" (theme: ");
    result.append(theme);
    result.append(", themeColor: ");
    result.append(themeColor);
    result.append(')');
    return result.toString();
  }

} //ThemeImpl
