package com.tiernoparla.ejercicioelementales;
 import java.lang.Math;
 import java.util.Scanner;

public class SumaNumerosEnteros {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in); 
		 System.out.println ("Introduzca un número entero");
		int a = sc.nextInt(); 
		int b,sum=0;
		while(a>0){
		
                    if (a != 0){			
			b=a % 10;
			sum=sum+b;
			a=a/10;
			}//if
		} //while	
		System.out.println(sum);
       
    } //main 
    
} //public class
