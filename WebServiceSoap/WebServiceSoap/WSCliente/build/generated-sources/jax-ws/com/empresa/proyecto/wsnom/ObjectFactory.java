
package com.empresa.proyecto.wsnom;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.empresa.proyecto.wsnom package. 
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

    private final static QName _AgregarNombrePropioResponse_QNAME = new QName("http://ws.proyecto.empresa.com/", "agregarNombrePropioResponse");
    private final static QName _AgregarNombrePropio_QNAME = new QName("http://ws.proyecto.empresa.com/", "agregarNombrePropio");
    private final static QName _ListarNombrePropio_QNAME = new QName("http://ws.proyecto.empresa.com/", "listarNombrePropio");
    private final static QName _ListarNombrePropioResponse_QNAME = new QName("http://ws.proyecto.empresa.com/", "listarNombrePropioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.empresa.proyecto.wsnom
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarNombrePropioResponse }
     * 
     */
    public ListarNombrePropioResponse createListarNombrePropioResponse() {
        return new ListarNombrePropioResponse();
    }

    /**
     * Create an instance of {@link AgregarNombrePropio }
     * 
     */
    public AgregarNombrePropio createAgregarNombrePropio() {
        return new AgregarNombrePropio();
    }

    /**
     * Create an instance of {@link ListarNombrePropio }
     * 
     */
    public ListarNombrePropio createListarNombrePropio() {
        return new ListarNombrePropio();
    }

    /**
     * Create an instance of {@link AgregarNombrePropioResponse }
     * 
     */
    public AgregarNombrePropioResponse createAgregarNombrePropioResponse() {
        return new AgregarNombrePropioResponse();
    }

    /**
     * Create an instance of {@link NombrePropio }
     * 
     */
    public NombrePropio createNombrePropio() {
        return new NombrePropio();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarNombrePropioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "agregarNombrePropioResponse")
    public JAXBElement<AgregarNombrePropioResponse> createAgregarNombrePropioResponse(AgregarNombrePropioResponse value) {
        return new JAXBElement<AgregarNombrePropioResponse>(_AgregarNombrePropioResponse_QNAME, AgregarNombrePropioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarNombrePropio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "agregarNombrePropio")
    public JAXBElement<AgregarNombrePropio> createAgregarNombrePropio(AgregarNombrePropio value) {
        return new JAXBElement<AgregarNombrePropio>(_AgregarNombrePropio_QNAME, AgregarNombrePropio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarNombrePropio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "listarNombrePropio")
    public JAXBElement<ListarNombrePropio> createListarNombrePropio(ListarNombrePropio value) {
        return new JAXBElement<ListarNombrePropio>(_ListarNombrePropio_QNAME, ListarNombrePropio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarNombrePropioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.proyecto.empresa.com/", name = "listarNombrePropioResponse")
    public JAXBElement<ListarNombrePropioResponse> createListarNombrePropioResponse(ListarNombrePropioResponse value) {
        return new JAXBElement<ListarNombrePropioResponse>(_ListarNombrePropioResponse_QNAME, ListarNombrePropioResponse.class, null, value);
    }

}
