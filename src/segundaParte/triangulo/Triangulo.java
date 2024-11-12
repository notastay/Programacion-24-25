package segundaParte.triangulo;

import e_Ej1.Punto;

public class Triangulo {
    private Punto p1;
    private Punto p2;
    private Punto p3;

    /**
     * Usamos 3 {@link Punto} para las vertices del triangulo
     * 
     * @param p1
     *           Un {@code Punto} del triangulo
     * @param p2
     *           Un {@code Punto} del triangulo
     * @param p3
     *           Un {@code Punto} del triangulo
     * 
     * @see Punto#Punto(int, int)
     */
    public Triangulo(Punto p1, Punto p2, Punto p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    /**
     * Usa el metodo {@link Punto#distancia(Punto)} para calcular la distancia entre
     * los 3 puntos del triangulo
     * 
     * @return
     *         El perimetro del {@code Triangulo}
     */
    public int perimetro() {
        int res = (p1.distancia(p2)) + (p2.distancia(p3)) + (p3.distancia(p1));
        return res;
    }
}
