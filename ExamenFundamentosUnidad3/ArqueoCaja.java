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
        String txt           = "";

        do {
            opcion = mostrarMenu();

            switch (opcion) {
                case 1:
                    System.out.println("---------------------------");
                    System.out.println("-- Fondo de Caja Inicial --");
                    System.out.println("---------------------------");
                    do {
                        System.out.print("Ingresa el fondo inicial: ");
                        txt = br.readLine();
                        if (!validarNumero(txt)) {
                            System.out.println("Dato no valido, intenta otra vez.");
                        }
                    } while (!validarNumero(txt));
                    fondoInicial = Double.parseDouble(txt);
                    System.out.println("Fondo guardado: $" + fondoInicial);
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
                    System.out.println("-- Efectivo en Caja --");
                    System.out.println("----------------------------");
                    do {
                        System.out.print("Ingresa el dinero en caja: ");
                        txt = br.readLine();
                        if (!validarNumero(txt)) {
                            System.out.println("Dato no valido, intenta otra vez.");
                        }
                    } while (!validarNumero(txt));
                    efectivoReal = Double.parseDouble(txt);
                    calcularCorte(fondoInicial, totalVentas, totalGastos, efectivoReal);
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion no valida (1-5).");
                    break;
            }

        } while (opcion != 5);
    }

    static int mostrarMenu() throws IOException {
        String txt;
        boolean ok = false;
        int opc = 0;

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
            System.out.println("Elige una opcion: ");
            System.out.println("=======================");
            txt = br.readLine();

            if (validarNumero(txt)) {
                double num = Double.parseDouble(txt);
                if (num >= 1 && num <= 5) {
                    opc = (int) num;
                    ok = true;
                } else {
                    System.out.println("Fuera de rango.");
                }
            } else {
                System.out.println("Pon un numero del 1 al 5.");
            }

        } while (!ok);

        return opc;
    }

    static boolean validarNumero(String txt) {
        if (txt == null || txt.length() == 0) {
            return false;
        }
        try {
            Double.parseDouble(txt);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static double registrarMovimientos(String tipoMovimiento) throws IOException {
        String txt;
        double total = 0;

        System.out.println("----------------------");
        System.out.println("-- Registrar " + tipoMovimiento + " --");

        do {
            System.out.print("Cuantos movimientos de " + tipoMovimiento + ": ");
            txt = br.readLine();
            if (!validarNumero(txt)) {
                System.out.println("Dato no valido.");
            }
        } while (!validarNumero(txt));

        int cantMovimientos = (int) Double.parseDouble(txt);

        if (cantMovimientos == 0) {
            System.out.println("No hay " + tipoMovimiento + ". Total: $0");
        } else {
            for (int i = 1; i <= cantMovimientos; i++) {
                do {
                    System.out.print("  Movimiento " + i + ": $");
                    txt = br.readLine();
                    if (!validarNumero(txt)) {
                        System.out.println("  Dato no valido.");
                    }
                } while (!validarNumero(txt));
                double monto = Double.parseDouble(txt);
                total += monto;
            }
            System.out.println("Total de " + tipoMovimiento + ": $" + total);
        }

        System.out.println();
        return total;
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
