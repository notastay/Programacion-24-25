package Tema_7;

public class Ej40_encriptadoVigenere {
    public static void main(String[] args) {
        
        System.out.println(encriptar("HALO ALLES GUTEN MORGEN"));
        System.out.println(desencriptar("ICOS GSTNC SHHTD EHLBAK" ));
    }

    public static String encriptar(String cadena){
        String letras="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String encriptado="";
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.substring(i, i+1).equals(" ")){
                encriptado=encriptado+" ";
                continue;
            }
            int posiciones=letras.indexOf(letras.charAt(i))+1;
            int charPosicion=letras.indexOf(cadena.charAt(i));
            charPosicion=charPosicion+posiciones;
            if(charPosicion>=letras.length()){
                charPosicion=charPosicion-letras.length();
            }
            encriptado=encriptado+letras.substring(charPosicion,charPosicion+1);
        }
        return encriptado;

    }
    public static String desencriptar(String cadena){
        String letras="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String desencriptado="";
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.substring(i, i+1).equals(" ")){
                desencriptado=desencriptado+" ";
                continue;
            }
            int posiciones=letras.indexOf(letras.charAt(i))+1;
            int charPosicion=letras.indexOf(cadena.charAt(i));
            charPosicion=charPosicion-posiciones;
            if(charPosicion<0){
                charPosicion=charPosicion+letras.length();
            }
            desencriptado=desencriptado+letras.substring(charPosicion,charPosicion+1);
        }
        return desencriptado;

    }
    public static String cesar(String cadena, boolean encriptar){
        if(encriptar==true){
            return encriptar(cadena);
        }
        return desencriptar(cadena);
    }
}


