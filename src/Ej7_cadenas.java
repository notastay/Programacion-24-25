import java.util.Scanner;

public class Ej7_cadenas {
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        System.out.println("Dame 1 cadenas y te dire si es palindromo");
        String cadena=tecl.nextLine();
        int palindromo=0;
        String cadenaP=cadena.replace(" ", "").toLowerCase();
        for (int i = 1; i <= cadenaP.length(); i++) {
            String delante=cadenaP.substring(i-1,i);
            String atras=cadenaP.substring(cadenaP.length()-i,cadenaP.length()-i+1);
            if(delante.equals(atras)){
                palindromo++;
            }
        }
        if(palindromo==cadenaP.length()){
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }
    }
}
