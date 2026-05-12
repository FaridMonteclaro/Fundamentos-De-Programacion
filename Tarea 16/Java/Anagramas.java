package Fundamentos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Anagramas {
    
    
    public static String ordenar(String palabra) {
        char[] letras = palabra.toCharArray();
        Arrays.sort(letras);
        return new String(letras);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int n, i, j;
        String[] palabras;
        boolean[] usada;
        String clave;

        System.out.print("Ingresa N: ");
        n = Integer.parseInt(entrada.readLine());

        palabras = new String[n];
        usada = new boolean[n];

        for (i = 0; i < n; i++) {
            palabras[i] = entrada.readLine();
            usada[i] = false;
        }

        for (i = 0; i < n; i++) {
            if (!usada[i]) {

                clave = ordenar(palabras[i]);

                
                String[] grupo = new String[n];
                int contador = 0;

                for (j = i; j < n; j++) {
                    if (!usada[j] && ordenar(palabras[j]).equals(clave)) {
                        grupo[contador] = palabras[j];
                        contador++;
                        usada[j] = true;
                    }
                }

                
                Arrays.sort(grupo, 0, contador);

                
                for (j = 0; j < contador; j++) {
                    System.out.print(grupo[j] + " ");
                }
                System.out.println();
            }
        }
    }
}
