package Fundamentos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Distancia {
    
    public static int minimoDeTres(int a, int b, int c) {
        int menor = a;

        if (b < menor) {
            menor = b;
        }

        if (c < menor) {
            menor = c;
        }

        return menor;
    }

    public static void main(String[] args) throws IOException {
      
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        String cadena1, cadena2;
        int n, m, i, j, costo;
        int[][] dp;

        System.out.print("Ingresa la primera cadena: ");
        cadena1 = entrada.readLine();

        System.out.print("Ingresa la segunda cadena: ");
        cadena2 = entrada.readLine();

        n = cadena1.length();
        m = cadena2.length();

        dp = new int[n + 1][m + 1];

        for (i = 0; i <= n; i++) {
            dp[i][0] = i;
        }

        for (j = 0; j <= m; j++) {
            dp[0][j] = j;
        }

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {
                if (cadena1.charAt(i - 1) == cadena2.charAt(j - 1)) {
                    costo = 0;
                } else {
                    costo = 1;
                }

                dp[i][j] = minimoDeTres(
                    dp[i - 1][j] + 1,
                    dp[i][j - 1] + 1,
                    dp[i - 1][j - 1] + costo
                );
            }
        }

        System.out.println("La distancia es: " + dp[n][m]);
    }
}
