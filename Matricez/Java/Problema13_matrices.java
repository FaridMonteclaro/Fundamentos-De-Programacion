package Fundamentos;
import java.util.Scanner;

public class Problema13_matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Dame los " + n + " números:");
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        int[] difs = new int[n-1];
        int maxDif = Integer.MIN_VALUE;
        int posMax = 0;
        for (int i = 0; i < n-1; i++) {
            difs[i] = Math.abs(nums[i+1] - nums[i]); // valor absoluto según ejemplo
            if (difs[i] > maxDif) {
                maxDif = difs[i];
                posMax = i;
            }
        }
        System.out.println("Diferencia entre consecutivos:");
        for (int d : difs) System.out.print(d + " ");
        System.out.println("\nLa diferencia mayor es " + maxDif + 
                           " y está entre el " + nums[posMax] + " y " + nums[posMax+1]);
    }
}
