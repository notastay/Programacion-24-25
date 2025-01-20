package tema_8;

public class Matrices1 {
    public static void main(String[] args) {
        int matriz1[][] =new int[5][5];
        int hasta25=1;
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[i][j]=hasta25;
                hasta25++;
            }
        }
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.println(matriz1[i][j]+" ");
            }
        }
    }
}
