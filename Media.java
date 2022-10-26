package com.tiernoparla.ejercicioelementales;

public class Media {

    public static void main(String[] arg) {
        //Calcule la media de X números 
        int arr[] = new int[]{1, 2, 3, 4};
        int mean;
        int suma = 0;

        for (int i = 0; i < arr.length; i++) {
            suma += arr[i];
        }
        mean = suma / arr.length;
        System.out.println(mean);

    }//main

}//public class
