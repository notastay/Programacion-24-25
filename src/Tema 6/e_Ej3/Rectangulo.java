package e_Ej3;

import java.util.concurrent.ThreadLocalRandom;

public class Rectangulo {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private static final int min = 0;
    private static final int max = 100;

    public Rectangulo(int x1, int y1, int x2, int y2) {
        if (x1 < x2 && y1 < y2) {
            if (x1 > min && y1 > min && x2 < max && y2 < max) {
                this.x1 = x1;
                this.y1 = y1;
                this.x2 = x2;
                this.y2 = y2;
            } else {
                System.err.println("ERROR al instanciar Rectangulo");
            }
        } else {
            System.err.println("ERROR al instanciar Rectangulo");
        }
    }

    /**
     * @return
     *         devuelve el valor del atributo {@code x1}
     */
    public int getX1() {
        return x1;
    }

    /**
     * cambia el valor al atributo {@code x1} si el parametro introducido es
     * {@code menor} que {@code x2} y {@code mayor} que el atributo static
     * {@link Rectangulo#min}
     * 
     * @param x1
     *           el nuevo valor de {@code x1}
     */
    public void setX1(int x1) {
        if (x1 < x2 && x1 > min) {
            this.x1 = x1;
        } else {
            System.err.println("ERROR al cambiar el valor");
        }
    }

    /**
     * @return
     *         devuelve el valor del atributo {@code x2}
     */
    public int getX2() {
        return x2;
    }

    /**
     * cambia el valor al atributo {@code x2} si el parametro introducido es
     * {@code mayor} que {@code x1} y {@code menor} que el atributo static
     * {@link Rectangulo#max}
     * 
     * @param x2
     *           el nuevo valor de {@code x2}
     */
    public void setX2(int x2) {
        if (x1 < x2 && x2 < max) {
            this.x2 = x2;
        } else {
            System.err.println("ERROR al cambiar el valor");
        }
    }

    /**
     * @return
     *         devuelve el valor del atributo {@code y1}
     */
    public int getY1() {
        return y1;
    }

    /**
     * cambia el valor al atributo {@code y1} si el parametro introducido es
     * {@code menor} que {@code y2} y {@code mayor} que el atributo static
     * {@link Rectangulo#min}
     * 
     * @param y1
     *           el nuevo valor de {@code y1}
     */
    public void setY1(int y1) {
        if (y1 < y2 && y1 > min) {
            this.y1 = y1;
        } else {
            System.err.println("ERROR al cambiar el valor");
        }
    }

    /**
     * @return
     *         devuelve el valor del atributo {@code y2}
     */
    public int getY2() {
        return y2;
    }

    /**
     * cambia el valor al atributo {@code y2} si el parametro introducido es
     * {@code mayor} que {@code y1} y {@code menor} que el atributo static
     * {@link Rectangulo#max}
     * 
     * @param y2
     *           el nuevo valor de {@code y2}
     */
    public void setY2(int y2) {
        if (y1 < y2 && y2 < max) {
            this.y2 = y2;
        } else {
            System.err.println("ERROR al cambiar el valor");
        }
    }

    /**
     * imprimira por pantalla los {@code atributos} de rectangulo en formato
     * {@code (x1,y1)(x2,y2)}
     */
    public void imprimir() {
        System.out.println("(" + x1 + "," + y1 + ") (" + x2 + "," + y2 + ")");
    }

    /**
     * cambia los valores de los atributos {@code x1} y {@code y1} si los parametros
     * introducidos son {@code mayores} que el atributo static
     * {@link Rectangulo#min} y
     * {@code x1 es menor que x2} ademas de que {@code y1 es menor que y2}
     * 
     * @param x1
     *           el nuevo valor de {@code x1}
     * @param y1
     *           el nuevo valor de {@code y1}
     * @see Rectangulo#setX2Y2(int, int)
     * @see Rectangulo#setAll(int, int, int, int)
     */
    public void setX1Y1(int x1, int y1) {
        if (x1 < x2 && y1 < y2 && x1 > min && y1 > min) {
            this.x1 = x1;
            this.y1 = y1;
        } else {
            System.err.println("ERROR al cambiar los valores");
        }
    }

    /**
     * cambia los valores de los atributos {@code x2} y {@code y2} si los parametros
     * introducidos son {@code menores} que el atributo static
     * {@link Rectangulo#max} y
     * {@code x2 es mayor que x1} ademas de que {@code y2 es mayor que y1}
     * 
     * @param x2
     *           el nuevo valor de {@code x2}
     * @param y2
     *           el nuevo valor de {@code y2}
     * @see Rectangulo#setX1Y1(int, int)
     * @see Rectangulo#setAll(int, int, int, int)
     */
    public void setX2Y2(int x2, int y2) {
        if (x1 < x2 && y1 < y2 && x2 < max && x2 < max) {
            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.err.println("ERROR al cambiar los valores");
        }
    }

    /**
     * cambia los valores de los atributos {@code x2} y {@code y2} si los parametros
     * introducidos son {@code menores} que el atributo static
     * {@link Rectangulo#max} y {@code mayores} que el atributo static
     * {@link Rectangulo#min}.
     * 
     * {@code x2 es mayor que x1} ademas de que {@code y2 es mayor que y1} y
     * {@code x1 es menor que x2} ademas de que {@code y1 es menor que y2}
     * 
     * @param x1
     *           el nuevo valor de {@code x1}
     * @param y1
     *           el nuevo valor de {@code y1}
     * @param x2
     *           el nuevo valor de {@code x2}
     * @param y2
     *           el nuevo valor de {@code y2}
     * 
     * @see Rectangulo#setX1Y1(int, int)
     * @see Rectangulo#setX2Y2(int, int)
     */
    public void setAll(int x1, int y1, int x2, int y2) {
        if (x1 < x2 && y1 < y2 && x1 > min && y1 > min && x2 < max && y2 < max) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.err.println("ERROR al cambiar los valores");
        }
    }

    /**
     * Usa los puntos del {@code Rectangulo} para calcular el perimetro de este
     * 
     * @return
     *         devolvera el perimetro del {@code Rectangulo}
     */
    public int getPerimeto() {
        return ((x2 - x1) + (y2 - y1)) * 2;
    }

    /**
     * Usa los puntos del {@code Rectangulo} para calcular el area de este
     * 
     * @return
     *         devolvera el area del {@code Rectangulo}
     */
    public int getArea() {
        return (x2 - x1) * (y2 - y1);
    }

    /**
     * Implementa el constructor de {@code Rectangulo} para crear un nuevo objeto
     * {@code Rectangiulo}
     * haciendo uso de {@link ThreadLocalRandom#current()} en rango de las constantes
     * {@code min} y {@code max}
     * para darle valores a los atributos {@code x1}, {@code y1}, {@code x2} y {@code y2}
     * 
     * @return Un nuevo objeto {@code Rectangulo}
     * @see Rectangulo#Rectangulo(int, int, int, int)
     */
    public static Rectangulo creaRectanguloAleatorio() {
        Rectangulo r = new Rectangulo(ThreadLocalRandom.current().nextInt(min, max + 1),
                ThreadLocalRandom.current().nextInt(min, max + 1), ThreadLocalRandom.current().nextInt(min, max + 1),
                ThreadLocalRandom.current().nextInt(min, max + 1));
        return r;
    }
}