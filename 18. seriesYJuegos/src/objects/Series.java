package objects;

import constants.AllConstants;
import interfaces.Entregable;

public class Series implements Entregable {

    private String titulo;
    private String genero;
    private String creador;
    private int numeroDeTemporadas;
    private boolean entregado;

    public Series() {
        this.titulo = "";
        this.genero = "";
        this.creador = "";
        this.numeroDeTemporadas = AllConstants.NUMERO_DE_TEMPORADAS;
        this.entregado = ENTREGADO;
    }

    public Series(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.genero = "";
        this.numeroDeTemporadas = AllConstants.NUMERO_DE_TEMPORADAS;
        this.entregado = ENTREGADO;
    }

    public Series(String titulo, String genero, String creador, int numeroDeTemporadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.entregado = ENTREGADO;
    }

    public int compareTo(Object a) {
        Series otraSerie = (Series) a;

        if(this.getNumeroDeTemporadas() < otraSerie.getNumeroDeTemporadas()){

            return AllConstants.MENOR;

        }else if(this.getNumeroDeTemporadas() > otraSerie.getNumeroDeTemporadas()){

            return AllConstants.MAYOR;

        }
        return AllConstants.IGUAL;
    }

    public void devolver() {
        this.entregado = ENTREGADO;
    }

    public void entregar() {
        this.entregado = true;
    }

    public boolean isEntregado() {
        return entregado;
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

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    @Override
    public String toString() {
        return ("Serie:")
                .concat("\nTitulo: ").concat(this.getTitulo())
                .concat("\nGenero: ").concat(this.getGenero())
                .concat("\nCreador: ").concat(this.getCreador())
                .concat("\nNumero de temporadas: ").concat(String.valueOf(this.getNumeroDeTemporadas()))
                .concat("\nEntregado: ").concat(this.msgEntregado());
    }

    private String msgEntregado() {
        return (this.isEntregado()) ? "Sí" : "No";
    }
}
