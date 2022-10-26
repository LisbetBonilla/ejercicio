package com.tiernoparla.ejercicioelementales;

public class Password {

    public static void main(String[] arg) {

        String pass = "abiuniu2j8";
        boolean pass_ok = true;

        //long 10
        if (pass.length() < 10) {
            pass_ok = false;
        }

        System.out.println(pass.matches("[a-zA-Z0-9]*"));

        //solo letras y nums
        if (!pass.matches("[a-zA-Z0-9]*")) {
            pass_ok = false;
        }

        // al menos 2 nums
        int counter = 0;

        for (char c : pass.toCharArray()) {
            if (Character.isDigit(c)) {
                counter++;
            }//if
        }//for
        if (counter < 2) {
            pass_ok = false;
        }//if

        if (pass_ok) {
            System.out.println("el password ésta ok");
        } else {
            System.out.println("el password está mal");
        }

        /*MI METODO
        boolean esValida = true;
        
        String password;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce password:");
        password = entrada.nextLine();
        
        int contador =0;
        for(int i =0; i < password.length(); i++){
            if(Character.isDigit(password.charAt(i))){
                contador++;           
            }
            
        }//for
        if(password.length() < 10&& contador < 2){
            esValida = false;
        System.out.println("El password" + password + " es incorrecto");
        }
         */
    }//main
}//public class
