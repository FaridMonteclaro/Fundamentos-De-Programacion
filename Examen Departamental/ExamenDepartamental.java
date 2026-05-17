package Fundamentos;
import java.util.Scanner;

public class ExamenDepartamental {
    
    public static double promedioGeneral(double[] promedios, int N) {
        double suma = 0;
        for (int i = 0; i < N; i++) {
            suma = suma + promedios[i];
        }
        double promGral = suma / N;
        return promGral;
    }
    
    public static double promedioAsignatura(double[] notas, int N) {
        double suma = 0;
        for (int i = 0; i < N; i++) {
            suma = suma + notas[i];
        }
        double promAsig = suma / N;
        return promAsig;
    }
    
    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);
        
        int N, i;
        String nombre;
        double calif1, calif2;
        boolean valido;
        String[] nombres;
        double[] nota1, nota2, promediosAlumnos;

        do {
            System.out.print("Ingrese el numero de alumnos: ");
            N = scanner.nextInt();
        } while (N <= 0);

        nombres = new String[N];
        nota1 = new double[N];
        nota2 = new double[N];
        promediosAlumnos = new double[N];

        for (i = 0; i < N; i++) {
            System.out.println();
            System.out.println("--- Alumno " + (i + 1) + " ---");

            do {
                System.out.print("Nombre: ");
                nombre = scanner.next();

                valido = nombre.length() > 0;
                if (!valido) {
                    System.out.println("Error: El nombre no puede estar vacio");
                }
            } while (!valido);
            nombres[i] = nombre;

            do {
                System.out.print("Calificacion 1 (1-100): ");
                calif1 = scanner.nextDouble();
                valido = (calif1 >= 1 && calif1 <= 100);
                if (!valido) {
                    System.out.println("Error: Debe ser un numero entre 1 y 100");
                }
            } while (!valido);
            nota1[i] = calif1;

            do {
                System.out.print("Calificacion 2 (1-100): ");
                calif2 = scanner.nextDouble();
                valido = (calif2 >= 1 && calif2 <= 100);
                if (!valido) {
                    System.out.println("Error: Debe ser un numero entre 1 y 100");
                }
            } while (!valido);
            nota2[i] = calif2;
 
            promediosAlumnos[i] = (nota1[i] + nota2[i]) / 2;
        }
        
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("               RESULTADOS                  ");
        System.out.println("-------------------------------------------");
        System.out.println();
        System.out.println("Alumno             Nota1   Nota2   Promedio");
        System.out.println("-------------------------------------------");
        
        for (i = 0; i < N; i++) {
            System.out.printf("%-18s %-7.2f %-7.2f %.2f%n", 
                              nombres[i], nota1[i], nota2[i], promediosAlumnos[i]);
        }
        
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("Promedio general del grupo: " + promedioGeneral(promediosAlumnos, N));
        System.out.println("Promedio de asignatura 1: " + promedioAsignatura(nota1, N));
        System.out.println("Promedio de asignatura 2: " + promedioAsignatura(nota2, N));
        System.out.println("-------------------------------------------");
        
        scanner.close();
    }
}
