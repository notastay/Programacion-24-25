package segundaParte.trabajo;

public class Trabajo {
    private static double precioHorasExtra;
    private static int numTrabajadores;
    private String nombre;
    private String dNI;
    private double sueldoBase;
    private int horasExtraMes;
    private double tipoIRPF;

    public Trabajo(String nombre, String dNI, double sueldoBase, int horasExtraMes, double tipoIRPF) {
        this.nombre = nombre;
        this.dNI = dNI;
        this.sueldoBase = sueldoBase;
        this.horasExtraMes = horasExtraMes;
        this.tipoIRPF = tipoIRPF;
    }

    public static double getPrecioHorasExtra() {
        return precioHorasExtra;
    }

    public static void setPrecioHorasExtra(double precioHorasExtra) {
        Trabajo.precioHorasExtra = precioHorasExtra;
    }

    public static int getNumTrabajadores() {
        return numTrabajadores;
    }

    public static void setNumTrabajadores(int numTrabajadores) {
        Trabajo.numTrabajadores = numTrabajadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getdNI() {
        return dNI;
    }

    public void setdNI(String dNI) {
        this.dNI = dNI;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getHorasExtraMes() {
        return horasExtraMes;
    }

    public void setHorasExtraMes(int horasExtraMes) {
        this.horasExtraMes = horasExtraMes;
    }

    public double getTipoIRPF() {
        return tipoIRPF;
    }

    public void setTipoIRPF(double tipoIRPF) {
        this.tipoIRPF = tipoIRPF;
    }

    public double calcularImporteHorasExtra(){
        return horasExtraMes*precioHorasExtra;
    }

    public double calcularSueldoBruto(){
        return sueldoBase+calcularImporteHorasExtra();
    }

    public double calcularRetencionIrpf(){
        double irpf= tipoIRPF/100;
        return (calcularSueldoBruto()+irpf);
    }
    public double calcularSueldo(){
        return calcularSueldoBruto()-calcularRetencionIrpf();
    }

    public String toString(){
        return dNI+nombre+ "\n"+
        "Sueldo Base: "+ calcularSueldo() + "\n"+
        "Horas Extra: "+ horasExtraMes+ "\n"+
        "Tipo IRPF: "+ tipoIRPF+"\n"+
        "Sueldo Bruto: "+calcularSueldoBruto()+"\n"+
        "Retencion por IRPF: "+calcularRetencionIrpf()+"\n"+
        "Sueldo Neto: "+calcularSueldo();
    }

    

    
}
