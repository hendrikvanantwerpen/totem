//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v@@BUILD_VERSION@@ 
// 	See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 	Any modifications to this file will be lost upon recompilation of the source schema. 
// 	Generated on: 2005.06.24 � 02:45:37 CEST 
//


package be.ac.ucl.ingi.totem.scenario.model.jaxb;


/**
 * Java content class for CBGPPeerRecv element declaration.
 * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/shared_dir/belial/users/lepropre/eclipse/workspace/run-totem/src/resources/scenario/CBGP-Scenario-v1_0.xsd line 100)
 * <p>
 * <pre>
 * &lt;element name="CBGPPeerRecv">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;extension base="{http://jaxb.model.scenario.totem.run.montefiore.ulg.ac.be}eventType">
 *         &lt;attribute name="msg" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="peer" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="router" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;/extension>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 */
public interface CBGPPeerRecv
    extends javax.xml.bind.Element, be.ac.ucl.ingi.totem.scenario.model.jaxb.CBGPPeerRecvType
{


}
