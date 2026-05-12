package Fundamentos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PromedioPara 
{
    public static void main(String[] args) throws IOException 
  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double suma = 0, calif, resultado;
        
        for (int ciclo = 1; ciclo <= 3; ciclo++) {
            System.out.print("Ingresa la calificacion " + ciclo + ": ");
            calif = Double.parseDouble(br.readLine());
            suma = suma + calif;
        }
        
        resultado = suma / 3;
        
        if (resultado >= 7) {
            System.out.println("ALUMNO ACREDITADO");
        } else {
            System.out.println("ALUMNO NO ACREDITADO");
        }
    }
}
