/**
 * generated by Xtext 2.12.0
 */
package dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.impl;

import dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SlideOMaticFactoryImpl extends EFactoryImpl implements SlideOMaticFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SlideOMaticFactory init()
  {
    try
    {
      SlideOMaticFactory theSlideOMaticFactory = (SlideOMaticFactory)EPackage.Registry.INSTANCE.getEFactory(SlideOMaticPackage.eNS_URI);
      if (theSlideOMaticFactory != null)
      {
        return theSlideOMaticFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SlideOMaticFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SlideOMaticFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SlideOMaticPackage.PRESENTATION: return createPresentation();
      case SlideOMaticPackage.THEME: return createTheme();
      case SlideOMaticPackage.AUTHORS: return createAuthors();
      case SlideOMaticPackage.INSTITUTE: return createInstitute();
      case SlideOMaticPackage.DATE: return createDate();
      case SlideOMaticPackage.SLIDE: return createSlide();
      case SlideOMaticPackage.SECTION: return createSection();
      case SlideOMaticPackage.CONTENT: return createContent();
      case SlideOMaticPackage.BLOCKABLE_CONTENT: return createBlockableContent();
      case SlideOMaticPackage.TEXT: return createText();
      case SlideOMaticPackage.BLOCK: return createBlock();
      case SlideOMaticPackage.LIST: return createList();
      case SlideOMaticPackage.NUMBERED_LIST: return createNumberedList();
      case SlideOMaticPackage.UN_NUMBERED_LIST: return createUnNumberedList();
      case SlideOMaticPackage.LIST_ITEM: return createListItem();
      case SlideOMaticPackage.FLOATS: return createFloats();
      case SlideOMaticPackage.IMAGE: return createImage();
      case SlideOMaticPackage.SIZE: return createSize();
      case SlideOMaticPackage.TABLE: return createTable();
      case SlideOMaticPackage.TABLE_ROW: return createTableRow();
      case SlideOMaticPackage.CODE: return createCode();
      case SlideOMaticPackage.ANIMATION: return createAnimation();
      case SlideOMaticPackage.ANIMATION_TYPE: return createAnimationType();
      case SlideOMaticPackage.SEC: return createSec();
      case SlideOMaticPackage.SUB_SEC: return createSubSec();
      case SlideOMaticPackage.SUB_SUB_SEC: return createSubSubSec();
      case SlideOMaticPackage.TOC: return createTOC();
      case SlideOMaticPackage.PROPORTIONAL_SIZE: return createProportionalSize();
      case SlideOMaticPackage.EXACT_SIZE: return createExactSize();
      case SlideOMaticPackage.MOVE: return createMove();
      case SlideOMaticPackage.JUMP: return createJump();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Presentation createPresentation()
  {
    PresentationImpl presentation = new PresentationImpl();
    return presentation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Theme createTheme()
  {
    ThemeImpl theme = new ThemeImpl();
    return theme;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Authors createAuthors()
  {
    AuthorsImpl authors = new AuthorsImpl();
    return authors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Institute createInstitute()
  {
    InstituteImpl institute = new InstituteImpl();
    return institute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date createDate()
  {
    DateImpl date = new DateImpl();
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Slide createSlide()
  {
    SlideImpl slide = new SlideImpl();
    return slide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Section createSection()
  {
    SectionImpl section = new SectionImpl();
    return section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Content createContent()
  {
    ContentImpl content = new ContentImpl();
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockableContent createBlockableContent()
  {
    BlockableContentImpl blockableContent = new BlockableContentImpl();
    return blockableContent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Text createText()
  {
    TextImpl text = new TextImpl();
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List createList()
  {
    ListImpl list = new ListImpl();
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberedList createNumberedList()
  {
    NumberedListImpl numberedList = new NumberedListImpl();
    return numberedList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnNumberedList createUnNumberedList()
  {
    UnNumberedListImpl unNumberedList = new UnNumberedListImpl();
    return unNumberedList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListItem createListItem()
  {
    ListItemImpl listItem = new ListItemImpl();
    return listItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Floats createFloats()
  {
    FloatsImpl floats = new FloatsImpl();
    return floats;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Image createImage()
  {
    ImageImpl image = new ImageImpl();
    return image;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Size createSize()
  {
    SizeImpl size = new SizeImpl();
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Table createTable()
  {
    TableImpl table = new TableImpl();
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableRow createTableRow()
  {
    TableRowImpl tableRow = new TableRowImpl();
    return tableRow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Code createCode()
  {
    CodeImpl code = new CodeImpl();
    return code;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Animation createAnimation()
  {
    AnimationImpl animation = new AnimationImpl();
    return animation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnimationType createAnimationType()
  {
    AnimationTypeImpl animationType = new AnimationTypeImpl();
    return animationType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sec createSec()
  {
    SecImpl sec = new SecImpl();
    return sec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubSec createSubSec()
  {
    SubSecImpl subSec = new SubSecImpl();
    return subSec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubSubSec createSubSubSec()
  {
    SubSubSecImpl subSubSec = new SubSubSecImpl();
    return subSubSec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TOC createTOC()
  {
    TOCImpl toc = new TOCImpl();
    return toc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProportionalSize createProportionalSize()
  {
    ProportionalSizeImpl proportionalSize = new ProportionalSizeImpl();
    return proportionalSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExactSize createExactSize()
  {
    ExactSizeImpl exactSize = new ExactSizeImpl();
    return exactSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Move createMove()
  {
    MoveImpl move = new MoveImpl();
    return move;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Jump createJump()
  {
    JumpImpl jump = new JumpImpl();
    return jump;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SlideOMaticPackage getSlideOMaticPackage()
  {
    return (SlideOMaticPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SlideOMaticPackage getPackage()
  {
    return SlideOMaticPackage.eINSTANCE;
  }

} //SlideOMaticFactoryImpl
