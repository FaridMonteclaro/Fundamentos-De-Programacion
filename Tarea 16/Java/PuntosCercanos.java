package Fundamentos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PuntosCercanos
  {
    public static void main(String[] args) throws IOException 
    {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int n, i, j;
        int[] x, y;
        long dx, dy, dist, minDist;
        String[] datos;

        System.out.print("Ingresa la cantidad de puntos: ");
        n = Integer.parseInt(entrada.readLine());

        x = new int[n];
        y = new int[n];

        for (i = 0; i < n; i++) {
            System.out.print("Ingresa x y y del punto " + (i + 1) + ": ");
            datos = entrada.readLine().split(" ");
            x[i] = Integer.parseInt(datos[0]);
            y[i] = Integer.parseInt(datos[1]);
        }

        minDist = Long.MAX_VALUE;

        for (i = 0; i < n - 1; i++) {
          
          for (j = i + 1; j < n; j++) {
                dx = x[j] - x[i];
                dy = y[j] - y[i];
                dist = dx * dx + dy * dy;

                if (dist < minDist) {
                    minDist = dist;
                }
            }
        }

        System.out.println("La distancia euclidiana al cuadrado minima es: " + minDist);
    }
}
