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

    public Factura(int identificador,  int idCliente) {
        this.identificador = identificador;
        this.fecha = LocalDate.now();
        this.idCliente = idCliente;
        this.lineaFactura = new ArrayList<LineaFactura>();
        this.total=0;
    }

    public void añadirLinea(String descripcion,double precioUnitario, int cantidad){
        LineaFactura linea= new LineaFactura(descripcion, precioUnitario, cantidad);
        lineaFactura.add(linea);
        calcularTotal();
    }

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

    public double calcularTotal() {
        double sumaTotal=0;
        for (LineaFactura linea : lineaFactura) {
            sumaTotal += linea.getImporteTotal();
        }
        return sumaTotal*(1+(21/100));
    }

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
