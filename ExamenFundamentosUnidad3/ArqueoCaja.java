package Fundamentos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Examen_Fundamentos_Unidad03_ArqueoCaja {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        double fondoInicial  = 0;
        double totalVentas   = 0;
        double totalGastos   = 0;
        double efectivoReal  = 0;
        int    opcion        = 0;
        String textoBruto    = "";

        do {
            opcion = mostrarMenu();

            switch (opcion) {
                case 1:
                    System.out.println("---------------------------");
                    System.out.println("-- Fondo de Caja Inicial --");
                    System.out.println("---------------------------");
                    do {
                        System.out.print("Ingrese el monto del fondo inicial: ");
                        textoBruto = br.readLine();
                        if (!validarNumero(textoBruto)) {
                            System.out.println("Entrada invalida. Solo numeros. Intente de nuevo.");
                        }
                    } while (!validarNumero(textoBruto));
                    fondoInicial = Double.parseDouble(textoBruto);
                    System.out.println("Fondo inicial registrado: $" + fondoInicial);
                    System.out.println();
                    break;

                case 2:
                    totalVentas = registrarMovimientos("Ventas");
                    break;

                case 3:
                    totalGastos = registrarMovimientos("Gastos");
                    break;

                case 4:
                    System.out.println("----------------------------");
                    System.out.println("-- Efectivo Real en Cajon --");
                    System.out.println("----------------------------");
                    do {
                        System.out.print("Ingrese el efectivo fisico en el cajon: ");
                        textoBruto = br.readLine();
                        if (!validarNumero(textoBruto)) {
                            System.out.println("Entrada invalida. Solo numeros. Intente de nuevo.");
                        }
                    } while (!validarNumero(textoBruto));
                    efectivoReal = Double.parseDouble(textoBruto);
                    calcularCorte(fondoInicial, totalVentas, totalGastos, efectivoReal);
                    break;

                case 5:
                    System.out.println("Cerrando el sistema... Hasta luego!");
                    break;

                default:
                    System.out.println("Opcion no valida. Seleccione del 1 al 5.");
                    break;
            }

        } while (opcion != 5);
    }

    static int mostrarMenu() throws IOException {
        String textoBruto;
        boolean opcValida = false;
        int opcSalida = 0;

        System.out.println("=================================");
        System.out.println("=== SISTEMA DE ARQUEO DE CAJA ===");
        System.out.println("=================================");
        System.out.println("1. Ingresar Fondo de Caja Inicial");
        System.out.println("2. Registrar Ventas del Turno");
        System.out.println("3. Registrar Gastos / Retiros");
        System.out.println("4. Realizar Corte de Caja");
        System.out.println("5. Salir del Sistema");

        do {
            System.out.println("=======================");
            System.out.println("Seleccione una opcion: ");
            System.out.println("=======================");
            textoBruto = br.readLine();

            if (validarNumero(textoBruto)) {
                double numOpcion = Double.parseDouble(textoBruto);
                if (numOpcion >= 1 && numOpcion <= 5) {
                    opcSalida = (int) numOpcion;
                    opcValida = true;
                } else {
                    System.out.println("Opcion fuera de rango (1-5). Intente de nuevo.");
                }
            } else {
                System.out.println("Entrada invalida. Ingrese un numero del 1 al 5.");
            }

        } while (!opcValida);

        return opcSalida;
    }

    static boolean validarNumero(String texto) {
        if (texto == null || texto.length() == 0) {
            return false;
        }
        try {
            double numero = Double.parseDouble(texto);
            if (numero == 0
                    && !texto.equals("0")
                    && !texto.equals("0.0")
                    && !texto.equals("00")) {
                return false;
            }
            return numero >= 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static double registrarMovimientos(String tipoMovimiento) throws IOException {
        String textoBruto;
        double totalAcumulado = 0;

        System.out.println("----------------------");
        System.out.println("-- Registrar " + tipoMovimiento + " --");

        do {
            System.out.print("Cuantos movimientos de " + tipoMovimiento + " desea ingresar? ");
            textoBruto = br.readLine();
            if (!validarNumero(textoBruto)) {
                System.out.println("Entrada invalida. Ingrese un numero entero.");
            }
        } while (!validarNumero(textoBruto));

        int cantMovimientos = (int) Double.parseDouble(textoBruto);

        if (cantMovimientos == 0) {
            System.out.println("Sin movimientos de " + tipoMovimiento + ". Total: $0");
        } else {
            for (int i = 1; i <= cantMovimientos; i++) {
                do {
                    System.out.print("  Monto del movimiento " + i + ": $");
                    textoBruto = br.readLine();
                    if (!validarNumero(textoBruto)) {
                        System.out.println("  Entrada invalida. Solo numeros. Intente de nuevo.");
                    }
                } while (!validarNumero(textoBruto));
                double montoActual = Double.parseDouble(textoBruto);
                totalAcumulado += montoActual;
            }
            System.out.println("Total de " + tipoMovimiento + ": $" + totalAcumulado);
        }

        System.out.println();
        return totalAcumulado;
    }

    static void calcularCorte(double fondoInicial, double totalVentas,
                               double totalGastos, double efectivoReal) {
        double teoricoEnCaja = (fondoInicial + totalVentas) - totalGastos;
        double diferencia    = efectivoReal - teoricoEnCaja;

        System.out.println("============================");
        System.out.println("=== RESULTADO DEL ARQUEO ===");
        System.out.println("Fondo Inicial  : $" + fondoInicial);
        System.out.println("Total Ventas   : $" + totalVentas);
        System.out.println("Total Gastos   : $" + totalGastos);
        System.out.println("Teorico en Caja: $" + teoricoEnCaja);
        System.out.println("Efectivo Real  : $" + efectivoReal);
        System.out.println("============================");

        if (diferencia < 0) {
            System.out.println("RESULTADO: FALTANTE");
            System.out.println("Diferencia: $" + (diferencia * -1));
        } else if (diferencia > 0) {
            System.out.println("RESULTADO: SOBRANTE");
            System.out.println("Diferencia: +$" + diferencia);
        } else {
            System.out.println("RESULTADO: CUADRADO");
            System.out.println("Diferencia: $0");
        }
    }
}
