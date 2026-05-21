package Fundamentos;
import java.util.*;

public class Problema19_matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();
        System.out.print("w: ");
        int w = sc.nextInt();
        System.out.print("x: ");
        int x = sc.nextInt();
        Random rand = new Random();
        int[] datos = new int[n];
        int suma = 0;
        for (int i = 0; i < n; i++) {
            datos[i] = rand.nextInt(x - w + 1) + w;
            suma += datos[i];
        }
        double media = (double) suma / n;
        double sumaCuadrados = 0;
        for (int d : datos)
            sumaCuadrados += Math.pow(d - media, 2);
        double desviacion = Math.sqrt(sumaCuadrados / n);
        System.out.println("Datos generados:");
        for (int d : datos) System.out.print(d + " ");
        System.out.printf("\nMedia = %.3f\n", media);
        System.out.printf("Desviación estándar = %.4f\n", desviacion);
    }
}
