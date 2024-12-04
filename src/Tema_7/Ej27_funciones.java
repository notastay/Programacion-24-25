package Tema_7;

public class Ej27_funciones {
    public static void main(String[] args) {
        System.out.println(sumaIntervalo(2, 7));
    }
    public static long sumaIntervalo(long a, long b){
        long resultado=0;
        if(a<b&&a>0&&b>0){
            for (long i = a; i <= b; i++) {
               resultado=resultado+i; 
            }
            return resultado;
        }
        return -1;
    }
}
