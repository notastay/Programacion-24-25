package tema_8;

public class Ingredientes {
    private String nombre;
    private int cantidad;
    private String unidad;

    
    public Ingredientes(String nombre, float cantidad, String unidad) {
        this.nombre = nombre;
        this.cantidad = Math.round(cantidad);
        this.unidad = unidad;
    }

    //getters y setters generados automaticamente
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getCantidad() {
        return cantidad;
    }


    public void setCantidad(int cantidad) {
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
