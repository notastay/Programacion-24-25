package tema_8;

public class Vectores11 {
    public static void main(String[] args) {
        int[] array= new int[100];
        int[] arrayCopia= new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i]=i+1;
        }
        for (int i = 0; i < arrayCopia.length; i++) {
            arrayCopia[i]=array[array.length-1-i];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < arrayCopia.length; i++) {
            System.out.println(arrayCopia[i]);
        }

    }
}
