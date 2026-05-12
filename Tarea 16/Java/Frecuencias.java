package Fundamentos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Frecuencias {

    public static void main(String[] args) throws IOException {
      
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        String cadena;
        int[] frecuencias = new int[26];
        int i, pos, maxFrecuencia, indiceMax;
        char letraMax;

        System.out.print("Ingresa una cadena: ");
        cadena = entrada.readLine();

        for (i = 0; i < cadena.length(); i++) {
            pos = cadena.charAt(i) - 'a';
            frecuencias[pos]++;
        }

        maxFrecuencia = frecuencias[0];
        indiceMax = 0;

        for (i = 1; i < 26; i++) {
            if (frecuencias[i] > maxFrecuencia) {
                maxFrecuencia = frecuencias[i];
                indiceMax = i;
            }
        }

        letraMax = (char) ('a' + indiceMax);

        System.out.println(letraMax + " " + maxFrecuencia);
    }
}
