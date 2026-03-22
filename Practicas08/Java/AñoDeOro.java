package Fundamentos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicios_IF_AñoDeOro {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int año;
		
		System.out.print("Ingresa el año: ");
		año = Integer.parseInt(br.readLine());
		
		if
		(
			año >= 2000 && año <= 3000 &&
			año % 10 == 1 &&
			año % 4 == 2 &&
			!(año % 400 == 0 || (año % 4 == 0 && año % 100 != 0)) &&
			año > 1 && año % 2 != 0 && año % 3 != 0 && año % 5 != 0 && año % 7 != 0
		) {
			System.out.println("Año de Oro");
		} else {
			System.out.println("Año Ordinario");
		}
		if
		(
			año >= 2000 && año <= 3000 &&
			año % 10 == 1 &&
			año % 4 == 2 &&
			!(año % 400 == 0 || (año % 4 == 0 && año % 100 != 0))
		) {
			System.out.println("Año de Oro");
		} else {
			System.out.println("Año Ordinario");
			
			if 
			(
				año > 1 && año % 2 != 0 && año % 3 != 0 && año % 5 != 0 && año % 7 != 0
			) {
				System.out.println("Año de Oro");
			} else {
				System.out.println("Año Ordinario");
			}
		}
	}
}
