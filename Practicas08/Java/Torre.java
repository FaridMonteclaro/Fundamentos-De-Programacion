package Fundamentos;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Algoritmos_Avanzados_Torre_10 {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int f1, c1, f2, c2;
		
		System.out.print("Ingrese fila inicial: ");
		f1 = Integer.parseInt(br.readLine());
		
		System.out.print("Ingrese columna inicial: ");
		c1 = Integer.parseInt(br.readLine());
		
		System.out.print("Ingrese fila final: ");
		f2 = Integer.parseInt(br.readLine());
		
		System.out.print("Ingrese columna final: ");
		c2 = Integer.parseInt(br.readLine());

		if ((f1==f2 || c1==c2) && !(f1==f2 && c1==c2)) 
		{
			System.out.println("Valido");
		} 
		else 
		{
			System.out.println("Invalido");
		}
	}

}
