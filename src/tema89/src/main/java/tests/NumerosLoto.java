package tests;

import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

public class NumerosLoto {
    public static void main(String[] args) {
        generarCombinacion();
    }

    public static int[] generarCombinacion(){
        int[][] posibiliadesLoto=new int[49][2];
        int hasta49=1;
        int numerosLoto[]=new int[6];
        //llenamos la primera fila de la matriz con los numeros del 1 al 49
        //y la segunda la usaremos como contador
        for (int i = 0; i < posibiliadesLoto.length; i++) {
            posibiliadesLoto[i][0]=hasta49;
            posibiliadesLoto[i][1]=0;
            hasta49++;
        }
        //llenamos la matriz
        for (int i = 0; i < 50000000; i++) {
            int opcion=ThreadLocalRandom.current().nextInt(1,50);
            for (int j = 0; j < posibiliadesLoto.length; j++) {
                if(posibiliadesLoto[j][0]==opcion){
                    posibiliadesLoto[j][1]=posibiliadesLoto[j][1]+1;
                }
            }
        }
        //buscamos los 6 numeros que mas aparecen
        int contadorA6=0;
        do {
            int mayor=0;
            int mayorNum=0;
            for (int i = 0; i < posibiliadesLoto.length; i++)  {
                if(posibiliadesLoto[i][1]>mayor){
                    mayor=posibiliadesLoto[i][1];
                    mayorNum=posibiliadesLoto[i][0];
                }
            }
            
            numerosLoto[contadorA6]=mayorNum;
            for (int i = 0; i < posibiliadesLoto.length; i++) {
                if(posibiliadesLoto[i][0]==mayorNum){
                    posibiliadesLoto[i][1]=0;
                }
            }
            
            contadorA6++;
        } while (contadorA6!=6);
        return numerosLoto;


    }
}