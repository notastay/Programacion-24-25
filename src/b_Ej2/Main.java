package b_Ej2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tecl = new Scanner(System.in);
        Persona p1 = new Persona(tecl.nextLine(), tecl.nextLine(), tecl.nextLine(), tecl.nextInt());
        if (p1.edad > 17) {
            System.out.println(p1.nombre + " " + p1.apellidos + " con DNI " + p1.dni + " es mayor de edad ");
        } else {
            System.out.println(p1.nombre + " " + p1.apellidos + " con DNI " + p1.dni + " no es mayor de edad ");

        }
        tecl.close();
    }
}
