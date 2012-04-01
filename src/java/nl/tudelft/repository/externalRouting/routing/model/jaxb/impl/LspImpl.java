//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.01 at 09:07:08 CEST 
//


package nl.tudelft.repository.externalRouting.routing.model.jaxb.impl;

public class LspImpl implements nl.tudelft.repository.externalRouting.routing.model.jaxb.Lsp, com.sun.xml.bind.JAXBObject, be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallableObject, be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.XMLSerializable, be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.ValidatableObject
{

    protected boolean has_Reservation;
    protected float _Reservation;
    protected java.lang.String _Id;
    protected nl.tudelft.repository.externalRouting.routing.model.jaxb.Lsp.PathType _Path;
    public final static java.lang.Class version = (nl.tudelft.repository.externalRouting.routing.model.jaxb.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (nl.tudelft.repository.externalRouting.routing.model.jaxb.Lsp.class);
    }

    public float getReservation() {
        return _Reservation;
    }

    public void setReservation(float value) {
        _Reservation = value;
        has_Reservation = true;
    }

    public boolean isSetReservation() {
        return has_Reservation;
    }

    public void unsetReservation() {
        has_Reservation = false;
    }

    public java.lang.String getId() {
        return _Id;
    }

    public void setId(java.lang.String value) {
        _Id = value;
    }

    public boolean isSetId() {
        return (_Id!= null);
    }

    public void unsetId() {
        _Id = null;
    }

    public nl.tudelft.repository.externalRouting.routing.model.jaxb.Lsp.PathType getPath() {
        return _Path;
    }

    public void setPath(nl.tudelft.repository.externalRouting.routing.model.jaxb.Lsp.PathType value) {
        _Path = value;
    }

    public boolean isSetPath() {
        return (_Path!= null);
    }

    public void unsetPath() {
        _Path = null;
    }

    public be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallingEventHandler createUnmarshaller(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallingContext context) {
        return new nl.tudelft.repository.externalRouting.routing.model.jaxb.impl.LspImpl.Unmarshaller(context);
    }

    public void serializeBody(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (!has_Reservation) {
            context.reportError(com.sun.xml.bind.serializer.Util.createMissingObjectError(this, "Reservation"));
        }
        if (_Id!= null) {
            context.startElement("http://jaxb.model.routing.externalRouting.repository.tudelft.nl", "id");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(((java.lang.String) _Id), "Id");
            } catch (java.lang.Exception e) {
                be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
        context.startElement("http://jaxb.model.routing.externalRouting.repository.tudelft.nl", "reservation");
        context.endNamespaceDecls();
        context.endAttributes();
        try {
            context.text(javax.xml.bind.DatatypeConverter.printFloat(((float) _Reservation)), "Reservation");
        } catch (java.lang.Exception e) {
            be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endElement();
        context.startElement("http://jaxb.model.routing.externalRouting.repository.tudelft.nl", "path");
        context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Path), "Path");
        context.endNamespaceDecls();
        context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Path), "Path");
        context.endAttributes();
        context.childAsBody(((com.sun.xml.bind.JAXBObject) _Path), "Path");
        context.endElement();
    }

    public void serializeAttributes(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (!has_Reservation) {
            context.reportError(com.sun.xml.bind.serializer.Util.createMissingObjectError(this, "Reservation"));
        }
    }

    public void serializeURIs(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (!has_Reservation) {
            context.reportError(com.sun.xml.bind.serializer.Util.createMissingObjectError(this, "Reservation"));
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (nl.tudelft.repository.externalRouting.routing.model.jaxb.Lsp.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceEx"
+"p\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000\'com.sun.msv.grammar.trex.ElementPatt"
+"ern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;"
+"xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndecl"
+"aredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolea"
+"n\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0000ppsr\u0000\u001bcom.sun.msv.grammar.Dat"
+"aExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exc"
+"eptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003ppsr\u0000#c"
+"om.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysVali"
+"dxr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr"
+"\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.su"
+"n.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUrit"
+"\u0000\u0012Ljava/lang/String;L\u0000\btypeNameq\u0000~\u0000\u0018L\u0000\nwhiteSpacet\u0000.Lcom/sun"
+"/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org"
+"/2001/XMLSchemat\u0000\u0006stringsr\u00005com.sun.msv.datatype.xsd.WhiteSp"
+"aceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd"
+".WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001sr\u00000com.sun.msv.grammar.Ex"
+"pression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003ppsr\u0000\u001bcom.sun.msv"
+".util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0018L\u0000\fnamespaceURIq"
+"\u0000~\u0000\u0018xpq\u0000~\u0000\u001cq\u0000~\u0000\u001bsq\u0000~\u0000\u0007ppsr\u0000 com.sun.msv.grammar.AttributeExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\nxq\u0000~\u0000\u0003q\u0000~\u0000\u000epsq\u0000~\u0000\u0010pps"
+"r\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0015q\u0000~\u0000\u001bt"
+"\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Coll"
+"apse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u001eq\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000*q\u0000~\u0000\u001bsr\u0000#com.sun.msv.gr"
+"ammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0018L\u0000\fnamespac"
+"eURIq\u0000~\u0000\u0018xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0004ty"
+"pet\u0000)http://www.w3.org/2001/XMLSchema-instancesr\u00000com.sun.ms"
+"v.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000"
+"\r\u0001q\u0000~\u00004sq\u0000~\u0000.t\u0000\u0002idt\u0000?http://jaxb.model.routing.externalRouti"
+"ng.repository.tudelft.nlq\u0000~\u00004sq\u0000~\u0000\tpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0010ppsr\u0000\"co"
+"m.sun.msv.datatype.xsd.FloatType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000+com.sun.msv.d"
+"atatype.xsd.FloatingNumberType\u00fc\u00e3\u00b6\u0087\u008c\u00a8|\u00e0\u0002\u0000\u0000xq\u0000~\u0000\u0015q\u0000~\u0000\u001bt\u0000\u0005float"
+"q\u0000~\u0000,q\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000?q\u0000~\u0000\u001bsq\u0000~\u0000\u0007ppsq\u0000~\u0000%q\u0000~\u0000\u000epq\u0000~\u0000\'q\u0000~\u00000q\u0000~\u0000"
+"4sq\u0000~\u0000.t\u0000\u000breservationq\u0000~\u00008sq\u0000~\u0000\tpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\tpp\u0000sq\u0000~\u0000\u0007pp"
+"sr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.m"
+"sv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\u000epsq\u0000~\u0000%q"
+"\u0000~\u0000\u000epsr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u00005q\u0000~\u0000Nsr\u0000 com.sun.msv.grammar.AnyNameCla"
+"ss\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000/q\u0000~\u00004sq\u0000~\u0000.t\u0000Enl.tudelft.repository.exter"
+"nalRouting.routing.model.jaxb.Lsp.PathTypet\u0000+http://java.sun"
+".com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0007ppsq\u0000~\u0000%q\u0000~\u0000\u000epq\u0000~\u0000\'q\u0000~\u00000q\u0000"
+"~\u00004sq\u0000~\u0000.t\u0000\u0004pathq\u0000~\u00008sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$"
+"ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHa"
+"sh\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/ms"
+"v/grammar/ExpressionPool;xp\u0000\u0000\u0000\u000b\u0001pq\u0000~\u0000Fq\u0000~\u0000:q\u0000~\u0000\u0006q\u0000~\u0000\bq\u0000~\u0000$q\u0000"
+"~\u0000Aq\u0000~\u0000Tq\u0000~\u0000\u0005q\u0000~\u0000Kq\u0000~\u0000Hq\u0000~\u0000\u000fx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public static class PathTypeImpl implements nl.tudelft.repository.externalRouting.routing.model.jaxb.Lsp.PathType, com.sun.xml.bind.JAXBObject, be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallableObject, be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.XMLSerializable, be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.ValidatableObject
    {

        protected com.sun.xml.bind.util.ListImpl _Node;
        public final static java.lang.Class version = (nl.tudelft.repository.externalRouting.routing.model.jaxb.impl.JAXBVersion.class);
        private static com.sun.msv.grammar.Grammar schemaFragment;

        private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
            return (nl.tudelft.repository.externalRouting.routing.model.jaxb.Lsp.PathType.class);
        }

        protected com.sun.xml.bind.util.ListImpl _getNode() {
            if (_Node == null) {
                _Node = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
            }
            return _Node;
        }

        public java.util.List getNode() {
            return _getNode();
        }

        public boolean isSetNode() {
            return ((_Node == null)?false:_Node.isModified());
        }

        public void unsetNode() {
            if (_Node!= null) {
                _Node.clear();
                _Node.setModified(false);
            }
        }

        public be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallingEventHandler createUnmarshaller(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallingContext context) {
            return new nl.tudelft.repository.externalRouting.routing.model.jaxb.impl.LspImpl.PathTypeImpl.Unmarshaller(context);
        }

        public void serializeBody(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.XMLSerializer context)
            throws org.xml.sax.SAXException
        {
            int idx1 = 0;
            final int len1 = ((_Node == null)? 0 :_Node.size());
            while (idx1 != len1) {
                context.startElement("http://jaxb.model.routing.externalRouting.repository.tudelft.nl", "node");
                int idx_0 = idx1;
                try {
                    idx_0 += 1;
                } catch (java.lang.Exception e) {
                    be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.Util.handlePrintConversionException(this, e, context);
                }
                context.endNamespaceDecls();
                int idx_1 = idx1;
                try {
                    idx_1 += 1;
                } catch (java.lang.Exception e) {
                    be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.Util.handlePrintConversionException(this, e, context);
                }
                context.endAttributes();
                try {
                    context.text(((java.lang.String) _Node.get(idx1 ++)), "Node");
                } catch (java.lang.Exception e) {
                    be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.Util.handlePrintConversionException(this, e, context);
                }
                context.endElement();
            }
        }

        public void serializeAttributes(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.XMLSerializer context)
            throws org.xml.sax.SAXException
        {
            int idx1 = 0;
            final int len1 = ((_Node == null)? 0 :_Node.size());
            while (idx1 != len1) {
                try {
                    idx1 += 1;
                } catch (java.lang.Exception e) {
                    be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.Util.handlePrintConversionException(this, e, context);
                }
            }
        }

        public void serializeURIs(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.XMLSerializer context)
            throws org.xml.sax.SAXException
        {
            int idx1 = 0;
            final int len1 = ((_Node == null)? 0 :_Node.size());
            while (idx1 != len1) {
                try {
                    idx1 += 1;
                } catch (java.lang.Exception e) {
                    be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.Util.handlePrintConversionException(this, e, context);
                }
            }
        }

        public java.lang.Class getPrimaryInterface() {
            return (nl.tudelft.repository.externalRouting.routing.model.jaxb.Lsp.PathType.class);
        }

        public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
            if (schemaFragment == null) {
                schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsr\u0000\'com.sun.msv.grammar.trex.Ele"
+"mentPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/Na"
+"meClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aigno"
+"reUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003pp\u0000sq\u0000~\u0000\u0000pps"
+"r\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxn"
+"g/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/uti"
+"l/StringPair;xq\u0000~\u0000\u0003ppsr\u0000#com.sun.msv.datatype.xsd.StringType"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com.sun.msv.datatype.xsd.Buil"
+"tinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.Concret"
+"eType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUrit\u0000\u0012Ljava/lang/String;L\u0000\btypeNameq\u0000~"
+"\u0000\u0014L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProces"
+"sor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0006stringsr\u00005com.su"
+"n.msv.datatype.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr"
+"\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001"
+"sr\u00000com.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xq\u0000~\u0000\u0003ppsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tloca"
+"lNameq\u0000~\u0000\u0014L\u0000\fnamespaceURIq\u0000~\u0000\u0014xpq\u0000~\u0000\u0018q\u0000~\u0000\u0017sr\u0000\u001dcom.sun.msv.gr"
+"ammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000 com.sun.msv.grammar.At"
+"tributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\bxq\u0000~\u0000\u0003sr\u0000\u0011j"
+"ava.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\fppsr\u0000\"com.sun.m"
+"sv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0011q\u0000~\u0000\u0017t\u0000\u0005QNamesr\u00005c"
+"om.sun.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xq\u0000~\u0000\u001aq\u0000~\u0000\u001dsq\u0000~\u0000\u001eq\u0000~\u0000)q\u0000~\u0000\u0017sr\u0000#com.sun.msv.grammar.Simple"
+"NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0014L\u0000\fnamespaceURIq\u0000~\u0000\u0014xr\u0000"
+"\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0004typet\u0000)http://"
+"www.w3.org/2001/XMLSchema-instancesr\u00000com.sun.msv.grammar.Ex"
+"pression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000$\u0001q\u0000~\u00003sq\u0000~\u0000"
+"-t\u0000\u0004nodet\u0000?http://jaxb.model.routing.externalRouting.reposit"
+"ory.tudelft.nlsq\u0000~\u0000\u0007pp\u0000sq\u0000~\u0000\u0000ppq\u0000~\u0000\u000fsq\u0000~\u0000 ppsq\u0000~\u0000\"q\u0000~\u0000%pq\u0000~\u0000"
+"&q\u0000~\u0000/q\u0000~\u00003q\u0000~\u00005sq\u0000~\u0000 ppsr\u0000 com.sun.msv.grammar.OneOrMoreExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003exp"
+"q\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000%psq\u0000~\u0000\u0007q\u0000~\u0000%p\u0000sq\u0000~\u0000\u0000ppq\u0000~\u0000\u000fsq\u0000~\u0000 ppsq\u0000~\u0000\"q\u0000~"
+"\u0000%pq\u0000~\u0000&q\u0000~\u0000/q\u0000~\u00003q\u0000~\u00005q\u0000~\u00003sr\u0000\"com.sun.msv.grammar.Expressi"
+"onPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Expressi"
+"onPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$C"
+"losedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom"
+"/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000\n\u0001pq\u0000~\u0000\u0006q\u0000~\u0000?q\u0000~\u0000!q\u0000~\u0000:"
+"q\u0000~\u0000Bq\u0000~\u0000<q\u0000~\u0000\u0005q\u0000~\u0000\u000bq\u0000~\u00009q\u0000~\u0000Ax"));
            }
            return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
        }

        public class Unmarshaller
            extends be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.AbstractUnmarshallingEventHandlerImpl
        {


            public Unmarshaller(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallingContext context) {
                super(context, "----");
            }

            protected Unmarshaller(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallingContext context, int startState) {
                this(context);
                state = startState;
            }

            public java.lang.Object owner() {
                return nl.tudelft.repository.externalRouting.routing.model.jaxb.impl.LspImpl.PathTypeImpl.this;
            }

            public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
                throws org.xml.sax.SAXException
            {
                int attIdx;
                outer:
                while (true) {
                    switch (state) {
                        case  3 :
                            if (("node" == ___local)&&("http://jaxb.model.routing.externalRouting.repository.tudelft.nl" == ___uri)) {
                                context.pushAttributes(__atts, true);
                                state = 1;
                                return ;
                            }
                            revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        case  0 :
                            if (("node" == ___local)&&("http://jaxb.model.routing.externalRouting.repository.tudelft.nl" == ___uri)) {
                                context.pushAttributes(__atts, true);
                                state = 1;
                                return ;
                            }
                            break;
                    }
                    super.enterElement(___uri, ___local, ___qname, __atts);
                    break;
                }
            }

            public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
                throws org.xml.sax.SAXException
            {
                int attIdx;
                outer:
                while (true) {
                    switch (state) {
                        case  3 :
                            revertToParentFromLeaveElement(___uri, ___local, ___qname);
                            return ;
                        case  2 :
                            if (("node" == ___local)&&("http://jaxb.model.routing.externalRouting.repository.tudelft.nl" == ___uri)) {
                                context.popAttributes();
                                state = 3;
                                return ;
                            }
                            break;
                    }
                    super.leaveElement(___uri, ___local, ___qname);
                    break;
                }
            }

            public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
                throws org.xml.sax.SAXException
            {
                int attIdx;
                outer:
                while (true) {
                    switch (state) {
                        case  3 :
                            revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                            return ;
                    }
                    super.enterAttribute(___uri, ___local, ___qname);
                    break;
                }
            }

            public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
                throws org.xml.sax.SAXException
            {
                int attIdx;
                outer:
                while (true) {
                    switch (state) {
                        case  3 :
                            revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                            return ;
                    }
                    super.leaveAttribute(___uri, ___local, ___qname);
                    break;
                }
            }

            public void handleText(final java.lang.String value)
                throws org.xml.sax.SAXException
            {
                int attIdx;
                outer:
                while (true) {
                    try {
                        switch (state) {
                            case  3 :
                                revertToParentFromText(value);
                                return ;
                            case  1 :
                                eatText1(value);
                                state = 2;
                                return ;
                        }
                    } catch (java.lang.RuntimeException e) {
                        handleUnexpectedTextException(value, e);
                    }
                    break;
                }
            }

            private void eatText1(final java.lang.String value)
                throws org.xml.sax.SAXException
            {
                try {
                    _getNode().add(value);
                } catch (java.lang.Exception e) {
                    handleParseConversionException(e);
                }
            }

        }

    }

    public class Unmarshaller
        extends be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallingContext context) {
            super(context, "----------");
        }

        protected Unmarshaller(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return nl.tudelft.repository.externalRouting.routing.model.jaxb.impl.LspImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("id" == ___local)&&("http://jaxb.model.routing.externalRouting.repository.tudelft.nl" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 1;
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  3 :
                        if (("reservation" == ___local)&&("http://jaxb.model.routing.externalRouting.repository.tudelft.nl" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 4;
                            return ;
                        }
                        break;
                    case  6 :
                        if (("path" == ___local)&&("http://jaxb.model.routing.externalRouting.repository.tudelft.nl" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 7;
                            return ;
                        }
                        break;
                    case  9 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  7 :
                        if (("node" == ___local)&&("http://jaxb.model.routing.externalRouting.repository.tudelft.nl" == ___uri)) {
                            _Path = ((nl.tudelft.repository.externalRouting.routing.model.jaxb.impl.LspImpl.PathTypeImpl) spawnChildFromEnterElement((nl.tudelft.repository.externalRouting.routing.model.jaxb.impl.LspImpl.PathTypeImpl.class), 8, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        state = 3;
                        continue outer;
                    case  2 :
                        if (("id" == ___local)&&("http://jaxb.model.routing.externalRouting.repository.tudelft.nl" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  8 :
                        if (("path" == ___local)&&("http://jaxb.model.routing.externalRouting.repository.tudelft.nl" == ___uri)) {
                            context.popAttributes();
                            state = 9;
                            return ;
                        }
                        break;
                    case  9 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  5 :
                        if (("reservation" == ___local)&&("http://jaxb.model.routing.externalRouting.repository.tudelft.nl" == ___uri)) {
                            context.popAttributes();
                            state = 6;
                            return ;
                        }
                        break;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        state = 3;
                        continue outer;
                    case  9 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        state = 3;
                        continue outer;
                    case  9 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  0 :
                            state = 3;
                            continue outer;
                        case  1 :
                            eatText1(value);
                            state = 2;
                            return ;
                        case  4 :
                            eatText2(value);
                            state = 5;
                            return ;
                        case  9 :
                            revertToParentFromText(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Id = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Reservation = javax.xml.bind.DatatypeConverter.parseFloat(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
                has_Reservation = true;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

    }

}
