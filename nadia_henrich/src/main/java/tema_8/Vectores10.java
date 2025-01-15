package tema_8;

import java.util.Scanner;

public class Vectores10 {
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        System.out.println("Dime la cantidad de alturas que necesitas");
        int n=tecl.nextInt();
        Double[] alturas=new Double[n];
        System.out.println("Dime las alturas");
        for (int i = 0; i < alturas.length; i++) {
            alturas[i]=tecl.nextDouble();
        }
        double media=0, maxima=0, minima=0, suma=0;
        int encimaMedia=0, bajoMedia=0;
        for (int i = 0; i < alturas.length; i++) {
            suma+=alturas[i];
            if(i==0){
                maxima=alturas[i];
                minima=alturas[i];
            }
            if(alturas[i]<minima){
                minima=alturas[i];
            }
            if(alturas[i]>maxima){
                maxima=alturas[i];
            }
        }
        media=suma/alturas.length;
        for (int i = 0; i < alturas.length; i++) {
            if(alturas[i]>media){
                encimaMedia++;
            }
            if(alturas[i]<media){
                bajoMedia++;
            }
        }
        System.out.println("Altura Maxima: "+maxima+"\n"+"Altura Minima: "+minima+"\n"+"Altura Media: "+media+"\n"+"Alturas por encima de la media: "+encimaMedia+"\n"+"Alturas por debajo de la media: "+bajoMedia+"\n");
        tecl.close();

    }
}
