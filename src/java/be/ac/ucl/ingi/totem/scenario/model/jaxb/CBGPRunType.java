//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v@@BUILD_VERSION@@ 
// 	See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 	Any modifications to this file will be lost upon recompilation of the source schema. 
// 	Generated on: 2005.06.24 � 02:45:37 CEST 
//


package be.ac.ucl.ingi.totem.scenario.model.jaxb;


/**
 * Java content class for anonymous complex type.
 * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/shared_dir/belial/users/lepropre/eclipse/workspace/run-totem/src/resources/scenario/CBGP-Scenario-v1_0.xsd line 52)
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://jaxb.model.scenario.totem.run.montefiore.ulg.ac.be}eventType">
 *       &lt;attribute name="stopAt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface CBGPRunType
    extends be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.EventType
{


    /**
     * Gets the value of the stopAt property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getStopAt();

    /**
     * Sets the value of the stopAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setStopAt(java.lang.String value);

    boolean isSetStopAt();

    void unsetStopAt();

}
