package com.tiernoparla.ejercicioelementales;

 import java.lang.Math;
 import java.util.Scanner;


public class fibonacci {
    public static void main(String[] arg) {
        
     //calcular  termino N de fibonacci con arrays en vez de x1, x2 y Fib   
        
        int [] Fib = {1,1,0};
         int N = 6;
         for(int i=3; i<= N; i++){
            Fib [2] = Fib[1] + Fib[0];
            Fib [0] = Fib[1];
            Fib [1] = Fib[2];       
         } //for
         
         System.out.println(Fib[2]);
         
          //1º declaro array de tamaño 3 de int {x1, x2, Fib}
          //2º inicializo el array con {x1= 1, x2=1, Fib=0}
          //3ºhago el for -->pero donde estaba Fib ahora esta ARR[2]                       
      
                                      
          
} //main
    

} //public class