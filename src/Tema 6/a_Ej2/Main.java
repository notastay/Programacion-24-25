package a_Ej2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona pers1 = new Persona();
        Scanner tecl = new Scanner(System.in);
        System.out.print("Nombre: ");
        pers1.nombre = tecl.nextLine();
        System.out.print("DNI: ");
        pers1.dni = tecl.nextLine();
        System.out.print("Apellidos: ");
        pers1.apellidos = tecl.nextLine();
        System.out.print("Edad: ");
        pers1.edad = tecl.nextInt();
        if (pers1.edad > 17) {
            System.out.println(pers1.nombre + pers1.apellidos + "con DNI " + pers1.dni + " es mayor de edad ");
        } else {
            System.out.println(pers1.nombre + pers1.apellidos + "con DNI " + pers1.dni + " no es mayor de edad ");

        }
        tecl.close();

    }
}
