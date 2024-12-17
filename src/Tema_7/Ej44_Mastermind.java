package Tema_7;

import java.util.concurrent.ThreadLocalRandom;

public class Ej44_Mastermind {
    private final String combinacion;

    public String getCombinacion() {
        return combinacion;
    }

    /**
     * Constructor que genera una combinación aleatoria de números únicos entre 1 y
     * 9.
     *
     * <p>
     * La longitud de la combinación será la especificada por el parámetro
     * {@code longitud},
     * siempre y cuando se encuentre entre 2 y 8 (inclusive). Si el valor de
     * longitud
     * no está dentro de ese rango, se generará una combinación con una longitud
     * predeterminada
     * de 4 dígitos.
     * </p>
     *
     * <p>
     * El constructor garantiza que los números en la combinación sean únicos y se
     * seleccionen aleatoriamente del conjunto de dígitos "1" a "9".
     * </p>
     *
     * @param longitud La longitud deseada para la combinación. Debe estar en el
     *                 rango [2, 8].
     *                 Si el valor no cumple esta condición, la combinación tendrá 4
     *                 dígitos.
     */

    public Ej44_Mastermind(int longitud) {
        String numeros = "123456789";
        String res = "";
        if (longitud < 9 || longitud > 1) {
            for (int i = 0; i < longitud; i++) {
                int cadenaNumeros = ThreadLocalRandom.current().nextInt(0, numeros.length());
                res += numeros.charAt(cadenaNumeros);
                numeros = numeros.replace(numeros.charAt(cadenaNumeros) + "", "");
            }
            combinacion = res;
        } else {
            for (int i = 0; i < 4; i++) {
                int cadenaNumeros = ThreadLocalRandom.current().nextInt(0, numeros.length());
                res += numeros.charAt(cadenaNumeros);
                numeros.replace(numeros.charAt(cadenaNumeros) + "", "");
            }
            combinacion = res;
        }
    }

    /**
     * Compara la cadena dada con la combinación y cuenta cuántos caracteres
     * coinciden
     * exactamente en la misma posición. Si las longitudes de las dos cadenas son
     * diferentes o la cadena contiene caracteres no válidos, devuelve -1.
     *
     * <p>
     * El método espera que la cadena de entrada contenga únicamente dígitos del 1
     * al 9.
     * Si se cumplen todas las condiciones, se comparará cada carácter de la cadena
     * con el carácter correspondiente de la combinación y se contará cuántos
     * coinciden.
     * </p>
     * 
     * @param cadena Una cadena de caracteres que contiene dígitos (1-9) y debe
     *               tener
     *               la misma longitud que la combinación.
     * @return El número de caracteres en la cadena que coinciden exactamente en
     *         posición
     *         con la combinación. Devuelve -1 si las longitudes son diferentes o si
     *         la cadena contiene caracteres no válidos.
     *
     * @see Ej44_Mastermind#numerosOtraPosicion
     */
    public int numerosCorrectos(String cadena) {
        int contadorIgualPos = 0;
        if (combinacion.length() == cadena.length() && cadena.matches("^[1-9]+$")) {
            for (int i = 0; i < combinacion.length(); i++) {
                String recorreCadena = cadena.substring(i, i + 1);
                if (recorreCadena.equals(combinacion.charAt(i) + "")) {
                    contadorIgualPos++;
                }
            }
            return contadorIgualPos;
        }
        return -1;
    }

    /**
     * Compara la cadena dada con la combinación y cuenta cuántos caracteres están
     * presentes
     * en la combinación pero no necesariamente en la misma posición.
     *
     * <p>
     * El método verifica que la cadena dada tenga la misma longitud que la
     * combinación
     * y que solo contenga dígitos del 1 al 9. Si ambas condiciones se cumplen,
     * recorre
     * la cadena y la combinación, comparando los caracteres para contar las
     * coincidencias,
     * aunque estén en posiciones diferentes.
     * </p>
     *
     * @param cadena Una cadena de caracteres que contiene dígitos (1-9) y debe
     *               tener
     *               la misma longitud que la combinación.
     * @return El número de caracteres en la cadena que coinciden con los de la
     *         combinación,
     *         aunque estén en posiciones distintas. Devuelve -1 si las longitudes
     *         no coinciden
     *         o si la cadena contiene caracteres no válidos.
     * @see Ej44_Mastermind#numerosCorrectos
     */
    public int numerosOtraPosicion(String cadena) {
        int contadorIgual = 0;
        if (combinacion.length() == cadena.length() && cadena.matches("^[1-9]+$")) {
            for (int i = 0; i < combinacion.length(); i++) {
                for (int j = 0; j < cadena.length(); j++) {
                    String recorreCadena = cadena.substring(i, i + 1);
                    if (recorreCadena.equals(combinacion.charAt(j) + "")&&i!=j) {
                        contadorIgual++;
                    }
                }
            }
            return contadorIgual;
        }
        return -1;
    }
}
