
/* First created by JCasGen Fri Dec 08 20:45:13 MSK 2017 */
package org.apache.uima.tutorial;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Fri Dec 08 22:07:48 MSK 2017
 * @generated */
public class Recognited_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Recognited.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.tutorial.Recognited");
 
  /** @generated */
  final Feature casFeat_recognitionResult;
  /** @generated */
  final int     casFeatCode_recognitionResult;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getRecognitionResult(int addr) {
        if (featOkTst && casFeat_recognitionResult == null)
      jcas.throwFeatMissing("recognitionResult", "org.apache.uima.tutorial.Recognited");
    return ll_cas.ll_getStringValue(addr, casFeatCode_recognitionResult);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRecognitionResult(int addr, String v) {
        if (featOkTst && casFeat_recognitionResult == null)
      jcas.throwFeatMissing("recognitionResult", "org.apache.uima.tutorial.Recognited");
    ll_cas.ll_setStringValue(addr, casFeatCode_recognitionResult, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Recognited_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_recognitionResult = jcas.getRequiredFeatureDE(casType, "recognitionResult", "uima.cas.String", featOkTst);
    casFeatCode_recognitionResult  = (null == casFeat_recognitionResult) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_recognitionResult).getCode();

  }
}



    