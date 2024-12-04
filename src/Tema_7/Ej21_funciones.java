package Tema_7;

public class Ej21_funciones {
    public static void main(String[] args) {
        System.out.println(minimo(4, 7));
        System.out.println(minimo(7, 4));
    }
    public static int minimo(int a, int b){
        if(a>b){
            return b;
        }
        return a;
    }
}
