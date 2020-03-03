package com.company;
import java.util.Scanner;
/*
12. Pedir dos palabras por teclado, indicar si son iguales, sino
    son iguales mostrar sus diferencias.
*/
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palabra1;
        String palabra2;

        System.out.println("Ingrese la palabra 1: ");
        palabra1 = sc.nextLine();

        System.out.println("Ingrese la palabra 2: ");
        palabra2 = sc.nextLine();

        if(!palabra1.equals(palabra2)){

            if(palabra1.length() != palabra2.length()){

                System.out.println("Las palabras no tienen el mismo tamaño.");

            }else{

                for(int i = 0 ; i < palabra1.length() ; i++){

                    if(palabra1.charAt(i) != palabra2.charAt(i)){
                        System.out.println("las letras " + palabra1.charAt(i) + " y " + palabra2.charAt(i)
                                + " hacen que las palabras sean diferentes.");

                    }
                }
            }
        }
    }
}
