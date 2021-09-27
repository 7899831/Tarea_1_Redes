package com.empresa.proyecto.controller2;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ClienteServletNom", urlPatterns = {"/clientenombre.do"})
public class ClienteServletNom extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Gson gson = new Gson();
        String jsonString = gson.toJson(listarNombrePropio());
        response.setContentType("application/json");
        response.getWriter().write(jsonString);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String NombreCom = request.getParameter("nomcom");
         agregarNombrePropio(NombreCom);
         response.setContentType("text/plain");
         response.getWriter().write("Datos Ingresados");
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }

    private static String agregarNombrePropio(java.lang.String agregarNombrePropio) {
        com.empresa.proyecto.wsnom.NombrePropioWebService_Service service = new com.empresa.proyecto.wsnom.NombrePropioWebService_Service();
        com.empresa.proyecto.wsnom.NombrePropioWebService port = service.getNombrePropioWebServicePort();
        return port.agregarNombrePropio(agregarNombrePropio);
    }

    private static java.util.List<com.empresa.proyecto.wsnom.NombrePropio> listarNombrePropio() {
        com.empresa.proyecto.wsnom.NombrePropioWebService_Service service = new com.empresa.proyecto.wsnom.NombrePropioWebService_Service();
        com.empresa.proyecto.wsnom.NombrePropioWebService port = service.getNombrePropioWebServicePort();
        return port.listarNombrePropio();
    }

    
}
