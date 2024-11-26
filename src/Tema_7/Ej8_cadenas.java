package Tema_7;

import java.util.Scanner;

public class Ej8_cadenas {
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        System.out.println("Dame 1 cadena y un caracter");
        String cadena=tecl.nextLine();
        String caracter=tecl.nextLine();
        int contadorCaracter=0;
        for (int i = 0; i < cadena.length(); i++) {
            String loop=cadena.substring(i,i+1);
            if (loop.equals(caracter)) {
                contadorCaracter++;
            }
        }
        System.out.println("Hay "+contadorCaracter+" "+caracter+"'s en tu cadena");
        tecl.close();
    }
}
