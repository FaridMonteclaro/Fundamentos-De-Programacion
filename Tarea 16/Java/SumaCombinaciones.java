package Fundamentos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumaCombinaciones 
{
     public static void main(String[] args) throws IOException 
  {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int n, i, j, k, contador = 0;
        int[] a;
        int suma;
        String[] datos;

        System.out.print("Ingresa la cantidad de numeros: ");
        n = Integer.parseInt(entrada.readLine());

        a = new int[n];

        System.out.println("Ingresa los numeros separados por espacio:");
        datos = entrada.readLine().split(" ");

        for (i = 0; i < n; i++) {
            a[i] = Integer.parseInt(datos[i]);
        }

        for (i = 0; i < n - 2; i++) {
           
          for (j = i + 1; j < n - 1; j++) {
               
            for (k = j + 1; k < n; k++) {
                    suma = a[i] + a[j] + a[k];

                    if (suma % 3 == 0) {
                        contador++;
                      
                    }
                }
            }
        }

        System.out.println("Numero total de tripletes: " + contador);
    }
}
