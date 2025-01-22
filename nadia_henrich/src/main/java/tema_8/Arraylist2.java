package tema_8;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist2 {
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        System.out.println("Dame un entero y te dire sus divisores");
        int entero=tecl.nextInt();
        ArrayList<Integer> divisores= new ArrayList<>();

        for (int i = 1; i < Math.sqrt(entero); i++) {
            if(entero%i==0){
                divisores.add(i);
            }
        }
        for (int i = 0; i < divisores.size(); i++) {
            System.out.println(divisores.get(i));
        }
        tecl.close();
    }
}
