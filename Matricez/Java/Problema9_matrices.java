package Fundamentos;
import java.util.Scanner;

public class Problema9_matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿De cuántos renglones quieres la figura de triángulo? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
