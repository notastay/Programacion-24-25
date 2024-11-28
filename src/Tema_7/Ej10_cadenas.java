package Tema_7;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ej10_cadenas {
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        String opciones="abcdefghij";
        int posiciones=0;
        String contraseña="";
        do{
        System.out.println("Cuantas posiciones de 5-10 quieres que tenga tu contraseña");
        posiciones=tecl.nextInt();
        }while(posiciones<5||posiciones>10);
        for (int i = 0; i < posiciones; i++) {
            int numero=ThreadLocalRandom.current().nextInt(0,opciones.length());
            contraseña=contraseña+opciones.charAt(numero);  
            opciones=opciones.replace(""+opciones.charAt(numero),"" );     
        }
        System.out.println(contraseña);
        tecl.close();

    }
}
