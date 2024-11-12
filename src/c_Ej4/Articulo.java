package c_Ej4;

public class Articulo {
    private String nombre;
    private double precio;
    private final double iva = 21;
    private int cuantosQuedan;

    public Articulo(String nombre, double precio, double iva, int cuantosQuedan) {
        if (precio > 0 && cuantosQuedan > 0 && iva == 21) {
            this.cuantosQuedan = cuantosQuedan;
            this.nombre = nombre;
            this.precio = precio;
        } else {
            System.err.println("ERROR al instanciar " + nombre);
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0){
        this.precio = precio;
        }else{
            System.out.println("ERROR al cambiar el valor");
        }
    }

    public double getIva() {
        return iva;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        if (cuantosQuedan > 0){
            this.cuantosQuedan = cuantosQuedan;
            }else{
                System.out.println("ERROR al cambiar el valor");
            }
    }
}
