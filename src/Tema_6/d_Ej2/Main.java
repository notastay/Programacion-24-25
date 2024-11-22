package Tema_6.d_Ej2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tecl = new Scanner(System.in);
        Persona p1 = new Persona(tecl.nextLine(), tecl.nextLine(), tecl.nextLine(), tecl.nextInt());
        Persona p2 =new Persona("Josefa","Ruiz","35545288S",68);
        Persona p3 =new Persona("Maria","Cordoba","67834566U",17);
        System.out.println(p2.esJubilado());
        System.out.println(p3.esMayorEdad());
        System.out.println(p2.diferenciaEdad(p3));
        p1.imprime();
        tecl.close();
    }
}
