package com.tiernoparla.ejercicioelementales;


public class NumerosPares {
public static boolean par (int n){
        String str = Integer.toString(n); // convierte el int a string
        int dur = str.length(); // se crea una int con la duracion de la string
        int[] nums = new int[str.length()]; // se crea un array con la duración de la string

        for (int i = 0; i < dur; i++) {
            nums[i] = str.charAt(i) - '0';
            if (nums[i] % 2 != 0) {
                return false;
            } // if par

        } // for
        return true;
    } // clase para saber si todos las cifras de un número son pares
    public static void main(String[] args) {

        if (par(222243)) {
            System.out.println("Todos los números son pares.");
        } // if par
        else {
            System.out.println("No todos los números son pares.");
        } // if no es par

    }
}

