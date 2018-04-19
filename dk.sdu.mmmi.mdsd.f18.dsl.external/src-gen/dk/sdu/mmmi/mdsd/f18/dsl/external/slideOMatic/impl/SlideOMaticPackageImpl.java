/**
 * generated by Xtext 2.12.0
 */
package dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.impl;

import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Animation;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.AnimationType;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Authors;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Block;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Content;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Date;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Image;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Institute;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Jump;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.List;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Move;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.NumberedList;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.NumberedListItem;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Paragraph;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Presentation;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Sec;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Section;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Size;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Slide;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SlideOMaticFactory;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SlideOMaticPackage;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SubSec;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SubSubSec;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Table;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.TableRow;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Text;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Theme;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.UnNumberedList;
import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.UnNumberedListItem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SlideOMaticPackageImpl extends EPackageImpl implements SlideOMaticPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass presentationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass themeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass authorsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instituteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slideEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberedListItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unNumberedListItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass floatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass imageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sizeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableRowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass animationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass animationTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass secEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subSecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subSubSecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tocEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paragraphEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberedListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unNumberedListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jumpEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SlideOMaticPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SlideOMaticPackageImpl()
  {
    super(eNS_URI, SlideOMaticFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SlideOMaticPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SlideOMaticPackage init()
  {
    if (isInited) return (SlideOMaticPackage)EPackage.Registry.INSTANCE.getEPackage(SlideOMaticPackage.eNS_URI);

    // Obtain or create and register package
    SlideOMaticPackageImpl theSlideOMaticPackage = (SlideOMaticPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SlideOMaticPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SlideOMaticPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSlideOMaticPackage.createPackageContents();

    // Initialize created meta-data
    theSlideOMaticPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSlideOMaticPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SlideOMaticPackage.eNS_URI, theSlideOMaticPackage);
    return theSlideOMaticPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPresentation()
  {
    return presentationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPresentation_Name()
  {
    return (EAttribute)presentationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPresentation_Theme()
  {
    return (EReference)presentationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPresentation_Authors()
  {
    return (EReference)presentationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPresentation_Institute()
  {
    return (EReference)presentationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPresentation_Date()
  {
    return (EReference)presentationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPresentation_Slides()
  {
    return (EReference)presentationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPresentation_Animations()
  {
    return (EReference)presentationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTheme()
  {
    return themeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTheme_Theme()
  {
    return (EAttribute)themeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTheme_ThemeColor()
  {
    return (EAttribute)themeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAuthors()
  {
    return authorsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAuthors_Names()
  {
    return (EAttribute)authorsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstitute()
  {
    return instituteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstitute_Name()
  {
    return (EAttribute)instituteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDate()
  {
    return dateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDate_Date()
  {
    return (EAttribute)dateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSlide()
  {
    return slideEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSlide_Name()
  {
    return (EAttribute)slideEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSlide_Contents()
  {
    return (EReference)slideEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSection()
  {
    return sectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContent()
  {
    return contentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getText()
  {
    return textEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getText_Text()
  {
    return (EAttribute)textEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getList()
  {
    return listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberedListItem()
  {
    return numberedListItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberedListItem_Item()
  {
    return (EAttribute)numberedListItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnNumberedListItem()
  {
    return unNumberedListItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnNumberedListItem_Item()
  {
    return (EAttribute)unNumberedListItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFloat()
  {
    return floatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFloat_Name()
  {
    return (EAttribute)floatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImage()
  {
    return imageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImage_Src()
  {
    return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImage_Alignment()
  {
    return (EAttribute)imageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImage_Size()
  {
    return (EReference)imageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSize()
  {
    return sizeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSize_Scale()
  {
    return (EAttribute)sizeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTable()
  {
    return tableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTable_Rows()
  {
    return (EReference)tableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableRow()
  {
    return tableRowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTableRow_Values()
  {
    return (EAttribute)tableRowEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnimation()
  {
    return animationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnimation_Target()
  {
    return (EReference)animationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnimation_Type()
  {
    return (EReference)animationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnimation_Location()
  {
    return (EAttribute)animationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnimation_Size()
  {
    return (EReference)animationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnimationType()
  {
    return animationTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSec()
  {
    return secEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubSec()
  {
    return subSecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubSubSec()
  {
    return subSubSecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTOC()
  {
    return tocEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParagraph()
  {
    return paragraphEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlock()
  {
    return blockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBlock_Name()
  {
    return (EAttribute)blockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberedList()
  {
    return numberedListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberedList_ListItems()
  {
    return (EReference)numberedListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnNumberedList()
  {
    return unNumberedListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnNumberedList_ListItems()
  {
    return (EReference)unNumberedListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMove()
  {
    return moveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJump()
  {
    return jumpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SlideOMaticFactory getSlideOMaticFactory()
  {
    return (SlideOMaticFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    presentationEClass = createEClass(PRESENTATION);
    createEAttribute(presentationEClass, PRESENTATION__NAME);
    createEReference(presentationEClass, PRESENTATION__THEME);
    createEReference(presentationEClass, PRESENTATION__AUTHORS);
    createEReference(presentationEClass, PRESENTATION__INSTITUTE);
    createEReference(presentationEClass, PRESENTATION__DATE);
    createEReference(presentationEClass, PRESENTATION__SLIDES);
    createEReference(presentationEClass, PRESENTATION__ANIMATIONS);

    themeEClass = createEClass(THEME);
    createEAttribute(themeEClass, THEME__THEME);
    createEAttribute(themeEClass, THEME__THEME_COLOR);

    authorsEClass = createEClass(AUTHORS);
    createEAttribute(authorsEClass, AUTHORS__NAMES);

    instituteEClass = createEClass(INSTITUTE);
    createEAttribute(instituteEClass, INSTITUTE__NAME);

    dateEClass = createEClass(DATE);
    createEAttribute(dateEClass, DATE__DATE);

    slideEClass = createEClass(SLIDE);
    createEAttribute(slideEClass, SLIDE__NAME);
    createEReference(slideEClass, SLIDE__CONTENTS);

    sectionEClass = createEClass(SECTION);

    contentEClass = createEClass(CONTENT);

    textEClass = createEClass(TEXT);
    createEAttribute(textEClass, TEXT__TEXT);

    listEClass = createEClass(LIST);

    numberedListItemEClass = createEClass(NUMBERED_LIST_ITEM);
    createEAttribute(numberedListItemEClass, NUMBERED_LIST_ITEM__ITEM);

    unNumberedListItemEClass = createEClass(UN_NUMBERED_LIST_ITEM);
    createEAttribute(unNumberedListItemEClass, UN_NUMBERED_LIST_ITEM__ITEM);

    floatEClass = createEClass(FLOAT);
    createEAttribute(floatEClass, FLOAT__NAME);

    imageEClass = createEClass(IMAGE);
    createEAttribute(imageEClass, IMAGE__SRC);
    createEAttribute(imageEClass, IMAGE__ALIGNMENT);
    createEReference(imageEClass, IMAGE__SIZE);

    sizeEClass = createEClass(SIZE);
    createEAttribute(sizeEClass, SIZE__SCALE);

    tableEClass = createEClass(TABLE);
    createEReference(tableEClass, TABLE__ROWS);

    tableRowEClass = createEClass(TABLE_ROW);
    createEAttribute(tableRowEClass, TABLE_ROW__VALUES);

    animationEClass = createEClass(ANIMATION);
    createEReference(animationEClass, ANIMATION__TARGET);
    createEReference(animationEClass, ANIMATION__TYPE);
    createEAttribute(animationEClass, ANIMATION__LOCATION);
    createEReference(animationEClass, ANIMATION__SIZE);

    animationTypeEClass = createEClass(ANIMATION_TYPE);

    secEClass = createEClass(SEC);

    subSecEClass = createEClass(SUB_SEC);

    subSubSecEClass = createEClass(SUB_SUB_SEC);

    tocEClass = createEClass(TOC);

    paragraphEClass = createEClass(PARAGRAPH);

    blockEClass = createEClass(BLOCK);
    createEAttribute(blockEClass, BLOCK__NAME);

    numberedListEClass = createEClass(NUMBERED_LIST);
    createEReference(numberedListEClass, NUMBERED_LIST__LIST_ITEMS);

    unNumberedListEClass = createEClass(UN_NUMBERED_LIST);
    createEReference(unNumberedListEClass, UN_NUMBERED_LIST__LIST_ITEMS);

    moveEClass = createEClass(MOVE);

    jumpEClass = createEClass(JUMP);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    sectionEClass.getESuperTypes().add(this.getSlide());
    textEClass.getESuperTypes().add(this.getContent());
    listEClass.getESuperTypes().add(this.getContent());
    floatEClass.getESuperTypes().add(this.getContent());
    imageEClass.getESuperTypes().add(this.getFloat());
    tableEClass.getESuperTypes().add(this.getFloat());
    secEClass.getESuperTypes().add(this.getSection());
    subSecEClass.getESuperTypes().add(this.getSection());
    subSubSecEClass.getESuperTypes().add(this.getSection());
    tocEClass.getESuperTypes().add(this.getContent());
    paragraphEClass.getESuperTypes().add(this.getText());
    blockEClass.getESuperTypes().add(this.getText());
    numberedListEClass.getESuperTypes().add(this.getList());
    unNumberedListEClass.getESuperTypes().add(this.getList());
    moveEClass.getESuperTypes().add(this.getAnimationType());
    jumpEClass.getESuperTypes().add(this.getAnimationType());

    // Initialize classes and features; add operations and parameters
    initEClass(presentationEClass, Presentation.class, "Presentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPresentation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPresentation_Theme(), this.getTheme(), null, "theme", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPresentation_Authors(), this.getAuthors(), null, "authors", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPresentation_Institute(), this.getInstitute(), null, "institute", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPresentation_Date(), this.getDate(), null, "date", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPresentation_Slides(), this.getSlide(), null, "slides", null, 0, -1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPresentation_Animations(), this.getAnimation(), null, "animations", null, 0, -1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(themeEClass, Theme.class, "Theme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTheme_Theme(), ecorePackage.getEString(), "theme", null, 0, 1, Theme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTheme_ThemeColor(), ecorePackage.getEString(), "themeColor", null, 0, 1, Theme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(authorsEClass, Authors.class, "Authors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAuthors_Names(), ecorePackage.getEString(), "names", null, 0, -1, Authors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instituteEClass, Institute.class, "Institute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstitute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Institute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dateEClass, Date.class, "Date", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDate_Date(), ecorePackage.getEString(), "date", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slideEClass, Slide.class, "Slide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSlide_Name(), ecorePackage.getEString(), "name", null, 0, 1, Slide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlide_Contents(), this.getContent(), null, "contents", null, 0, -1, Slide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(contentEClass, Content.class, "Content", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getText_Text(), ecorePackage.getEString(), "text", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listEClass, List.class, "List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(numberedListItemEClass, NumberedListItem.class, "NumberedListItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumberedListItem_Item(), ecorePackage.getEString(), "item", null, 0, 1, NumberedListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unNumberedListItemEClass, UnNumberedListItem.class, "UnNumberedListItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnNumberedListItem_Item(), ecorePackage.getEString(), "item", null, 0, 1, UnNumberedListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(floatEClass, dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Float.class, "Float", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFloat_Name(), ecorePackage.getEString(), "name", null, 0, 1, dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.Float.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImage_Src(), ecorePackage.getEString(), "src", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImage_Alignment(), ecorePackage.getEString(), "alignment", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImage_Size(), this.getSize(), null, "size", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sizeEClass, Size.class, "Size", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSize_Scale(), ecorePackage.getEInt(), "scale", null, 0, 1, Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTable_Rows(), this.getTableRow(), null, "rows", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableRowEClass, TableRow.class, "TableRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTableRow_Values(), ecorePackage.getEString(), "values", null, 0, -1, TableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(animationEClass, Animation.class, "Animation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnimation_Target(), this.getFloat(), null, "target", null, 0, 1, Animation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnimation_Type(), this.getAnimationType(), null, "type", null, 0, 1, Animation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAnimation_Location(), ecorePackage.getEString(), "location", null, 0, 1, Animation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnimation_Size(), this.getSize(), null, "size", null, 0, 1, Animation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(animationTypeEClass, AnimationType.class, "AnimationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(secEClass, Sec.class, "Sec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subSecEClass, SubSec.class, "SubSec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subSubSecEClass, SubSubSec.class, "SubSubSec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tocEClass, dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.TOC.class, "TOC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(paragraphEClass, Paragraph.class, "Paragraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBlock_Name(), ecorePackage.getEString(), "name", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberedListEClass, NumberedList.class, "NumberedList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumberedList_ListItems(), this.getNumberedListItem(), null, "ListItems", null, 0, -1, NumberedList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unNumberedListEClass, UnNumberedList.class, "UnNumberedList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnNumberedList_ListItems(), this.getUnNumberedListItem(), null, "ListItems", null, 0, -1, UnNumberedList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moveEClass, Move.class, "Move", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(jumpEClass, Jump.class, "Jump", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //SlideOMaticPackageImpl
