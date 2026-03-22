package Fundamentos;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TareasIF_Ciberseguridad_Firewall_16 {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub

		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        
		        System.out.print("IP: ");
		        String ip = br.readLine();
		        
		        System.out.print("Puerto: ");
		        int puerto = Integer.parseInt(br.readLine());
		        
		        System.out.print("Protocolo (TCP/UDP): ");
		        String protocolo = br.readLine();
		        
		        if (ip.equals("192.168.1.50")) {
		            System.out.println("Tráfico Bloqueado");
		        } else if ((puerto==80||puerto==443) && protocolo.equals("TCP")) {
		            System.out.println("Tráfico Permitido");
		        } else if (puerto==53 && protocolo.equals("UDP")) {
		            System.out.println("Tráfico Permitido");
		        } else {
		            System.out.println("Tráfico Bloqueado");
		       }
		    }
          }
