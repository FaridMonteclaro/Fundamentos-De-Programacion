package Fundamentos;
import java.util.*;

class Alumno implements Comparable<Alumno> {
    String nombre;
    int[] califs;
    double promedio;
    Alumno(String nom, int[] cal) {
        nombre = nom;
        califs = cal;
        int suma = 0;
        for (int c : cal) suma += c;
        promedio = (double) suma / cal.length;
    }
    public int compareTo(Alumno o) {
        return this.nombre.compareTo(o.nombre);
    }
}

public class Problema17_matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No. de alumnos: ");
        int n = sc.nextInt();
        System.out.print("No. de materias por alumno: ");
        int m = sc.nextInt();
        sc.nextLine();
        Alumno[] alumnos = new Alumno[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nombre: ");
            String nom = sc.nextLine();
            int[] cal = new int[m];
            for (int j = 0; j < m; j++) {
                System.out.print("Calif " + (j+1) + ": ");
                cal[j] = sc.nextInt();
            }
            sc.nextLine();
            alumnos[i] = new Alumno(nom, cal);
        }
        Arrays.sort(alumnos);
        System.out.println("\nNombre\t" + "Calif 1\tCalif 2\tCalif 3\tPromedio");
        double sumaGpo = 0;
        for (Alumno a : alumnos) {
            System.out.print(a.nombre + "\t");
            for (int c : a.califs) System.out.print(c + "\t");
            System.out.printf("%.0f\n", a.promedio);
            sumaGpo += a.promedio;
        }
        System.out.printf("Promedio del Gpo. = %.0f\n", sumaGpo / n);
    }
}
