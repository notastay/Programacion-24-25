package tema_8;

public class LineaFactura {
    private String descripcion;
    private double precioUnitario;
    private int cantidadUnidades;
    private final int descuento;
    private double importeTotal;

    /**
     * Con el uso de un ternario le damos valor a descuento, 
     * calcula el precio final sin descuento y 
     * despues calcula el importe con el descuento.
     * 
     * @param descripcion
     *      La descripcion del objeto a comprar/vender
     * @param precioUnitario
     *      El precio por unidad del producto
     * @param cantidadUnidades
     *      La cantidad de unidades a comprar/vender
     * 
     */
    public LineaFactura(String descripcion, double precioUnitario, int cantidadUnidades) {
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.cantidadUnidades = cantidadUnidades;
        this.descuento=(cantidadUnidades<10)?5 :0;
        double precioFinal =(precioUnitario * cantidadUnidades);
        this.importeTotal = precioFinal - (precioFinal * (descuento/100.0));
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidadUnidades() {
        return cantidadUnidades;
    }

    public void setCantidadUnidades(int cantidadUnidades) {
        this.cantidadUnidades = cantidadUnidades;
    }

    public int getDescuento() {
        return descuento;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    @Override
    public String toString() {
        return "LineaFactura [descripcion=" + descripcion + ", precioUnitario=" + precioUnitario + ", cantidadUnidades="
                + cantidadUnidades + ", descuento=" + descuento + ", importeTotal=" + importeTotal + "]";
    }

    
}
