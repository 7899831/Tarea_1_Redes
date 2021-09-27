package com.empresa.proyecto.controller;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ClienteServlet", urlPatterns = {"/cliente.do"})
public class ClienteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         Gson gson = new Gson();
         String jsonString = gson.toJson(listarRut());
         response.setContentType("application/json");
         response.getWriter().write(jsonString); 
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         int digitoRut = Integer.parseInt(request.getParameter("digiRut"));
         String verificadoRut = request.getParameter("veriRut");
         insertarRut(digitoRut,verificadoRut);
         response.setContentType("text/plain");
         response.getWriter().write("Datos Ingresados");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

    private static String insertarRut(int insertarRut, java.lang.String arg1) {
        com.empresa.proyecto.ws.RutWebService_Service service = new com.empresa.proyecto.ws.RutWebService_Service();
        com.empresa.proyecto.ws.RutWebService port = service.getRutWebServicePort();
        return port.insertarRut(insertarRut, arg1);
    }

    private static java.util.List<com.empresa.proyecto.ws.Rut> listarRut() {
        com.empresa.proyecto.ws.RutWebService_Service service = new com.empresa.proyecto.ws.RutWebService_Service();
        com.empresa.proyecto.ws.RutWebService port = service.getRutWebServicePort();
        return port.listarRut();
    }
}
    