package Tema_7;
//borra los espacios
//el scanner no se cierra y no esta indentado

public class Ej14_cadenas {
    public static void main(String[] args) {

        java.util.Scanner teclado = new java.util.Scanner(System.in);
        System.out.println("Introduce una cadena:");
        String cadena = teclado.nextLine();
        StringBuilder cadenaSB = new StringBuilder(cadena);
        int pos;
        do {
            pos = cadenaSB.indexOf(" ");
            if (pos != -1)
                cadenaSB.deleteCharAt(pos);
        } while (pos != -1);
        System.out.println(cadenaSB);
        teclado.close();
    }
}