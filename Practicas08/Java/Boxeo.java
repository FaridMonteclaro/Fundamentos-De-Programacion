package Fundamentos;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Algoritmos_Avanzados_Boxeo_13 {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double peso;
		
		System.out.print("Ingrese peso: ");
		peso = Double.parseDouble(br.readLine());
		
			if (peso < 52) 
		{
			System.out.println("Mosca");
		} 
		else 
		{
			if (peso <= 63) 
			{
				System.out.println("Ligero");
			} 
			else 
			{
				if (peso <= 75) 
				{
					System.out.println("Mediano");
				} 
				else 
				{
					if (peso <= 91) 
					{
						System.out.println("Pesado");
					} 
					else 
					{
						System.out.println("Super Pesado");
					}
				}
			}
		}
	}
}
