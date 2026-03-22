package Fundamentos;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TareasIF_Ciberseguridad_Password_17 {

	public static void main(String[] args) throws Exception
	{// TODO Auto-generated method stub
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Longitud: ");
			int longitud = Integer.parseInt(br.readLine());
			
			System.out.print("Tiene Mayuscula? (Verdadero/Falso): ");
			boolean tieneMayus = Boolean.parseBoolean(br.readLine());
			
			System.out.print("Tiene Numero? (Verdadero/Falso): ");
			boolean tieneNum = Boolean.parseBoolean(br.readLine());
			
			System.out.print("Tiene Especial? (Verdadero/Falso): ");
			boolean tieneEspecial = Boolean.parseBoolean(br.readLine());
			
			int contador = 0;
			
			if (tieneMayus) {
				contador++;
			}
			if (tieneNum) {
				contador++;
			}
			if (tieneEspecial) {
				contador++;
			}
			if (longitud < 8) {
				System.out.println("Insegura");
			} else {
				if (contador == 3) {
					System.out.println("Muy Fuerte");
				} else if (contador == 2) {
					System.out.println("Fuerte");
				} else {
					System.out.println("Debil");
			}
		}
	}
}
