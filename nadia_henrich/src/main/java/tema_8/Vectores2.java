package tema_8;

import java.util.Scanner;

public class Vectores2 {
    public static void main(String[] args) {
        Scanner tecl= new Scanner(System.in);
        int suma=0;
        int[] numeros=new int[10];
        for (int cadaNum : numeros) {
            System.out.println("Dime numeros hasta rellenar el Array");
            numeros[cadaNum]=tecl.nextInt();
            suma+=numeros[cadaNum];
        }
        System.out.println("La suma final es "+suma);
        tecl.close();
    }
}
