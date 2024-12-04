package Tema_7;

import java.util.concurrent.ThreadLocalRandom;

public class Ej29_funciones {
    public static void main(String[] args) {
        System.out.println(aleatorio(1, 10));
    }

    public static int aleatorio(int a, int b){
        if(a<b&&a>0&&b>0){
            int azar=ThreadLocalRandom.current().nextInt(a,b+1);
            return azar;
        }
        return -1;
    }
}
