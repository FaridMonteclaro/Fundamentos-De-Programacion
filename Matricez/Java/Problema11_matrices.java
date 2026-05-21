package Fundamentos;
import java.util.Scanner;

public class Problema11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        String[] nombres = new String[n];
        System.out.println("Dame los " + n + " nombres:");
        for (int i = 0; i < n; i++)
            nombres[i] = sc.nextLine().toUpperCase();
        
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (nombres[j].compareTo(nombres[j+1]) > 0) {
                    String temp = nombres[j];
                    nombres[j] = nombres[j+1];
                    nombres[j+1] = temp;
                }
        System.out.println("Ordenados");
        for (String s : nombres) System.out.println(s);
    }
}
