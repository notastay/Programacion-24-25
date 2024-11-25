package Tema_7;

import java.util.Scanner;

public class Ej6_cadenas {
    public static void main(String[] args) {
        Scanner tecl= new Scanner(System.in);
        int contadorA=0, contadorE=0, contadorI=0, contadorO=0, contadorU=0;
        System.out.println("Dame una cadena y te contare las vocales");
        String cadena=tecl.nextLine();
        String cadenaMinus=cadena.toLowerCase();
        for (int i = 0; i < cadenaMinus.length(); i++) {
            String loop=cadenaMinus.substring(i,i+1);//asi solo se extrae un caracter en cada iteracion
            if(loop.equals("a")){
                contadorA++;
            }else if(loop.equals("e")){
                contadorE++;
            }else if(loop.equals("i")){
                contadorI++;
            }else if(loop.equals("o")){
                contadorO++;
            }else if(loop.equals("u")){
                contadorU++;
            }
        }
        System.out.println("Nº de A's: "+contadorA);
        System.out.println("Nº de E's: "+contadorE);
        System.out.println("Nº de I's: "+contadorI);
        System.out.println("Nº de O's: "+contadorO);
        System.out.println("Nº de U's: "+contadorU);
        tecl.close();
    }
}
