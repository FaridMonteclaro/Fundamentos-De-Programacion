package Fundamentos;
import java.util.;

public class Problema16_matrices {
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
        for (int i = 0; i < n; i++)
            datos[i] = rand.nextInt(x - w + 1) + w;
        System.out.println("Datos generados:");
        for (int d : datos) System.out.print(d + " ");
        System.out.println();
        // Calcular frecuencias
        Map<Integer, Integer> frec = new HashMap<>();
        for (int d : datos)
            frec.put(d, frec.getOrDefault(d, 0) + 1);
        int maxFreq = Collections.max(frec.values());
        System.out.print("La moda es: ");
        for (Map.Entry<Integer, Integer> e : frec.entrySet())
            if (e.getValue() == maxFreq)
                System.out.print(e.getKey() + " ");
        System.out.println("y se repite " + maxFreq + " veces");
    }
}
