package tema_8;

/**
 * Clase que representa un artículo en una tienda.
 */
public class Articulo {
    private final int ID;
    private final String NOMBRE;
    private final double IVA = 21;
    private double precioVenta;
    private double precioCompra;
    private int stock;
    private int contadorId = 0;

    /**
     * Constructor de la clase Articulo.
     *
     * @param nombre       Nombre del artículo.
     * @param precioVenta  Precio de venta del artículo.
     * @param precioCompra Precio de compra del artículo.
     * @param stock        Cantidad inicial de stock disponible.
     */
    public Articulo(String nombre, double precioVenta, double precioCompra, int stock) {
        contadorId++;
        this.NOMBRE = nombre;
        ID = contadorId;
        if (precioCompra > 0 && precioVenta > 0) {
            this.precioVenta = precioVenta;
            this.precioCompra = precioCompra;
        }
        if (stock >= 0) {
            this.stock = stock;
        }
    }

    // Getters y setters generados automáticamente
    public int getID() {
        return ID;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public double getIVA() {
        return IVA;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public int getStock() {
        return stock;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Método para vender una cantidad de este artículo.
     *
     * @param cantidad Cantidad a vender.
     * @return {@code true} si la venta se realizó correctamente, {@code false} en caso contrario.
     */
    public boolean vender(int cantidad) {
        if (cantidad > 0 && cantidad < stock) {
            stock = stock - cantidad;
            return true;
        }
        System.err.println("La cantidad debe ser mayor a 0 y menor que el stock");
        return false;
    }

    /**
     * Método para comprar una cantidad de este artículo.
     *
     * @param cantidad Cantidad a comprar.
     * @return {@code true} si la compra se realizó correctamente, {@code false} en caso contrario.
     */
    public boolean comprar(int cantidad) {
        if (cantidad > 0) {
            stock = stock + cantidad;
            return true;
        }
        System.err.println("La cantidad debe ser mayor a 0");
        return false;
    }

    /**
     * Método para mostrar la información del artículo en formato de texto.
     *
     * @return Una cadena de texto con los datos del artículo.
     */
    public String mostrarInfo() {
        return "Articulo [ID=" + ID + ", NOMBRE=" + NOMBRE + ", IVA=" + IVA + ", precioVenta=" + precioVenta
                + ", precioCompra=" + precioCompra + ", stock=" + stock + "]";
    }
}
