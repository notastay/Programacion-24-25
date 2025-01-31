package tema_8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que representa una tienda con funcionalidades para gestionar artículos,
 * realizar ventas, compras y administrar un inventario.
 */
public class Tienda {
    private ArrayList<Articulo> listaArticulos;
    static Scanner tecl = new Scanner(System.in);

    /**
    * Clase que representa una tienda con funcionalidades para gestionar artículos,
    * realizar ventas, compras y administrar un inventario.
    */
    public Tienda() {
        this.listaArticulos = new ArrayList<>(); // Inicializamos la lista de artículos
    }

    /**
     * Muestra el menú principal de la tienda.
     */
    public void mostrarMenu() {
        System.out.println("1. Mostrar artículos.\r\n" + //
                "2. Venta a cliente.\r\n" + //
                "3. Compra a proveedor.\r\n" + //
                "4. Gestionar artículos.\r\n" + //
                "5. Salir");
    }

    /**
     * Muestra la información de todos los artículos en el inventario.
     */
    public void mostrarArticulos() {
        if (listaArticulos.isEmpty()) {
            System.out.println("No hay artículos en la tienda.");
        } else {
            for (Articulo articulo : listaArticulos) {
                System.out.println(articulo.mostrarInfo()); // Mostramos la información de cada artículo
            }
        }
    }

    /**
     * Realiza una venta a un cliente.
     * Solicita el nombre del cliente, el ID del artículo y la cantidad a vender.
     * Confirma la venta antes de descontar el stock del artículo.
     */
    public void ventaCliente() {
        System.out.println("Dime tu nombre");
        String nombre = tecl.nextLine(); // Recogemos el nombre del cliente
        System.out.println("Dime el ID del producto");
        int id = tecl.nextInt(); // Leemos el ID del producto
        System.out.println("Y la cantidad a vender");
        int cantidad = tecl.nextInt(); // Leemos la cantidad deseada
        tecl.nextLine(); // Limpiamos el buffer

        if (nombre != null && cantidad > 0 && listaArticulos != null) {
            Articulo articulo = null;
            double precioFinal = 0;

            // Buscamos el artículo por ID
            for (int i = 0; i < listaArticulos.size(); i++) {
                if (listaArticulos.get(i).getID() == id) {
                    articulo = listaArticulos.get(i);
                    precioFinal = listaArticulos.get(i).getPrecioVenta() * cantidad;
                }
            }

            if (precioFinal == 0) {
                System.err.println("El producto con ID " + id + ", no ha sido encontrado");
            } else {
                System.out.println(nombre + " tu total es " + precioFinal + "€ \nDesea confirmar?");
                String confirmar = tecl.nextLine(); // Leemos la confirmación

                if (confirmar.equalsIgnoreCase("si")) {
                    articulo.vender(cantidad); // Realizamos la venta
                } else {
                    System.err.println("Cancelando venta...");
                }
            }
        }
    }

    /**
     * Realiza una compra a un proveedor.
     * Solicita el nombre del proveedor, el ID del artículo y la cantidad a comprar.
     * Confirma la compra antes de aumentar el stock del artículo.
     */
    public void compraProveedor() {
        System.out.println("Dime el nombre del proveedor");
        String nombre = tecl.nextLine(); // Recogemos el nombre del proveedor
        System.out.println("Dime el ID del producto");
        int id = tecl.nextInt(); // Leemos el ID del producto
        System.out.println("Y la cantidad a comprar");
        int cantidad = tecl.nextInt(); // Leemos la cantidad deseada
        tecl.nextLine(); // Limpiamos el buffer

        if (nombre != null && cantidad > 0 && listaArticulos != null) {
            Articulo articulo = null;
            double precioFinal = 0;

            // Buscamos el artículo por ID
            for (int i = 0; i < listaArticulos.size(); i++) {
                if (listaArticulos.get(i).getID() == id) {
                    articulo = listaArticulos.get(i);
                    precioFinal = listaArticulos.get(i).getPrecioCompra() * cantidad;
                }
            }

            if (precioFinal == 0) {
                System.err.println("El producto con ID " + id + ", no ha sido encontrado");
            } else {
                System.out.println("Su total es " + precioFinal + "€ \nDesea confirmar?");
                String confirmar = tecl.nextLine(); // Leemos la confirmación

                if (confirmar.equalsIgnoreCase("si")) {
                    articulo.comprar(cantidad); // Realizamos la compra
                } else {
                    System.err.println("Cancelando compra...");
                }
            }
        }
    }
    /**
     * Gestiona el inventario de artículos.
     * Permite añadir, editar o eliminar artículos del inventario.
     */
    public void gestionarArticulos() {
        int opcion;

        do {
            System.out.println("\n--- Gestión de Artículos ---");
            System.out.println("1. Añadir artículo");
            System.out.println("2. Editar artículo");
            System.out.println("3. Eliminar artículo");
            System.out.println("4. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = tecl.nextInt(); // Leemos la opción seleccionada
            tecl.nextLine(); // Limpiamos el buffer

            switch (opcion) {
                case 1:
                    añadirArticulo();
                    break;
                case 2:
                    editarArticulo();
                    break;
                case 3:
                    eliminarArticulo();
                    break;
                case 4:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 4);
    }

    /**
     * Añade un nuevo artículo al inventario.
     */
    private void añadirArticulo() {
        System.out.print("Nombre del artículo: ");
        String nombre = tecl.nextLine(); // Leemos el nombre
        System.out.print("Precio de venta: ");
        double precioVenta = tecl.nextDouble(); // Leemos el precio de venta
        System.out.print("Precio de compra: ");
        double precioCompra = tecl.nextDouble(); // Leemos el precio de compra
        System.out.print("Stock inicial: ");
        int stock = tecl.nextInt(); // Leemos el stock inicial
        tecl.nextLine(); // Limpiamos el buffer

        // Validamos los datos y añadimos el artículo
        if (precioVenta > precioCompra && precioCompra > 0 && precioVenta > 0 && stock >= 0) {
            Articulo articuloAñade = new Articulo(nombre, precioVenta, precioCompra, stock);
            listaArticulos.add(articuloAñade);
        } else {
            System.err.println("Error al añadir el artículo");
        }
    }

    /**
     * Elimina un artículo del inventario.
     */
    private void eliminarArticulo() {
        System.out.println("\n--- Eliminar Artículo ---");
        System.out.print("Ingrese el ID del artículo a eliminar: ");
        int id = tecl.nextInt(); // Leemos el ID
        tecl.nextLine(); // Limpiamos el buffer

        Articulo articuloBorrar = null;

        // Buscamos el artículo por ID
        for (Articulo articulo : listaArticulos) {
            if (articulo.getID() == id) {
                articuloBorrar = articulo;
            }
        }

        if (articuloBorrar != null) {
            listaArticulos.remove(articuloBorrar); // Eliminamos el artículo
        } else {
            System.err.println("No ha sido posible borrar ese artículo");
        }
    }

    /**
     * Edita los datos de un artículo en el inventario.
     */
    private void editarArticulo() {
        System.out.println("\n--- Editar Artículo ---");
        System.out.print("Ingrese el ID del artículo a editar: ");
        int id = tecl.nextInt(); // Leemos el ID
        tecl.nextLine(); // Limpiamos el buffer

        Articulo articuloEditable = null;

        // Buscamos el artículo por ID
        for (Articulo articulo : listaArticulos) {
            if (articulo.getID() == id) {
                articuloEditable = articulo;
            }
        }

        if (articuloEditable != null) {
            System.out.print("Nuevo precio de venta: ");
            double nuevoPrecioVenta = tecl.nextDouble(); // Leemos el nuevo precio de venta
            System.out.print("Nuevo precio de compra: ");
            double nuevoPrecioCompra = tecl.nextDouble(); // Leemos el nuevo precio de compra
            System.out.print("Nuevo stock: ");
            int nuevoStock = tecl.nextInt(); // Leemos el nuevo stock
            tecl.nextLine(); // Limpiamos el buffer

            // Validamos los datos y actualizamos el artículo
            if (nuevoPrecioVenta > nuevoPrecioCompra && nuevoPrecioCompra > 0 && nuevoPrecioVenta > 0 && nuevoStock >= 0) {
                articuloEditable.setPrecioCompra(nuevoPrecioCompra);
                articuloEditable.setPrecioVenta(nuevoPrecioVenta);
                articuloEditable.setStock(nuevoStock);
            } else {
                System.err.println("Error: Datos incorrectos");
            }
        } else {
            System.err.println("No se ha encontrado un artículo con ese ID");
        }
    }

    /**
     * Método principal 
     * Presenta un menú al usuario para interactuar con la tienda.
     */
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        int opcion;
        do {
            tienda.mostrarMenu();
            opcion = tecl.nextInt(); // Leemos la opción seleccionada
            tecl.nextLine(); // Limpiamos el buffer

            switch (opcion) {
                case 1:
                    tienda.mostrarArticulos();
                    break;
                case 2:
                    tienda.ventaCliente();
                    break;
                case 3:
                    tienda.compraProveedor();
                    break;
                case 4:
                    tienda.gestionarArticulos();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 5);
    }



}
