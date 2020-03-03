package com.company;

import java.util.Scanner;

/*
    11. Realizar  la  construcción  de  un  algoritmo  que  permita  de  acuerdo  a  una
        frase pasada  por  consola, indicar  cual  es  la  longitud  de  esta  frase,  adicionalmente
        cuantas vocales tiene de “a,e,i,o,u”.
 */
public class Main {

    static int contadorA = 0;
    static int contadorE = 0;
    static int contadorI = 0;
    static int contadorO = 0;
    static int contadorU = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String fraseCuentaVocales;


        System.out.println("Ingrese una frase: ");
        fraseCuentaVocales = sc.nextLine();

        contarVocalesFrase(fraseCuentaVocales);

        System.out.println("A = " + contadorA);
        System.out.println("E = " + contadorE);
        System.out.println("I = " + contadorI);
        System.out.println("O = " + contadorO);
        System.out.println("U = " + contadorU);
    }

    public static void contarVocalesFrase(String fraseCuentaVocales) {
        String letraFrase;
        for (int i = 0; i < fraseCuentaVocales.length(); i++) {
            letraFrase = Character.toString(fraseCuentaVocales.charAt(i));
            switch (letraFrase.toUpperCase()) {
                case "A":
                    contadorA++;
                    break;
                case "E":
                    contadorE++;
                    break;
                case "I":
                    contadorI++;
                    break;
                case "O":
                    contadorO++;
                    break;
                case "U":
                    contadorU++;
                    break;
                default:

            }
        }
    }

}
