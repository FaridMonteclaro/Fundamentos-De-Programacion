package Fundamentos;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicios_IF_Caballo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x1, y1, x2, y2, dx, dy;
		
		System.out.print("Ingrese x1: ");
		x1 = Integer.parseInt(br.readLine());
		
		System.out.print("Ingrese y1: ");
		y1 = Integer.parseInt(br.readLine());
		
		System.out.print("Ingrese x2: ");
		x2 = Integer.parseInt(br.readLine());
		
		System.out.print("Ingrese y2: ");
		y2 = Integer.parseInt(br.readLine());
		
		dx = Math.abs(x2 - x1);
		dy = Math.abs(y2 - y1);
		
		if ((dx == 2 && dy == 1) || (dx == 1 && dy == 2)) 
		{
			System.out.println("Movimiento Valido");
		} 
		else 
		{
			System.out.println("Invalido");
		}
	}
}
