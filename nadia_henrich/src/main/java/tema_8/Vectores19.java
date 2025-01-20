package tema_8;

import java.util.Arrays;
import java.util.Scanner;

public class Vectores19 {
    public static void main(String[] args) {
        int[] puntuaciones=new int[8];
        int[] puntuacionesSorted=new int[8];
        Scanner tecl=new Scanner(System.in);
        System.out.println("Dime las puntuaciones");
        for (int i = 0; i < puntuaciones.length; i++) {
            do {
                puntuaciones[i]=tecl.nextInt();
            } while (puntuaciones[i]<1000||puntuaciones[i]>2800);
        }
        Arrays.sort(puntuaciones);
        for (int i = 0; i < puntuacionesSorted.length; i++) {
            puntuacionesSorted[i]=puntuaciones[puntuaciones.length-i];
        }
        for (int i : puntuacionesSorted) {
            System.out.println(i);
        }
        
    }
}
