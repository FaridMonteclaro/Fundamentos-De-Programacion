package Fundamentos;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EjerciciosIF_Sandia {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int W; 
		
		System.out.print("Ingrese el peso W: ");
		W = Integer.parseInt(br.readLine());
		
		if (W > 2 && W % 2 == 0) 
		{
			System.out.println("SI");
		} 
		else 
		{
			System.out.println("NO");
		}
	}
}
