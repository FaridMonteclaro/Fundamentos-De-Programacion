package Fundamentos;
import java.util.Scanner;

public class a2213207068_productointegrador {

    private static Scanner scanner = new Scanner(System.in);

    public static String MostrarMenu(String[] opciones) {
    	
        String cadena = "";
        int i = 0;
        while (i < opciones.length) {
            cadena += (i + 1) + ". " + opciones[i] + "\n";
            i++;
        }
        return cadena;
    }

    public static String Dialogo(String texto) {
        System.out.print(texto + ": ");
        String cadena = scanner.nextLine();
        return cadena;
    }

    public static String DesplegarMenu(String Titulo1, String[] menu) {
        String cadena = Titulo1 + "\n\n";
        cadena += MostrarMenu(menu);
        cadena += "Elija una opción";
        return Dialogo(cadena);
    }

    public static void subMenuProductos() {
        String[] opciones = {"Modificar Producto", "Listado de Productos", "Salida"};
        int opcion;
        do {
            String entrada = DesplegarMenu("=== MODIFICAR PRODUCTO ===", opciones);
            try {
                opcion = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                opcion = -1;
            }
            switch (opcion) {
                case 1:
                    System.out.println("\n-> Opción: Modificar Producto \n");
                    break;
                case 2:
                    System.out.println("\n-> Opción: Listado de Productos \n");
                    break;
                case 3:
                    System.out.println("\n-> Regresando al menú principal...\n");
                    break;
                default:
                    System.out.println("\nX Opción no válida. Intente de nuevo.\n");
            }
        } while (opcion != 3);
    }

    public static void subMenuPuntoVenta() {
        String[] opciones = {"Agregar Producto a Ticket", "Eliminar Producto del Ticket", 
                             "Listado de Productos en el Ticket", "Pagar", "Salida"};
        int opcion;
        do {
            String entrada = DesplegarMenu("=== AGREGAR PRODUCTO A TICKET ===", opciones);
            try {
                opcion = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                opcion = -1;
            }
            switch (opcion) {
                case 1:
                    System.out.println("\n-> Agregar Producto a Ticket \n");
                    break;
                case 2:
                    System.out.println("\n-> Eliminar Producto del Ticket \n");
                    break;
                case 3:
                    System.out.println("\n-> Listado de Productos en el Ticket \n");
                    break;
                case 4:
                    System.out.println("\n-> Pagar \n");
                    break;
                case 5:
                    System.out.println("\n-> Regresando al menú principal...\n");
                    break;
                default:
                    System.out.println("\nX Opción no válida. Intente de nuevo.\n");
            }
        } while (opcion != 5);
    }

    public static void subMenuInventario() {
        String[] opciones = {"Listado de Inventario", "Agregar Stock", "Salida"};
        int opcion;
        do {
            String entrada = DesplegarMenu("=== LISTADO DE INVENTARIO ===", opciones);
            try {
                opcion = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                opcion = -1;
            }
            switch (opcion) {
                case 1:
                    System.out.println("\n -> Listado de Inventario \n");
                    break;
                case 2:
                    System.out.println("\n-> Agregar Stock \n");
                    break;
                case 3:
                    System.out.println("\n-> Regresando al menú principal...\n");
                    break;
                default:
                    System.out.println("\nX Opción no válida. Intente de nuevo.\n");
            }
        } while (opcion != 3);
    }

    public static void listadoDeVentas() {
        System.out.println("\n-> Mostrando Listado de Ventas \n");
    }

    public static void main(String[] args) {
        String[] opcionesPrincipales = {"Productos", "Punto de Venta", "Inventario", 
                                        "Listado de Ventas", "Salida"};
        int opcion;

        do {
            String entrada = DesplegarMenu("Menú", opcionesPrincipales);
            try {
                opcion = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                opcion = -1;
            }

            switch (opcion) {
                case 1:
                    subMenuProductos();
                    break;
                case 2:
                    subMenuPuntoVenta();
                    break;
                case 3:
                    subMenuInventario();
                    break;
                case 4:
                    listadoDeVentas();
                    break;
                case 5:
                    System.out.println("\n¡Gracias por usar el sistema! Saliendo...\n");
                    break;
                default:
                    System.out.println("\n Opción no válida. Intente con un número del 1 al 5.\n");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
