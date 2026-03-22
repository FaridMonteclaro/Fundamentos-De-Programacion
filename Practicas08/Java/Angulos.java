package Fundamentos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class EjerciciosIF_Angulos 
{
	public static void main(String[] args) throws Exception
	{  // TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A, B, C;
		
		System.out.print("Ingrese angulo A: ");
		A = Integer.parseInt(br.readLine());
		
		System.out.print("Ingrese angulo B: ");
		B = Integer.parseInt(br.readLine());
		
		System.out.print("Ingrese angulo C: ");
		C = Integer.parseInt(br.readLine());
		
		
		if (A+B+C == 180 && A>0 && B>0 && C>0) 
		{
			if (A==90 || B==90 || C==90) 
			{
				System.out.println("Rectangulo");
			} 
			else 
			{
				if (A>90 || B>90 || C>90) 
				{
					System.out.println("Obtusangulo");
				} 
				else 
				{
					System.out.println("Acutangulo");
				}
			}
		} 
		else 
		{
			System.out.println("Angulos Invalidos");			
		}	
	}
}
