package com.company;
import java.util.Scanner;

/*
4.  Lee  un  número  por  teclado  que  pida  el  precio  de  un  producto  (puede  tener decimales)
    y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
*/

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double IVA = 0.21;

        System.out.println("Digite el precio del producto: ");

        double precio = sc.nextDouble();
        double precioConIVA = precio * (1 + IVA);

        System.out.println("El precio del producto con el IVA incluido es de " +
                precioConIVA + "$");

    }
}
