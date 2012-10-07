

/* First created by JCasGen Wed Aug 29 14:24:55 CEST 2012 */
package eu.excitement.type.entailment;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** This type represents a hypothesis part of a T-H pair. This type annotates a hypoth-
esis item within the HypothesisView. It can occur multiple times (for multi-hypothesis problems)
 * Updated by JCasGen Thu Oct 04 17:40:04 CEST 2012
 * XML source: /home/tailblues/progs/cas_access_example/ExcitementTypes/typesystem/desc/type/EntailmentTypes.xml
 * @generated */
public class Hypothesis extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Hypothesis.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Hypothesis() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Hypothesis(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Hypothesis(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Hypothesis(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
}

    