import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CalculoAreasPSeInt2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String opcion;

        do {
            mostrarMenu();
            opcion = br.readLine();
            opcion = opcion.toUpperCase();

            switch (opcion) {
                case "C":
                    circulo(br);
                    break;
                case "T":
                    triangulo(br);
                    break;
                case "S":
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (!opcion.equals("S"));
    }

    public static void mostrarMenu() {
        System.out.println("=== MENÚ DE ÁREAS ===");
        System.out.println("C - Calcular área de un círculo");
        System.out.println("T - Calcular área de un triángulo");
        System.out.println("S - Salir");
        System.out.print("Ingrese una opción: ");
    }

    public static void circulo(BufferedReader br) throws IOException {
        System.out.print("Ingrese el radio del círculo: ");
        double radio = Double.parseDouble(br.readLine());
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + area);
    }

    public static void triangulo(BufferedReader br) throws IOException {
        System.out.print("Ingrese la base del triángulo: ");
        double base = Double.parseDouble(br.readLine());
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = Double.parseDouble(br.readLine());
        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }
}
