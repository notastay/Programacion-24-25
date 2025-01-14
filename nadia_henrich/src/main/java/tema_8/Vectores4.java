package tema_8;

import java.util.Scanner;

public class Vectores4 {
    public static void main(String[] args) {
        Scanner tecl= new Scanner(System.in);
        int sumaPos=0;
        int sumaNeg=0;
        int[] numeros =new int[20];
        for (int cadaNum : numeros){
            System.out.println("Dime numeros hasta rellenar el array");
            numeros[cadaNum]=tecl.nextInt();
            if(numeros[cadaNum]>=0){
                sumaPos+=numeros[cadaNum];
            }else{
                sumaNeg+=numeros[cadaNum];
            }
        }
        System.out.println("La suma de los positivos es "+sumaPos+" y la suma de los negativos es "+sumaNeg);
        tecl.close();
    }
}
