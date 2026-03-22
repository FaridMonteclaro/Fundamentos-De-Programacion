package Fundamentos;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Algoritmos_Avanzados_Circulos_07 {
	
	public static void main(String[] args) throws Exception
	{ 
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double x1, y1, r1, x2, y2, r2, dist2, suma2;
		
		System.out.print("Ingrese x1: ");
		x1 = Double.parseDouble(br.readLine());
		
		System.out.print("Ingrese y1: ");
		y1 = Double.parseDouble(br.readLine());
		
		System.out.print("Ingrese r1: ");
		r1 = Double.parseDouble(br.readLine());
		
		System.out.print("Ingrese x2: ");
		x2 = Double.parseDouble(br.readLine());
		
		System.out.print("Ingrese y2: ");
		y2 = Double.parseDouble(br.readLine());
		
		System.out.print("Ingrese r2: ");
		r2 = Double.parseDouble(br.readLine());
		
		dist2 = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
		suma2 = Math.pow(r1+r2, 2);
		
		if (dist2 < suma2) 
		{
			System.out.println("Traslapan");
		} 
		else 
		{
			if (dist2 == suma2) 
			{
				System.out.println("Tangentes");
			} 
			else 
			{
				System.out.println("No se tocan");
			}
		}
		
		}
}
