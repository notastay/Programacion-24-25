package tema_8;

import java.util.Scanner;

public class Arraylist4 {
    public static void main(String[] args) {
        // Inicializar el objeto Factura como nulo, se creará más adelante
        Factura f1 = null;

        // Crear un objeto Scanner para leer entradas del usuario
        Scanner tecl = new Scanner(System.in);
        String opcion;

        // Bucle principal del menú
        do {
            // Mostrar opciones del menú
            System.out.println("a) Dar de alta una factura \n"
                    + "b) Añadir linea \n c) Borrar linea \n d) Mostrar Factura \n e) Salir");
            opcion = tecl.nextLine();

            // Manejar la opción seleccionada por el usuario
            switch (opcion) {
                case "a":
                    // Opción para dar de alta una nueva factura
                    System.out.println("Introduce identificador e idCliente:");
                    String identificador = tecl.nextLine(); // Leer el identificador de la factura
                    String idCliente = tecl.nextLine();    // Leer el identificador del cliente
                    tecl.nextLine(); // Consumir la nueva línea pendiente
                    f1 = new Factura(identificador, idCliente); // Crear una nueva factura
                    break;

                case "b":
                    // Opción para añadir una línea a la factura
                    if (f1 != null) { 
                        System.out.println("Introduce descripcion, precio unitario, y cantidad:");
                        String descripcion = tecl.nextLine(); // Leer la descripción
                        double precioUnitario = tecl.nextDouble(); // Leer el precio unitario
                        int cantidad = tecl.nextInt(); // Leer la cantidad
                        LineaFactura linea=new LineaFactura(descripcion, precioUnitario, cantidad);
                        tecl.nextLine(); // Consumir la nueva línea pendiente
                        f1.añadirLinea(linea); // Añadir la línea a la factura
                    } else {
                        // Mensaje si no se ha dado de alta una factura
                        System.out.println("Primero debes dar de alta una factura.");
                    }
                    break;

                case "c":
                    // Opción para borrar una línea de la factura
                    if (f1 != null) {
                        System.out.println("Introduce la posicion de la linea a eliminar:");
                        int posicion = tecl.nextInt(); // Leer la posición de la línea a eliminar
                        tecl.nextLine(); // Consumir la nueva línea pendiente
                        f1.eliminarLinea(posicion); // Eliminar la línea
                    } else {
                        // Mensaje si no se ha dado de alta una factura
                        System.out.println("Primero debes dar de alta una factura.");
                    }
                    break;

                case "d":
                    // Opción para mostrar la factura actual
                    if (f1 != null) {
                        f1.mostrarFactura(); // Llamar al método que muestra la factura
                    } else {
                        // Mensaje si no se ha dado de alta una factura
                        System.out.println("Primero debes dar de alta una factura.");
                    }
                    break;

                case "e":
                    // Opción para salir del programa
                    System.out.println("Saliendo...");
                    break;

                default:
                    // Mensaje para opciones inválidas
                    System.out.println("Opcion Invalida");
                    break;
            }
        } while (!opcion.equals("e")); // Continuar el bucle hasta que el usuario elija salir

        // Cerrar el objeto Scanner para liberar recursos
        tecl.close();
    }
}
