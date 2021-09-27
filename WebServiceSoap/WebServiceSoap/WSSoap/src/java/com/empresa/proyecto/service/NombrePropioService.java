package com.empresa.proyecto.service;

import com.empresa.proyecto.bean.NombrePropio;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NombrePropioService {
    
    List<NombrePropio> listaNombrePropio = new ArrayList<>();

    public NombrePropioService() {
    }
    
    public String agregarNombrePropio(String NombreCompleto){
                
        int size = listaNombrePropio.size();
        if (size!=0){
            listaNombrePropio.clear();
        }
        NombrePropio NP = new NombrePropio();
        String[] Partes=NombreCompleto.split(" ");
        int largo = Partes.length;
        String[] Nombres = new String[largo-2];
        
        for(int i=0;i<largo-2;i++){
            Nombres[i]=Partes[i];
        }
        //String[] Apellidos ={"asd"};
        String[] Apellidos = new String[2];
        int n=0;
        for(int j=largo-2;j<largo;j++){
            Apellidos[n]=Partes[j];
            n++;
        }
        NP.setNombre(Nombres);
        NP.setApellido(Apellidos);
        listaNombrePropio.add(NP);
        return "Se agrego el nombre " + Arrays.toString(NP.getNombre()) + Arrays.toString(NP.getApellido());
    }
    
    public List<NombrePropio> listarNombrePropio(){
        return listaNombrePropio;
    }
}
