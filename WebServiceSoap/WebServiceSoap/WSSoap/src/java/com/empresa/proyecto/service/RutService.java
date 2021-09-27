package com.empresa.proyecto.service;

import com.empresa.proyecto.bean.Rut;
import java.util.ArrayList;
import java.util.List;

public class RutService {

    List<Rut> listaRut = new ArrayList<>();
    
    public RutService() {
    }
    
    public String insertarRut(int digitosRut, String verificadorRut){
        
        int size = listaRut.size();
        int numero;
        if (size!=0){
            listaRut.clear();
        }
        Integer M=0,S=1,T=(digitosRut);
		for (;T!=0;T=(int) Math.floor(T/=10))
			S=((S+T%10*(9-M++%6))%11);
        String Resultado="EL RUT NO ES VALIDO";
        
        if(("K").equals(verificadorRut) || ("k").equals(verificadorRut)){
            numero=-1;
        }
        
        else{
            numero = Integer.parseInt(verificadorRut);
        }
        
        if((S-1)==numero){
            Resultado="EL RUT ES VALIDO";
        }
        Rut r = new Rut();
        r.setDigitosRut(digitosRut);
        r.setVerificadorRut(verificadorRut);
        r.setComparadorRut(Resultado);
                
        listaRut.add(r);
       
        return "Se agrego " + r.getDigitosRut() +"-"+ r.getVerificadorRut()+ "   Verificador: "+r.getComparadorRut();
    }
    
    public List<Rut> listarRut(){
        return listaRut;
    }

}