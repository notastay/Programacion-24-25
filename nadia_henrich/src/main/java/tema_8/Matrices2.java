package tema_8;

public class Matrices2 {
    public static void main(String[] args) {
        int tablasMult[][]= new int[10][10];
        for (int i = 0; i < tablasMult.length; i++) {
            for (int j = 0; j < tablasMult.length; j++) {
                tablasMult[i][j]=(i+1)*(j+1);
            }
        }
        for (int i = 0; i < tablasMult.length; i++) {
            for (int j = 0; j < tablasMult.length; j++) {
                System.out.println(tablasMult[i][j]+" ");
            }
        }
    }
}
