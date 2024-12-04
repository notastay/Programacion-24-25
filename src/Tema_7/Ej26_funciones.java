package Tema_7;

public class Ej26_funciones {
    public static void main(String[] args) {
        System.out.println(suma1aN(5));
        System.out.println(producto1aN(5));
        System.out.println(intermedio1aN(7));
    }
    public static int suma1aN(int n){
        int sumat=0;
        for (int i = 0; i <n; i++) {
            sumat=sumat+i;
        }
        return sumat;
    }
    public static int producto1aN(int n){
        int product=0;
        for ( int i = 0; i <n; i++) {
          product=product+i;  
        }
        return product;
    }
    public static double intermedio1aN(int n){
        return (n+1)/2;
    }


}
