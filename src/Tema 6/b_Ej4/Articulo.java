package b_Ej4;

public class Articulo {
    String nombre;
    double precio;
    final double iva = 21;
    int cuantosQuedan;

    public Articulo(String nombre, double precio, double iva, int cuantosQuedan) {
        if (precio > 0 && cuantosQuedan > 0 && iva == 21) {
            this.cuantosQuedan = cuantosQuedan;
            this.nombre = nombre;
            this.precio = precio;
        } else {
            System.err.println("ERROR al instanciar " + nombre);
        }

    }
}
