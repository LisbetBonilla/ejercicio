package com.tiernoparla.ejercicioelementales;
 import java.lang.Math;
 import java.util.Arrays;
 import java.util.Scanner;
 import java.util.regex.*;
 import java.util.Random;

public class Matrizes {
    public static void main(String[] arg) {

        /*
        int N = 5;
        
        int[][] matrix = new int [N][N];
        
        for(int i =0; i < matrix.length; i++){
            for (int j =0; j < matrix[i].length; j++){
                matrix[i][j] = i+j;
            }//for j
        }//for i
       
          for(int i =0; i < matrix.length; i++){
            for (int j =0; j < matrix[i].length; j++){
                System.out.println(matrix[i][j]);
            }//for j
            System.out.println("");
        }//for i
        
          for (int[] arr: matrix){
              System.out.println(Arrays.toString(arr));
          }
          */
        
        Random rnd = new Random();
        for(int i =0; i < 10; i++){
            if(rnd.nextBoolean()){
                System.out.println(1);
            }else {
                System.out.println(0);
            }
        }
        
        
        
    }//main
}//public class
