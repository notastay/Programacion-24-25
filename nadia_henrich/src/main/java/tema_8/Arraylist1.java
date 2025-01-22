package tema_8;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList <Double> alturas =new ArrayList<>();
        Scanner tecl=new Scanner(System.in);
        String opcion;
        double altura;
        int contadorBorrados=0;
        do {
            System.out.println("a)Añadir altura.\n" + //
                        "b) Mostrar lista actual con el número de posición.\n" + //
                        "c) Eliminar por posición. \n" + //
                        "d) Eliminar por valor. (Devuelve la cantidad de eliminaciones)\n" + //
                        "e) Ordenar la lista \n"+ //
                        "f) Salir");
            opcion=tecl.nextLine();
            switch (opcion) {
                case "a":
                do {
                    System.out.println("Dime la altura a añadir");
                    altura=tecl.nextDouble();
                } while (altura>2.50&&altura<0.50);
                    alturas.add(altura);
                    break;

                case "b":
                    for (int i = 0; i < alturas.size(); i++) {
                        System.out.println(i+"|"+alturas.get(i));
                    }
                    break;

                case "c":
                        alturas.remove(tecl.nextInt());
                    break;

                case "d":
                        System.out.println("Dime la altura a eliminar");
                        altura=tecl.nextDouble();
                        contadorBorrados =0;
                        for (int i = 0; i < alturas.size(); i++) {
                            if(alturas.get(i).equals(altura)){
                                alturas.remove(i);
                                contadorBorrados++;
                            }
                        }
                        System.out.println("se han borrado "+contadorBorrados+" numeros");
                    break;

                case "e":
                        alturas.sort(null);
                    break;

                default:
                System.out.println("Opcion Invalida");
                    break;
            }
            
        } while (!opcion.equals("f"));
        tecl.close();
    }
}
