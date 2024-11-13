package segundaParte.ejemplarLibro;

import java.time.LocalDate;

public class EjemplarLibro{
    private String titulo;
    private LocalDate fechaAdquisicion;
    private int numeroEjemplar=0;
    private boolean prestado;

    public EjemplarLibro(String titulo) {
        this.titulo = titulo;
        this.fechaAdquisicion = LocalDate.now();
        this.numeroEjemplar =1 ;
        this.prestado =false;
    }

    public EjemplarLibro(EjemplarLibro l) {
        this.titulo=l.titulo;
        this.fechaAdquisicion=l.fechaAdquisicion;
        this.numeroEjemplar=l.numeroEjemplar+1;
        this.prestado=false;
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

    public boolean prestar(){
        if(prestado==false){
            prestado=true;
            return true;
        }
        return false;
    }

    public boolean devolver(){
        if(prestado==true){
            prestado=false;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return  titulo + ", (" + fechaAdquisicion + "), " + numeroEjemplar ;
    }

}