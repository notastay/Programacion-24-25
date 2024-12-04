package Tema_7;

public class Ej25_funciones {
    public static void main(String[] args) {
        System.out.println(perimetroRectangulo(5, 5));
        System.out.println(areaRectangulo(5, 5));
    }
    public static double perimetroRectangulo(double alto, double ancho){
        return (alto+ancho)*2;
    }
    public static double areaRectangulo(double alto, double ancho){
        return alto*ancho;
    }
    
}
