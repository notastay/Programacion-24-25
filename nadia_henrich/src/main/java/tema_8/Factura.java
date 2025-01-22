package tema_8;

import java.time.LocalDate;
import java.util.ArrayList;

public class Factura {
    private int identificador;
    private LocalDate fecha;
    private int idCliente;
    private final int iVA=21;
    private ArrayList<LineaFactura> lineaFactura;
    private double total;

    /**
     * La fecha se inicializa con la fecha en el momento de la creacion de la factura
     * La linea factura inicializa un ArrayList de objetos de tipo LineaFactura
     * El total se inicializa en 0
     * 
     * @param identificador
     *      El numero que identifica cada factura
     * @param idCliente
     *      El numero que identifica el cliente
     */
    public Factura(int identificador,  int idCliente) {
        this.identificador = identificador;
        this.fecha = LocalDate.now();
        this.idCliente = idCliente;
        this.lineaFactura = new ArrayList<LineaFactura>();
        this.total=0;
    }

    /**
     * Se crea un objeto de tipo {@code LineaFactura} y
     * se añade al {@link ArrayList}, luego se recalcula el total.
     * 
     * @param descripcion
     *      La descripcion del objeto a comprar/vender
     * @param precioUnitario
     *      El precio por unidad del producto
     * @param cantidadUnidades
     *      La cantidad de unidades a comprar/vender
     * 
     * @see LineaFactura#LineaFactura(String, double, int)
     */
    public void añadirLinea(String descripcion,double precioUnitario, int cantidad){
        LineaFactura linea= new LineaFactura(descripcion, precioUnitario, cantidad);
        lineaFactura.add(linea);
        calcularTotal();
    }

    /**
     * Si el {@link ArrayList} no esta vacio borra la linea en esa posicion,
     * tras esto vuelve a calcular el total.
     * @param posicion
     *      La posicion en el {@link ArrayList} de la linea a borrar
     */
    public void eliminarLinea(int posicion){
        if (posicion >= 0 && posicion < lineaFactura.size()) {
            lineaFactura.remove(posicion);
        } else {
            System.out.println("Posición no válida: " + posicion);
        }
        calcularTotal();
    
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public LocalDate getFecha() {
        return fecha;
    }


    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getiVA() {
        return iVA;
    }

    public double getTotal() {
        return total;
    }

    /**
     * Recorre el {@link ArrayList} sumando los totales a una variable 
     * Luego calcula el total con IVA.
     * @return
     *      devuelve el precio total de la factura con el IVA añadido
     */
    public double calcularTotal() {
        double sumaTotal=0;
        for (LineaFactura linea : lineaFactura) {
            sumaTotal += linea.getImporteTotal();
        }
        total= sumaTotal*(1+(iVA/100));
        return total;
    }

    /**
     * Imprime por pantalla la factura completa.
     */
    public void mostrarFactura(){
        calcularTotal();
        System.out.println("Factura Numero"+identificador+ " a fecha de "+fecha+"\n"+
        "Numero de cliente: "+idCliente);
        for (LineaFactura linea : lineaFactura) {
            System.out.println(linea);
        }
        System.out.println("Total de la factura "+total);
        
    }

    
}
