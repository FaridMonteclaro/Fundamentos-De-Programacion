package Fundamentos;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Algoritmos_Avanzados_Fecha_12 {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int dia, mes;
		boolean bisiesto;
		
		System.out.print("Dia: ");
		dia = Integer.parseInt(br.readLine());
		
		System.out.print("Mes: ");
		mes = Integer.parseInt(br.readLine());
		
		System.out.print("Es bisiesto? (true/false): ");
		bisiesto = Boolean.parseBoolean(br.readLine());
		
			if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) 
		{
			if (dia>=1 && dia<=31) 
			{
				System.out.println("Fecha Valida");
			} 
			else 
			{
				System.out.println("Invalida");
			}
		} 
		else 
		{
			if (mes==4 || mes==6 || mes==9 || mes==11) 
			{
				if (dia>=1 && dia<=30) 
				{
					System.out.println("Fecha Valida");
				} 
				else 
				{
					System.out.println("Invalida");
				}
			} 
			else 
			{
				if (mes==2) 
				{
					if (bisiesto && dia>=1 && dia<=29) 
					{
						System.out.println("Fecha Valida");
					} 
					else 
					{
						if (!bisiesto && dia>=1 && dia<=28) 
						{
							System.out.println("Fecha Valida");
						} 
						else 
						{
							System.out.println("Invalida");
						}
					}
				} 
				else 
				{
					System.out.println("Invalida");
				}
			}
		}
	}	{
}
	}
