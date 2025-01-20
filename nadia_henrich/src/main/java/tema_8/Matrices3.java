package tema_8;

import java.util.Scanner;

public class Matrices3 {
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        System.out.println("Dime las dimensiones de la matriz");
        int n=tecl.nextInt();
        int m=tecl.nextInt();
        int matrizNM[][]=new int[n][m];
        int mayoresCero=0;
        int menoresCero=0;
        int igualCero=0;
        System.out.println("introduce los valores");
        for (int i = 0; i < matrizNM.length; i++) {
            for (int j = 0; j < matrizNM[i].length; j++) {
                matrizNM[i][j]=tecl.nextInt();
                if(matrizNM[i][j]==0){
                    igualCero++;
                }
                else if(matrizNM[i][j]<0){
                    menoresCero++;
                }
                else{
                    mayoresCero++;
                }
            }
        }
        System.out.println("Hay "+mayoresCero+ " numeros mayores que 0, "+menoresCero+" menores y "+igualCero+ " iguales");
        tecl.close();
    }
}
