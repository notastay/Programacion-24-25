package tema_8;

import java.util.Arrays;

public class Vectores16 {
    public static void main(String[] args) {
        int[] secuencia= new int[55];
        int pos=0;
        for (int i = 1; i <= 10; i++) {
            int fin=pos+i;
            Arrays.fill(secuencia, pos, fin, i);
            pos=fin;
            
        }
        for (int i = 0; i < secuencia.length; i++) {
            System.out.println(secuencia[i]);
        }
    }
}
