package com.tiernoparla.ejercicioelementales;
 import java.lang.Math;
 import java.util.Scanner;

public class Interes {
    public static void main(String[] arg) {
        
        int años = 5;
        double interes = 3;
        double dinero = 300;

            for(int i = 1; i <= años; i++){
                dinero = dinero + dinero*interes/100;   
             }
            System.out.println(dinero);
           
    }//main
    
}//public class
