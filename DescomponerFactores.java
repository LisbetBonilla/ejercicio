package com.tiernoparla.ejercicioelementales;

public class DescomponerFactores {
    
    public static void main(String[] args) {
        int n = 100;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (Math.pow(i , j) == n){
                    System.out.println(n+" = "+i+"^"+j);
                } //if
            } //forif
        } //for
    } //main
} //public class

