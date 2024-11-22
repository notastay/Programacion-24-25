package Tema_6.b_Ej3;

public class Main {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(0, 0, 5, 5);
        Rectangulo r2 = new Rectangulo(7, 9, 2, 3);
        System.out.println("Primer rectangulo: (" + r1.x1 + "," + r1.y1 + ") (" + r1.x2 + "," + r1.y2 + ")");
        System.out.println("Perimetro: " + ((r1.x2 - r1.x1) + (r1.y2 - r1.y1)) * 2);
        System.out.println("Area: " + ((r1.x2 - r1.x1) * (r1.y2 - r1.y1)));
        System.out.println("Segundo rectangulo: (" + r2.x1 + "," + r2.y1 + ") (" + r2.x2 + "," + r2.y2 + ")");

    }
}
