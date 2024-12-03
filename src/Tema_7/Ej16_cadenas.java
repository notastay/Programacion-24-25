package Tema_7;

import java.util.Scanner;

public class Ej16_cadenas {
    public static void main(String[] args) {
        Scanner tecl = new Scanner(System.in);
        System.out.println("Dame un numero decimal");
        int decimal = tecl.nextInt();
        int resto = 0;
        String resultado = "";
        do {
            resto = decimal % 16;
            decimal = decimal / 16;
            switch (resto) {
                case 10:
                    resultado = "A" + resultado;
                    break;
                case 11:
                    resultado = "B" + resultado;
                    break;
                case 12:
                    resultado = "C" + resultado;
                    break;
                case 13:
                    resultado = "D" + resultado;
                    break;
                case 14:
                    resultado = "E" + resultado;
                    break;
                case 15:
                    resultado = "F" + resultado;
                    break;

                default:
                    resultado = resto + resultado;
                    break;
            }
        } while (decimal > 0);
        System.out.println(resultado);
        tecl.close();

    }
}
