package Fundamentos;
import java.util.Random;

public class Problema4_matrices {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.print("¿Cuántas filas tiene el arreglo? ");
        int n = Integer.parseInt(System.console().readLine());
        int[][] matriz = new int[n][];
        int[] decimales = new int[n];
        for (int i = 0; i < n; i++) {
            int cols = rand.nextInt(10) + 1; // entre 1 y 10
            matriz[i] = new int[cols];
            int valor = 0;
            System.out.print("Fila " + i + ": ");
            for (int j = 0; j < cols; j++) {
                matriz[i][j] = rand.nextInt(2); // 0 o 1
                System.out.print(matriz[i][j] + " ");
                valor = valor * 2 + matriz[i][j];
            }
            decimales[i] = valor;
            System.out.println("equivale a " + valor + " decimal");
        }
    }
}
