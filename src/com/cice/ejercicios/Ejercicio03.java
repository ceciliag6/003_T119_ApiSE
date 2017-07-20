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
public class Ejercicio03 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("a b c");
        //int i = 0;
        int posicion=0;
        do{
            posicion = sb.indexOf(" ", posicion);     
            if (posicion==-1){
                break;
            }
            System.out.println(posicion);
            sb.insert(posicion, '/');
            System.out.println(sb);
            //i = posicion+1; 
            //System.out.println(i);
            System.out.println(posicion);
            posicion = posicion+2;
        }while (posicion>=0);
   
    }
    
}
