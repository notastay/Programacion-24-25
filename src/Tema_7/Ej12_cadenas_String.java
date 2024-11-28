package Tema_7;

import java.util.Scanner;

public class Ej12_cadenas_String {
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        System.out.println("Dime una cadena");
        String cadena=tecl.nextLine();
        System.out.println("Dime una posicion");
        int posicion=tecl.nextInt();
        System.out.println("Dime un caracter para reemplazar");
        tecl.nextLine();
        String caracter=tecl.nextLine();
        cadena=cadena.replace(""+cadena.charAt(posicion), caracter);
        System.out.println(cadena);
        tecl.close();
    }
}
