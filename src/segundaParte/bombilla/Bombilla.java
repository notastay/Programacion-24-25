package segundaParte.bombilla;

public class Bombilla {
    private boolean interruptor;
    private static boolean interruptorGeneral = false;

    /**
     * el interruptor general sera el mismo para toda la casa y por consecuente para
     * todas las bombillas
     */
    public Bombilla() {
        interruptor = false;
    }

    public boolean isInterruptor() {
        return interruptor;
    }

    public void pulsaInterruptor() {
        if (interruptor == false) {
            interruptor = true;
        } else {
            interruptor = false;
        }
    }

    public static boolean isInterruptorGeneral() {
        return interruptorGeneral;
    }

    public static void pulsaInterruptorGeneral() {
        if (interruptorGeneral == false) {
            interruptorGeneral = true;
        } else {
            interruptorGeneral = false;
        }
    }

    public static boolean estaLuciendo(Bombilla b) {
        if (b.interruptor == true && interruptorGeneral == true) {
            return true;
        }
        return false;
    }

}
