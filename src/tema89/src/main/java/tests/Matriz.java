package tests;

public class Matriz {

    
    public static void main(String[] args) {
        int[][] matriz = generarMatriz();
        mostrarMatriz(matriz);
        
        int lineasCeros = numeroLineas(matriz, 0);
        int lineasUnos = numeroLineas(matriz, 1);
        
        System.out.println("Número de líneas con 0: " + lineasCeros);
        System.out.println("Número de líneas con 1: " + lineasUnos);
        
        if (lineasCeros > lineasUnos) {
            System.out.println("¡Ganan los 0!");
        } else if (lineasUnos > lineasCeros) {
            System.out.println("¡Ganan los 1!");
        } else {
            System.out.println("¡Empate!");
        }
    }
    
    public static int[][] generarMatriz() {
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = 1;
            }
        }
        
        return matriz;
    }
    
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
    public static int numeroLineas(int[][] matriz, int numero) {
        if (matriz.length != matriz[0].length) {
            return 0; // No es cuadrada
        }
        
        int n = matriz.length;
        int count = 0;
        
        // Comprobar filas y columnas
        for (int i = 0; i < n; i++) {
            if (esLinea(matriz[i], numero)) count++; // Fila
            if (esLinea(getColumna(matriz, i), numero)) count++; // Columna
        }
        
        // Comprobar diagonales
        if (esLinea(getDiagonalPrincipal(matriz), numero)) count++;
        if (esLinea(getDiagonalSecundaria(matriz), numero)) count++;
        
        return count;
    }
    
    private static boolean esLinea(int[] linea, int numero) {
        for (int num : linea) {
            if (num != numero) {
                return false;
            }
        }
        return true;
    }
    
    private static int[] getColumna(int[][] matriz, int col) {
        int[] columna = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            columna[i] = matriz[i][col];
        }
        return columna;
    }
    
    private static int[] getDiagonalPrincipal(int[][] matriz) {
        int[] diagonal = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            diagonal[i] = matriz[i][i];
        }
        return diagonal;
    }
    
    private static int[] getDiagonalSecundaria(int[][] matriz) {
        int[] diagonal = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            diagonal[i] = matriz[i][matriz.length - 1 - i];
        }
        return diagonal;
    }
}

