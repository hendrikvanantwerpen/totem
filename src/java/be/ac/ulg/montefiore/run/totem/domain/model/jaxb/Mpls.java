//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.31 at 08:54:47 CEST 
//


package be.ac.ulg.montefiore.run.totem.domain.model.jaxb;


/**
 * Java content class for mpls complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/data/software/totem/totem.git/src/resources/domain/Domain-v1_3.xsd line 293)
 * <p>
 * <pre>
 * &lt;complexType name="mpls">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lsp" type="{}lsp" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface Mpls {


    /**
     * Gets the value of the Lsp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Lsp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLsp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link be.ac.ulg.montefiore.run.totem.domain.model.jaxb.Lsp}
     * 
     */
    java.util.List getLsp();

    boolean isSetLsp();

    void unsetLsp();

}
