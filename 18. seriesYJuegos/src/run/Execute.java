package run;

import constants.AllConstants;
import objects.Series;
import objects.Videojuego;

public class Execute {

    public void executing() {

        int seriesEntregadas = 0;
        int juegosEntregados = 0;

        Series[] arraySeries = llenarArraySeries();
        Videojuego[] arrayVideojuegos = llenarArrayVideojuegos();

        entregarAlgunosElementos(arraySeries, arrayVideojuegos);
        seriesEntregadas = contarSeriesEntregadas(arraySeries);
        juegosEntregados = contarJuegosEntregados(arrayVideojuegos);

        System.out.println(("La cantidad de series entregadas es: ").concat(String.valueOf(seriesEntregadas)));
        System.out.println(("La cantidad de videojuegos entregados es: ").concat(String.valueOf(juegosEntregados)));

        System.out.println(("\nEn total la cantidad de elementos entregados es: ")
                .concat(String.valueOf(seriesEntregadas + juegosEntregados)));

        Series mayorSerie = encontrarMayorSeries(arraySeries);
        Videojuego mayorJuego = encontrarMayorJuego(arrayVideojuegos);

        System.out.println(("\nLa mayor serie es:\n").concat(mayorSerie.toString()));
        System.out.println(("\nEl mayor videojuego es:\n").concat(mayorJuego.toString()));


    }

    public Series[] llenarArraySeries() {
        Series[] arraySeries = {
                new Series(),
                new Series("Atrapado en el metro", "Juan Alpinestar"),
                new Series("El sonido del cielo", "Suspenso", "Carlos", 2),
                new Series("Llorando en el desierto", "Arlberch"),
                new Series("Elif", "Romantico", "Sid nadamas Q' Do", 100)
        };

        return arraySeries;
    }

    public Videojuego[] llenarArrayVideojuegos() {
        Videojuego[] arrayVideojuegos = {
                new Videojuego(),
                new Videojuego("Dark Souls II", 30),
                new Videojuego("Sekiro", "Accion", "From Software", 50),
                new Videojuego("Bloodborne", 35),
                new Videojuego("God of War III", "Hack n' Slash", "Santamonica Studio", 8)
        };
        return arrayVideojuegos;
    }

    private void entregarAlgunosElementos(Series[] listSeries, Videojuego[] listJuegos) {

        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                listSeries[i].entregar();
            } else {
                listJuegos[i].entregar();
            }
        }

    }

    private int contarSeriesEntregadas(Series[] arraySeries) {
        int contadorEntregados = 0;

        for (Series serie : arraySeries) {
            if (serie.isEntregado()) {
                serie.devolver();
                contadorEntregados++;
            }
        }
        return contadorEntregados;
    }

    private int contarJuegosEntregados(Videojuego[] arrayVideoJuegos) {
        int contadorEntregados = 0;

        for (Videojuego juego : arrayVideoJuegos) {
            if (juego.isEntregado()) {
                juego.devolver();
                contadorEntregados++;
            }
        }
        return contadorEntregados;
    }

    private Series encontrarMayorSeries(Series[] arraySeries) {
        Series mayorSerie = arraySeries[0];
        int comparacion = 0;

        for (Series objSerie : arraySeries) {

            comparacion = mayorSerie.compareTo(objSerie);

            if (comparacion == AllConstants.MENOR) {

                mayorSerie = objSerie;

            }
        }
        return mayorSerie;
    }

    private Videojuego encontrarMayorJuego(Videojuego[] arrayVideojuegos) {
        Videojuego mayorVideojuego = arrayVideojuegos[0];
        int comparacion = 0;

        for (Videojuego objVideojuego : arrayVideojuegos) {

            comparacion = mayorVideojuego.compareTo(objVideojuego);

            if (comparacion == AllConstants.MENOR) {

                mayorVideojuego = objVideojuego;

            }
        }
        return mayorVideojuego;
    }
}
