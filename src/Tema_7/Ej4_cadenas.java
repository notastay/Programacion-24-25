package Tema_7;

import java.util.Scanner;

public class Ej4_cadenas {
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        System.out.println("Dime Nombre y los 2 apellidos");
        String nombre=tecl.nextLine();
        String apellido1=tecl.nextLine();
        String apellido2=tecl.nextLine();
        String concatPrimeras3=nombre.substring(0,3)+apellido1.substring(0,3)+apellido2.substring(0,3);
        concatPrimeras3=concatPrimeras3.toUpperCase();
        System.out.println(concatPrimeras3);
        tecl.close();


    }
}
