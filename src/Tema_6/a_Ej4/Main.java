package Tema_6.a_Ej4;

public class Main {
    public static void main(String[] args) {
        Articulo obj1 = new Articulo();
        obj1.nombre = "Cafe";
        obj1.precio = 1.50;
        System.out.println(obj1.nombre + " - Precio:" + obj1.precio + "€ - IVA:" + obj1.iva + "% - PVP: "
                + (obj1.precio + (obj1.precio * (obj1.iva / 100))));
    }
}
