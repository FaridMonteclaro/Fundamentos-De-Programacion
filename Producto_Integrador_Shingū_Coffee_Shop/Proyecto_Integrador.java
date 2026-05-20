package Proyecto_Integrador;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProductoIntegrador {

    static String[][] productos;
    static String[][] ventas;
    static int tamventas = 100;

    // --------------------------------------------------------------
    // Funciones de presentación
    // --------------------------------------------------------------
    public static void lineaSimple() {
        System.out.println("----------------------------------------");
    }

    public static void lineaDoble() {
        System.out.println("========================================");
    }

    public static void mostrarTitulo(String titulo) {
        lineaDoble();
        System.out.println("   " + titulo);
        lineaDoble();
    }

    public static void mostrarSubtitulo(String subtitulo) {
        System.out.println("\n--- " + subtitulo + " ---");
    }

    public static void mostrarError(String mensaje) {
        System.out.println("[ERROR] " + mensaje);
    }

    public static void mostrarExito(String mensaje) {
        System.out.println("[OK] " + mensaje);
    }

    public static void mostrarInfo(String mensaje) {
        System.out.println("[INFO] " + mensaje);
    }

    // --------------------------------------------------------------
    // Funciones base
    // --------------------------------------------------------------
    public static String Dialogo(String texto) throws IOException {
        System.out.print(texto + " : ");
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
        return lectura.readLine();
    }

    public static String RellenarEspacios(String dato, int tamano) {
        return String.format("%1$-" + tamano + "s", dato);
    }

    public static String Fecha() {
        return new SimpleDateFormat("dd-MM-yyyy").format(new Date());
    }

    public static String IdTicketSiguiente(String idticket) {
        int num = Integer.parseInt(idticket) + 1;
        if (num < 10) return "00" + num;
        else if (num < 100) return "0" + num;
        else return "" + num;
    }

    public static int ObtenerUltimaPosicion(String[][] matriz) {
        for (int i = matriz.length - 1; i >= 0; i--) {
            if (matriz[i] != null && matriz[i][0] != null && !matriz[i][0].isEmpty())
                return i;
        }
        return -1;
    }

    // --------------------------------------------------------------
    // Validación numérica con reintento
    // --------------------------------------------------------------
    public static boolean EsNumeroEntero(String dato) {
        if (dato == null || dato.isEmpty()) return false;
        for (char c : dato.toCharArray()) if (!Character.isDigit(c)) return false;
        return true;
    }

    public static boolean EsNumeroDouble(String dato) {
        if (dato == null || dato.isEmpty()) return false;
        boolean punto = false;
        for (char c : dato.toCharArray()) {
            if (!Character.isDigit(c)) {
                if (c == '.' && !punto) punto = true;
                else return false;
            }
        }
        return true;
    }

    public static boolean EvaluarNumerico(String dato, int tipo) {
        if (tipo == 1) return EsNumeroEntero(dato);
        else if (tipo == 2) return EsNumeroDouble(dato);
        return false;
    }

    public static String LeerValidado(String texto, int tipo) throws IOException {
        String entrada;
        do {
            entrada = Dialogo(texto);
            if (entrada == null) entrada = "";
            entrada = entrada.trim();
            if (entrada.isEmpty()) {
                mostrarError("No se ingresó ningún dato. Intente de nuevo.");
                continue;
            }
            if (!EvaluarNumerico(entrada, tipo)) {
                mostrarError("Debe ingresar un valor numérico " + (tipo == 1 ? "entero." : "decimal."));
                continue;
            }
            break;
        } while (true);
        return entrada;
    }

    // --------------------------------------------------------------
    // Carga de productos (20 productos)
    // --------------------------------------------------------------
    public static String[][] CargarProductos() {
        String[][] prod = new String[20][5];
        prod[0] = new String[]{"001", "Espresso (1 taza)", "35.00", "50", "16"};
        prod[1] = new String[]{"002", "Latte (1 taza)", "45.00", "45", "16"};
        prod[2] = new String[]{"003", "Cappuccino (1 taza)", "45.00", "40", "16"};
        prod[3] = new String[]{"004", "Americano (1 taza)", "35.00", "55", "16"};
        prod[4] = new String[]{"005", "Mocha (1 taza)", "50.00", "35", "16"};
        prod[5] = new String[]{"006", "Frappé de Vainilla", "55.00", "30", "16"};
        prod[6] = new String[]{"007", "Frappé de Chocolate", "55.00", "30", "16"};
        prod[7] = new String[]{"008", "Té Chai (1 taza)", "40.00", "25", "16"};
        prod[8] = new String[]{"009", "Pastel de Zanahoria", "60.00", "20", "16"};
        prod[9] = new String[]{"010", "Croissant", "35.00", "30", "16"};
        prod[10] = new String[]{"011", "Galleta de Avena", "15.00", "40", "0"};
        prod[11] = new String[]{"012", "Bagel con Queso", "45.00", "20", "16"};
        prod[12] = new String[]{"013", "Agua Embotellada", "20.00", "60", "0"};
        prod[13] = new String[]{"014", "Refresco 355ml", "25.00", "50", "16"};
        prod[14] = new String[]{"015", "Ramen Queso Picante", "85.00", "25", "16"};
        prod[15] = new String[]{"016", "Ramen Cream Carbonara", "90.00", "20", "16"};
        prod[16] = new String[]{"017", "Ramen Kimchi", "80.00", "22", "16"};
        prod[17] = new String[]{"018", "Galleta Crispy", "12.00", "50", "0"};
        prod[18] = new String[]{"019", "Ramen Buldark", "95.00", "18", "16"};
        prod[19] = new String[]{"020", "Taro Frappe", "60.00", "30", "16"};
        return prod;
    }

    public static String MostrarProducto(String[] vproducto) {
        String codigo = RellenarEspacios(vproducto[0], 5);
        String nombre = RellenarEspacios(vproducto[1], 28);
        String precio = RellenarEspacios(vproducto[2], 7);
        String stock = RellenarEspacios(vproducto[3], 5);
        String iva = RellenarEspacios(vproducto[4] + "%", 4);
        return "| " + codigo + " | " + nombre + " | " + precio + " | " + stock + " | " + iva + " |";
    }

    public static String MostrarLista(String[][] vproductos) {
        StringBuilder sb = new StringBuilder();
        String separador = "+-------+------------------------------+---------+-------+------+";
        sb.append(separador).append("\n");
        sb.append("| Codigo| Nombre                       | Precio  | Stock | IVA  |\n");
        sb.append(separador).append("\n");
        for (int i = 0; i < vproductos.length; i++) {
            sb.append(MostrarProducto(vproductos[i])).append("\n");
        }
        sb.append(separador);
        return sb.toString();
    }

    public static int ExisteProducto(String codigo, String[][] vproductos) {
        for (int i = 0; i < vproductos.length; i++) {
            if (vproductos[i][0].compareTo(codigo.trim()) == 0) return i;
        }
        return -1;
    }

    public static void ModificarProducto(String[][] vproductos) throws IOException {
        mostrarSubtitulo("MODIFICAR PRECIO");
        System.out.println(MostrarLista(vproductos));
        String codigo = Dialogo("Ingrese el codigo del producto a modificar");
        if (codigo == null || codigo.trim().isEmpty()) {
            mostrarError("Dato nulo");
            return;
        }
        int pos = ExisteProducto(codigo.trim(), vproductos);
        if (pos == -1) {
            mostrarError("No existe el codigo");
            return;
        }
        String nuevoPrecio = LeerValidado("Nuevo precio de " + vproductos[pos][1], 2);
        vproductos[pos][2] = nuevoPrecio;
        mostrarExito("Precio actualizado.");
    }

    // --------------------------------------------------------------
    // Menú Productos
    // --------------------------------------------------------------
    public static void MenuProductos(String[][] vproductos) throws IOException {
        String opcion;
        do {
            mostrarTitulo("GESTION DE PRODUCTOS");
            System.out.println("1. Modificar precio");
            System.out.println("2. Listado de productos");
            System.out.println("3. Salir");
            lineaSimple();
            opcion = Dialogo("Opcion");
            if (opcion == null) {
                mostrarError("Opcion incorrecta");
                continue;
            }
            switch (opcion) {
                case "1":
                    ModificarProducto(vproductos);
                    break;
                case "2":
                    mostrarSubtitulo("LISTADO DE PRODUCTOS");
                    System.out.println(MostrarLista(vproductos));
                    break;
                case "3":
                    mostrarInfo("Saliendo del modulo productos...");
                    break;
                default:
                    mostrarError("Opcion no valida");
            }
        } while (!opcion.equals("3"));
    }

    // --------------------------------------------------------------
    // Descontar Stock (Actividad 3)
    // --------------------------------------------------------------
    public static int DescontarStock(String[][] productos, String codigo, int cantidad) {
        int pos = ExisteProducto(codigo, productos);
        if (pos == -1) return -2;
        int stockActual = Integer.parseInt(productos[pos][3]);
        if (stockActual == 0) return 0;
        if (cantidad > stockActual) return -1;
        productos[pos][3] = String.valueOf(stockActual - cantidad);
        return 1;
    }

    // --------------------------------------------------------------
    // Punto de Venta (Ticket)
    // --------------------------------------------------------------
    public static String[][] CrearTicket() { return new String[20][4]; }
    public static String[][] CrearVenta() { return new String[tamventas][5]; }

    public static int ExisteTicketCodigo(String[][] mticket, String codigo) {
        int ult = ObtenerUltimaPosicion(mticket);
        for (int i = 0; i <= ult; i++) {
            if (mticket[i][0] != null && mticket[i][0].compareTo(codigo.trim()) == 0) return i;
        }
        return -1;
    }

    public static boolean InsertarProductoTicket(String[][] mticket, String[] datos, int tamticket) {
        int ult = ObtenerUltimaPosicion(mticket);
        int pos = ExisteTicketCodigo(mticket, datos[0]);
        if (pos != -1) {
            int cantActual = Integer.parseInt(mticket[pos][3]);
            mticket[pos][3] = String.valueOf(cantActual + 1);
            return true;
        }
        if (ult + 1 >= tamticket) return false;
        int nuevaPos = ult + 1;
        mticket[nuevaPos][0] = datos[0];
        mticket[nuevaPos][1] = datos[1];
        mticket[nuevaPos][2] = datos[2];
        mticket[nuevaPos][3] = datos[3];
        return true;
    }

    public static String TotalProducto(String precio, String cantidad) {
        double total = Double.parseDouble(precio) * Double.parseDouble(cantidad);
        return String.format("%.2f", total);
    }

    public static String MostrarProductoTicket(String[][] mticket, int pos) {
        String cod = RellenarEspacios(mticket[pos][0], 5);
        String nom = RellenarEspacios(mticket[pos][1], 28);
        String pre = RellenarEspacios(mticket[pos][2], 7);
        String cant = RellenarEspacios(mticket[pos][3], 4);
        String total = RellenarEspacios(TotalProducto(mticket[pos][2], mticket[pos][3]), 8);
        return "| " + cod + " | " + nom + " | " + pre + " | " + cant + " | " + total + " |";
    }

    public static String MostrarTicket(String[][] mticket) {
        StringBuilder sb = new StringBuilder();
        int ult = ObtenerUltimaPosicion(mticket);
        if (ult == -1) return "   [Ticket vacio]";
        String separador = "+-------+------------------------------+---------+------+----------+";
        sb.append(separador).append("\n");
        sb.append("| Codigo| Nombre                       | Precio  | Cant | Subtotal |\n");
        sb.append(separador).append("\n");
        for (int i = 0; i <= ult; i++) {
            sb.append(MostrarProductoTicket(mticket, i)).append("\n");
        }
        sb.append(separador);
        return sb.toString();
    }

    // --------------------------------------------------------------
    // Cálculo de IVA por producto (Actividad 5)
    // --------------------------------------------------------------
    public static double SubTotalTicket(String[][] mticket) {
        double sub = 0;
        int ult = ObtenerUltimaPosicion(mticket);
        for (int i = 0; i <= ult; i++) {
            sub += Double.parseDouble(TotalProducto(mticket[i][2], mticket[i][3]));
        }
        return sub;
    }

    public static double IvaTicket(String[][] mticket, String[][] productos) {
        double ivaTotal = 0;
        int ult = ObtenerUltimaPosicion(mticket);
        for (int i = 0; i <= ult; i++) {
            String codigo = mticket[i][0];
            int posProd = ExisteProducto(codigo, productos);
            if (posProd == -1) continue;
            String ivaPorcStr = productos[posProd][4];
            double ivaPorc = Double.parseDouble(ivaPorcStr);
            if (ivaPorc != 0) {
                double subtotalLinea = Double.parseDouble(mticket[i][2]) * Double.parseDouble(mticket[i][3]);
                ivaTotal += subtotalLinea * (ivaPorc / 100);
            }
        }
        return ivaTotal;
    }

    public static double TotalTicket(String[][] mticket, String[][] productos) {
        return SubTotalTicket(mticket) + IvaTicket(mticket, productos);
    }

    public static void MostrarTicketVenta(String[][] mticket, String idticket, String fecha, String[][] productos) {
        lineaDoble();
        System.out.println("Fecha: " + fecha + "   Ticket No.: " + idticket);
        lineaDoble();
        System.out.println(MostrarTicket(mticket));
        lineaSimple();
        System.out.printf("Subtotal: $%.2f\n", SubTotalTicket(mticket));
        System.out.printf("IVA (individual): $%.2f\n", IvaTicket(mticket, productos));
        lineaSimple();
        System.out.printf("TOTAL A PAGAR: $%.2f\n", TotalTicket(mticket, productos));
        lineaDoble();
    }

    // --------------------------------------------------------------
    // Captura y eliminación de productos en ticket
    // --------------------------------------------------------------
    public static void CapturaVentaProducto(String[][] mticket, String[][] mproductos, int tamticket) throws IOException {
        mostrarSubtitulo("AGREGAR PRODUCTO");
        System.out.println(MostrarLista(mproductos));
        String codigo = Dialogo("Codigo del producto");
        if (codigo == null || codigo.trim().isEmpty()) {
            mostrarError("Dato nulo");
            return;
        }
        int posProd = ExisteProducto(codigo.trim(), mproductos);
        if (posProd == -1) {
            mostrarError("Codigo no existe.");
            return;
        }
        int resultado = DescontarStock(mproductos, codigo.trim(), 1);
        if (resultado == -2) mostrarError("Producto no existe.");
        else if (resultado == -1) mostrarError("Cantidad insuficiente en stock.");
        else if (resultado == 0) mostrarError("Stock en cero.");
        else if (resultado == 1) {
            String[] venta = { mproductos[posProd][0], mproductos[posProd][1], mproductos[posProd][2], "1" };
            if (!InsertarProductoTicket(mticket, venta, tamticket))
                mostrarError("Ticket lleno.");
            else
                mostrarExito("Agregado: " + mproductos[posProd][1]);
        }
    }

    public static void RemoverProductoTicket(String[][] mticket, int pos) {
        int ult = ObtenerUltimaPosicion(mticket);
        for (int i = pos; i < ult; i++) mticket[i] = mticket[i+1];
        mticket[ult] = new String[4];
    }

    public static void EliminarProductoTicket(String[][] mticket, int pos) {
        int cant = Integer.parseInt(mticket[pos][3]);
        if (cant > 1) mticket[pos][3] = String.valueOf(cant - 1);
        else RemoverProductoTicket(mticket, pos);
    }

    public static void Eliminar(String[][] mticket, String[][] mproductos) throws IOException {
        mostrarSubtitulo("ELIMINAR PRODUCTO");
        System.out.println(MostrarTicket(mticket));
        String codigo = Dialogo("Codigo del producto a eliminar");
        if (codigo == null || codigo.trim().isEmpty()) return;
        int posTicket = ExisteTicketCodigo(mticket, codigo.trim());
        if (posTicket == -1) {
            mostrarError("El producto no existe en el ticket.");
            return;
        }
        int posProd = ExisteProducto(codigo.trim(), mproductos);
        if (posProd != -1) {
            int cantidadDevuelta = Integer.parseInt(mticket[posTicket][3]);
            int stockActual = Integer.parseInt(mproductos[posProd][3]);
            mproductos[posProd][3] = String.valueOf(stockActual + cantidadDevuelta);
        }
        EliminarProductoTicket(mticket, posTicket);
        mostrarExito("Producto eliminado del ticket.");
    }

    // --------------------------------------------------------------
    // Cancelar Venta (Actividad 4)
    // --------------------------------------------------------------
    public static void DevolucionTicket(String[][] mticket, String[][] mproductos) {
        int ult = ObtenerUltimaPosicion(mticket);
        for (int i = 0; i <= ult; i++) {
            String codigo = mticket[i][0];
            int posProd = ExisteProducto(codigo, mproductos);
            if (posProd != -1) {
                int stockActual = Integer.parseInt(mproductos[posProd][3]);
                int cantidadTicket = Integer.parseInt(mticket[i][3]);
                mproductos[posProd][3] = String.valueOf(stockActual + cantidadTicket);
            }
        }
    }

    public static void CancelarVenta(String[][] mticket, String[][] mproductos) {
        DevolucionTicket(mticket, mproductos);
        for (int i = 0; i < mticket.length; i++) {
            mticket[i] = new String[4];
        }
        mostrarInfo("Venta cancelada. Inventario restaurado y ticket limpiado.");
    }

    // --------------------------------------------------------------
    // Menú Punto de Venta
    // --------------------------------------------------------------
    public static void MenuPuntoVenta(String[][] ventas, String idticket, String[][] productos) throws IOException {
        boolean pago = false;
        int tamTicket = 20;
        String[][] ticket = CrearTicket();
        idticket = IdTicketSiguiente(idticket);
        String fechadia = Fecha();
        String opcion;
        do {
            mostrarTitulo("PUNTO DE VENTA");
            System.out.println("Fecha: " + fechadia + "   Ticket: " + idticket);
            lineaSimple();
            System.out.println(MostrarTicket(ticket));
            lineaSimple();
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Ver ticket completo");
            System.out.println("4. Pagar");
            System.out.println("5. Salir (cancelar si no se pago)");
            lineaSimple();
            opcion = Dialogo("Opcion");
            if (opcion == null) {
                mostrarError("Dato incorrecto");
                continue;
            }
            switch (opcion) {
                case "1":
                    CapturaVentaProducto(ticket, productos, tamTicket);
                    break;
                case "2":
                    Eliminar(ticket, productos);
                    break;
                case "3":
                    mostrarSubtitulo("DETALLE DEL TICKET");
                    System.out.println(MostrarTicket(ticket));
                    break;
                case "4":
                    MostrarTicketVenta(ticket, idticket, fechadia, productos);
                    int posVentas = ObtenerUltimaPosicion(ventas);
                    int ultTicket = ObtenerUltimaPosicion(ticket);
                    for (int i = 0; i <= ultTicket; i++) {
                        posVentas++;
                        ventas[posVentas] = new String[]{idticket, ticket[i][0], ticket[i][1], ticket[i][2], ticket[i][3]};
                    }
                    pago = true;
                    mostrarExito("Venta registrada.");
                    opcion = "5";
                    break;
                case "5":
                    if (!pago) {
                        mostrarInfo("Venta no pagada. Cancelando...");
                        CancelarVenta(ticket, productos);
                    } else {
                        mostrarInfo("Saliendo del punto de venta.");
                    }
                    break;
                default:
                    mostrarError("Opcion no valida");
            }
        } while (!opcion.equals("5"));
    }

    // --------------------------------------------------------------
    // Menú Inventario
    // --------------------------------------------------------------
    public static void AgregarStock(String[][] vproductos) throws IOException {
        mostrarSubtitulo("AGREGAR STOCK");
        System.out.println(MostrarLista(vproductos));
        String codigo = Dialogo("Codigo del producto");
        int pos = ExisteProducto(codigo, vproductos);
        if (pos == -1) {
            mostrarError("Codigo no existe");
            return;
        }
        String cantidadStr = LeerValidado("Cantidad a agregar a " + vproductos[pos][1], 1);
        int cantAdd = Integer.parseInt(cantidadStr);
        int stockActual = Integer.parseInt(vproductos[pos][3]);
        vproductos[pos][3] = String.valueOf(stockActual + cantAdd);
        mostrarExito("Nuevo stock: " + vproductos[pos][3]);
    }

    public static void MenuInventario(String[][] vproductos) throws IOException {
        String opcion;
        do {
            mostrarTitulo("INVENTARIO");
            System.out.println("1. Listado de inventario");
            System.out.println("2. Agregar stock");
            System.out.println("3. Salir");
            lineaSimple();
            opcion = Dialogo("Opcion");
            if (opcion == null) {
                mostrarError("Opcion incorrecta");
                continue;
            }
            switch (opcion) {
                case "1":
                    mostrarSubtitulo("INVENTARIO ACTUAL");
                    System.out.println(MostrarLista(vproductos));
                    break;
                case "2":
                    AgregarStock(vproductos);
                    break;
                case "3":
                    mostrarInfo("Saliendo del inventario...");
                    break;
                default:
                    mostrarError("Opcion no valida");
            }
        } while (!opcion.equals("3"));
    }

    // --------------------------------------------------------------
    // Listado de Ventas
    // --------------------------------------------------------------
    public static void MostrarListaVentas(String[][] ventas) {
        mostrarTitulo("HISTORIAL DE VENTAS");
        int ult = ObtenerUltimaPosicion(ventas);
        if (ult == -1) {
            mostrarInfo("No hay ventas registradas.");
            return;
        }
        String separador = "+----------+-------+-----------------------------+----------+----------+";
        System.out.println(separador);
        System.out.println("| ID Ticket| Codigo| Producto                    | Precio   | Cantidad |");
        System.out.println(separador);
        for (int i = 0; i <= ult; i++) {
            String idTicket = RellenarEspacios(ventas[i][0], 8);
            String codigo = RellenarEspacios(ventas[i][1], 5);
            String producto = RellenarEspacios(ventas[i][2], 27);
            String precio = RellenarEspacios(ventas[i][3], 8);
            String cantidad = RellenarEspacios(ventas[i][4], 8);
            System.out.println("| " + idTicket + " | " + codigo + " | " + producto + " | " + precio + " | " + cantidad + " |");
        }
        System.out.println(separador);
    }

    public static String ObtenerUltimoValorVentas(String[][] ventas) {
        int ult = ObtenerUltimaPosicion(ventas);
        if (ult == -1) return "000";
        return ventas[ult][0];
    }

    // --------------------------------------------------------------
    // Menú Principal
    // --------------------------------------------------------------
    public static void MenuPrincipal(String[][] vproductos, String[][] vventas) throws IOException {
        String opcion;
        do {
            mostrarTitulo("       SHINGU COFFEE SHOP  ");
            System.out.println("1. Gestion de Productos");
            System.out.println("2. Punto de Venta");
            System.out.println("3. Inventario");
            System.out.println("4. Listado de Ventas");
            System.out.println("5. Salir");
            lineaSimple();
            opcion = Dialogo("Opcion");
            if (opcion == null) {
                mostrarError("Opcion incorrecta");
                continue;
            }
            switch (opcion) {
                case "1": MenuProductos(vproductos); break;
                case "2": MenuPuntoVenta(vventas, ObtenerUltimoValorVentas(vventas), vproductos); break;
                case "3": MenuInventario(vproductos); break;
                case "4": MostrarListaVentas(vventas); break;
                case "5": mostrarExito("Gracias por usar Shingu Coffee POS. Hasta luego!"); break;
                default: mostrarError("Opcion no existe");
            }
        } while (!opcion.equals("5"));
    }

    public static void main(String[] args) throws IOException {
        productos = CargarProductos();
        ventas = CrearVenta();
        MenuPrincipal(productos, ventas);
    }
}
