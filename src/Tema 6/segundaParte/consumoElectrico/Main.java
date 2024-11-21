package segundaParte.consumoElectrico;

public class Main {
    public static void main(String[] args) {
        Aparato a1=new Aparato("Bombilla", 100);
        Aparato a2=new Aparato("Radiador", 2000);
        Aparato a3=new Aparato("Plancha", 1200);
        a1.interruptor();
        a3.interruptor();
        a1.imprimir();
        a2.imprimir();
        a3.imprimir();
        System.out.println(" ");
        System.out.println("El consumo total es de "+(a1.getConsumoActual()+a3.getConsumoActual()));
        System.out.println(" ");
        a3.interruptor();
        a2.interruptor();
        a1.imprimir();
        a2.imprimir();
        a3.imprimir();
        System.out.println(" ");
        System.out.println("El consumo total es de "+(a1.getConsumoActual()+a2.getConsumoActual()));

    }
}
