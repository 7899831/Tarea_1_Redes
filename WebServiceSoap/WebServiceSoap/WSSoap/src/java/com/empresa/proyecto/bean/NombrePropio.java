package com.empresa.proyecto.bean;


public class NombrePropio {

    public NombrePropio() {
    }
    
    private String[] Nombre;
    private String[] Apellido;
    private String prueba;

    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }
    
    public String[] getNombre() {
        return Nombre;
    }

    public void setNombre(String[] Nombre) {
        this.Nombre = Nombre;
    }

    public String[] getApellido() {
        return Apellido;
    }

    public void setApellido(String[] Apellido) {
        this.Apellido = Apellido;
    }

    
        
}

