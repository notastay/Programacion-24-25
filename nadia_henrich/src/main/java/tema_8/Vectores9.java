package tema_8;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Vectores9 {
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        int[] numerosA10=new int[100];
        for (int i = 0; i < numerosA10.length; i++) {
            numerosA10[i]=ThreadLocalRandom.current().nextInt(1,11);
        }
        System.out.println("Dame un numero");
        int n=tecl.nextInt();
        for (int i = 0; i < numerosA10.length; i++) {
            if(numerosA10[i]==n){
                System.out.println("Tu numero aparece en la posicion "+ i);
            }
        }
        tecl.close();
    }
}
