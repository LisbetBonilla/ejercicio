package com.tiernoparla.ejercicioelementales;

public class SiSonVocales {
      
   public static int vocales(String str){
        int i = 0;

        for(int x = 0; x<str.length();x++){
            if(str.charAt(x) == 'a' || str.charAt(x) == 'e' || str.charAt(x) == 'i' || str.charAt(x) == 'o' || str.charAt(x) == 'u'){
                i++;
            } // if coincide con las vocales se suma
        } // for x 
        return i; // numero de vocales

    } // método que cuenta las vocales


    public static void main(String[] args) {

        String str = "aabaa";

        if (!str.matches("[aeiou]*")){
            System.out.println("No todas son vocales y tiene "+vocales(str)+" vocales.");
        } // if son solo vocales
        else{
            System.out.println("Son todas vocales y tiene "+vocales(str)+" vocales.");
        } // if no son solo vocales

    } // main
} //public class
