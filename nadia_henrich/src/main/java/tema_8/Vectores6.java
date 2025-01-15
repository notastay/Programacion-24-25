package tema_8;

import java.util.Scanner;

public class Vectores6 {
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        System.out.println("Dame 2 numeros");
        int n=tecl.nextInt();
        int m= tecl.nextInt();
        int[] nM= new int[n];
        for (int i : nM) {
            nM[i]=m;
        }
        tecl.close();
    }
}
