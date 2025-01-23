package tema_8;

import java.time.LocalDate;
import java.util.ArrayList;

public class Factura {
    private final String identificador;
    private final LocalDate fecha;
    private final String idCliente;
    private final int IVA=21;
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
    public Factura(String identificador,  String idCliente) {
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
    public void añadirLinea(LineaFactura linea){
        lineaFactura.add(linea);
        calcularTotal();
    }

    /**
     * Si el {@link ArrayList} no esta vacio borra la linea en esa posicion,
     * tras esto vuelve a calcular el total.
     * @param posicion
     *      Indice en el {@link ArrayList} de la linea a borrar
     * @return
     *      La LineaFactura eliminada o null si no se borra nada
     */
    public LineaFactura eliminarLinea(int posicion){
        if (posicion >= 0 && posicion < lineaFactura.size()) {
            return lineaFactura.remove(posicion);
        } else return null;
        
    
    }

    public String getIdentificador() {
        return identificador;
    }

    public LocalDate getFecha() {
        return fecha;
    }


    public String getIdCliente() {
        return idCliente;
    }

    public int getiVA() {
        return IVA;
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
        total= sumaTotal*(1+(IVA/100));
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
