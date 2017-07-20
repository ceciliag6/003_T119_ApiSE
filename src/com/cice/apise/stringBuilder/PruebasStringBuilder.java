/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.apise.stringBuilder;

/**
 *
 * @author cecilia
 */
public class PruebasStringBuilder {
    
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        sb.append("Esto es una opción de cadena");
        System.out.println("   hola   ".trim().length());
        sb.append(". Esta es otra secuencia");
        System.out.println(sb);
        sb.insert(0, "Mi tercera inserción, pero será la primera. ");
        System.out.println(sb);
        sb.replace(0, 5, "Pizza");
        System.out.println(sb);
        sb.delete(0, 20);
        System.out.println(sb);
    }
    
}
