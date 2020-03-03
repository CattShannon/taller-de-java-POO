package com.company;
/*
5.  Muestra los números impares y pares del 1 al 100 (ambos incluidos).
    Usa un bucle while.
*/

public class Main {

    public static void main(String[] args) throws InterruptedException {

        int numero = 1;

        System.out.println("Mostrando los numeros pares e impares del 1 al 100.");

        Thread.sleep(1000);  /*Una pausa para que el usuario logre leer el mensaje*/

        while(numero <= 100){
            if(numero % 2 == 0){
                System.out.println("Par: \t" + numero);
            }else{
                System.out.println("Impar:  " + numero);
            }
            numero++;
        }
    }
}
