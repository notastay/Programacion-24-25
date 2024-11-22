package Tema_6.e_Ej1;

import java.util.concurrent.ThreadLocalRandom;

public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return
     *      devolvera el valor del atributo {@code x}
     */
    public int getX() {
        return x;
    }
    /**
     * cambia el valor del atributo {@code x} en un {@code Punto}
     * @param x
     *      el nuevo valor para {@code x}
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return
     *      devolvera el valor del atributo {@code y}
     */
    public int getY() {
        return y;
    }

    /**
     * cambia el valor del atributo {@code y} en un {@code Punto}
     * @param y
     *      el nuevo valor para {@code y}
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * imprime por pantalla los atributos de punto en formato {@code (x,y)}
     * 
     * @see Punto#getX()
     * @see Punto#getY()
     */
    public void imprime() {
        System.out.println("(" + x + "," + y + ")");
    }

    /**
     * se cambiaran los valores de {@code x} y {@code y} cambiando la posicion de
     * {@code Punto}
     * 
     * @param x
     *          nueva posicion en el eje horizontal
     * @param y
     *          nueva posicion en el eje vertical
     * @see Punto#desplaza(int, int)
     * 
     */
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * se desplazara el {@code Punto} una distancia en cada eje {@code x} y
     * {@code y}
     * 
     * @param dx
     *           distancia a desplazarse en el eje horizontal
     * @param dy
     *           distancia a desplazarse en el eje vertical
     * 
     * @see Punto#setXY(int, int)
     */
    public void desplaza(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

    /**
     * usa una formula matematica para calcular la distancia entre 2 puntos, con
     * ayuda de {@link Math#sqrt(double)} y {@link Math#pow(double, double)}
     * 
     * @param p
     *          un objeto de tipo {@code Punto}
     * @return
     *         un int de la distancia entre los 2 {@code Puntos}
     */
    public int distancia(Punto p) {
        int resultado;
        resultado = (int) (Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2)));
        return resultado;
    }

    /**
     * Implementa el constructor de {@code Punto} para crear un nuevo objeto
     * {@code Punto}
     * haciendo uso de {@link ThreadLocalRandom#current()} en rango de
     * -100 a 100
     * para darle valores a los atributos {@code x} y {@code y}
     * 
     * @return Un nuevo objeto {@code Punto}
     * @see Punto#Punto(int, int)
     */
    public static Punto crearPuntoAleatorio() {
        Punto p = new Punto(ThreadLocalRandom.current().nextInt(-100, 101),
                ThreadLocalRandom.current().nextInt(-100, 101));
        return p;
    }
}
