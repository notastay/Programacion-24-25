package e_Ej4;

public class Main {
    public static void main(String[] args) {
        Articulo obj1 = new Articulo("Cafe", 1.5, 100, "general");
        obj1.imprimir();
        Articulo obj2 = new Articulo("Nesquick", 1, 2, "reducido");
        Articulo obj3 = new Articulo("Colacao", 0.50, 1000, "super reducido");
        obj2.almacenar(5);
        obj3.vender(10);
        obj2.imprimir();
        obj3.imprimir();
        System.out.println(obj3.getPVP());
        System.out.println(obj3.getPVPDescuento(10));

    }
}
