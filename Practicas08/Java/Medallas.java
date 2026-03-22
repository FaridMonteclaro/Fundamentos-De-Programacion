package Fundamentos;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Algoritmos_Avanzados_Medallas_15 {

	public static void main(String[] args) throws Exception
	{ // TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double n1, n2, n3, prom;
		
		System.out.print("Nota 1: ");
		n1 = Double.parseDouble(br.readLine());
		
		System.out.print("Nota 2: ");
		n2 = Double.parseDouble(br.readLine());
		
		System.out.print("Nota 3: ");
		n3 = Double.parseDouble(br.readLine());
		
		prom = (n1+n2+n3)/3;
		
		if (prom>90 && (n1==100 || n2==100 || n3==100)) 
		{
			System.out.println("Oro con Honores");
		} 
		else 
		{
			if (prom>90) 
			{
				System.out.println("Oro");
			} 
			else 
			{
				if (prom>=80) 
				{
					System.out.println("Plata");
				} 
				else 
				{
					System.out.println("Sin medalla");
				}
			}
		}
	}
}
