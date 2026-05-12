package Fundamentos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Promedio 
{
    public static void main(String[] args) throws IOException 
  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char opc = 's';
        double suma, sumaPromedio = 0, promedio, calif;
        int ciclo, num = 0;
        
        while (opc == 's' || opc == 'S') {
            
            suma = 0;
            ciclo = 0;
            
            while (ciclo < 3) {
                ciclo++;
                System.out.print("Ingresa la calificacion " + ciclo + ": ");
                calif = Double.parseDouble(br.readLine());
                suma = suma + calif;
            }
            
            promedio = suma / 3;
            
            if (promedio >= 7) {
                System.out.println("ALUMNO ACREDITADO");
            } else {
                System.out.println("ALUMNO NO ACREDITADO");
            }
            
            sumaPromedio += promedio;
            num++;
            
            System.out.print("Desea seguir? (s/n): ");
            opc = br.readLine().charAt(0);
        }
        
        if (num > 0) {
            System.out.println("El promedio del grupo de " + num + 
                               " alumnos es: " + (sumaPromedio / num));
        }
    }
}
