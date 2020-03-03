package com.company;
import java.util.Scanner;
/*
10. Realizar una aplicación de consola, que al ingresar una frase por teclado elimine
   los espacios que esta contenga
*/
public class Main {

    public static void main(String[] args) {

        System.out.println("Ingrese una frase para eliminarle los espacios: ");
        Scanner sc = new Scanner(System.in);

        String frase = sc.nextLine();

        System.out.println("Frase original: " + frase);

        frase = frase.replace(" ", "");

        System.out.println("Frase sin espacios:" + frase);
    }
}
