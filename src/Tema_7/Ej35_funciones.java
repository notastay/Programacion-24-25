package Tema_7;

public class Ej35_funciones {
    public static void main(String[] args) {
        System.out.println(masPrimo(12421));
        System.out.println(digitos(12421));
        System.out.println(digitos(12421.34));

        
    }

    public static int masPrimo(int num){
        int res;
        for (int i = num+1; ; i++) {
            boolean esPrimo=true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i%j==0){
                    esPrimo=false;
                    break;
                }
            }
            if(esPrimo){
                res=i;
                break;
            }
        }
        return res;
    }
    public static int digitos(double num){
        String numeros=String.valueOf(num);
        if(numeros.contains(".")){
            numeros=numeros.replaceAll("[.-]","");
        }
        return numeros.length();
    }
}
