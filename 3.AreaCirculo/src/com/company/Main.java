package com.company;
import java.util.Scanner;

/*
    3.  Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá porteclado
    (recuerda  pasar  de  String  a  double  conDouble.parseDouble).  Usa  la constante PI y
    el método pow de Math.
*/

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un valor para el radio: ");

        double radio = Double.parseDouble(sc.next());
        double area;

        area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área del círculo para un radio con un valor de " + radio
                + " es " + area);

    }
}
