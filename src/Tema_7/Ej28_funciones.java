package Tema_7;

public class Ej28_funciones {
    public static void main(String[] args) {
        System.out.println(contarCeros("000ab"));
    }
    public static int contarCeros(String str){
        int contador=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='0'){
                contador++;
            }
        }
        return contador;
    }
}
