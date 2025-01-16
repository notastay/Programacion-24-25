package tema_8;

public class Vectores14 {
    public static void main(String[] args) {
        int[] secuencia= new int[55];
        int pos=0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                secuencia[pos]=i;
                pos++;
            }
            
        }
        for (int i = 0; i < secuencia.length; i++) {
            System.out.println(secuencia[i]);
        }
    }
}
