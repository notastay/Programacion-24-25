package tema_8;

import java.util.Scanner;

public class Vectores1 {
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        int[] numeros= new int[10];
        for (int cadaNum : numeros) {
            System.out.println("Dime un numero hasta rellenar el array");
            numeros[cadaNum]=tecl.nextInt();
        }
        tecl.close();

    }
    
}
