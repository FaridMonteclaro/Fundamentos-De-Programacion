package Fundamentos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Permutaciones 
{
    
    static char[] letras;
    static char[] resultado;
    static boolean[] usado;
    static int n;

    public static void generar(int nivel) 
  {
        int i;

        if (nivel == n) {
            System.out.println(new String(resultado));
          
        } else {
            for (i = 0; i < n; i++) {
                if (usado[i]) {
                    continue;
                }

                if (i > 0 && letras[i] == letras[i - 1] && !usado[i - 1]) {
                    continue;
                }

                usado[i] = true;
                resultado[nivel] = letras[i];
                generar(nivel + 1);
                usado[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException 
  {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    
        String cadena;
        
        System.out.print("Ingresa la cadena: ");
        cadena = entrada.readLine();
        n = cadena.length();

        letras = cadena.toCharArray();
        Arrays.sort(letras);

        resultado = new char[n];
        usado = new boolean[n];

        generar(0);
    }
}
