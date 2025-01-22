package tema_8;

public class LineaFactura {
    private String descripcion;
    private double precioUnitario;
    private int cantidadUnidades;
    private final int descuento;
    private double importeTotal;

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
