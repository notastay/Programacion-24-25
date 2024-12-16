package Tema_7;

import java.util.concurrent.ThreadLocalRandom;

public class Ej44_Mastermind {
    private final String combinacion;

    public Ej44_Mastermind(int longitud) {
        String numeros="1234456789";
        String res="";
        if(longitud<9||longitud>1){
            for (int i = 0; i < longitud; i++) {
                int cadenaNumeros=ThreadLocalRandom.current().nextInt(0,numeros.length());
                res+=numeros.charAt(cadenaNumeros);
                numeros.replace(numeros.charAt(cadenaNumeros)+"","");
            }
            combinacion=res;
        }else{
            for (int i = 0; i < 4; i++) {
                int cadenaNumeros=ThreadLocalRandom.current().nextInt(0,numeros.length());
                res+=numeros.charAt(cadenaNumeros);
                numeros.replace(numeros.charAt(cadenaNumeros)+"","");
            }
            combinacion=res;
        }
    }

    


}
