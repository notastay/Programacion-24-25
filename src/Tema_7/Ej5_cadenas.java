package Tema_7;

import java.util.Scanner;

public class Ej5_cadenas {
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        System.out.println("Dame una cadena de texto");
        String cadena=tecl.nextLine();
        System.out.println(cadena.replace(" " , "\n"));
        tecl.close();
    }
}
