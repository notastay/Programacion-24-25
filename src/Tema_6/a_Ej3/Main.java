package Tema_6.a_Ej3;

public class Main {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo();
        r1.x1 = 0;
        r1.y1 = 0;
        r1.x2 = 5;
        r1.y2 = 5;
        r2.x1 = 7;
        r2.y1 = 9;
        r2.x2 = 2;
        r2.y2 = 3;
        System.out.println("Primer rectangulo: (" + r1.x1 + "," + r1.y1 + ") (" + r1.x2 + "," + r1.y2 + ")");
        System.out.println("Perimetro: " + ((r1.x2 - r1.x1) + (r1.y2 - r1.y1)) * 2);
        System.out.println("Area: " + ((r1.x2 - r1.x1) * (r1.y2 - r1.y1)));
        System.out.println("Segundo rectangulo: (" + r2.x1 + "," + r2.y1 + ") (" + r2.x2 + "," + r2.y2 + ")");
        System.out.println("Perimetro: " + ((r2.x2 - r2.x1) + (r2.y2 - r2.y1)) * 2);
        System.out.println("Area: " + ((r2.x2 - r2.x1) * (r2.y2 - r2.y1)));
    }
}
