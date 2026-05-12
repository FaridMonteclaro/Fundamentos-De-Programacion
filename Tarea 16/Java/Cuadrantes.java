package Fundamentos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cuadrantes {
  
    public static void main(String[] args) throws IOException {
      
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int n, i, x, y;
        int origen = 0, c1 = 0, c2 = 0, c3 = 0, c4 = 0, ejeX = 0, ejeY = 0;
        String[] datos;

        System.out.print("Ingresa la cantidad de puntos: ");
        n = Integer.parseInt(entrada.readLine());

        for (i = 1; i <= n; i++) {
            System.out.print("Ingresa x y y del punto " + i + ": ");
            datos = entrada.readLine().split(" ");
            x = Integer.parseInt(datos[0]);
            y = Integer.parseInt(datos[1]);

            if (x == 0 && y == 0) {
                origen++;
            } else if (x == 0) {
                ejeY++;
            } else if (y == 0) {
                ejeX++;
            } else if (x > 0 && y > 0) {
                c1++;
            } else if (x < 0 && y > 0) {
                c2++;
            } else if (x < 0 && y < 0) {
                c3++;
            } else if (x > 0 && y < 0) {
                c4++;
            }
        }

        System.out.println("Origen: " + origen);
        System.out.println("Cuadrante I: " + c1);
        System.out.println("Cuadrante II: " + c2);
        System.out.println("Cuadrante III: " + c3);
        System.out.println("Cuadrante IV: " + c4);
        System.out.println("Eje X: " + ejeX);
        System.out.println("Eje Y: " + ejeY);
    }
}
