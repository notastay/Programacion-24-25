package Tema_7;

public class Ej33_funciones {
    public static void main(String[] args) {
        System.out.println(cantidadDivisores(60));
    }
    public static int cantidadDivisores(int num){
        int divisor=2;
        int numDivisores=1;
        if(num>0){
            while(num>1){
                int exponente=0;
                while(num%divisor==0){
                    num/=divisor;
                    exponente++;
                }
                if(exponente >0){
                    numDivisores*=(exponente+1);
                }
                divisor++;
            }
            return numDivisores;
        }
        return 0;
    }
}
