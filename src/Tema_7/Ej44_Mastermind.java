package Tema_7;

import java.util.concurrent.ThreadLocalRandom;

public class Ej44_Mastermind {
    private final String combinacion;

    public String getCombinacion() {
        return combinacion;
    }

    public Ej44_Mastermind(int longitud) {
        String numeros="123456789";
        String res="";
        if(longitud<9||longitud>1){
            for (int i = 0; i < longitud; i++) {
                int cadenaNumeros=ThreadLocalRandom.current().nextInt(0,numeros.length());
                res+=numeros.charAt(cadenaNumeros);
                numeros=numeros.replace(numeros.charAt(cadenaNumeros)+"","");
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

    public int numerosCorrectos(String cadena){
        int contadorIgualPos=0;
        if(combinacion.length()==cadena.length()&&cadena.matches("^[1-9]+$")){
            for (int i = 0; i < combinacion.length(); i++) {
                String recorreCadena=cadena.substring(i, i+1);
                if(recorreCadena.equals(combinacion.charAt(i)+"")){
                    contadorIgualPos++;
                }
            }
            return contadorIgualPos;
        }
        return -1;
    }
    public int numerosOtraPosicion(String cadena){
        int contadorIgual=0;
        if(combinacion.length()==cadena.length()&&cadena.matches("^[1-9]+$")){
            for (int i = 0; i < combinacion.length(); i++) {
                for (int j = 0; j < cadena.length(); j++) {
                    String recorreCadena=cadena.substring(i, i+1);
                    if(recorreCadena.equals(combinacion.charAt(j)+"")){
                        contadorIgual++;
                    }
                }
            }
            return contadorIgual;
        }
        return -1;
    }
}
