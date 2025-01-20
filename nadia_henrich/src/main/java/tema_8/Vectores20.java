package tema_8;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Vectores20 {
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        int[] mostrarN= new int[1000];
        for (int i = 0; i < mostrarN.length; i++) {
            mostrarN[i]=ThreadLocalRandom.current().nextInt(0,100);
        }
        System.out.println("Dime un num n");
        int n=tecl.nextInt();
        int contadorN=0;
        for (int i = 0; i < mostrarN.length; i++) {
            if(mostrarN[i]==n){
                contadorN++;
            }
        }
        if(contadorN>0){
            System.out.println(n+ " Esta en el array "+contadorN+" veces");
        }
        tecl.close();
    }
}
