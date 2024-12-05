package Tema_7;

import java.util.Scanner;

public class Ej32_funciones {
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        int numero;
        do {
            System.out.println("Dime un numero entre 1-20 y te dire su factorial");
            numero=tecl.nextInt();
            if(numero>1||numero<20){
                break;
            }
            System.out.println(factorial(numero));
            

            
        } while (numero>1||numero<20);
        tecl.close();
    }
    public static int factorial(int n){
        int acumulativa=1;
        for (int i = 2; i < n+1; i++) {
            acumulativa=acumulativa*i;
        }
        return acumulativa;
    }
}
