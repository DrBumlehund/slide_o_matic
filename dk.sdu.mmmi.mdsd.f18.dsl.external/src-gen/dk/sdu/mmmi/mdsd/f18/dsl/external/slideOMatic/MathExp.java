/**
 * generated by Xtext 2.12.0
 */
package dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Math Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.MathExp#getEval <em>Eval</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.MathExp#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SlideOMaticPackage#getMathExp()
 * @model
 * @generated
 */
public interface MathExp extends Content
{
  /**
   * Returns the value of the '<em><b>Eval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Eval</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eval</em>' attribute.
   * @see #setEval(String)
   * @see dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SlideOMaticPackage#getMathExp_Eval()
   * @model
   * @generated
   */
  String getEval();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.MathExp#getEval <em>Eval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Eval</em>' attribute.
   * @see #getEval()
   * @generated
   */
  void setEval(String value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Expression)
   * @see dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.SlideOMaticPackage#getMathExp_Exp()
   * @model containment="true"
   * @generated
   */
  Expression getExp();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.f18.dsl.external.slideOMatic.MathExp#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Expression value);

} // MathExp
