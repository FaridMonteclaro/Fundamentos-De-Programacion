package Fundamentos;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TareasIF_Ciberseguridad_QoS_20 {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Tipo de trafico (Voz/Video/Descarga): ");
		String tipo = br.readLine();
		
		System.out.print("Latencia en ms: ");
		int latencia = Integer.parseInt(br.readLine());
		
		if (tipo.equals("Voz") || tipo.equals("Video")) {
			if (latencia < 50) {
				System.out.println("Prioridad Alta");
			} else {
				System.out.println("Prioridad Media");
			}
		} else if (tipo.equals("Descarga")) {
			if (latencia < 150) {
				System.out.println("Prioridad Baja");
			} else {
				System.out.println("Prioridad Minima");
			}
		} else {
			System.out.println("Tipo no reconocido");
		}
	}
}
