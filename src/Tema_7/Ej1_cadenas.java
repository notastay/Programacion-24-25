package Tema_7;

import java.util.Scanner;

public class Ej1_cadenas {
    public static void main(String[] args){
        Scanner tecl=new Scanner(System.in);
        String cadena= "Hola Buenas Tardes!";
        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());
        System.out.println("Dame un caracter y te dire si esta en la cadena");
        String caracter=tecl.nextLine();
        if(cadena.contains(caracter)){
            System.out.println("La cadena contiene tu caracter "+caracter);
        }else{
            System.out.println("La cadena no contiene tu caracter "+caracter);
        }
        if(cadena.length()>10){
            System.out.println("La cadena tiene mas de 10 posiciones");
        }else{
            System.out.println("La cadena no tiene mas de 10 posiciones");
        }
        String primeras=cadena.substring(0,5);
        String ultimas=cadena.substring(cadena.length()-5);
        System.out.println("Las primeras 5 letras de la cadena son "+ primeras+"\n"+"Las 5 ultimas son "+ultimas);
        if(cadena.equalsIgnoreCase("Hola")){
            System.out.println("La cadena es hola");
        }else{
            System.out.println("La cadena no es hola");
        }
        tecl.close();
        
    }
}
