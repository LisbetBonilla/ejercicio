
package com.tiernoparla.ejercicioelementales;
 import java.lang.Math;
 import java.util.Scanner;

public class menormayor {
    public static void main(String[] arg) {
        
        //dados N numeros, cual es el menor/mayor de todos
        
         double nums []= {1, -7.2, 4.5, -21, 3.14, 0};
         double min = 0;
      
         for(int i = 0; i <nums.length; i++){             
             if(min > nums [i]){
                 min = nums[i];
             }
             else {
                 //nada
                 min = min;
                 } //if-else
             }//for

        System.out.println("el minimo es: " + min);
       
    } // main   
} // public class
