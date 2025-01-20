package tema_8;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Vectores18 {
    public static void main(String[] args) {
        int[] array30=new int[30];
        for (int i = 0; i < array30.length; i++) {
            array30[i]=ThreadLocalRandom.current().nextInt(0,10);
        }
        Arrays.sort(array30);
        for (int i : array30) {
            System.out.println(i);
        }

    }
}
