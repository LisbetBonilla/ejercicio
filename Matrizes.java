package com.tiernoparla.ejercicioelementales;

import java.util.Random;

public class Matrizes {

    public static void main(String[] arg) {

        //metodo que le das un N, y dibuja por pantalla una matriz NxN
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
         
        
         //matriz NxN de 0's y 1's aleatorios
            final int N = 5;
        
           int[][] matrix = new int [N][N];
        
        Random rnd = new Random();
        for(int i =0; i < matrix.length; i++){
           for(int j = 0; j < matrix[i].length; j++){
              matrix[i][j] = (rnd.nextBoolean()) ? 1 : 0;
            }//for j
        }//for i
           
        for(int[] arr: matrix){
            System.out.println(Arrays.toString(arr));
        }//for
         */
 /*
        for(int i = 0; i < 10; i++){
            Random rnd2 = new Random();
            System.out.println(rnd2.nextDouble());
         }//for
         */
        final int N = 5;

        int[][] matrix = new int[N][N];

        Random rnd = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println((int) (Math.random() * 2));
            }//for j
        }//for i
    }//main
}//public class
