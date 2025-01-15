package tema_8;

import java.util.Scanner;

public class Vectores12 {
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        String opcion="";
        int[] array10Enteros= new int[10];
        int p=0;
        do {
            System.out.println("a.Mostrar valores \n b.Introducir Valor \n c.Salir");
            opcion=tecl.nextLine();
            if(opcion.equals("a")){
                for (int i = 0; i < array10Enteros.length; i++) {
                    System.out.println(array10Enteros[i]);
                }
            }
            if(opcion.equals("b")){
                System.out.println("Dime numero y posicion");
                do{
                p=tecl.nextInt();
                }while(p>0&&p<array10Enteros.length);
                int v=tecl.nextInt();
                array10Enteros[p]=v;
            }
        } while (!opcion.equals("c"));
        tecl.close();
    }
}
