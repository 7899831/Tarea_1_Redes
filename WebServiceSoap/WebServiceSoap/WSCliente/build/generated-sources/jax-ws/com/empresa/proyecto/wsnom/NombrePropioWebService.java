
package com.empresa.proyecto.wsnom;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "NombrePropioWebService", targetNamespace = "http://ws.proyecto.empresa.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NombrePropioWebService {


    /**
     * 
     * @return
     *     returns java.util.List<com.empresa.proyecto.wsnom.NombrePropio>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarNombrePropio", targetNamespace = "http://ws.proyecto.empresa.com/", className = "com.empresa.proyecto.wsnom.ListarNombrePropio")
    @ResponseWrapper(localName = "listarNombrePropioResponse", targetNamespace = "http://ws.proyecto.empresa.com/", className = "com.empresa.proyecto.wsnom.ListarNombrePropioResponse")
    @Action(input = "http://ws.proyecto.empresa.com/NombrePropioWebService/listarNombrePropioRequest", output = "http://ws.proyecto.empresa.com/NombrePropioWebService/listarNombrePropioResponse")
    public List<NombrePropio> listarNombrePropio();

    /**
     * 
     * @param agregarNombrePropio
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "agregarNombrePropio", targetNamespace = "http://ws.proyecto.empresa.com/", className = "com.empresa.proyecto.wsnom.AgregarNombrePropio")
    @ResponseWrapper(localName = "agregarNombrePropioResponse", targetNamespace = "http://ws.proyecto.empresa.com/", className = "com.empresa.proyecto.wsnom.AgregarNombrePropioResponse")
    @Action(input = "http://ws.proyecto.empresa.com/NombrePropioWebService/agregarNombrePropioRequest", output = "http://ws.proyecto.empresa.com/NombrePropioWebService/agregarNombrePropioResponse")
    public String agregarNombrePropio(
        @WebParam(name = "agregarNombrePropio", targetNamespace = "")
        String agregarNombrePropio);

}
