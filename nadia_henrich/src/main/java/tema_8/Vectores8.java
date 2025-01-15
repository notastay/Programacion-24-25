package tema_8;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Vectores8 {
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        Double[] arrayA100=new Double[100];
        for (int i = 0; i < arrayA100.length; i++) {
            arrayA100[i]=ThreadLocalRandom.current().nextDouble(0.0,1.000001);
        }
        System.out.println("Dime un numero");
        double r=tecl.nextInt();
        int contador=0;
        for (int i = 0; i < arrayA100.length; i++) {
            if(arrayA100[i]>=r){
                contador++;
            }
        }
        System.out.println("Hay "+ contador+ " valores mayores o igual a "+r);
        tecl.close();
    }
}
