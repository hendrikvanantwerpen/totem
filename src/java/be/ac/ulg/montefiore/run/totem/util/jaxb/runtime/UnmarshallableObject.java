//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v@@BUILD_VERSION@@ 
// 	See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 	Any modifications to this file will be lost upon recompilation of the source schema. 
// 	Generated on: 2005.03.01 � 10:02:17 CET 
//

package be.ac.ulg.montefiore.run.totem.util.jaxb.runtime;


/**
 * Generated classes have to implement this interface for it
 * to be unmarshallable.
 * 
 * @author      Kohsuke KAWAGUCHI
 */
public interface UnmarshallableObject
{
    /**
     * Creates an unmarshaller that will unmarshall this object.
     */
    UnmarshallingEventHandler createUnmarshaller( UnmarshallingContext context );
}
