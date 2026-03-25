package practica;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ejercicio01_a {
	static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
	
  (System.in);
	
	public static double pedirdato(String mensaje) throws Exception {
		double num;
		System.out.println(mensaje);
		num = Double.parseDouble(lectura.readLine());
		return num;
	}
	
	public static double calcularareaCirculo(double radio) {
		double area;
		area = Math.PI*radio*radio;
		return area;
	}
		public static double calcularareaTriangulo(double base, double altura) {
			double area;
			area = (base*altura)/2;
			return area;
		}
	public static void mostrarMenu() {
		// TODO Auto-generated method stub

		System.out.println("Menu:");
		System.out.println("c.- Calcular area del circulo");
		System.out.println("t.- Calcular area del triangulo");
		System.out.println("s.- Salir");
		System.out.println("Elige una opcion: ");
	}

	public static void main(String[] args)
		// TODO Auto-generated method stub
	{
		
	}
}
