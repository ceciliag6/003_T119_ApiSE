/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.ejercicios;

/**
 *
 * @author cecilia
 */
public class Ejercicio02 {
    
    
    
    public static void main(String[] args){
        String cadena = new String("aasta es una cadena de caracteres muy larga");
        char miCaracter;
        int numAes = 0;
        for(int i=0; i<cadena.length(); i++){
            miCaracter = cadena.charAt(i);
            if (miCaracter == 'a') {
                numAes++;
            }
        }
        System.out.println(numAes);
        
        int pos = 0;
        int miPosicion = 0;
        /*
        while(pos < cadena.length()){
            miPosicion = cadena.indexOf("a", pos);
            System.out.println("tenemos a en la posición "+miPosicion);
            pos = ++miPosicion;
           // pos++;
        }
        */
        while(pos < cadena.length()){
            miPosicion = cadena.indexOf("a",pos);
            System.out.println("tenemos a en la posición "+miPosicion); 
            pos = ++miPosicion;
        }
}
    
}
