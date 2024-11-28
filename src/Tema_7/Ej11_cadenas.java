package Tema_7;

import java.util.Scanner;

public class Ej11_cadenas {
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        System.out.println("Dime un email y te dire sus dominios y subdominios");
        String email=tecl.nextLine();
        String dominios=email.substring(email.indexOf("@"),email.length()-3);
        System.out.println(dominios);
    }
}
