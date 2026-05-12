package a2241330016_tarea15;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepetirMenu 
{
    public static void main(String[] args) throws IOException 
  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int opcion;
        double operando1, operando2, resultado;
        
        do {
            
            System.out.print("Ingrese el valor del operando 1: ");
            operando1 = Double.parseDouble(br.readLine());
            
            System.out.print("Ingrese el valor del operando 2: ");
            operando2 = Double.parseDouble(br.readLine());
            
            System.out.println("----- MENU -----");
            System.out.println("1.- Suma");
            System.out.println("2.- Multiplicacion");
            System.out.println("3.- Division");
            System.out.println("4.- Salir");
            System.out.print("Seleccione una opcion [1..4]: ");
            opcion = Integer.parseInt(br.readLine());
            
            switch (opcion) {
                case 1:
                    resultado = operando1 + operando2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                    
                case 2:
                    resultado = operando1 * operando2;
                    System.out.println("El resultado de la multiplicacion es: " + resultado);
                    break;
                    
                case 3:
                    if (operando2 != 0) {
                        resultado = operando1 / operando2;
                        System.out.println("El resultado de la division es: " + resultado);
                    } else {
                        System.out.println("Error: no se puede dividir entre 0");
                    }
                    break;
                    
                case 4:
                    System.out.println("Saliendo...");
                    break;
                    
                default:
                    System.out.println("Opcion no reconocida");
            }
            
        } while (opcion != 4);
    }
