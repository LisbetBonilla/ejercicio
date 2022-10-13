package com.tiernoparla.ejercicioelementales;
 import java.lang.Math;
 import java.util.Scanner;

public class AñoBisiesto {
    public static void main(String[] arg) {
        
        Scanner sn = new Scanner(System.in);
 
        // Pido el año
        System.out.println("Introduce un año");
        int anio = sn.nextInt();
 
        //Si es divisible entre 4 y no es divisible entre 100 o es divisible entre 100 y 400.
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }
        
    }//main
}//public class
