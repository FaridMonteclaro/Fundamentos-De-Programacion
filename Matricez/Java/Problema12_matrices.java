package Fundamentos;
import java.util.Random;
import java.util.Scanner;

public class Problema12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();
        int[][] m = new int[n][n];
        Random rand = new Random();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                m[i][j] = rand.nextInt(13);
        
        System.out.println("Matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
        int sumaDiag = 0;
        for (int i = 0; i < n; i++)
            sumaDiag += m[i][i];
        int sumaMultiplos3 = 0;
        for (int i = 0; i < n; i++)
            for (int j = i+1; j < n; j++)
                if (m[i][j] % 3 == 0)
                    sumaMultiplos3 += m[i][j];
        System.out.println("Suma de la diagonal = " + sumaDiag);
        System.out.println("Suma de múltiplos de 3 arriba de la diagonal = " + sumaMultiplos3);
    }
}
