package com.tiernoparla.ejercicioelementales;
 import java.lang.Math;
 import java.util.Scanner;

public class ContarVocalesString {
   public static void main(String[] arg) {
      String palabra = "abcde";
      int contador = 0;
              for(int i = 0; i < palabra.length(); i++){
                 // Character.toLowerCase(palabra.charAt(i));
                if ( 
                        (palabra.charAt(i)=='a') || 
                        (palabra.charAt(i)=='e') || 
                        (palabra.charAt(i)=='i') || 
                        (palabra.charAt(i)=='o') || 
                        (palabra.charAt(i)=='u')){                
                    contador++;
                    
                    }//if
                }//for
   
              System.out.println("La palabra " + palabra + " contiene " 
                      + contador + " vocales");
   }//main
}//public class
