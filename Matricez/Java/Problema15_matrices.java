package Fundamentos;
import java.util.Random;
import java.util.Scanner;

public class Problema15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Filas: ");
        int filas = sc.nextInt();
        System.out.print("Columnas: ");
        int cols = sc.nextInt();
        Random rand = new Random();
        int[][] mat = new int[filas][cols];
        for (int i = 0; i < filas; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = rand.nextInt(30) - 14;
        System.out.println("Matriz original:");
        imprimir(mat);
        
        int[][] transp = new int[cols][filas];
        for (int i = 0; i < filas; i++)
            for (int j = 0; j < cols; j++)
                transp[j][i] = mat[i][j];
        System.out.println("Transpuesta:");
        imprimir(transp);
        if (filas == cols) {
            System.out.println("Es cuadrada.");
            int suma = 0;
            for (int i = 0; i < filas; i++)
                if (mat[i][i] % 2 != 0)
                    suma += mat[i][i];
            System.out.println("Suma de impares en diagonal = " + suma);
        } else {
            System.out.println("No es cuadrada.");
            int suma = 0;
            for (int j = 0; j < cols; j++) { 
                if (mat[0][j] % 7 == 0) suma += mat[0][j];
                if (mat[filas-1][j] % 7 == 0) suma += mat[filas-1][j];
            }
            for (int i = 1; i < filas-1; i++) { 
                if (mat[i][0] % 7 == 0) suma += mat[i][0];
                if (mat[i][cols-1] % 7 == 0) suma += mat[i][cols-1];
            }
            System.out.println("Suma de múltiplos de 7 en periferia = " + suma);
        }
    }
    static void imprimir(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }
}
