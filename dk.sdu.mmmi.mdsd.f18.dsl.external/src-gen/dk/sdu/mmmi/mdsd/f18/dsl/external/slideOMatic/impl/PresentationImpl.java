/**
 * generated by Xtext 2.12.0
 */
package dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.impl;

import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Authors;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Date;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Institute;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Presentation;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Slide;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SlideOMaticPackage;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Theme;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.impl.PresentationImpl#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.impl.PresentationImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.impl.PresentationImpl#getTheme <em>Theme</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.impl.PresentationImpl#getAuthors <em>Authors</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.impl.PresentationImpl#getInstitute <em>Institute</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.impl.PresentationImpl#getDate <em>Date</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.impl.PresentationImpl#getSlides <em>Slides</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PresentationImpl extends MinimalEObjectImpl.Container implements Presentation
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getSubtitle() <em>Subtitle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubtitle()
   * @generated
   * @ordered
   */
  protected static final String SUBTITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSubtitle() <em>Subtitle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubtitle()
   * @generated
   * @ordered
   */
  protected String subtitle = SUBTITLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getTheme() <em>Theme</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTheme()
   * @generated
   * @ordered
   */
  protected Theme theme;

  /**
   * The cached value of the '{@link #getAuthors() <em>Authors</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthors()
   * @generated
   * @ordered
   */
  protected Authors authors;

  /**
   * The cached value of the '{@link #getInstitute() <em>Institute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstitute()
   * @generated
   * @ordered
   */
  protected Institute institute;

  /**
   * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected Date date;

  /**
   * The cached value of the '{@link #getSlides() <em>Slides</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSlides()
   * @generated
   * @ordered
   */
  protected EList<Slide> slides;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PresentationImpl()
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
    return SlideOMaticPackage.Literals.PRESENTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlideOMaticPackage.PRESENTATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSubtitle()
  {
    return subtitle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubtitle(String newSubtitle)
  {
    String oldSubtitle = subtitle;
    subtitle = newSubtitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlideOMaticPackage.PRESENTATION__SUBTITLE, oldSubtitle, subtitle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Theme getTheme()
  {
    return theme;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTheme(Theme newTheme, NotificationChain msgs)
  {
    Theme oldTheme = theme;
    theme = newTheme;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlideOMaticPackage.PRESENTATION__THEME, oldTheme, newTheme);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTheme(Theme newTheme)
  {
    if (newTheme != theme)
    {
      NotificationChain msgs = null;
      if (theme != null)
        msgs = ((InternalEObject)theme).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SlideOMaticPackage.PRESENTATION__THEME, null, msgs);
      if (newTheme != null)
        msgs = ((InternalEObject)newTheme).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SlideOMaticPackage.PRESENTATION__THEME, null, msgs);
      msgs = basicSetTheme(newTheme, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlideOMaticPackage.PRESENTATION__THEME, newTheme, newTheme));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Authors getAuthors()
  {
    return authors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAuthors(Authors newAuthors, NotificationChain msgs)
  {
    Authors oldAuthors = authors;
    authors = newAuthors;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlideOMaticPackage.PRESENTATION__AUTHORS, oldAuthors, newAuthors);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAuthors(Authors newAuthors)
  {
    if (newAuthors != authors)
    {
      NotificationChain msgs = null;
      if (authors != null)
        msgs = ((InternalEObject)authors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SlideOMaticPackage.PRESENTATION__AUTHORS, null, msgs);
      if (newAuthors != null)
        msgs = ((InternalEObject)newAuthors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SlideOMaticPackage.PRESENTATION__AUTHORS, null, msgs);
      msgs = basicSetAuthors(newAuthors, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlideOMaticPackage.PRESENTATION__AUTHORS, newAuthors, newAuthors));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Institute getInstitute()
  {
    return institute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInstitute(Institute newInstitute, NotificationChain msgs)
  {
    Institute oldInstitute = institute;
    institute = newInstitute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlideOMaticPackage.PRESENTATION__INSTITUTE, oldInstitute, newInstitute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstitute(Institute newInstitute)
  {
    if (newInstitute != institute)
    {
      NotificationChain msgs = null;
      if (institute != null)
        msgs = ((InternalEObject)institute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SlideOMaticPackage.PRESENTATION__INSTITUTE, null, msgs);
      if (newInstitute != null)
        msgs = ((InternalEObject)newInstitute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SlideOMaticPackage.PRESENTATION__INSTITUTE, null, msgs);
      msgs = basicSetInstitute(newInstitute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlideOMaticPackage.PRESENTATION__INSTITUTE, newInstitute, newInstitute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date getDate()
  {
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDate(Date newDate, NotificationChain msgs)
  {
    Date oldDate = date;
    date = newDate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlideOMaticPackage.PRESENTATION__DATE, oldDate, newDate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDate(Date newDate)
  {
    if (newDate != date)
    {
      NotificationChain msgs = null;
      if (date != null)
        msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SlideOMaticPackage.PRESENTATION__DATE, null, msgs);
      if (newDate != null)
        msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SlideOMaticPackage.PRESENTATION__DATE, null, msgs);
      msgs = basicSetDate(newDate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlideOMaticPackage.PRESENTATION__DATE, newDate, newDate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Slide> getSlides()
  {
    if (slides == null)
    {
      slides = new EObjectContainmentEList<Slide>(Slide.class, this, SlideOMaticPackage.PRESENTATION__SLIDES);
    }
    return slides;
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
      case SlideOMaticPackage.PRESENTATION__THEME:
        return basicSetTheme(null, msgs);
      case SlideOMaticPackage.PRESENTATION__AUTHORS:
        return basicSetAuthors(null, msgs);
      case SlideOMaticPackage.PRESENTATION__INSTITUTE:
        return basicSetInstitute(null, msgs);
      case SlideOMaticPackage.PRESENTATION__DATE:
        return basicSetDate(null, msgs);
      case SlideOMaticPackage.PRESENTATION__SLIDES:
        return ((InternalEList<?>)getSlides()).basicRemove(otherEnd, msgs);
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
      case SlideOMaticPackage.PRESENTATION__NAME:
        return getName();
      case SlideOMaticPackage.PRESENTATION__SUBTITLE:
        return getSubtitle();
      case SlideOMaticPackage.PRESENTATION__THEME:
        return getTheme();
      case SlideOMaticPackage.PRESENTATION__AUTHORS:
        return getAuthors();
      case SlideOMaticPackage.PRESENTATION__INSTITUTE:
        return getInstitute();
      case SlideOMaticPackage.PRESENTATION__DATE:
        return getDate();
      case SlideOMaticPackage.PRESENTATION__SLIDES:
        return getSlides();
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
      case SlideOMaticPackage.PRESENTATION__NAME:
        setName((String)newValue);
        return;
      case SlideOMaticPackage.PRESENTATION__SUBTITLE:
        setSubtitle((String)newValue);
        return;
      case SlideOMaticPackage.PRESENTATION__THEME:
        setTheme((Theme)newValue);
        return;
      case SlideOMaticPackage.PRESENTATION__AUTHORS:
        setAuthors((Authors)newValue);
        return;
      case SlideOMaticPackage.PRESENTATION__INSTITUTE:
        setInstitute((Institute)newValue);
        return;
      case SlideOMaticPackage.PRESENTATION__DATE:
        setDate((Date)newValue);
        return;
      case SlideOMaticPackage.PRESENTATION__SLIDES:
        getSlides().clear();
        getSlides().addAll((Collection<? extends Slide>)newValue);
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
      case SlideOMaticPackage.PRESENTATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SlideOMaticPackage.PRESENTATION__SUBTITLE:
        setSubtitle(SUBTITLE_EDEFAULT);
        return;
      case SlideOMaticPackage.PRESENTATION__THEME:
        setTheme((Theme)null);
        return;
      case SlideOMaticPackage.PRESENTATION__AUTHORS:
        setAuthors((Authors)null);
        return;
      case SlideOMaticPackage.PRESENTATION__INSTITUTE:
        setInstitute((Institute)null);
        return;
      case SlideOMaticPackage.PRESENTATION__DATE:
        setDate((Date)null);
        return;
      case SlideOMaticPackage.PRESENTATION__SLIDES:
        getSlides().clear();
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
      case SlideOMaticPackage.PRESENTATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SlideOMaticPackage.PRESENTATION__SUBTITLE:
        return SUBTITLE_EDEFAULT == null ? subtitle != null : !SUBTITLE_EDEFAULT.equals(subtitle);
      case SlideOMaticPackage.PRESENTATION__THEME:
        return theme != null;
      case SlideOMaticPackage.PRESENTATION__AUTHORS:
        return authors != null;
      case SlideOMaticPackage.PRESENTATION__INSTITUTE:
        return institute != null;
      case SlideOMaticPackage.PRESENTATION__DATE:
        return date != null;
      case SlideOMaticPackage.PRESENTATION__SLIDES:
        return slides != null && !slides.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", subtitle: ");
    result.append(subtitle);
    result.append(')');
    return result.toString();
  }

} //PresentationImpl
