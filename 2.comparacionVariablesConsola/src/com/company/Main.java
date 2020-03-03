package com.company;
import java.util.Scanner;

   /*
    2. Al ejercicio anterior agregar entrada por consola de dos valores e indicar
        si son mayores, menores o iguales.
   */

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Los numeros ingresados son iguales.");
        } else if (a < b) {
            System.out.println("La variable b es la mayor con un valor de: " + b);
        } else {
            System.out.println("La variable a es la mayor con un valor de: " + a);
        }

    }
}
