package Tema_6.d_Ej1;

public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(7, 5);
        Punto p2 = new Punto(4, 1);
        Punto p3 = new Punto(-3, 7);
        //p1.setX(4);
        p2.imprime();
        p3.desplaza(5, 2);
        p3.imprime();
        System.out.println(p1.distancia(p2));
    }
    
}
