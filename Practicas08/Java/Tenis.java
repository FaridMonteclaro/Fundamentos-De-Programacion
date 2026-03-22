package Fundamentos;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Algoritmos_Avanzados_tenis_11 {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A, B;
		
		System.out.print("Puntos Jugador A: ");
		A = Integer.parseInt(br.readLine());
		
		System.out.print("Puntos Jugador B: ");
		B = Integer.parseInt(br.readLine());
		
		if (A==6 && B<=4) 
		{
			System.out.println("Gana A");
		} 
		else 
		{
			if (B==6 && A<=4) 
			{
				System.out.println("Gana B");
			} 
			else 
			{
				if (A>=7 && A-B>=2) 
				{
					System.out.println("Gana A");
				} 
				else 
				{
					if (B>=7 && B-A>=2) 
					{
						System.out.println("Gana B");
					} 
					else 
					{
						System.out.println("En juego");
					}
				}
			}
		}
	}

}
