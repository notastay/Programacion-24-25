package Tema_6.c_Ej2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tecl = new Scanner(System.in);
        Persona p1 = new Persona(tecl.nextLine(), tecl.nextLine(), tecl.nextLine(), tecl.nextInt());
        if (p1.getEdad() > 17) {
            System.out.println(p1.getNombre() + " " + p1.getApellidos() + " con DNI " + p1.getDni() + " es mayor de edad ");
        } else {
            System.out.println(p1.getNombre() + " " + p1.getApellidos() + " con DNI " + p1.getDni() + " no es mayor de edad ");

        }
        tecl.close();
    }
}
