package com.tiernoparla.ejercicioelementales;

public class StringInvertida {
   public static void main(String[] args) {

        String palabras = "hola que paso";
        String invertido = "";

        for (int i = palabras.length() - 1; i >= 0; i--) {
            invertido += palabras.charAt(i); // se añade el caracter a la nueva string
        } // for 

        System.out.println(invertido);
    } // main
}
        
