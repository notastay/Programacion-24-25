package Tema_7;

public class Ej43_camelSnake {
    public static void main(String[] args) {
        System.out.println(camel2snake("holaBuenasTardes"));
        System.out.println(snake2camel("ola_buenas_tardes"));
        System.out.println(camel2snake("holaBuenas Tardes"));
        System.out.println(snake2camel("ola_buenas_tardes_"));
        
    }

    public static String camel2snake(String camel){
        String cadenaSnake="";
        if(camel!=null && camel.matches("^[a-z]+([A-Z][a-z0-9]*)*$")){
            for (int i = 0; i < camel.length(); i++) {
                String charActual=camel.substring(i,i+1);
                if(charActual.matches("^[A-Z]+$")){
                    cadenaSnake+="_"+charActual.toLowerCase();
                }else{
                    cadenaSnake+=charActual;
                }
            }
            return cadenaSnake;
        }
        return "ERROR";
    }

    public static String snake2camel(String snake){
        String cadenaCamel="";
        if(snake!=null&&snake.matches("^[a-z]+(_[a-z0-9]+)*$")){
            for (int i = 0; i < snake.length(); i++) {
                String charActual=snake.substring(i,i+1);
                if(charActual.matches("_")){
                    cadenaCamel+=snake.substring(i+1,i+2).toUpperCase();
                    i++;
                }else{
                    cadenaCamel+=charActual;
                }
            }
            return cadenaCamel;
        }
        return "ERROR";

    }
}
