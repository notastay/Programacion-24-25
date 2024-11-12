package b_Ej4;

public class Main {
    public static void main(String[] args) {
        Articulo obj1 = new Articulo("Cafe", 1.5, 21, 100);
        System.out.println(obj1.nombre + " - Precio:" + obj1.precio + " - IVA:" + obj1.iva + "% - PVP: "
                + (obj1.precio + (obj1.precio * (obj1.iva / 100))));
        Articulo obj2 = new Articulo("Nesquick", 1, 21, -10);
        Articulo obj3 = new Articulo("Colacao", -0.50, 21, 1000);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
