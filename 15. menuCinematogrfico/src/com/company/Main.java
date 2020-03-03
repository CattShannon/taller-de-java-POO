package com.company;
import java.util.Scanner;
/*
15. Hacer un programa que muestre el siguiente menú de opciones

    ****** GESTION CINEMATOGRÁFICA ********
    1-NUEVO ACTOR
    2-BUSCAR ACTOR
    3-ELIMINAR ACTOR
    4-MODIFICAR ACTOR
    5-VER TODOS LOS ACTORES
    6-VER PELICULAS DE LOS ACTORES
    7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
    8-SALIR

    EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8, MIENTRAS SE DIGITE
    UNA DE LAS CINCO OPCIONES DEBE SEGUIR MOSTRADO EL MENU Y SI EL USUARIO DIGITA
    UN NUMERO QUE NO ESTA EN EL MENU SE DEBE ARROJAR UN MENSAJE " OPCION INCORRECTO".
    Y MOSTRAR EL MENU NUEVAMENTE.
*/
public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do{
            System.out.println(menu());
            System.out.println("Elija una opcion: ");
            opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.out.println("SALIENDO ...");
                    break;
                default:
                    System.out.println("OPCION INCORRECTA.");
            }


        }while(opcion != 8);

        System.out.println("HA SALIDO DEL MENÚ.");

    }

    public static String menu(){
        return "******GESTION CINEMATOGRAFICA******\n"
                +" 1 - NUEVO ACTOR\n"
                +" 2 - BUSCAR ACTOR\n"
                +" 3 - ELIMINAR ACTOR\n"
                +" 4 - MODIFICAR ACTOR\n"
                +" 5 - VER TODOS LOS ACTORES\n"
                +" 6 - VER PELICULAS DE LOS ACTORES\n"
                +" 7 - VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n"
                +" 8 - SALIR\n";
    }
}
