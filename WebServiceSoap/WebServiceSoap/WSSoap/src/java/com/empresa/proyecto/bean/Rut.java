package com.empresa.proyecto.bean;

public class Rut {
    
    private int digitosRut;
    private String verificadorRut;
    private String comparadorRut;

    public Rut(){
    }

    public String getComparadorRut() {
        return comparadorRut;
    }

    public void setComparadorRut(String comparadorRut) {
        this.comparadorRut = comparadorRut;
    }

    public int getDigitosRut() {
        return digitosRut;
    }

    public void setDigitosRut(int digitosRut) {
        this.digitosRut = digitosRut;
    }

    public String getVerificadorRut() {
        return verificadorRut;
    }

    public void setVerificadorRut(String verificadorRut) {
        this.verificadorRut = verificadorRut;
    }

}
