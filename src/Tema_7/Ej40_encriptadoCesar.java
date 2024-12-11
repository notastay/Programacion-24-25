package Tema_7;

public class Ej40_encriptadoCesar {
    public static void main(String[] args) {
        
        System.out.println(encriptar("HALO ALLES GUTEN MORGEN", 28));
        System.out.println(encriptar("JQNC DWGPCB", -28));
    }

    public static String encriptar(String cadena, int posiciones){
        String letras="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String encriptado="";
        while (posiciones>=letras.length()||posiciones<0) {
            if(posiciones>=letras.length()){
                posiciones=posiciones-letras.length();
            }
            if(posiciones<0){
                posiciones=posiciones+letras.length();
            }
        }
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
        while (posiciones>=letras.length()||posiciones<0) {
            if(posiciones>=letras.length()){
                posiciones=posiciones-letras.length();
            }
            if(posiciones<0){
                posiciones=posiciones+letras.length();
            }
        }
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
    public static String cesar(String cadena,int posiciones, boolean encriptar){
        if(encriptar==true){
            return encriptar(cadena, posiciones);
        }
        return desencriptar(cadena, posiciones);
    }
}


