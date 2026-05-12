package Fundamentos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Subconjuntos {

    static char[] letras;
    static char[] resultado;
    static int n, k;

    public static void generar(int inicio, int nivel) 
  {
        int i;

        if (nivel == k) {
            for (i = 0; i < k; i++) {
               System.out.print(resultado[i]);
            }
          
          System.out.println();
          
        } 
        else 
        {
            for (i = inicio; i <= n - (k - nivel); i++) {
                resultado[nivel] = letras[i];
                generar(i + 1, nivel + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException 
  {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String[] datos;
        int i;

        
        System.out.print("Ingresa N y K: ");
        datos = entrada.readLine().trim().split("\\s+");
        n = Integer.parseInt(datos[0]);
        k = Integer.parseInt(datos[1]);

        if (k > n || k < 0) {
            System.out.println("Valor de K no valido");
            return;
        }

        System.out.print("Ingresa las letras separadas por espacio: ");
        datos = entrada.readLine().trim().split("\\s+");

        letras = new char[n];
        resultado = new char[k];

        for (i = 0; i < n; i++)
          {
            letras[i] = datos[i].charAt(0);
        }

        generar(0, 0);
    }
}
