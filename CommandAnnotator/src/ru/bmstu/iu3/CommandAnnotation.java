

/* First created by JCasGen Thu Nov 30 12:13:03 MSK 2017 */
package ru.bmstu.iu3;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu Nov 30 12:13:03 MSK 2017
 * XML source: D:/ws2/CommandAnnotator/desc/CommandAnnotatorDescriptor.xml
 * @generated */
public class CommandAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(CommandAnnotation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected CommandAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public CommandAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public CommandAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public CommandAnnotation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: otherAnnotation

  /** getter for otherAnnotation - gets 
   * @generated
   * @return value of the feature 
   */
  public Annotation getOtherAnnotation() {
    if (CommandAnnotation_Type.featOkTst && ((CommandAnnotation_Type)jcasType).casFeat_otherAnnotation == null)
      jcasType.jcas.throwFeatMissing("otherAnnotation", "ru.bmstu.iu3.CommandAnnotation");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((CommandAnnotation_Type)jcasType).casFeatCode_otherAnnotation)));}
    
  /** setter for otherAnnotation - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOtherAnnotation(Annotation v) {
    if (CommandAnnotation_Type.featOkTst && ((CommandAnnotation_Type)jcasType).casFeat_otherAnnotation == null)
      jcasType.jcas.throwFeatMissing("otherAnnotation", "ru.bmstu.iu3.CommandAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((CommandAnnotation_Type)jcasType).casFeatCode_otherAnnotation, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    