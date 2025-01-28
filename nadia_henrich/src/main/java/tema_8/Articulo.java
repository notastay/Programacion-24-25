package tema_8;

public class Articulo {
    private final int ID;
    private final String NOMBRE;
    private final double IVA=21;
    private double precioVenta;
    private double precioCompra;
    private int stock;
    private int contadorId=0;

    public Articulo(String nombre, double precioVenta, double precioCompra, int stock) {
        contadorId++;
        this.NOMBRE = nombre;
        ID=contadorId;
        if (precioCompra>0 && precioVenta>0) {
            this.precioVenta = precioVenta;
            this.precioCompra = precioCompra;
        }
        if(stock>=0){
            this.stock = stock;
        }
        
    }

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

    public boolean vender(int cantidad){
        if(cantidad>0 && cantidad<stock){
            stock=stock-cantidad;
            return true;
        }
        System.err.println("La cantidad debe ser mayor a 0 y menor que el stock");
        return false;
    }

    public boolean comprar(int cantidad){
        if(cantidad>0 ){
            stock=stock+cantidad;
            return true;
        }
        System.err.println("La cantidad debe ser mayor a 0");
        return false;
    }

    public String mostrarInfo() {
        return "Articulo [ID=" + ID + ", NOMBRE=" + NOMBRE + ", IVA=" + IVA + ", precioVenta=" + precioVenta
                + ", precioCompra=" + precioCompra + ", stock=" + stock + "]";
    }

    
    

    
}
