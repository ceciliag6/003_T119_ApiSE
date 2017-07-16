/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.ejercicios;

import java.util.Scanner;

/**
 *
 * @author cecilia
 */
public class Ejercicio01 {
    
    public void pincipal(){
    Scanner sc = new Scanner(System.in);
    String cadena1, cadena2;
    int longitud1, longitud2, longitud3;
    System.out.println("Introduce una cademna de caracteres");
    cadena1 = sc.next();
    longitud1 = cadena1.length();
    System.out.println("Introduce una segunda cadena de caracteres");
    cadena2 = sc.next();
    longitud2 = cadena2.length();
    
    if(longitud1>longitud2){
        System.out.println("la cadena " + cadena1 + " es más larga que la cadena " + cadena2);
    }
    else{
        if (longitud1 == longitud2){
            System.out.println("las dos cadenas tienen el mismo número de caracteres");
        }
        else {
            System.out.println("la cadena " + cadena2 + " es más larga que la cadena " + cadena1);
        }
    }

    
    
    }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una nueva cadena de caracteres");
        String cadena = sc.nextLine();
        System.out.println(cadena);
        int num_vocales = 0;
        char caracter;
        for(int i=0;i<cadena.length();i++){
            caracter = cadena.toLowerCase().charAt(i);
            switch (caracter){
                case 'a': 
                case 'e': 
                case 'i': 
                case 'o': 
                case 'u': 
                    num_vocales = num_vocales + 1;                 
            }
                    
        }
        System.out.println("El número de vocales dentro de la cadena es: "+num_vocales);
    }

    public void miSplit(String[] args){
        Scanner sc = new Scanner(System.in);
        String miCadena, cadenaModificada;
        System.out.println("Introduce una cadena de caracteres");
        miCadena = sc.nextLine();
        String[] palabras = miCadena.split(" ");
        for(String palabra:palabras){
            System.out.println(palabra);
        }   
        
    }
    
}

