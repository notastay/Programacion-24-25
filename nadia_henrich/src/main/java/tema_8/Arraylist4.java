package tema_8;

import java.util.Scanner;

public class Arraylist4 {
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        String opcion;
        do {
            System.out.println("a) Dar de alta una factura \n"
            + "b) Añadir linea \n c) Borrar linea \n d) Mostrar Factura \n e) Salir");
            opcion=tecl.nextLine();
            switch (opcion) {
                case "a":
                    Factura f1= new Factura(tecl.nextInt(), tecl.nextInt());
                    break;

                case "b":
                    
                    
                    break;

                case "c":
                    
                    break;

                case "d":
                    
                    break;
            
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        } while (!opcion.equals("e"));
    }
}
