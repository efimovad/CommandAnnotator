
/* First created by JCasGen Thu Nov 30 12:13:05 MSK 2017 */
package ru.bmstu.iu3;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Thu Nov 30 12:13:05 MSK 2017
 * @generated */
public class CommandAnnotation_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = CommandAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("ru.bmstu.iu3.CommandAnnotation");
 
  /** @generated */
  final Feature casFeat_otherAnnotation;
  /** @generated */
  final int     casFeatCode_otherAnnotation;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getOtherAnnotation(int addr) {
        if (featOkTst && casFeat_otherAnnotation == null)
      jcas.throwFeatMissing("otherAnnotation", "ru.bmstu.iu3.CommandAnnotation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_otherAnnotation);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOtherAnnotation(int addr, int v) {
        if (featOkTst && casFeat_otherAnnotation == null)
      jcas.throwFeatMissing("otherAnnotation", "ru.bmstu.iu3.CommandAnnotation");
    ll_cas.ll_setRefValue(addr, casFeatCode_otherAnnotation, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public CommandAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_otherAnnotation = jcas.getRequiredFeatureDE(casType, "otherAnnotation", "uima.tcas.Annotation", featOkTst);
    casFeatCode_otherAnnotation  = (null == casFeat_otherAnnotation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_otherAnnotation).getCode();

  }
}



    