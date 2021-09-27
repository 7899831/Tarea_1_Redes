package com.empresa.proyecto.ws;

import com.empresa.proyecto.bean.NombrePropio;
import com.empresa.proyecto.service.NombrePropioService;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "NombrePropioWebService")
public class NombrePropioWebService {

    NombrePropioService nombrepropioService = new NombrePropioService();
    
    @WebMethod(operationName = "agregarNombrePropio")
    public String agregarNombrePropio(@WebParam(name = "agregarNombrePropio") String NombreCompleto) {
        return nombrepropioService.agregarNombrePropio(NombreCompleto);
    }
    
    @WebMethod(operationName = "listarNombrePropio")
    public List<NombrePropio> listarNombrePropio(){
        return nombrepropioService.listarNombrePropio();
    }
}
