package com.tiernoparla.ejercicioelementales;
 import java.lang.Math;
 import java.util.Scanner;


public class CaracterMedioString {
     public static void main(String[] arg) {
         //encontrar el caracter de en medio de una string.
         
         /* 
         String str = "abcdef";
          System.out.println("la letra del medio es: " 
                  + str.charAt(str.length()/2));
         //Si long es par, son 2 los caracteres de en medio.
         */

          String str = "abcdefgh";
          String par;        
          if(str.length() % 2 ==0){
              par =str.charAt(str.length()/2-1) + " " + str.charAt(str.length()/2);
              System.out.println(par);
          }
          else{
              System.out.println(str.charAt(str.length()/2));
          }
          

    
     }  //main 
}//public class
