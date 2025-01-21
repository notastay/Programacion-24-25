package tema_8;

import java.util.Scanner;

public class Matrices4 {
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        int notas[][]= new int[4][5];
        int sumat=0;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                notas[i][j]=tecl.nextInt();
            }
        }
        

        for (int i = 0; i < notas.length; i++) {
            sumat=0;
            int maximo=notas[i][0];
            int minimo=notas[i][0];

            for (int j = 0; j < notas[i].length; j++) {
                if(maximo<notas[i][j]){
                    maximo=notas[i][j];
                }
                if(minimo>notas[i][j]){
                    minimo=notas[i][j];
                }
                sumat+=notas[i][j];
                
            }
            System.out.println("La media de alumno "+i+ " es "+(sumat/5.00));
            System.out.println("Nota maxima= "+maximo);
            System.out.println("Nota minima= "+minimo);

            
        }

        tecl.close();
    }
}
