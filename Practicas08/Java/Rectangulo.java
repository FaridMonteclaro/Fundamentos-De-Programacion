package Fundamentos;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Algoritmos_Avanzados_Rectangulo_06 {

	public static void main(String[] args) throws Exception 
	{ // TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double x1, y1, x2, y2, px, py;
		
		System.out.print("Ingrese x1: ");
		x1 = Double.parseDouble(br.readLine());
		
		System.out.print("Ingrese y1: ");
		y1 = Double.parseDouble(br.readLine());
		
		System.out.print("Ingrese x2: ");
		x2 = Double.parseDouble(br.readLine());
		
		System.out.print("Ingrese y2: ");
		y2 = Double.parseDouble(br.readLine());
		
		System.out.print("Ingrese px: ");
		px = Double.parseDouble(br.readLine());
		
		System.out.print("Ingrese py: ");
		py = Double.parseDouble(br.readLine());
		
		
		if (px>=x1 && px<=x2 && py>=y1 && py<=y2)
		{
			if (px==x1 || px==x2 || py==y1 || py==y2) 
			{
				System.out.println("Borde");
			} 
			else
			{
				System.out.println("Dentro");
			}
		} 
		else 
		{
			System.out.println("Fuera");
		}	
	}
}
		} 
		else 
		{
			System.out.println("Fuera");
		}	
	}
}
