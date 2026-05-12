package Fundamentos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TablaMientras
  {
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        int num, ciclo;
        
        System.out.print("Ingrese el numero de la tabla: ");
        num = Integer.parseInt(br.readLine());
        
        ciclo = 1;
        
        while (ciclo <= 10) {
            System.out.println(num + " * " + ciclo + " = " + (num * ciclo));
            ciclo = ciclo + 1;
        }
    }
}
