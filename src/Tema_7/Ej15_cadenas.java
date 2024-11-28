package Tema_7;

import java.util.Scanner;

public class Ej15_cadenas {
    public static void main(String[] args) {
        Scanner tecl = new Scanner(System.in);
        String cadena;
        int contadorRepes=0;
        StringBuilder sb = new StringBuilder();
        do {
            contadorRepes=0;
            System.out.println("Dame una cadena se 6 posiciones");
            cadena = tecl.nextLine();
            sb = new StringBuilder(cadena);
            for (int i = 0; i < sb.length(); i++) {
                for (int j = 0; j < sb.length(); j++) {
                    if (i!=j&&sb.charAt(i) == sb.charAt(j)) {
                        contadorRepes++;
                    }
                }
            }
        } while (!cadena.matches("\\d{6}")||contadorRepes!=0);
        tecl.close();
    }
}
