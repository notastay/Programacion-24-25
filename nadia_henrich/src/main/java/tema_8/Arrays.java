package tema_8;

import java.util.concurrent.ThreadLocalRandom;

public class Arrays {
    public static void main(String[] args) {
        if(args.length!=2){
            System.err.println("Por favor introduce 2 valores por linea de comando");
            System.exit(1);
        }

        int N=Integer.parseInt(args[0]);
        int M=Integer.parseInt(args[1]);
        int matriz[][]=new int[N][M];
        llenarMatriz(matriz);
        mostrarMaximosMatriz(matriz);

    }

    public static void llenarMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=ThreadLocalRandom.current().nextInt(0,101);            }
        }
    }

    public static void mostrarMaximosMatriz(int matriz[][]){
        //creamos un array para guardar el maximo de cada columna 
        //y lo inicializamos con el valor minimo posible para un array 
        int[] columnMax= new int[matriz[0].length];
        for (int i = 0; i < columnMax.length; i++) {
            columnMax[i]=Integer.MIN_VALUE;
        }

        for (int i = 0; i < matriz.length; i++) {
            //creamos una variable que guarde el maximo de cada fila
            int rowMax=Integer.MIN_VALUE;

            for (int j = 0; j < matriz[i].length; j++) {
                //se van imprimiendo los distintos valores de cada fila
                System.out.printf(" %5d ", matriz[i][j]);

                //se va actualizando el rowMax para imprimirlo
                if(matriz[i][j]>rowMax){
                    rowMax=matriz[i][j];
                }

                //se va actualizando el columnMax de cada columna
                if(matriz[i][j]>columnMax[j]){
                    columnMax[j]=matriz[i][j];
                }
            }
            System.out.printf("   [%2d]%n", rowMax);
        }
        for (int i : columnMax) {
            System.out.printf("     [%d]",i);
        }
        System.out.println();
        
        
    }
}
