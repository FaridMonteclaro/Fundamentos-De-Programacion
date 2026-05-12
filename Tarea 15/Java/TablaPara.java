package Fundamentos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TablaPara 
{
     public static void main(String[] args) throws IOException 
  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int num;
        
        System.out.print("Ingrese el numero de la tabla: ");
        num = Integer.parseInt(br.readLine());
        
        for (int ciclo = 1; ciclo <= 10; ciclo++) {
            System.out.println(num + " * " + ciclo + " = " + (num * ciclo));
        }
    }
}
