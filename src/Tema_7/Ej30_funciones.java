package Tema_7;

import java.util.Scanner;

public class Ej30_funciones {
    public static void main(String[] args) {
        String opcion;
        Scanner tecl = new Scanner(System.in);
        do {
            System.out.println("      ");
            System.out.println(" Menu \n********* \n a) Area de círculo (necesitará el radio) \n b) el área de cuadrado (ecesitará el lado) \n c) el área detriángulo (necesitará base y altura) \n d) Salir");
            System.out.println("   ");
            opcion = tecl.nextLine();
            switch (opcion) {
                case "A":
                    System.out.println("Dime el radio");
                    double radio = tecl.nextDouble();
                    tecl.nextLine();
                    System.out.println(areaCirculo(radio));
                    break;

                case "B":
                    System.out.println("Dime el lado");
                    double lado=tecl.nextDouble();
                    tecl.nextLine();
                    System.out.println(areaCuadrado(lado));
                    break;
                case "C":
                    System.out.println("Dime base y altura");
                    double base=tecl.nextDouble();
                    double altura=tecl.nextDouble();
                    tecl.nextLine();
                    System.out.println(areaTriangulo(base, altura));
                    break;

                default:
                System.out.println("Opcion no valida");
                    break;
            }

        } while (!(opcion.equals("d")));
        tecl.close();
    }

    public static double areaCirculo(double radio) {
        final double PI=Math.PI;
        double res = Math.pow(radio,2)*PI;
        return res;
    }

    public static double areaCuadrado(double lado) {
        return lado * lado;
    }

    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;

    }
}
