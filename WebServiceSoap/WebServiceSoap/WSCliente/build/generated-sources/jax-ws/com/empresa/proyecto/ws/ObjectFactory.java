
package com.empresa.proyecto.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.empresa.proyecto.ws package. 
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
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListarRut_QNAME = new QName("http://ws.proyecto.empresa.com/", "listarRut");
    private final static QName _ListarRutResponse_QNAME = new QName("http://ws.proyecto.empresa.com/", "listarRutResponse");
    private final static QName _InsertarRut_QNAME = new QName("http://ws.proyecto.empresa.com/", "insertarRut");
    private final static QName _InsertarRutResponse_QNAME = new QName("http://ws.proyecto.empresa.com/", "insertarRutResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.empresa.proyecto.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertarRutResponse }
     * 
     */
    public InsertarRutResponse createInsertarRutResponse() {
        return new InsertarRutResponse();
    }

    /**
     * Create an instance of {@link InsertarRut }
     * 
     */
    public InsertarRut createInsertarRut() {
        return new InsertarRut();
    }

    /**
     * Create an instance of {@link ListarRut }
     * 
     */
    public ListarRut createListarRut() {
        return new ListarRut();
    }

    /**
     * Create an instance of {@link ListarRutResponse }
     * 
     */
    public ListarRutResponse createListarRutResponse() {
        return new ListarRutResponse();
    }

    /**
     * Create an instance of {@link Rut }
     * 
     */
    public Rut createRut() {
        return new Rut();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarRut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "listarRut")
    public JAXBElement<ListarRut> createListarRut(ListarRut value) {
        return new JAXBElement<ListarRut>(_ListarRut_QNAME, ListarRut.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarRutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "listarRutResponse")
    public JAXBElement<ListarRutResponse> createListarRutResponse(ListarRutResponse value) {
        return new JAXBElement<ListarRutResponse>(_ListarRutResponse_QNAME, ListarRutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarRut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "insertarRut")
    public JAXBElement<InsertarRut> createInsertarRut(InsertarRut value) {
        return new JAXBElement<InsertarRut>(_InsertarRut_QNAME, InsertarRut.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarRutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "insertarRutResponse")
    public JAXBElement<InsertarRutResponse> createInsertarRutResponse(InsertarRutResponse value) {
        return new JAXBElement<InsertarRutResponse>(_InsertarRutResponse_QNAME, InsertarRutResponse.class, null, value);
    }

}
