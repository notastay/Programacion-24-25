package d_Ej4;

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
        if (precio > 0) {
            this.precio = precio;
        } else {
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
        if (cuantosQuedan > 0) {
            this.cuantosQuedan = cuantosQuedan;
        } else {
            System.out.println("ERROR al cambiar el valor");
        }
    }

    public void imprimir() {
        System.out.println(nombre + " - Precio:" + precio + " - IVA:" + iva + "% - PVP: "
                + (precio + (precio * (iva / 100))));
    }

    public double getPVP() {
        return (precio + (precio * (iva / 100)));
    }

    public double getPVPDescuento(int descuento) {
        return this.getPVP() - ((this.getPVP() * descuento) / 100);
    }

    public boolean vender(int cant) {
        if (cuantosQuedan >= cant) {
            cuantosQuedan = cuantosQuedan - cant;
            return true;
        }
        return false;
    }

    public boolean almacenar(int cant) {
        if (cant > 0) {
            cuantosQuedan = cuantosQuedan + cant;
            return true;
        }
        return false;
    }

}
