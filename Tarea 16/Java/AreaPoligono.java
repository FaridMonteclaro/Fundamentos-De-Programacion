package Fundamentos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaPoligono {
  
    public static void main(String[] args) throws IOException {
      
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int n, i, siguiente;
        int[] x, y;
        long suma1, suma2;
        double area;
        String[] datos;

        System.out.print("Ingresa la cantidad de vertices: ");
        n = Integer.parseInt(entrada.readLine());

        x = new int[n];
        y = new int[n];

        for (i = 0; i < n; i++) {
            System.out.print("Ingresa x y y del vertice " + (i + 1) + ": ");
            datos = entrada.readLine().split(" ");
            x[i] = Integer.parseInt(datos[0]);
            y[i] = Integer.parseInt(datos[1]);
        }

        suma1 = 0;
        suma2 = 0;

        for (i = 0; i < n; i++) {
            if (i == n - 1) {
                siguiente = 0;
            } else {
                siguiente = i + 1;
            }

            suma1 = suma1 + ((long) x[i] * y[siguiente]);
            suma2 = suma2 + ((long) y[i] * x[siguiente]);
        }

        area = Math.abs(suma1 - suma2) / 2.0;

        System.out.printf("El area del poligono es: %.1f\n", area);
    }
}
