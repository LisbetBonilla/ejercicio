package com.tiernoparla.ejercicioelementales;

public class Contador5Digitos2 {

    public static boolean stop_condition(int[] digitos) {
        return digitos[0] < 10 && digitos[1] < 10 && digitos[2] < 10 && digitos[3] < 10 && digitos[4] < 10;
    } //continue_condition

    public static void print_digitos(int[] digitos) {
        System.out.println(digitos[0] + " " + digitos[1] + " " + digitos[2] + " " + digitos[3] + " " + digitos[4]);
    } //print_digitos

    public static int update_next_digit(int[] digitos, int pos) {

        if (digitos[pos] == 10) {
            return digitos[pos + 1] + 1;
        }

        return digitos[pos + 1];

    } //update_next_digit

    public static int update_this_digit(int[] digitos, int pos) {

        if (digitos[pos] == 10) {
            return 0;
        }

        return digitos[pos];

    } //update_next_digit

    public static void main(String[] args) {

        final int TAM = 5;

        int digitos[] = new int[TAM];

        while (stop_condition(digitos)) {

            print_digitos(digitos);

            digitos[0]++;

            for (int i = 0; i < digitos.length - 1; i++) {
                digitos[i + 1] = update_next_digit(digitos, i);
                digitos[i] = update_this_digit(digitos, i);
            } //for 
            
        } //while
    
    } //main

} //public class
