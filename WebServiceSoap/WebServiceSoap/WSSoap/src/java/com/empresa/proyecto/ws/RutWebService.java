package com.empresa.proyecto.ws;

import com.empresa.proyecto.bean.Rut;
import com.empresa.proyecto.service.RutService;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "RutWebService")
public class RutWebService {

    RutService rutService = new RutService();
    
    @WebMethod(operationName = "insertarRut")
    public String insertarRut(@WebParam(name = "insertarRut") int ingresaDigitos,String ingresaVerificador) {
        return rutService.insertarRut(ingresaDigitos,ingresaVerificador);
    }

    @WebMethod(operationName = "listarRut")
    public List<Rut> listarRut() {
        return rutService.listarRut();
    }   
}