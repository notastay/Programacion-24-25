package tema_8;

import java.util.Scanner;

public class Vectores5 {
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        int[] numeros=new int[20];
        int suma=0;
        for (int cadaNum : numeros) {
            System.out.println("Dime numeros hasta rellenar el array");
            numeros[cadaNum]=tecl.nextInt();
            suma+=numeros[cadaNum];
        }
        System.out.println("La media es "+suma/numeros.length);
        tecl.close();
    }
}
