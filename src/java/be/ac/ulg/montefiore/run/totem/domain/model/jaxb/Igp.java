//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.02.29 at 02:59:16 CET 
//


package be.ac.ulg.montefiore.run.totem.domain.model.jaxb;


/**
 * Java content class for igp complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/monfort/Projects/run-totem/src/resources/domain/Domain-v1_3.xsd line 349)
 * <p>
 * <pre>
 * &lt;complexType name="igp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="links">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="link" type="{}linkIgp" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{}igpType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface Igp {


    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link be.ac.ulg.montefiore.run.totem.domain.model.jaxb.IgpType}
     */
    be.ac.ulg.montefiore.run.totem.domain.model.jaxb.IgpType getType();

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link be.ac.ulg.montefiore.run.totem.domain.model.jaxb.IgpType}
     */
    void setType(be.ac.ulg.montefiore.run.totem.domain.model.jaxb.IgpType value);

    boolean isSetType();

    void unsetType();

    /**
     * Gets the value of the links property.
     * 
     * @return
     *     possible object is
     *     {@link be.ac.ulg.montefiore.run.totem.domain.model.jaxb.Igp.IgpLinksType}
     */
    be.ac.ulg.montefiore.run.totem.domain.model.jaxb.Igp.IgpLinksType getLinks();

    /**
     * Sets the value of the links property.
     * 
     * @param value
     *     allowed object is
     *     {@link be.ac.ulg.montefiore.run.totem.domain.model.jaxb.Igp.IgpLinksType}
     */
    void setLinks(be.ac.ulg.montefiore.run.totem.domain.model.jaxb.Igp.IgpLinksType value);

    boolean isSetLinks();

    void unsetLinks();


    /**
     * Java content class for links element declaration.
     * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/monfort/Projects/run-totem/src/resources/domain/Domain-v1_3.xsd line 351)
     * <p>
     * <pre>
     * &lt;element name="links">
     *   &lt;complexType>
     *     &lt;complexContent>
     *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *         &lt;sequence>
     *           &lt;element name="link" type="{}linkIgp" maxOccurs="unbounded"/>
     *         &lt;/sequence>
     *       &lt;/restriction>
     *     &lt;/complexContent>
     *   &lt;/complexType>
     * &lt;/element>
     * </pre>
     * 
     */
    public interface IgpLinksType
        extends javax.xml.bind.Element, be.ac.ulg.montefiore.run.totem.domain.model.jaxb.Igp.LinksType
    {


    }


    /**
     * Java content class for anonymous complex type.
     * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/monfort/Projects/run-totem/src/resources/domain/Domain-v1_3.xsd line 352)
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="link" type="{}linkIgp" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     */
    public interface LinksType {


        /**
         * Gets the value of the Link property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the Link property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLink().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link be.ac.ulg.montefiore.run.totem.domain.model.jaxb.LinkIgp}
         * 
         */
        java.util.List getLink();

        boolean isSetLink();

        void unsetLink();

    }

}