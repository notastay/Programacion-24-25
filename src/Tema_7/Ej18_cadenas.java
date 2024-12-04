package Tema_7;

import java.util.Scanner;

public class Ej18_cadenas {
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        System.out.println("Dame un String");
        String cadena=tecl.nextLine();
        StringBuilder sb= new StringBuilder(cadena);
        for (int i = 1; i <sb.length() ; i+=2 ) {
            sb.replace(i, i+1, "*");
        }
        System.out.println(sb);
        tecl.close();
    }
}
