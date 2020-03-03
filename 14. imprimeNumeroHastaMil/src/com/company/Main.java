package com.company;
import java.util.Scanner;
/*
14. Crear un programa que pida un numero por teclado y que imprima por
    pantalla los números desde el numero introducido hasta 1000 con saldos
    de 2 en 2.
*/
public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int numeroInicio = 0;

        do{

            System.out.println("Ingrese el numero desde el que quiere iniciar el conteo");
            numeroInicio = sc.nextInt();

            if(numeroInicio > 1000){
                System.out.println("el numero ingresado no debe ser mayor a 1000");
            }

        }while(numeroInicio > 1000);

        for(int i = numeroInicio ; i <= 1000 ; i += 2){
            System.out.println(i);
        }
    }
}
