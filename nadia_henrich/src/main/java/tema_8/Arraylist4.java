package tema_8;

import java.util.Scanner;

public class Arraylist4 {
    public static void main(String[] args) {
        Factura f1= null;
        Scanner tecl=new Scanner(System.in);
        String opcion;
        do {
            System.out.println("a) Dar de alta una factura \n"
            + "b) Añadir linea \n c) Borrar linea \n d) Mostrar Factura \n e) Salir");
            opcion=tecl.nextLine();
            switch (opcion) {
                case "a":
                    System.out.println("Introduce identificador e idCliente:");
                    int identificador = tecl.nextInt();
                    int idCliente = tecl.nextInt();
                    tecl.nextLine(); 
                    f1 = new Factura(identificador, idCliente);
                    break;

                case "b":
                    if (f1 != null && f1.getIdentificador() != 0) {
                        System.out.println("Introduce descripcion, precio unitario, y cantidad:");
                        String descripcion = tecl.nextLine();
                        double precioUnitario = tecl.nextDouble();
                        int cantidad = tecl.nextInt();
                        tecl.nextLine(); 
                        f1.añadirLinea(descripcion, precioUnitario, cantidad);
                    } else {
                        System.out.println("Primero debes dar de alta una factura.");
                    }
                    
                    break;

                case "c":
                    if(f1 != null){
                        System.out.println("Introduce la posicion de la linea a eliminar");
                        int posicion=tecl.nextInt();
                        tecl.nextLine();
                        f1.eliminarLinea(posicion);
                    } else {
                        System.out.println("Primero debes dar de alta una factura.");
                    }
                    
                    break;

                case "d":
                    if (f1 != null) {
                        f1.mostrarFactura();
                    } else {
                        System.out.println("Primero debes dar de alta una factura.");
                    }
                    break;

                case "e":
                    System.out.println("Saliendo...");
                    break;
            
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        } while (!opcion.equals("e"));
        tecl.close();
    }
}
