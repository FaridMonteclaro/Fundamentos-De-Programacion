package Fundamentos;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TareasIF_Ciberseguridad_Sensores_18 {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Lectura 1: ");
		double a = Double.parseDouble(br.readLine());
		
		System.out.print("Lectura 2: ");
		double b = Double.parseDouble(br.readLine());
		
		System.out.print("Lectura 3: ");
		double c = Double.parseDouble(br.readLine());
		
		if (Math.abs(a-b) > 20 || Math.abs(a-c) > 20 || Math.abs(b-c) > 20) {
			System.out.println("Error de Sensor");
		} else {
			double prom = (a+b+c)/3;
			
			if (prom > 80) {
				System.out.println("Alerta de Incendio");
			} else if (prom > 60) {
				System.out.println("Alerta de Sobrecalentamiento");
			} else {
				System.out.println("Estado Normal");
			}
		}
	}
}
