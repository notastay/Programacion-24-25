package tema_8;

public class Ingrediente {
    private String nombre;
    private float cantidad;
    private String unidad;

    
    public Ingrediente(String nombre, float cantidad, String unidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidad = unidad;
    }

    //getters y setters generados automaticamente
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public float getCantidad() {
        return cantidad;
    }


    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }


    public String getUnidad() { 
        return unidad;
    }


    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }


    @Override
    public String toString() {
        return "Ingredientes [nombre=" + nombre + ", cantidad=" + cantidad + " " + unidad + "]";
    }
    

    
}
