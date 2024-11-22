package Tema_6.c_Ej3;

public class Main {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(0, 0, 5, 5);
        Rectangulo r2 = new Rectangulo(2, 3, 7, 9);
        System.out.println("Primer rectangulo: (" + r1.getX1() + "," + r1.getY1() + ") (" + r1.getX2() + "," + r1.getY2() + ")");
        System.out.println("Perimetro: " + ((r1.getX2() - r1.getX1()) + (r1.getY2() - r1.getY1())) * 2);
        System.out.println("Area: " + ((r1.getX2() - r1.getX1()) * (r1.getY2() - r1.getY1())));
        System.out.println("Segundo rectangulo: (" + r2.getX1() + "," + r2.getY1() + ") (" + r2.getX2() + "," + r2.getY2() + ")");
        

    }
}
