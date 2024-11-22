package Tema_6.segundaParte.ejemplarLibro;

import java.time.LocalDate;

public class EjemplarLibro {
    private String titulo;

    /**
     * La fecha de adquisicon de un libro en tipo de dato {@link LocalDate}
     * se autoasignara con la fecha actual.
     */
    private LocalDate fechaAdquisicion;
    private int numeroEjemplar;
    private boolean prestado;

    /**
     * Se usa para adquirir el primer ejemplar de un libro
     * 
     * @param titulo
     *               el valor del titulo que se le asignara a cada libro
     */
    public EjemplarLibro(String titulo) {
        this.titulo = titulo;
        this.fechaAdquisicion = LocalDate.now();
        this.numeroEjemplar = 1;
        this.prestado = false;
    }

    /**
     * Se usa para adquirir mas ejemplares de un libro, copiando sus atributos e
     * incrementando su atributo {@code numeroEjemplar}
     * 
     * @param l
     *          el libro al que se le incrementara el atributo
     *          {@code numeroEjemplar}
     * @see EjemplarLibro#EjemplarLibro(String)
     */
    public EjemplarLibro(EjemplarLibro l) {
        this.titulo = l.titulo;
        this.fechaAdquisicion = l.fechaAdquisicion;
        this.numeroEjemplar = l.numeroEjemplar + 1;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public int getNumeroEjemplar() {
        return numeroEjemplar;
    }

    public boolean isPrestado() {
        return prestado;
    }

    /**
     * Comprueba si el atributo {@code prestado} es false para comprobar si se puede
     * prestar y cambia su valor a {@code false}
     * 
     * @return
     *         devuelve {@code true} si el libro puede ser prestado
     * @see EjemplarLibro#devolver()
     */
    public boolean prestar() {
        if (prestado == false) {
            prestado = true;
            return true;
        }
        return false;
    }

    /**
     * Comprueba si el atributo {@code prestado} es true para coprobar si se puede
     * devolver y cambia su valor a {@code false}
     * 
     * @return
     *         devuelve {@code true} si el libro puede ser devuelto
     * @see EjemplarLibro#prestar()
     */
    public boolean devolver() {
        if (prestado == true) {
            prestado = false;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return titulo + ", (" + fechaAdquisicion + "), " + numeroEjemplar;
    }

}