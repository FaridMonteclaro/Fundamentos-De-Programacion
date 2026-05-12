package Fundamentos;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.IOException;

public class a2213207068_productointegrador3 {

    private static Scanner scanner = new Scanner(System.in);
    private static int ultimoTicket = 1000;

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

      public static String Fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatada = new SimpleDateFormat("dd-MM-yyyy");
        return formatada.format(fecha);
    }

     public static String IdTicketSiguiente(String idActual) {
    	
        int num = Integer.parseInt(idActual);
        num++;
        ultimoTicket = num;
        return String.valueOf(num);
    }

    public static void MenuProductos() {
        String[] datosmenuproductos = {"Modificar", "Listado", "Salida"};
        String opcion = "0";
        do {
            opcion = DesplegarMenu("--- MENÚ DE PRODUCTOS ---", datosmenuproductos);
            if (opcion == null) {
                System.out.println("Opción incorrecta");
                continue;
            }
            switch (opcion) {
                case "1":
                    System.out.println("Modificar Precio Producto");
                    break;
                case "2":
                    System.out.println("Listado Producto");
                    break;
                case "3":
                    System.out.println("Salida del Sistema");
                    break;
                default:
                    System.out.println("No existe esta opción");
            }
        } while (!opcion.equals("3"));
    }

    public static void MenuInventario() {
        String[] datosmenuinventario = {"Listado de Inventario", "Agregar Stock", "Salida"};
        String opcion = "0";
        do {
            opcion = DesplegarMenu("--- MENÚ DE INVENTARIO ---", datosmenuinventario);
            if (opcion == null) {
                System.out.println("Opción incorrecta");
                continue;
            }
            switch (opcion) {
                case "1":
                    System.out.println("Listado de Inventario");
                    break;
                case "2":
                    System.out.println("Agregar Stock");
                    break;
                case "3":
                    System.out.println("Salida del Sistema");
                    break;
                default:
                    System.out.println("No existe esta opción");
            }
        } while (!opcion.equals("3"));
    }

    public static void MenuPuntoVenta(String idticket) {
        String opcion = "0";
        boolean pago = false;
        String membrete = "";

        idticket = IdTicketSiguiente(idticket);
        String fechada = Fecha();
        membrete = "Fecha: " + fechada + "  Ticket: " + idticket + "\n-------------------------------";

        String[] datosmenu = {"Agregar Producto a Ticket", "Eliminar Producto del Ticket",
                              "Listado de Productos en el Ticket", "Pagar", "Salida"};

        do {
        	
            System.out.println("\n" + membrete);
            opcion = DesplegarMenu("--- PUNTO DE VENTA ---", datosmenu);
            if (opcion == null) {
                System.out.println("Opción incorrecta");
                continue;
            }
            switch (opcion) {
                case "1":
                    System.out.println("Agregar Articulo al Ticket");
                    break;
                case "2":
                    System.out.println("Eliminar Articulo del Ticket");
                    break;
                case "3":
                    System.out.println("Listado de Artículos del Ticket");
                    break;
                case "4":
                    System.out.println("Pagar Ticket y salir");
                    pago = true;
                    opcion = "5";
                    break;
                case "5":
                    System.out.println("Salida del Ventas");
                    if (!pago) {
                        System.out.println("No se pagó el ticket. El ticket se eliminará.");
                    }
                    break;
                default:
                    System.out.println("No existe esta opción");
            }
        } while (!opcion.equals("5"));
    }

    public static void MostrarListaVentas() {
        System.out.println("Mostrando lista de tickets vendidos...");
    }

    public static void MenuPrincipal() {
        String[] datosmenuprincipal = {"Productos", "Punto de Venta", "Inventario", "Listado de Ventas", "Salida"};
        String opcion = "0";
        String idTicketActual = String.valueOf(ultimoTicket);

        do {
            opcion = DesplegarMenu("Menú de Punto de Tienda de Abarrotes La Pequeña", datosmenuprincipal);
            if (opcion == null) {
                System.out.println("Opción incorrecta");
                continue;
            }
            switch (opcion) {
                case "1":
                    System.out.println("Menú de Productos");
                    MenuProductos();
                    break;
                case "2":
                    System.out.println("Menú de Punto de Venta");
                    MenuPuntoVenta(idTicketActual);
                    idTicketActual = String.valueOf(ultimoTicket);
                    break;
                case "3":
                    System.out.println("Menú de Inventario");
                    MenuInventario();
                    break;
                case "4":
                    System.out.println("Ventas");
                    MostrarListaVentas();
                    break;
                case "5":
                    System.out.println("Salida del Sistema");
                    break;
                default:
                    System.out.println("No existe esta opción");
            }
        } while (!opcion.equals("5"));
    }

    public static void main(String[] args) throws IOException {
        MenuPrincipal();
        scanner.close();
    }
}
