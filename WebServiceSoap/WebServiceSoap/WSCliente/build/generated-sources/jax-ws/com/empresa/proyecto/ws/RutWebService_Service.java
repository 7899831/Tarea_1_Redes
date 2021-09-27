
package com.empresa.proyecto.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RutWebService", targetNamespace = "http://ws.proyecto.empresa.com/", wsdlLocation = "http://localhost:8080/WSSoap/RutWebService?wsdl")
public class RutWebService_Service
    extends Service
{

    private final static URL RUTWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException RUTWEBSERVICE_EXCEPTION;
    private final static QName RUTWEBSERVICE_QNAME = new QName("http://ws.proyecto.empresa.com/", "RutWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WSSoap/RutWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RUTWEBSERVICE_WSDL_LOCATION = url;
        RUTWEBSERVICE_EXCEPTION = e;
    }

    public RutWebService_Service() {
        super(__getWsdlLocation(), RUTWEBSERVICE_QNAME);
    }

    public RutWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), RUTWEBSERVICE_QNAME, features);
    }

    public RutWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, RUTWEBSERVICE_QNAME);
    }

    public RutWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RUTWEBSERVICE_QNAME, features);
    }

    public RutWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RutWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RutWebService
     */
    @WebEndpoint(name = "RutWebServicePort")
    public RutWebService getRutWebServicePort() {
        return super.getPort(new QName("http://ws.proyecto.empresa.com/", "RutWebServicePort"), RutWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RutWebService
     */
    @WebEndpoint(name = "RutWebServicePort")
    public RutWebService getRutWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.proyecto.empresa.com/", "RutWebServicePort"), RutWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RUTWEBSERVICE_EXCEPTION!= null) {
            throw RUTWEBSERVICE_EXCEPTION;
        }
        return RUTWEBSERVICE_WSDL_LOCATION;
    }

}
