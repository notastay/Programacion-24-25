package Tema_7;

public class Ej20_funciones {
    public static void main(String[] args) {
        System.out.println(esMayorEdad(15));
        System.out.println(esMayorEdad(20));
    }
    public static boolean esMayorEdad(int a){
        if (a>=18) {
            return true;
        }
        return false;
    }
}
