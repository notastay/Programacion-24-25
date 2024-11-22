package Tema_6.d_Ej4;

public class Main {
    public static void main(String[] args) {
        Articulo obj1 = new Articulo("Cafe", 1.5, 21, 100);
        obj1.imprimir();
        Articulo obj2 = new Articulo("Nesquick", 1, 21, 2);
        Articulo obj3 = new Articulo("Colacao", 0.50, 21, 1000);
        obj2.almacenar(5);
        obj3.vender(10);
        obj2.imprimir();
        System.out.println(obj3.getPVP());
        System.out.println(obj3.getPVPDescuento(10));

    }
}
