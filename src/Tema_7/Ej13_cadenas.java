package Tema_7;

import java.util.Scanner;

public class Ej13_cadenas {
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        StringBuilder newCadena=new StringBuilder();
        for (int i = 0; i < 10; i++) {
            System.out.println("Dame una cadena");
            String cadena=tecl.nextLine();
            newCadena.append(cadena.charAt(0));
        }
        System.out.println(newCadena);
        tecl.close();
    }
}
