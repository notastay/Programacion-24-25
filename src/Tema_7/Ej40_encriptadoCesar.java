package Tema_7;

public class Ej40_encriptadoCesar {
    public static void main(String[] args) {
        
        System.out.println(encriptar("HOLA BUENAZ", 4));
        System.out.println(desencriptar("LSPE FYIRED", 4));
    }

    public static String encriptar(String cadena, int posiciones){
        String letras="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String encriptado="";
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.substring(i, i+1).equals(" ")){
                encriptado=encriptado+" ";
                continue;
            }
            int charPosicion=letras.indexOf(cadena.charAt(i));
            charPosicion=charPosicion+posiciones;
            if(charPosicion>=letras.length()){
                charPosicion=charPosicion-letras.length();
            }
            encriptado=encriptado+letras.substring(charPosicion,charPosicion+1);
        }
        return encriptado;

    }
    public static String desencriptar(String cadena, int posiciones){
        String letras="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String desencriptado="";
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.substring(i, i+1).equals(" ")){
                desencriptado=desencriptado+" ";
                continue;
            }
            int charPosicion=letras.indexOf(cadena.charAt(i));
            charPosicion=charPosicion-posiciones;
            if(charPosicion<0){
                charPosicion=charPosicion+letras.length();
            }
            desencriptado=desencriptado+letras.substring(charPosicion,charPosicion+1);
        }
        return desencriptado;

    }
}


