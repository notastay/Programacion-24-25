package Tema_6.c_Ej1;

public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(5, 0);
        Punto p2 = new Punto(10, 10);
        Punto p3 = new Punto(-3, 7);
        p1.setX(4);
        System.out.println("("+p2.getX()+","+p2.getY()+")");
        p3.setX(3);
    }
}
