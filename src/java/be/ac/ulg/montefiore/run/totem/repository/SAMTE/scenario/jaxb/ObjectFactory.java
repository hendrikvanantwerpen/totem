//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.08.31 at 12:16:28 CEST 
//


package be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
public class ObjectFactory
    extends be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.DefaultJAXBContextImpl
{

    private static java.util.HashMap defaultImplementations = new java.util.HashMap(16, 0.75F);
    private static java.util.HashMap rootTagMap = new java.util.HashMap();
    public final static be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.GrammarInfo grammarInfo = new be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.GrammarInfoImpl(rootTagMap, defaultImplementations, (be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.ObjectFactory.class));
    public final static java.lang.Class version = (be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.impl.JAXBVersion.class);

    static {
        defaultImplementations.put((be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.ObjectiveFunction.class), "be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.impl.ObjectiveFunctionImpl");
        defaultImplementations.put((be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.ObjectiveFunctionType.class), "be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.impl.ObjectiveFunctionTypeImpl");
        defaultImplementations.put((be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.GenerateCPLType.class), "be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.impl.GenerateCPLTypeImpl");
        defaultImplementations.put((be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.SimulatedAnnealing.class), "be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.impl.SimulatedAnnealingImpl");
        defaultImplementations.put((be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.GenerateCPL.class), "be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.GenerateCPL");
        defaultImplementations.put((be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.SimulatedAnnealingType.class), "be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.impl.SimulatedAnnealingTypeImpl");
        defaultImplementations.put((be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.SAMTEType.class), "be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.impl.SAMTETypeImpl");
        defaultImplementations.put((be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.SAMTE.class), "be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.impl.SAMTEImpl");
        rootTagMap.put(new javax.xml.namespace.QName("http://jaxb.scenario.SAMTE.repository.totem.run.montefiore.ulg.ac.be", "generateCPL"), (be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.GenerateCPL.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://jaxb.scenario.SAMTE.repository.totem.run.montefiore.ulg.ac.be", "SAMTE"), (be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.SAMTE.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://jaxb.scenario.SAMTE.repository.totem.run.montefiore.ulg.ac.be", "simulatedAnnealing"), (be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.SimulatedAnnealing.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://jaxb.scenario.SAMTE.repository.totem.run.montefiore.ulg.ac.be", "objectiveFunction"), (be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.ObjectiveFunction.class));
    }

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb
     * 
     */
    public ObjectFactory() {
        super(grammarInfo);
    }

    /**
     * Create an instance of the specified Java content interface.
     * 
     * @param javaContentInterface
     *     the Class object of the javacontent interface to instantiate
     * @return
     *     a new instance
     * @throws JAXBException
     *     if an error occurs
     */
    public java.lang.Object newInstance(java.lang.Class javaContentInterface)
        throws javax.xml.bind.JAXBException
    {
        return super.newInstance(javaContentInterface);
    }

    /**
     * Get the specified property. This method can only be
     * used to get provider specific properties.
     * Attempting to get an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param name
     *     the name of the property to retrieve
     * @return
     *     the value of the requested property
     * @throws PropertyException
     *     when there is an error retrieving the given property or value
     */
    public java.lang.Object getProperty(java.lang.String name)
        throws javax.xml.bind.PropertyException
    {
        return super.getProperty(name);
    }

    /**
     * Set the specified property. This method can only be
     * used to set provider specific properties.
     * Attempting to set an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param value
     *     the value of the property to be set
     * @param name
     *     the name of the property to retrieve
     * @throws PropertyException
     *     when there is an error processing the given property or value
     */
    public void setProperty(java.lang.String name, java.lang.Object value)
        throws javax.xml.bind.PropertyException
    {
        super.setProperty(name, value);
    }

    /**
     * Create an instance of ObjectiveFunction
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.ObjectiveFunction createObjectiveFunction()
        throws javax.xml.bind.JAXBException
    {
        return new be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.impl.ObjectiveFunctionImpl();
    }

    /**
     * Create an instance of ObjectiveFunctionType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.ObjectiveFunctionType createObjectiveFunctionType()
        throws javax.xml.bind.JAXBException
    {
        return new be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.impl.ObjectiveFunctionTypeImpl();
    }

    /**
     * Create an instance of GenerateCPLType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.GenerateCPLType createGenerateCPLType()
        throws javax.xml.bind.JAXBException
    {
        return new be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.impl.GenerateCPLTypeImpl();
    }

    /**
     * Create an instance of SimulatedAnnealing
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.SimulatedAnnealing createSimulatedAnnealing()
        throws javax.xml.bind.JAXBException
    {
        return new be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.impl.SimulatedAnnealingImpl();
    }

    /**
     * Create an instance of GenerateCPL
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.GenerateCPL createGenerateCPL()
        throws javax.xml.bind.JAXBException
    {
        return new be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.GenerateCPL();
    }

    /**
     * Create an instance of SimulatedAnnealingType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.SimulatedAnnealingType createSimulatedAnnealingType()
        throws javax.xml.bind.JAXBException
    {
        return new be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.impl.SimulatedAnnealingTypeImpl();
    }

    /**
     * Create an instance of SAMTEType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.SAMTEType createSAMTEType()
        throws javax.xml.bind.JAXBException
    {
        return new be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.impl.SAMTETypeImpl();
    }

    /**
     * Create an instance of SAMTE
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.SAMTE createSAMTE()
        throws javax.xml.bind.JAXBException
    {
        return new be.ac.ulg.montefiore.run.totem.repository.SAMTE.scenario.jaxb.impl.SAMTEImpl();
    }

}
