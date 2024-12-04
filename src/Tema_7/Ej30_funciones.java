package Tema_7;

import java.util.Scanner;

public class Ej30_funciones {
    public static void main(String[] args) {
        String opcion;
        Scanner tecl = new Scanner(System.in);
        do {
            System.out.println(
                    " Menu \n********* \n a) Area de círculo (necesitará el radio) \n b) el área de cuadrado (ecesitará el lado) \n c) el área detriángulo (necesitará base y altura) \n d) Salir");
            opcion = tecl.nextLine();
            switch (opcion) {
                case "A":
                    System.out.println("Dime el radio");
                    System.out.println(areaCirculo(tecl.nextDouble()));
                    break;

                case "B":
                    System.out.println("Dime el lado");
                    System.out.println(areaCuadrado(tecl.nextDouble()));
                    break;
                case "C":
                    System.out.println("Dime base y altura");
                    System.out.println(areaTriangulo(tecl.nextDouble(), tecl.nextDouble()));
                    break;

                default:
                    break;
            }

        } while (!(opcion.equals("d")));
        tecl.close();
    }

    public static double areaCirculo(double radio) {
        double res = Math.pow(Math.PI * radio);
        return res;
    }

    public static double areaCuadrado(double lado) {
        return lado * 4;
    }

    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;

    }
}
