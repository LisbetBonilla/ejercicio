package com.tiernoparla.ejercicioelementales;

public class Producto_nums_Impares {

    public static void main(String[] args) {

        
        long ProductoImpar = 1;

        for (int i = 1; i < 20; i += 2) {
            ProductoImpar = ProductoImpar * i;
        }

        System.out.println(
                "El resulato de multiplicar los 10 primeros numeros impares es:" + ProductoImpar);
    }
}
