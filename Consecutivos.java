package com.tiernoparla.ejercicioelementales;


public class Consecutivos {
      public static boolean consecutivos(int[] numeros) {

        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] + 1 != numeros[i + 1]) {
                return false;
            } // if no son consecutivos
        } // for

        return true;
    } // metodo para saber si son consecutivos

    public static void main(String[] args) {

        int[] n = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // números

        if (consecutivos(n)) {
            System.out.println("Los números son consecutivos.");
        } // if son consecutivos
        else {
            System.out.println("Los números no son consecutivos.");
        } // if no son consecutivos

    }

}
