package tema_8;

import java.util.Optional;

public class Receta {
    private String nombre;
    private String elaboracion;
    private int duracion;
    private Ingrediente[] ingredientes;

    public Receta(String nombre, String elaboracion, int duracion, Ingrediente[] ingredientes) {
        this.nombre = nombre;
        this.elaboracion = elaboracion;
        this.duracion = duracion;
        this.ingredientes= ingredientes;
    }


    //getters y setters generados automaticamente
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getElaboracion() {
        return elaboracion;
    }

    public void setElaboracion(String elaboracion) {
        this.elaboracion = elaboracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Optional<String> añadirIngrediente(Ingrediente ingrediente){
        for (int i = 0; i < ingredientes.length; i++) {
            if(ingredientes[i]==null){
                ingredientes[i]=ingrediente;
                return Optional.of(ingredientes[i].toString());
            }
        }
        return Optional.empty();

    }

    public Optional<String> eliminarIngrediente(String nombreIngrediente){
        for (int i = 0; i < ingredientes.length; i++) {
            if(ingredientes[i]!=null && ingredientes[i].getNombre().equals(nombreIngrediente)){
                ingredientes[i]=null;
                return Optional.of("Ingrediente Eliminado "+nombreIngrediente);
            }
        }
        return Optional.empty();
    }

    public void mostrarReceta() {
        System.out.println( "Receta [nombre=" + nombre + ", elaboracion=" + elaboracion + ", duracion=" + duracion+"]");
        for (Ingrediente ingredientes2 : ingredientes) {
            System.out.println(ingredientes2);
        }
    }
    
}
