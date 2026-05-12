package Fundamentos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PromedioRepetir 
{
    public static void main(String[] args) throws IOException 
  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        double suma = 0, calif, resultado;
        int ciclo = 0;
        
        do {
            ciclo++;
            System.out.print("Ingresa la calificacion " + ciclo + ": ");
            calif = Double.parseDouble(br.readLine());
            suma = suma + calif;
        } while (ciclo < 3);
        
        resultado = suma / 3;
        
        if (resultado >= 7) {
            System.out.println("ALUMNO ACREDITADO");
        } else {
            System.out.println("ALUMNO NO ACREDITADO");
        }
    }
}
