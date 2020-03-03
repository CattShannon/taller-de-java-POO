package com.company;
import java.util.Scanner;
/*
7.  Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
    si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
*/
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean Seguir = false;
        int numero = 0;

        do{
            System.out.println("Ingrese un numero mayor o igual a cero: ");
            numero = sc.nextInt();
        }while(numero < 0);

        System.out.println("El numero ingresado es: " + numero);
    }
}
