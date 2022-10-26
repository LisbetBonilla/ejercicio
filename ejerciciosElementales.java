package com.tiernoparla.ejercicioelementales;

import java.lang.Math;
import java.util.Scanner;

public class ejerciciosElementales {

    public static void main(String[] arg) {

        /*
        int N = 31752;
        int tam = 5;        
        int tmp = N;
        //int cifras;
        int[] arr = new int [tam];
        
        for(int i = 0; i <tam; i++){
            arr[i] =tmp %10;
            System.out.println(arr[i]);
            tmp = tmp/10;           
         }
          double x =0;
         for(int i =0; i < tam; i++){
             x = x + arr[i]*Math.pow(10,tam-(i-1));
         }
            System.out.println((int)x );
   

        /*
     //capicua
        
         // sacar las 4 cifras de un mun de 4 cifras
         int N = 1551;
         int tam = 4;
         int tmp = N;
         // int cifra;
         int [] cifras = new int[tam];
        
         for(int i = 0; i < tam; i++){
            cifras[i] =tmp % 10;
            System.out.println(cifras[i]);
            tmp = tmp/10;       
         }  
          //recuperar el número    
        
         double x =0;
         for(int i =0; i < tam; i++){
            x = x + cifras[i]*Math.pow(10,tam-(i+1)); 
         }
         //double x = cifras[0]*Math.pow(10,tam-1) + cifras[1]*Math.pow(10,tam-2) + cifras[2]*Math.pow(10,tam-3) + cifras[3]*Math.pow(10,tam-4);
         System.out.println((int)x);
         //System.out.println(cifras[0]*10^(tam-1) + cifras[1]*10^(tam-2) + cifras[2]*10^(tam-3) + cifras[3]*10^(tam-4));
        
          /*
          System.out.println(N%10); // primera cifra
          System.out.println((N/10)%10); // segunda cifra
          System.out.println(((N/10)/10)%10); //tercera cifra
          System.out.println((((N/10)/10)/10)%10); //cuarta cifra
  

     //calcular y guardar todos los terminos de fibonacci hasta el N
          // tengo N
          int N = 8;
          // defino un array de tamano N
          int [] Fib = new int[N];
          // guardo los dos primeros terminos
          Fib [0]= 1;
          Fib [1]= 1;
          // loop para calcular y guardar los siguientes terminos hasta N <--
         for (int i= 2; i < N; i++){
          Fib [i] = Fib[i-1] + Fib[i-2]; 
         }//FOR
         for(int i=0; i < Fib.length; i++){
             System.out.println(Fib[i]);
         }         
     //ARRAYS  
         String[] palabras = {"hola", "adios"};
        
         String[] palabras2 =new String[23];
        
         System.out.println(palabras2 [0]);             
        
         System.out.println(palabras[0]);
         System.out.println(palabras[1]);
        
         palabras[0] ="algo aqui";
        
         System.out.println(palabras [0]);
        
         for(int i=0; i < palabras.length; i++){
            System.out.println(palabras [i]);
         }
     
     //ternino N de la sucecion de Pibonacci
        
         int N =15; 
         int X1 = 1;
         int X2 = 1;
        
         int Fib = 0;
        
            for( int i =3; i <=N; i++){
              Fib = X2 + X1;
              X1 = X2;
              X2 = Fib;
             }//FOR
        
         System.out.println(Fib);4
        
     //SCANER
         Scanner sc = new Scanner(System.in);
         
         int N;
         int D;
         
         System.out.println("Dame N:");
         N = sc.nextInt();
         
         System.out.println("Dame D:");
         D = sc.nextInt();
         
         
         int R =N;
         int Q =0;
         
         while(R>=D){
             R = R - D;
             Q++;
         } //WHILE
         System.out.println(N ==D*Q+R);
        
      //PRINTEAR nums pares del 1 al 10
            for (int i =1; i <=10; i++){
                if (i %2 ==0) {
               System.out.println(i);
           }
       }
        
     //NUMEROS PARES DEL 1 AL 10 CON WHILE
         int num = 1;
         while (num <=10) {
            if(num % 2 == 0)
                System.out.println(num);
         num++;       
        }
 
     //OPERACIONES CON WHILE
         int N =45;
         int D =12;
         
         int R =N;
         int Q =0;
         
         while(R>=D){
             System.out.println(R);
             R = R - D;
             System.out.println(R);
             Q++;
         } //WHILE   
            
         System.out.println(N ==D*Q+R);
         */
    }//MAIN   
}//PUBLIC

