package Tema_7;

public class Ej44_pruebaMastermind {
    public static void main(String[] args) {
        Ej44_Mastermind test=new Ej44_Mastermind(4);
        System.out.println(test.getCombinacion());
        System.out.println(test.numerosCorrectos("1234"));
        System.out.println(test.numerosOtraPosicion("1234"));
    }
}
