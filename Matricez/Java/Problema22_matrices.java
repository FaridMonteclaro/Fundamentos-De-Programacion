package Fundamentos;
import java.util.*;

public class Problema22_matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Para cuantos números desea obtener su serie de Ulam: ");
        int n = sc.nextInt();
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa valor (mayor que cero): ");
            numeros[i] = sc.nextInt();
        }
        ArrayList<ArrayList<Integer>> series = new ArrayList<>();
        for (int num : numeros) {
            series.add(ulam(num));
        }
        for (int i = 0; i < n; i++) {
            System.out.print("La serie Ulam de " + numeros[i] + " es\n");
            for (int val : series.get(i)) System.out.print(val + " ");
            System.out.println();
        }
    }
    static ArrayList<Integer> ulam(int n) {
        ArrayList<Integer> lista = new ArrayList<>();
        while (n != 1) {
            lista.add(n);
            if (n % 2 == 0) n /= 2;
            else n = n * 3 + 1;
        }
        lista.add(1);
        return lista;
    }
}
