package tema_8;

import java.util.Scanner;

public class Vectores13 {
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        System.out.println("Dame un valor y los incrementos");
        int v=tecl.nextInt();
        int i=tecl.nextInt();
        int n=tecl.nextInt();
        int[] aritmetica= new int[n];
        for (int j = 0; j < aritmetica.length; j++) {
            aritmetica[j]=v;
            v+=i;
        }
        for (int j=0;j < aritmetica.length; j++) {
            System.out.println(aritmetica[j]);
        }
        tecl.close();

    }
}
