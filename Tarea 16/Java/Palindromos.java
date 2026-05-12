package Fundamentos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindromos {
    
    public static boolean esPalindromo(String cadena) {
        int i = 0;
        int j = cadena.length() - 1;

        while (i < j) {
            if (cadena.charAt(i) != cadena.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) throws IOException 
  {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int n, i;
        String cadena;

        System.out.print("Ingresa la cantidad de cadenas: ");
        n = Integer.parseInt(entrada.readLine());

        for (i = 0; i < n; i++) {
            cadena = entrada.readLine();

            if (esPalindromo(cadena)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
