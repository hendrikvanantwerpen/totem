//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.08.31 at 12:16:28 CEST 
//


package be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb;


/**
 * Java content class for initialSolutionType.
 *  <p>The following schema fragment specifies the expected content contained within this java content object.
 * <p>
 * <pre>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *   &lt;enumeration value="RANDOM"/>
 * &lt;/restriction>
 * </pre>
 * 
 */
public class InitialSolutionType {

    private final static java.util.Map valueMap = new java.util.HashMap();
    public final static java.lang.String _RANDOM = com.sun.xml.bind.DatatypeConverterImpl.installHook("RANDOM");
    public final static be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.InitialSolutionType RANDOM = new be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.InitialSolutionType(_RANDOM);
    private final java.lang.String lexicalValue;
    private final java.lang.String value;

    protected InitialSolutionType(java.lang.String v) {
        value = v;
        lexicalValue = v;
        valueMap.put(v, this);
    }

    public java.lang.String toString() {
        return lexicalValue;
    }

    public java.lang.String getValue() {
        return value;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean equals(java.lang.Object o) {
        return super.equals(o);
    }

    public static be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.InitialSolutionType fromValue(java.lang.String value) {
        be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.InitialSolutionType t = ((be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.InitialSolutionType) valueMap.get(value));
        if (t == null) {
            throw new java.lang.IllegalArgumentException();
        } else {
            return t;
        }
    }

    public static be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.InitialSolutionType fromString(java.lang.String str) {
        return fromValue(str);
    }

}
