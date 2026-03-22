package Fundamentos;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Algoritmos_Avanzados_Capicua_08 {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num, d1, d2, d3, d4;
		
		System.out.print("Ingrese numero de 4 cifras: ");
		num = Integer.parseInt(br.readLine());
		
		d1 = num / 1000;
		d2 = (num / 100) % 10;
		d3 = (num / 10) % 10;
		d4 = num % 10;
		
		if (d1==d4 && d2==d3) 
		{
			System.out.println("Es Capicua");
		} 
		else 
		{
			System.out.println("No lo es");
		}

	}

}
