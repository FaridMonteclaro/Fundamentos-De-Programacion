package Fundamentos;
import java.util.Random;
import java.util.Scanner;

public class Problema14_matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Filas de A: ");
        int n = sc.nextInt();
        System.out.print("Columnas de A: ");
        int m = sc.nextInt();
        System.out.print("Filas de B: ");
        int m2 = sc.nextInt();
        System.out.print("Columnas de B: ");
        int p = sc.nextInt();
        if (m != m2) {
            System.out.println("No se puede multiplicar: columnas de A != filas de B");
            return;
        }
        Random rand = new Random();
        int[][] A = new int[n][m];
        int[][] B = new int[m][p];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                A[i][j] = rand.nextInt(30) - 9; // -9..20
        for (int i = 0; i < m; i++)
            for (int j = 0; j < p; j++)
                B[i][j] = rand.nextInt(30) - 9;
        int[][] C = new int[n][p];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < p; j++)
                for (int k = 0; k < m; k++)
                    C[i][j] += A[i][k] * B[k][j];
        // Mostrar resultado
        System.out.println("Matriz C:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++)
                System.out.print(C[i][j] + " ");
            System.out.println();
        }
    }
}
