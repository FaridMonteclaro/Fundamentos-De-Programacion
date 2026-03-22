package Fundamentos;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EjerciciosIF_DivisionReclutas {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int edad, fuerza;
		double vision;
		
		System.out.print("Ingrese edad: ");
		edad = Integer.parseInt(br.readLine());
		
		System.out.print("Ingrese fuerza (0-100): ");
		fuerza = Integer.parseInt(br.readLine());
		
		System.out.print("Ingrese vision (0.0-1.0): ");
		vision = Double.parseDouble(br.readLine());
		
		if (edad>=18 && edad<=25) 
		{
			if (fuerza>80 && vision>=0.8) 
			{
				System.out.println("Fuerzas Especiales");
			} 
			else 
			{
				if (fuerza>50) 
				{
					System.out.println("Infanteria");
				} 
				else 
				{
					System.out.println("No apto");
				}
			}
		} 
		else 
		{
			if (edad>25 && vision>=0.9) 
			{
				System.out.println("Estratega");
			} 
			else 
			{
				System.out.println("No apto");
			}	
		}	
	}

}
