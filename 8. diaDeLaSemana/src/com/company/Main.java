package com.company;
import java.util.Scanner;
/*
8.  Crea una aplicación por consola que nos pida un día de la semana
    y que nos diga si es un díalaboral o no. Usa unswitchpara ello.
*/

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String dia;
        boolean diaLaboral = false;
        boolean error = false;

        System.out.println("Digite un día de la semana.");

        dia = sc.next();

        switch (dia.toUpperCase()) {
            case "LUNES":
                diaLaboral = true;
                break;
            case "MARTES":
                diaLaboral = true;
                break;
            case "MIERCOLES":
                diaLaboral = true;
                break;
            case "MIÉCOLES":
                diaLaboral = true;
            case "JUEVES":
                diaLaboral = true;
                break;
            case "VIERNES":
                diaLaboral = true;
                break;
            case "SABADO":            /*en Colombia los sábados son días laborales*/
                diaLaboral = true;
                break;
            case "DOMINGO":
                break;
            default:
                System.out.println("Error, la cadena ingresada no corresponde a ningun día de la semana.");
                error = true;

        }

        if (!error) {

            if (diaLaboral) {
                System.out.println("El día ingresado es día laboral");
            } else {
                System.out.println("El día ingresado no es día laboral");
            }

        }
    }
}
