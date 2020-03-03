package com.company;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
13. Realizar un algoritmo que permita consulta la fecha y
    hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)
*/
public class Main {

    public static void main(String[] args) {

        Date objFecha = new Date();
        SimpleDateFormat objFormatoFecha = new SimpleDateFormat("yyyy/MM/dd hh: mm: ss a");
        System.out.println("Fecha y hora actual: " + objFormatoFecha.format(objFecha));

    }
}
