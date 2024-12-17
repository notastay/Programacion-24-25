package Tema_7;

public class Ej43_camelSnake {
    public static void main(String[] args) {
        System.out.println(camel2snake("holaBuenasTardes"));
        System.out.println(snake2camel("ola_buenas_tardes"));
        System.out.println(camel2snake("holaBuenas Tardes"));
        System.out.println(snake2camel("ola_buenas_tardes_"));

    }

    /**
     * Una funcion a la que se le pasa una cadena en Camel Case y la convertira en
     * Snake case
     * 
     * <p>
     * La funcion espera que la cadena que se le pase este en Camel Case, es decir,
     * que comienze con una letra minuscula, se incluya una o mas letras mayusculas y que
     * pueda incluir caracteres alfanumericos pero no espacios.
     * </p>
     * 
     * <p>
     * Si se cumplen todas las condiciones recorrera la cadena buscando las letras mayusculas y 
     * añadira una barra baja {@code _} antes de la letra, ademas la parara a minuscula, pero todos los demas
     * caracteres los dejara igual.
     * </p>
     * 
     * @param camel Una cadena de caracteres que debe estar en formato Camel Case.
     * @return Una cadena en formato Snake Case. Devuelve "ERROR" si la cadena no
     *         sigue el formato correcto o si es null.
     * @see Ej43_camelSnake#snake2camel(String)
     */
    public static String camel2snake(String camel) {
        String cadenaSnake = "";
        if (camel != null && camel.matches("^[a-z]+([A-Z][a-z0-9]*)*$")) {
            for (int i = 0; i < camel.length(); i++) {
                String charActual = camel.substring(i, i + 1);
                if (charActual.matches("^[A-Z]+$")) {
                    cadenaSnake += "_" + charActual.toLowerCase();
                } else {
                    cadenaSnake += charActual;
                }
            }
            return cadenaSnake;
        }
        return "ERROR";
    }

    /**
     * Una funcion a la que se le pasa una cadena en Snake Case y la convertira en
     * Camel case
     * 
     * <p>
     * La funcion espera que la cadena que se le pase este en Snake Case, es decir,
     * que comienze con una letra minuscula, se incluya una o mas barras bajas
     * {@code _} y
     * termine con caracteres alfanumericos pero no con barra baja, ademas no
     * aceptara letras mayusculas ni espacios.
     * </p>
     * 
     * <p>
     * Si se cumplen todas las condiciones recorrera la cadena buscando las barras
     * bajas {@code _} y las
     * quitara, la siguiente letra la pasara a mayuscula pero todos los demas
     * caracteres los dejara igual.
     * </p>
     * 
     * @param snake Una cadena de caracteres que debe estar en formato Snake Case.
     * @return Una cadena en formato Camel Case. Devuelve "ERROR" si la cadena no
     *         sigue el formato correcto o si es null.
     * @see Ej43_camelSnake#camel2snake(String)
     */
    public static String snake2camel(String snake) {
        String cadenaCamel = "";
        if (snake != null && snake.matches("^[a-z]+(_[a-z0-9]+)*$")) {
            for (int i = 0; i < snake.length(); i++) {
                String charActual = snake.substring(i, i + 1);
                if (charActual.matches("_")) {
                    cadenaCamel += snake.substring(i + 1, i + 2).toUpperCase();
                    i++;
                } else {
                    cadenaCamel += charActual;
                }
            }
            return cadenaCamel;
        }
        return "ERROR";

    }
}
