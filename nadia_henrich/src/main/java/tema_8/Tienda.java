package tema_8;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
    private ArrayList<Articulo> listaArticulos;
    Scanner tecl=new Scanner(System.in);

    public void mostrarMenu(){
        System.out.println("1. Mostrar artículos.\r\n" + //
                        "2. Venta a cliente.\r\n" + //
                        "3. Compra a proveedor.\r\n" + //
                        "4. Gestionar artículos.\r\n" + //
                        "5. Salir");
    }

    public void mostrarArticulos(){
        for (Articulo articulo : listaArticulos) {
            System.out.println(articulo.mostrarInfo());
        }
    }

    public void ventaCliente(){
        System.out.println("Dime tu nombre");
        String nombre=tecl.nextLine();
        System.out.println("Dime el ID del producto");
        int id=tecl.nextInt();
        System.out.println("Y la cantidad a vender");
        int cantidad=tecl.nextInt();
        if(nombre!=null && cantidad>0){
            Articulo articulo=null;
            double precioFinal=0;
            for (int i = 0; i < listaArticulos.size(); i++) {
                if(listaArticulos.get(i).getID()==id){
                    articulo=listaArticulos.get(i);
                    precioFinal=listaArticulos.get(i).getPrecioVenta()*cantidad;
                }
            }
            if(precioFinal==0){
                System.err.println("El producto con ID "+ id+ ", no ha sido encontrado");
            }else{
                System.out.println(nombre+" tu total es "+ precioFinal+"€ \n Desea confirmar?");
                String confirmar=tecl.nextLine();
                if(confirmar.equals("si")){
                    articulo.vender(cantidad);
                }else{
                    System.err.println("Cancelando venta...");
                }
            }
        }
    }

    
    
}
