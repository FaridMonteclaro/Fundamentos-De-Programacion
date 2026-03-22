package Fundamentos;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Algoritmos_Avanzados_Pitagoras_09 {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double A, B, C;
		
		System.out.print("Ingrese A: ");
		A = Double.parseDouble(br.readLine());
		
		System.out.print("Ingrese B: ");
		B = Double.parseDouble(br.readLine());
		
		System.out.print("Ingrese C (mayor): ");
		C = Double.parseDouble(br.readLine());
		
		if (Math.pow(A, 2) + Math.pow(B, 2) == Math.pow(C, 2)) 
		{
			System.out.println("Rectangulo");
		} 
		else 
		{
			if (Math.pow(A, 2) + Math.pow(B, 2) > Math.pow(C, 2)) 
			{
				System.out.println("Acutangulo");
			} 
			else 
			{
				System.out.println("Obtusangulo");
			}
		}	
	}

}
