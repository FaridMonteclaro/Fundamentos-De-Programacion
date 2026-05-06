package Fundamentos;
import java.util.Scanner;

public class a2213207068_productointegrador5 {

    private static Scanner scanner = new Scanner(System.in);

    public static void MostrarLista(String[][] vproductos) 
    {
        System.out.println("\n--- LISTADO DE INVENTARIO ---");
        System.out.printf("%-6s %-20s %-8s %-10s\n", "Código", "Producto", "Precio", "Cantidad");
        
        for (String[] prod : vproductos) {
            System.out.printf("%-6s %-20s %-8s %-10s\n", prod[0], prod[1], prod[2], prod[3]);
        }
        
        System.out.println();
    }

    public static int ExisteProducto(String codigo, String[][] vproductos) {
       
    	for (int i = 0; i < vproductos.length; i++) {
            if (vproductos[i][0].equals(codigo)) {
          
            	return i;
            }
        }
        
    	return -1;
    }

    public static boolean EvaluarNumerico(String valor)
    {
        
    	if (valor == null || valor.trim().isEmpty()) return false;
       
    	try 
        {
            Integer.parseInt(valor.trim());
            
            return true;
        } 
    	catch (NumberFormatException e)
    	{
          
    		return false;
        }
    }

    public static void AgregarStock(String[][] vproductos)
    {
        System.out.println("\n--- AGREGAR INVENTARIO ---");

        MostrarLista(vproductos);

        System.out.print("Ingrese el código del producto: ");
        
        String codigo = scanner.nextLine();
        if (codigo == null || codigo.trim().isEmpty()) {
           
        	System.out.println("dato nulo");
            return;
        
        }

        int posicion = ExisteProducto(codigo, vproductos);
        
        if (posicion == -1) {
            System.out.println("no existe código");
        
            return;
        }

        String[] producto = vproductos[posicion];
        
        System.out.println("Producto seleccionado: " + producto[1] + " | Cantidad actual: " + producto[3]);

        System.out.print("Cantidad a agregar: ");
        
        String cantidadStr = scanner.nextLine();
        if (cantidadStr == null || cantidadStr.trim().isEmpty()) {
            System.out.println("dato nulo");
        
            return;
        
        }

        if (!EvaluarNumerico(cantidadStr)) {
            System.out.println("no es un valor numérico");
        
            return;
        }

        int cantidadActual = Integer.parseInt(producto[3]);
        int cantidadAgregar = Integer.parseInt(cantidadStr);
        int nuevaCantidad = cantidadActual + cantidadAgregar;

        vproductos[posicion][3] = String.valueOf(nuevaCantidad);

        System.out.println("Stock actualizado. Nueva cantidad de '" + producto[1] + "': " + nuevaCantidad);
    
    }

    public static void MenuInventario(String[][] vproductos) 
    {
      
    	String opcion;
    	
        do {
            
        	System.out.println("\n=== MENÚ INVENTARIO ===");
            System.out.println("1.- Listado de Inventario");
            System.out.println("2.- Agregar Inventario");
            System.out.println("3.- Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextLine();

            if (opcion == null)
            {
            	
                System.out.println("opción incorrecta");
                continue;
            
            }

            switch (opcion) 
            {
            
            case "1":

                    MostrarLista(vproductos);
                    break;
                case "2":

                    AgregarStock(vproductos);
                    break;
                case "3":
                    System.out.println("Saliendo del menú inventario...");
                    break;
                default:
                    System.out.println("No existe esta opción");
            }
        } 
        
        while (!"3".equals(opcion));
        
    }

    public static void MenuProductos(String[][] vproductos) 
    {
        System.out.println("Menú de productos (en construcción).");

    }

    public static void MenuPuntoVenta(String parametro) 
    {
        System.out.println("Menú punto de venta (en construcción). Parámetro recibido: " + parametro);
    }

    public static void MenuPrincipal(String[][] vproductos)
    {
      
    	String[] datosmenuprincipal = {"1.-Productos", "2.-Punto de Venta", "3.-Inventario", "5.-Salida"};
        String opcion = "0";
        do
        {
           
        	System.out.println("\n=== Menu de Punto de Tienda de Abarrotes la Pequeña ===");
            for (String item : datosmenuprincipal) 
            {
            
            	System.out.println(item);
            
            }
            
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextLine();

            if (opcion == null) 
            {
            	
                System.out.println("opción incorrecta");
                continue;
                
            }

            switch (opcion) 
            
            {
                case "1":
                    MenuProductos(vproductos);
                    break;
                case "2":
                    MenuPuntoVenta("000");
                    break;
                case "3":
                    MenuInventario(vproductos);
                    break;
                case "5":
                    System.out.println("Salida del Sistema");
                    break;
                default:
                    System.out.println("No existe esta opción");
                    
            }
        }
        
        while (!"5".equals(opcion));
    
    }

    public static void main(String[] args)
    {

        String[][] vproductos = {
            {"001", "Arroz 1kg", "35", "10"},
            {"002", "Azúcar 1kg", "25", "10"},
            {"003", "Harina 1kg", "28", "10"},
            {"004", "Aceite 1L", "50", "10"},
            {"005", "Leche 1L", "35", "10"},
            {"006", "Huevos 12 unidades", "45", "10"},
            {"007", "Fideos 500g", "20", "10"},
            {"008", "Sal 1kg", "15", "10"},
            {"009", "Pasta de tomate 400g", "25", "10"},
            {"010", "Atún lata 170g", "35", "10"}
    
        };

        MenuPrincipal(vproductos);

        scanner.close();
        
    }
}
