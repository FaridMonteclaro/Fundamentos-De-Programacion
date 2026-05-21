package Fundamentos;

import java.util.Random;
import java.util.Scanner;

public class Problema5_matrices {
    static int[][] generar(int filas, int cols) {
        Random rand = new Random();
        int[][] m = new int[filas][cols];
        for (int i = 0; i < filas; i++)
            for (int j = 0; j < cols; j++)
                m[i][j] = rand.nextInt(90) + 10; // 10..99
        return m;
    }

    static void imprimir_arreglo(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }

    static void imprimir_recorrido(int[][] m, int ren, int col, int veces) {
        System.out.print("Los números por los que se pasó son: ");
        int r = ren, c = col;
        for (int i = 0; i < veces; i++) {
            if (r >= m.length || c >= m[0].length) break;
            System.out.print(m[r][c] + " ");
            r++;
            c++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matriz = generar(4, 7);
        System.out.println("Matriz generada:");
        imprimir_arreglo(matriz);
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Renglón inicial? ");
        int ren = sc.nextInt();
        System.out.print("¿Columna inicial? ");
        int col = sc.nextInt();
        System.out.print("¿Cuántas veces hacer el recorrido? ");
        int veces = sc.nextInt();
        imprimir_recorrido(matriz, ren, col, veces);
    }
}
