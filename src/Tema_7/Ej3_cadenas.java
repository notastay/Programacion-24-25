package Tema_7;

import java.util.Scanner;

public class Ej3_cadenas {
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        String cadena1=tecl.nextLine();
        String cadena2=tecl.nextLine();
        if(cadena1.equals(cadena2)){
            System.out.println("Las 2 cadenas son la misma");
        }else if (cadena1.equalsIgnoreCase(cadena2)) {
            System.out.println("Las 2 cadenas son iguales ignorando mayusculas y minusculas");
        }else{
            System.out.println("Las 2 cadenas son distintas");
        }
        tecl.close();

    }
}
