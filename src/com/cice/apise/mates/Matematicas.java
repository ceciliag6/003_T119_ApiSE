/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.apise.mates;

/**
 *
 * @author cecilia
 */
public class Matematicas {
    public static void main (String[] args){
        long a;
        long b;
        long suma=0;
        a = Math.round(Math.random()*100);
        b = Math.round(Math.random()*100);
        System.out.println(a);
        System.out.println(b);
        if(a<b){
            for(long i = a; i<=b; i++){
                suma = suma + i;
            }
        }  
        else{
            for(long i = b; i<=a; i++){
                suma = suma + i;
            }            
        }
        System.out.println(suma);
    }
    
}
