package tema_8;

import java.util.Scanner;

public class Vectores3 {
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        int[] numeros= new int[10];
        int max=0, min=0;
        for (int cadaNum : numeros) {
            System.out.println("Dime numeros hasta rellenar el array");
            numeros[cadaNum]=tecl.nextInt();
            if(cadaNum==1){
                max=numeros[cadaNum];
                min=numeros[cadaNum];
            }
            if(numeros[cadaNum]>max){
                max=numeros[cadaNum];
            }
            if(numeros[cadaNum]<min){
                min=numeros[cadaNum];
            }
        }
        System.out.println("El max es "+max+" y el min es "+min);
        tecl.close();
    }
}
