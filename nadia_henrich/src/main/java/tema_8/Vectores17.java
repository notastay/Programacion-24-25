package tema_8;

import java.util.Scanner;

public class Vectores17 {
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        int[] array1=new int[10];
        int[] array2=new int[10];
        int comparator=0;
        System.out.println("Dime 20 numeros");
        for (int i = 0; i < array1.length; i++) {
            array1[i]=tecl.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i]=tecl.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            if(array1[i]==array2[i]){
                comparator++;
            }
        }
        if(comparator==array1.length){
            System.out.println("Los 2 arrays son iguales");
        }else{
            System.out.println("Los 2 arrays no son iguales");
        }
        tecl.close();

    }
}
