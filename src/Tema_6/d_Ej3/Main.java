package Tema_6.d_Ej3;

public class Main {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(0, 0, 5, 5);
        Rectangulo r2 = new Rectangulo(2, 3, 7, 9);
        r1.imprimir();
        System.out.println(r1.getPerimeto());
        System.out.println(r1.getArea());
        r2.imprimir();
        

    }
}
