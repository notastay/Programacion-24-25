package Tema_7;

import java.util.Scanner;

public class Ej2_cadenas {
    public static void main(String[] args) {
        String letrasNIF="TRWAGMYFPDXBNJZSQVHLCKE";
        Scanner tecl=new Scanner(System.in);
        System.out.println("Dime tu DNI");
        int dni=tecl.nextInt();
        int resto=dni%23;
        System.out.println(letrasNIF.charAt(resto));
        tecl.close();
    }
}
