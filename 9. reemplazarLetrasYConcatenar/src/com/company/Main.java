package com.company;
/*
9.  Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza  todas las a del
    String  anterior  por  una e,  adicionalmente  concatenar  a  esta  frase  una adicional
    que ustedes quieran incluir por consola y las muestre luego unidas.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

        String idea = "La sonrisa sera la mejor arma contra la tristeza";
        System.out.println("Ingrese una frase: ");
        String textoIngresado = sc.nextLine();

        idea = idea.replace ('a', 'e');

        System.out.println(idea + " " + textoIngresado);
    }
}
