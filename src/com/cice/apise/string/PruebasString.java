/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.apise.string;

/**
 *
 * @author cecilia
 */
public class PruebasString {
    
    public static void main (String[] args){
        boolean esMayor = 2>4;
        boolean esIgual = 2==(3-1);
        
        boolean comparaValoresBool = esMayor == esIgual;
        
        boolean comparaChars = ('a'!='e');
        
        System.out.println(esMayor +" "+esIgual +" "+comparaValoresBool +" "+comparaChars +" ");
        
        String nombre = new String("Gustavo");
        String otroNombre = "Gustavo";
        
        String sc = new String("Gustavo");
        String sc1 = sc;
        
        boolean comparacionSB = (sc==sc1);
        
        boolean nombresIguales = (nombre == otroNombre);//(nombre.equals(otroNombre));
        
        System.out.println(comparacionSB);
        
        boolean sonIguales = nombre.equalsIgnoreCase(otroNombre);
        
        int posicion = nombre.indexOf("ta");
        
        System.out.println(posicion);
        
        String cadena = new String("esta es mi cadena");
        
        System.out.println(cadena.substring(3));
        
        String cadena1 = "cecilia_g6@hotmail.com";
        
        int i = cadena1.indexOf("@");
        
        System.out.println(cadena1.substring(0, i));
        
        String[] miCad = cadena1.split(" ");
        
        for(String cade:miCad){
            System.out.println(cade);
        }
        
        System.out.println(cadena.replace("esta", "aquella"));
        
        String cadena2 = "         cadena con espacios            intermedios y finales   ";
        
        System.out.println(cadena2.trim());
        
        System.out.println(2+4+"9");
        
    }
    
}
