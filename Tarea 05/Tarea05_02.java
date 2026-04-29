package Fundamentos;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tarea05_02 {
	public static int Promedio(int[] calificaciones) {
		int suma = 0;
		for (int ciclo = 0; ciclo < calificaciones.length; ciclo++)
			suma = suma + calificaciones[ciclo];
		return suma / calificaciones.length;
	}
	
	public static String LecturaDatos(String mensaje) throws Exception
    {
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(mensaje);
        return lectura.readLine();
    }
	
	public static String[] CargaNombres() throws Exception
	{
		String[] nombres = new String[5];
		for(int ciclo=0;ciclo<5;ciclo++)
		nombres[ciclo]=LecturaDatos("Ingrese el nombre del alumno "+(ciclo+1));
		return nombres;
	}	
	
	public static int[][] CargaCalificaciones(String[] nombres) throws Exception
	{
		int[][] calif = new int[5][3];
		for(int filas=0;filas<5;filas++)
			for(int columnas=0;columnas<3;columnas++)
						calif[filas][columnas]= Integer.parseInt(LecturaDatos("Ingrese la calificacion "+columnas+" del alumno "+nombres[filas]+"-> "));
		return calif;
	}
	
	public static void main(String[] args) throws Exception {
   String[] nombres= CargaNombres();
   int[][]  calificaciones= CargaCalificaciones(nombres);
	for (int ciclo = 0; ciclo < 5; ciclo++)
		{
		
		String nombre=nombres[ciclo];
		System.out.println("el Alumno "+nombre+" parcial 1 .. "+calificaciones[ciclo][0]+" parcial 2 .."+calificaciones[ciclo][1]+" parcial 3 .. "
		+calificaciones[ciclo][2]+" obtuvo de promedio "+Promedio(calificaciones[ciclo]));
		
		}
	} // metodo main
	} // metodo fin de clase
