package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 12;
        int b = 8;

        if(a == b){
            System.out.println("Los numeros ingresados son iguales.");
        }else if(a < b){
            System.out.println("La variable b es la mayor con un valor de: " + b);
        }else{
            System.out.println("La variable a es la mayor con un valor de: " + a);
        }
    }
}
