package objects;

import constants.AllConstants;
import interfaces.Entregable;

public class Videojuego implements Entregable {

    private String titulo;
    private String genero;
    private String compania;
    private int horasEstimadas;
    private boolean entregado;

    public Videojuego() {
        this.titulo = "";
        this.genero = "";
        this.compania = "";
        this.horasEstimadas = AllConstants.HORAS_ESTIMADAS;
        this.entregado = ENTREGADO;
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = "";
        this.compania = "";
        this.horasEstimadas = AllConstants.HORAS_ESTIMADAS;
        this.entregado = ENTREGADO;
    }

    public Videojuego(String titulo, String genero, String compania, int horasEstimadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.compania = compania;
        this.horasEstimadas = horasEstimadas;
        this.entregado = ENTREGADO;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void devolver() {
        this.entregado = ENTREGADO;
    }

    public void entregar() {
        this.entregado = true;
    }

    public int compareTo(Object a) {
        Videojuego otroVideojuego = (Videojuego) a;

        if(this.getHorasEstimadas() < otroVideojuego.getHorasEstimadas()){

            return AllConstants.MENOR;

        }else if(this.getHorasEstimadas() > otroVideojuego.getHorasEstimadas()){

            return AllConstants.MAYOR;

        }
        return AllConstants.IGUAL;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    @Override
    public String toString() {
        return ("Videojuego:")
                .concat("\nTitulo: ").concat(this.getTitulo())
                .concat("\nGenero: ").concat(this.getGenero())
                .concat("\nCreador: ").concat(this.getCompania())
                .concat("\nNumero de temporadas: ").concat(String.valueOf(this.getHorasEstimadas()))
                .concat("\nEntregado: ").concat(this.msgEntregado());
    }

    private String msgEntregado() {
        return (this.isEntregado()) ? "Sí" : "No";
    }

}
