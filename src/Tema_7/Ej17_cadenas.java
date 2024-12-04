package Tema_7;

import java.util.Scanner;

public class Ej17_cadenas {
    public static void main(String[] args) {
        Scanner tecl = new Scanner(System.in);
        System.out.println("Dame un String");
        String cadena = tecl.nextLine();
        StringBuilder sb = new StringBuilder(cadena);
        if (sb.length() >= 1) {
            sb.setCharAt(1, 'z');
            if (sb.length() >= 3) {
                sb = sb.deleteCharAt(3);
                if (sb.length() >= 5) {
                    sb.setCharAt(5, 'x');
                    if(sb.length()>=10){
                         sb=sb.delete(5, 10);
                    }

                }
            }
        }
        sb=sb.reverse();
        String cadenaFinal=sb.toString();
        System.out.println(cadenaFinal);
        tecl.close();

    }
}
