package Tema_7;

public class Ej40_encriptadoVigenere {
    public static void main(String[] args) {
        
        System.out.println(encriptar("Buenas noches","LIMON"));
        System.out.println(desencriptar("NDRCOE WBRVQB","LIMON" ));
    }

    public static String encriptar(String cadena,String clave){
        cadena=cadena.toUpperCase();
        clave=clave.toUpperCase();
        String letras="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String encriptado="";
        int claveIndice=0;
        for (int i = 0; i < cadena.length(); i++) {
            if(!letras.contains(cadena.substring(i, i+1))){
                encriptado=encriptado+cadena.substring(i,i+1);
                continue;
            }
            int desplazamiento = letras.indexOf(clave.substring(claveIndice, claveIndice + 1))+1;
            claveIndice = (claveIndice + 1) % clave.length(); 
            int charPosicion = letras.indexOf(cadena.substring(i, i + 1)) + desplazamiento;
            if (charPosicion >= letras.length()) {
                charPosicion -= letras.length();
            }
            encriptado += letras.substring(charPosicion, charPosicion + 1);
        }
        return encriptado;

    }
    public static String desencriptar(String cadena,String clave){
        cadena=cadena.toUpperCase();
        clave=clave.toUpperCase();
        String letras="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String desencriptado="";
        int claveIndice=0;
        for (int i = 0; i < cadena.length(); i++) {
            if(!letras.contains(cadena.substring(i, i+1))){
                desencriptado=desencriptado+cadena.substring(i,i+1);
                continue;
            }
        int desplazamiento = letras.indexOf(clave.substring(claveIndice, claveIndice + 1))+1;
        claveIndice = (claveIndice + 1) % clave.length(); 
        int charPosicion = letras.indexOf(cadena.substring(i, i + 1)) - desplazamiento;
            if (charPosicion < 0) {
                charPosicion += letras.length();
            }
            desencriptado += letras.substring(charPosicion, charPosicion + 1);
        }
        return desencriptado;

    }
    public static String viginere(String cadena, String clave, boolean encriptar){
        if(encriptar==true){
            return encriptar(cadena,clave);
        }
        return desencriptar(cadena,clave);
    }
}


