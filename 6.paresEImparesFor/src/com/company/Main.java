package com.company;

import java.util.Scanner;

/*
6.  Realiza el ejercicio anterior usando un ciclo for.
*/
public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Mostrando los numeros pares e impares del 1 al 100.");

        Thread.sleep(1000);  /*Una pausa para que el usuario logre leer el mensaje*/

        for (int numero = 1; numero <= 100; numero++) {
            if (numero % 2 == 0) {
                System.out.println("Par: \t" + numero);
            } else {
                System.out.println("Impar:  " + numero);
            }
        }
    }
}
