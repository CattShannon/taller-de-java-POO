package interfaces;

public interface Entregable {

    boolean ENTREGADO = false;

    void entregar();

    void devolver();

    boolean isEntregado();

    int compareTo(Object a);

}
