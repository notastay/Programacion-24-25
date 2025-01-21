package tema_8;

import java.util.Scanner;

public class Matrices5 {
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        System.out.println("Cuantas personas hay en la empresa?");
        int n=tecl.nextInt();
        int brechaSalarial[][]=new int[n][2];
        for (int i = 0; i < brechaSalarial.length; i++) {
            do {
                System.out.println("Hombre(0) o Mujer(1)?");
                brechaSalarial[i][0]=tecl.nextInt();
            } while (brechaSalarial[i][0]!=1&&brechaSalarial[i][0]!=0); 
        }
        for (int i = 0; i < brechaSalarial.length; i++) {
            System.out.println("Y sus salarios son?");
            brechaSalarial[i][1]=tecl.nextInt();
        }
        int contM=0;
        int contH=0;
        int sumatM=0;
        int sumatH=0;
        for (int i = 0; i < brechaSalarial.length; i++) {
            if(brechaSalarial[i][0]==1){
                sumatM+=brechaSalarial[i][1];
                contM++;
            }
            if(brechaSalarial[i][0]==0){
                sumatH+=brechaSalarial[i][1];
                contH++;
            }    
        }
        System.out.println("El sueldo medio de las mujeres es "+(sumatM/contM));
        System.out.println("El sueldo medio de los hombres es "+(sumatH/contH));

        tecl.close();
    }
}
