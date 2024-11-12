package segundaParte.bombilla;

public class Main {
    public static void main(String[] args) {
        Bombilla b1=new Bombilla();
        System.out.println("Esta encendida la bombilla? "+Bombilla.estaLuciendo(b1));
        b1.pulsaInterruptor();
        System.out.println("Esta encendida la bombilla? "+Bombilla.estaLuciendo(b1));
        Bombilla.pulsaInterruptorGeneral();
        System.out.println("Esta encendida la bombilla? "+Bombilla.estaLuciendo(b1));

    }
}
