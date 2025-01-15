package tema_8;

import java.util.Scanner;

public class Vectores7 {
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        int p=0, q=0;
        do {
            System.out.println("Dame 2 enteros, el primero menor que el segundo");
            p=tecl.nextInt();
            q=tecl.nextInt();
        } while (p>=q);
        int tamaño=q-p;
        int[] desdePHastaQ= new int[tamaño+1];
        for (int i = 0; i < tamaño+1; i++) {
            desdePHastaQ[i] = p + i;
        }
        for (int i = 0; i < tamaño+1; i++) {
            System.out.println(desdePHastaQ[i]);
        }
        tecl.close();
    }
}
