package Tema_6.segundaParte.consumoElectrico;

public class Aparato {
    private String nombre;
    private boolean encendido;
    private final int consumo;
    private int consumoActual;

    public Aparato(String nombre, int consumo) {
        this.nombre = nombre;
        this.encendido = false;
        this.consumo = consumo;
        this.consumoActual = 0;
        System.out.println(nombre + consumo);
    }

    /**
     * usa el {@link System.out.println} para mostrar por pantalla los atributos de
     * cada aparato
     */
    public void imprimir() {
        System.out.println(nombre + " tiene una potencia de " + consumo + "W, esta encendido? " + encendido);
        System.out.println("Entonces su consumo actual es de " + consumoActual + "W");
    }

    /**
     * si el atributo {@code encendido} es {@code false} el aparato se enciende y
     * empieza a consumir
     * si el atributo {@code encendido} es {@code true} se apaga y su consumo pasa a
     * ser 0
     */
    public void interruptor() {
        if (!encendido) {
            encendido = true;
            consumoActual = consumo;
        } else {
            encendido = false;
            consumoActual = 0;
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public int getConsumo() {
        return consumo;
    }

    public int getConsumoActual() {
        return consumoActual;
    }

    public void setConsumoActual(int consumoActual) {
        this.consumoActual = consumoActual;
    }

}
