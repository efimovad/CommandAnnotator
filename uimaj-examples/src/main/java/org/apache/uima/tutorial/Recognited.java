

/* First created by JCasGen Fri Dec 08 20:45:13 MSK 2017 */
package org.apache.uima.tutorial;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Dec 08 22:07:48 MSK 2017
 * XML source: /Users/oleggruzdev/DevelopmentSoft/workspace/umporj/uimaj-examples/src/main/descriptors/tutorial/ex1/SpeechRecorderTAECustom.xml
 * @generated */
public class Recognited extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Recognited.class);
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
  protected Recognited() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Recognited(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Recognited(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Recognited(JCas jcas, int begin, int end) {
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
  //* Feature: recognitionResult

  /** getter for recognitionResult - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRecognitionResult() {
    if (Recognited_Type.featOkTst && ((Recognited_Type)jcasType).casFeat_recognitionResult == null)
      jcasType.jcas.throwFeatMissing("recognitionResult", "org.apache.uima.tutorial.Recognited");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Recognited_Type)jcasType).casFeatCode_recognitionResult);}
    
  /** setter for recognitionResult - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRecognitionResult(String v) {
    if (Recognited_Type.featOkTst && ((Recognited_Type)jcasType).casFeat_recognitionResult == null)
      jcasType.jcas.throwFeatMissing("recognitionResult", "org.apache.uima.tutorial.Recognited");
    jcasType.ll_cas.ll_setStringValue(addr, ((Recognited_Type)jcasType).casFeatCode_recognitionResult, v);}    
  }

    