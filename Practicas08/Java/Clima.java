package Fundamentos;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Algoritmos_Avanzados_Clima_14 {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double temp, hum;
		
		System.out.print("Temperatura: ");
		temp = Double.parseDouble(br.readLine());
		
		System.out.print("Humedad: ");
		hum = Double.parseDouble(br.readLine());
		
		if (temp>30 && hum>80) 
		{
			System.out.println("Sofocante");
		} 
		else 
		{
			if (temp<15 && hum>80) 
			{
				System.out.println("Frio Humedo");
			} 
			else 
			{
				System.out.println("Clima Normal");
			}
		}
	}
}
