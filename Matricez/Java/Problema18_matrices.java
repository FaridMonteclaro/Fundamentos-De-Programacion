package Fundamentos;
import java.util.*;

public class Problema18_matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();
        Random rand = new Random();
        int[] v = new int[n];
        for (int i = 0; i < n; i++)
            v[i] = rand.nextInt(51);
        System.out.println("Valores generados:");
        for (int x : v) System.out.print(x + " ");
        System.out.println();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int x : v) {
            if (x > max) max = x;
            if (x < min) min = x;
        }
        System.out.print("Mayor = " + max + " en posición(es): ");
        for (int i = 0; i < n; i++) if (v[i] == max) System.out.print((i+1) + " ");
        System.out.print("\nMenor = " + min + " en posición(es): ");
        for (int i = 0; i < n; i++) if (v[i] == min) System.out.print((i+1) + " ");
    }
}
