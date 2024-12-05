package Tema_7;

public class Ej34_funciones {
    public static void main(String[] args) {
        System.out.println(numerosPrimos());
    }
    public static int numerosPrimos(){
        int suma=0;
        for (int i = 1; i <= 1000; i++) {
            boolean esPrimo=true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i%j==0){
                    esPrimo=false;
                    break;
                }
            }
            if(esPrimo){
                suma+=i;
            }
            
        }
        return suma;
    }

}
