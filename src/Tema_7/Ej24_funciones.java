package Tema_7;

public class Ej24_funciones {
    public static void main(String[] args) {
        System.out.println(precioConIva(30));
    }
    public static double precioConIva(double precio){
        double iva=precio*0.21;
        return precio+iva;
    }
}
