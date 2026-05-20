import datetime
import sys

class ProductoIntegrador:
    productos = None
    ventas = None
    tamventas = 100

    # --------------------------------------------------------------
    # Funciones de presentación
    # --------------------------------------------------------------
    @staticmethod
    def linea_simple():
        print("----------------------------------------")

    @staticmethod
    def linea_doble():
        print("========================================")

    @staticmethod
    def mostrar_titulo(titulo):
        ProductoIntegrador.linea_doble()
        print("   " + titulo)
        ProductoIntegrador.linea_doble()

    @staticmethod
    def mostrar_subtitulo(subtitulo):
        print("\n--- " + subtitulo + " ---")

    @staticmethod
    def mostrar_error(mensaje):
        print("[ERROR] " + mensaje)

    @staticmethod
    def mostrar_exito(mensaje):
        print("[OK] " + mensaje)

    @staticmethod
    def mostrar_info(mensaje):
        print("[INFO] " + mensaje)

    # --------------------------------------------------------------
    # Funciones base
    # --------------------------------------------------------------
    @staticmethod
    def dialogo(texto):
        return input(texto + " : ")

    @staticmethod
    def rellenar_espacios(dato, tamano):
        return dato.ljust(tamano)

    @staticmethod
    def fecha():
        return datetime.datetime.now().strftime("%d-%m-%Y")

    @staticmethod
    def id_ticket_siguiente(idticket):
        num = int(idticket) + 1
        if num < 10:
            return "00" + str(num)
        elif num < 100:
            return "0" + str(num)
        else:
            return str(num)

    @staticmethod
    def obtener_ultima_posicion(matriz):
        for i in range(len(matriz) - 1, -1, -1):
            if matriz[i] is not None and matriz[i][0] is not None and matriz[i][0] != "":
                return i
        return -1

    # --------------------------------------------------------------
    # Validación numérica
    # --------------------------------------------------------------
    @staticmethod
    def es_numero_entero(dato):
        if not dato:
            return False
        return dato.isdigit()

    @staticmethod
    def es_numero_double(dato):
        if not dato:
            return False
        punto = False
        for c in dato:
            if not c.isdigit():
                if c == '.' and not punto:
                    punto = True
                else:
                    return False
        return True

    @staticmethod
    def evaluar_numerico(dato, tipo):
        if tipo == 1:
            return ProductoIntegrador.es_numero_entero(dato)
        elif tipo == 2:
            return ProductoIntegrador.es_numero_double(dato)
        return False

    @staticmethod
    def leer_validado(texto, tipo):
        while True:
            entrada = ProductoIntegrador.dialogo(texto)
            if entrada is None:
                entrada = ""
            entrada = entrada.strip()
            if not entrada:
                ProductoIntegrador.mostrar_error("No se ingresó ningún dato. Intente de nuevo.")
                continue
            if not ProductoIntegrador.evaluar_numerico(entrada, tipo):
                ProductoIntegrador.mostrar_error("Debe ingresar un valor numérico " + ("entero." if tipo == 1 else "decimal."))
                continue
            return entrada

    # --------------------------------------------------------------
    # Carga de productos (20 productos)
    # --------------------------------------------------------------
    @staticmethod
    def cargar_productos():
        prod = [None] * 20
        prod[0] = ["001", "Espresso (1 taza)", "35.00", "50", "16"]
        prod[1] = ["002", "Latte (1 taza)", "45.00", "45", "16"]
        prod[2] = ["003", "Cappuccino (1 taza)", "45.00", "40", "16"]
        prod[3] = ["004", "Americano (1 taza)", "35.00", "55", "16"]
        prod[4] = ["005", "Mocha (1 taza)", "50.00", "35", "16"]
        prod[5] = ["006", "Frappé de Vainilla", "55.00", "30", "16"]
        prod[6] = ["007", "Frappé de Chocolate", "55.00", "30", "16"]
        prod[7] = ["008", "Té Chai (1 taza)", "40.00", "25", "16"]
        prod[8] = ["009", "Pastel de Zanahoria", "60.00", "20", "16"]
        prod[9] = ["010", "Croissant", "35.00", "30", "16"]
        prod[10] = ["011", "Galleta de Avena", "15.00", "40", "0"]
        prod[11] = ["012", "Bagel con Queso", "45.00", "20", "16"]
        prod[12] = ["013", "Agua Embotellada", "20.00", "60", "0"]
        prod[13] = ["014", "Refresco 355ml", "25.00", "50", "16"]
        prod[14] = ["015", "Ramen Queso Picante", "85.00", "25", "16"]
        prod[15] = ["016", "Ramen Cream Carbonara", "90.00", "20", "16"]
        prod[16] = ["017", "Ramen Kimchi", "80.00", "22", "16"]
        prod[17] = ["018", "Galleta Crispy", "12.00", "50", "0"]
        prod[18] = ["019", "Ramen Buldark", "95.00", "18", "16"]
        prod[19] = ["020", "Taro Frappe", "60.00", "30", "16"]
        return prod

    @staticmethod
    def mostrar_producto(vproducto):
        codigo = ProductoIntegrador.rellenar_espacios(vproducto[0], 5)
        nombre = ProductoIntegrador.rellenar_espacios(vproducto[1], 28)
        precio = ProductoIntegrador.rellenar_espacios(vproducto[2], 7)
        stock = ProductoIntegrador.rellenar_espacios(vproducto[3], 5)
        iva = ProductoIntegrador.rellenar_espacios(vproducto[4] + "%", 4)
        return f"| {codigo} | {nombre} | {precio} | {stock} | {iva} |"

    @staticmethod
    def mostrar_lista(vproductos):
        sb = []
        separador = "+-------+------------------------------+---------+-------+------+"
        sb.append(separador)
        sb.append("| Codigo| Nombre                       | Precio  | Stock | IVA  |")
        sb.append(separador)
        for p in vproductos:
            sb.append(ProductoIntegrador.mostrar_producto(p))
        sb.append(separador)
        return "\n".join(sb)

    @staticmethod
    def existe_producto(codigo, vproductos):
        for i, p in enumerate(vproductos):
            if p[0] == codigo.strip():
                return i
        return -1

    @staticmethod
    def modificar_producto(vproductos):
        ProductoIntegrador.mostrar_subtitulo("MODIFICAR PRECIO")
        print(ProductoIntegrador.mostrar_lista(vproductos))
        codigo = ProductoIntegrador.dialogo("Ingrese el codigo del producto a modificar")
        if not codigo or not codigo.strip():
            ProductoIntegrador.mostrar_error("Dato nulo")
            return
        pos = ProductoIntegrador.existe_producto(codigo.strip(), vproductos)
        if pos == -1:
            ProductoIntegrador.mostrar_error("No existe el codigo")
            return
        nuevo_precio = ProductoIntegrador.leer_validado("Nuevo precio de " + vproductos[pos][1], 2)
        vproductos[pos][2] = nuevo_precio
        ProductoIntegrador.mostrar_exito("Precio actualizado.")

    # --------------------------------------------------------------
    # Menú Productos
    # --------------------------------------------------------------
    @staticmethod
    def menu_productos(vproductos):
        opcion = ""
        while opcion != "3":
            ProductoIntegrador.mostrar_titulo("GESTION DE PRODUCTOS")
            print("1. Modificar precio")
            print("2. Listado de productos")
            print("3. Salir")
            ProductoIntegrador.linea_simple()
            opcion = ProductoIntegrador.dialogo("Opcion")
            if opcion is None:
                ProductoIntegrador.mostrar_error("Opcion incorrecta")
                continue
            if opcion == "1":
                ProductoIntegrador.modificar_producto(vproductos)
            elif opcion == "2":
                ProductoIntegrador.mostrar_subtitulo("LISTADO DE PRODUCTOS")
                print(ProductoIntegrador.mostrar_lista(vproductos))
            elif opcion == "3":
                ProductoIntegrador.mostrar_info("Saliendo del modulo productos...")
            else:
                ProductoIntegrador.mostrar_error("Opcion no valida")

    # --------------------------------------------------------------
    # Descontar Stock
    # --------------------------------------------------------------
    @staticmethod
    def descontar_stock(productos, codigo, cantidad):
        pos = ProductoIntegrador.existe_producto(codigo, productos)
        if pos == -1:
            return -2
        stock_actual = int(productos[pos][3])
        if stock_actual == 0:
            return 0
        if cantidad > stock_actual:
            return -1
        productos[pos][3] = str(stock_actual - cantidad)
        return 1

    # --------------------------------------------------------------
    # Punto de Venta (Ticket)
    # --------------------------------------------------------------
    @staticmethod
    def crear_ticket():
        return [None] * 20

    @staticmethod
    def crear_venta():
        return [None] * ProductoIntegrador.tamventas

    @staticmethod
    def existe_ticket_codigo(mticket, codigo):
        ult = ProductoIntegrador.obtener_ultima_posicion(mticket)
        for i in range(ult + 1):
            if mticket[i] is not None and mticket[i][0] is not None and mticket[i][0] == codigo.strip():
                return i
        return -1

    @staticmethod
    def insertar_producto_ticket(mticket, datos, tamticket):
        ult = ProductoIntegrador.obtener_ultima_posicion(mticket)
        pos = ProductoIntegrador.existe_ticket_codigo(mticket, datos[0])
        if pos != -1:
            cant_actual = int(mticket[pos][3])
            mticket[pos][3] = str(cant_actual + 1)
            return True
        if ult + 1 >= tamticket:
            return False
        nueva_pos = ult + 1
        mticket[nueva_pos] = [datos[0], datos[1], datos[2], datos[3]]
        return True

    @staticmethod
    def total_producto(precio, cantidad):
        return f"{float(precio) * float(cantidad):.2f}"

    @staticmethod
    def mostrar_producto_ticket(mticket, pos):
        cod = ProductoIntegrador.rellenar_espacios(mticket[pos][0], 5)
        nom = ProductoIntegrador.rellenar_espacios(mticket[pos][1], 28)
        pre = ProductoIntegrador.rellenar_espacios(mticket[pos][2], 7)
        cant = ProductoIntegrador.rellenar_espacios(mticket[pos][3], 4)
        total = ProductoIntegrador.rellenar_espacios(ProductoIntegrador.total_producto(mticket[pos][2], mticket[pos][3]), 8)
        return f"| {cod} | {nom} | {pre} | {cant} | {total} |"

    @staticmethod
    def mostrar_ticket(mticket):
        ult = ProductoIntegrador.obtener_ultima_posicion(mticket)
        if ult == -1:
            return "   [Ticket vacio]"
        sb = []
        separador = "+-------+------------------------------+---------+------+----------+"
        sb.append(separador)
        sb.append("| Codigo| Nombre                       | Precio  | Cant | Subtotal |")
        sb.append(separador)
        for i in range(ult + 1):
            sb.append(ProductoIntegrador.mostrar_producto_ticket(mticket, i))
        sb.append(separador)
        return "\n".join(sb)

    # --------------------------------------------------------------
    # Cálculo de IVA por producto
    # --------------------------------------------------------------
    @staticmethod
    def subtotal_ticket(mticket):
        sub = 0.0
        ult = ProductoIntegrador.obtener_ultima_posicion(mticket)
        for i in range(ult + 1):
            sub += float(ProductoIntegrador.total_producto(mticket[i][2], mticket[i][3]))
        return sub

    @staticmethod
    def iva_ticket(mticket, productos):
        iva_total = 0.0
        ult = ProductoIntegrador.obtener_ultima_posicion(mticket)
        for i in range(ult + 1):
            codigo = mticket[i][0]
            pos_prod = ProductoIntegrador.existe_producto(codigo, productos)
            if pos_prod == -1:
                continue
            iva_porc = float(productos[pos_prod][4])
            if iva_porc != 0:
                subtotal_linea = float(mticket[i][2]) * float(mticket[i][3])
                iva_total += subtotal_linea * (iva_porc / 100)
        return iva_total

    @staticmethod
    def total_ticket(mticket, productos):
        return ProductoIntegrador.subtotal_ticket(mticket) + ProductoIntegrador.iva_ticket(mticket, productos)

    @staticmethod
    def mostrar_ticket_venta(mticket, idticket, fecha, productos):
        ProductoIntegrador.linea_doble()
        print(f"Fecha: {fecha}   Ticket No.: {idticket}")
        ProductoIntegrador.linea_doble()
        print(ProductoIntegrador.mostrar_ticket(mticket))
        ProductoIntegrador.linea_simple()
        print(f"Subtotal: ${ProductoIntegrador.subtotal_ticket(mticket):.2f}")
        print(f"IVA (individual): ${ProductoIntegrador.iva_ticket(mticket, productos):.2f}")
        ProductoIntegrador.linea_simple()
        print(f"TOTAL A PAGAR: ${ProductoIntegrador.total_ticket(mticket, productos):.2f}")
        ProductoIntegrador.linea_doble()

    # --------------------------------------------------------------
    # Captura y eliminación de productos en ticket
    # --------------------------------------------------------------
    @staticmethod
    def captura_venta_producto(mticket, mproductos, tamticket):
        ProductoIntegrador.mostrar_subtitulo("AGREGAR PRODUCTO")
        print(ProductoIntegrador.mostrar_lista(mproductos))
        codigo = ProductoIntegrador.dialogo("Codigo del producto")
        if not codigo or not codigo.strip():
            ProductoIntegrador.mostrar_error("Dato nulo")
            return
        pos_prod = ProductoIntegrador.existe_producto(codigo.strip(), mproductos)
        if pos_prod == -1:
            ProductoIntegrador.mostrar_error("Codigo no existe.")
            return
        resultado = ProductoIntegrador.descontar_stock(mproductos, codigo.strip(), 1)
        if resultado == -2:
            ProductoIntegrador.mostrar_error("Producto no existe.")
        elif resultado == -1:
            ProductoIntegrador.mostrar_error("Cantidad insuficiente en stock.")
        elif resultado == 0:
            ProductoIntegrador.mostrar_error("Stock en cero.")
        elif resultado == 1:
            venta = [mproductos[pos_prod][0], mproductos[pos_prod][1], mproductos[pos_prod][2], "1"]
            if not ProductoIntegrador.insertar_producto_ticket(mticket, venta, tamticket):
                ProductoIntegrador.mostrar_error("Ticket lleno.")
            else:
                ProductoIntegrador.mostrar_exito("Agregado: " + mproductos[pos_prod][1])

    @staticmethod
    def remover_producto_ticket(mticket, pos):
        ult = ProductoIntegrador.obtener_ultima_posicion(mticket)
        for i in range(pos, ult):
            mticket[i] = mticket[i+1]
        mticket[ult] = None

    @staticmethod
    def eliminar_producto_ticket(mticket, pos):
        cant = int(mticket[pos][3])
        if cant > 1:
            mticket[pos][3] = str(cant - 1)
        else:
            ProductoIntegrador.remover_producto_ticket(mticket, pos)

    @staticmethod
    def eliminar(mticket, mproductos):
        ProductoIntegrador.mostrar_subtitulo("ELIMINAR PRODUCTO")
        print(ProductoIntegrador.mostrar_ticket(mticket))
        codigo = ProductoIntegrador.dialogo("Codigo del producto a eliminar")
        if not codigo or not codigo.strip():
            return
        pos_ticket = ProductoIntegrador.existe_ticket_codigo(mticket, codigo.strip())
        if pos_ticket == -1:
            ProductoIntegrador.mostrar_error("El producto no existe en el ticket.")
            return
        pos_prod = ProductoIntegrador.existe_producto(codigo.strip(), mproductos)
        if pos_prod != -1:
            cantidad_devuelta = int(mticket[pos_ticket][3])
            stock_actual = int(mproductos[pos_prod][3])
            mproductos[pos_prod][3] = str(stock_actual + cantidad_devuelta)
        ProductoIntegrador.eliminar_producto_ticket(mticket, pos_ticket)
        ProductoIntegrador.mostrar_exito("Producto eliminado del ticket.")

    # --------------------------------------------------------------
    # Cancelar Venta
    # --------------------------------------------------------------
    @staticmethod
    def devolucion_ticket(mticket, mproductos):
        ult = ProductoIntegrador.obtener_ultima_posicion(mticket)
        for i in range(ult + 1):
            codigo = mticket[i][0]
            pos_prod = ProductoIntegrador.existe_producto(codigo, mproductos)
            if pos_prod != -1:
                stock_actual = int(mproductos[pos_prod][3])
                cantidad_ticket = int(mticket[i][3])
                mproductos[pos_prod][3] = str(stock_actual + cantidad_ticket)

    @staticmethod
    def cancelar_venta(mticket, mproductos):
        ProductoIntegrador.devolucion_ticket(mticket, mproductos)
        for i in range(len(mticket)):
            mticket[i] = None
        ProductoIntegrador.mostrar_info("Venta cancelada. Inventario restaurado y ticket limpiado.")

    # --------------------------------------------------------------
    # Menú Punto de Venta
    # --------------------------------------------------------------
    @staticmethod
    def menu_punto_venta(ventas, idticket, productos):
        pago = False
        tam_ticket = 20
        ticket = ProductoIntegrador.crear_ticket()
        idticket = ProductoIntegrador.id_ticket_siguiente(idticket)
        fechadia = ProductoIntegrador.fecha()
        opcion = ""
        while opcion != "5":
            ProductoIntegrador.mostrar_titulo("PUNTO DE VENTA")
            print(f"Fecha: {fechadia}   Ticket: {idticket}")
            ProductoIntegrador.linea_simple()
            print(ProductoIntegrador.mostrar_ticket(ticket))
            ProductoIntegrador.linea_simple()
            print("1. Agregar producto")
            print("2. Eliminar producto")
            print("3. Ver ticket completo")
            print("4. Pagar")
            print("5. Salir (cancelar si no se pago)")
            ProductoIntegrador.linea_simple()
            opcion = ProductoIntegrador.dialogo("Opcion")
            if opcion is None:
                ProductoIntegrador.mostrar_error("Dato incorrecto")
                continue
            if opcion == "1":
                ProductoIntegrador.captura_venta_producto(ticket, productos, tam_ticket)
            elif opcion == "2":
                ProductoIntegrador.eliminar(ticket, productos)
            elif opcion == "3":
                ProductoIntegrador.mostrar_subtitulo("DETALLE DEL TICKET")
                print(ProductoIntegrador.mostrar_ticket(ticket))
            elif opcion == "4":
                ProductoIntegrador.mostrar_ticket_venta(ticket, idticket, fechadia, productos)
                pos_ventas = ProductoIntegrador.obtener_ultima_posicion(ventas)
                ult_ticket = ProductoIntegrador.obtener_ultima_posicion(ticket)
                for i in range(ult_ticket + 1):
                    pos_ventas += 1
                    ventas[pos_ventas] = [idticket, ticket[i][0], ticket[i][1], ticket[i][2], ticket[i][3]]
                pago = True
                ProductoIntegrador.mostrar_exito("Venta registrada.")
                opcion = "5"
            elif opcion == "5":
                if not pago:
                    ProductoIntegrador.mostrar_info("Venta no pagada. Cancelando...")
                    ProductoIntegrador.cancelar_venta(ticket, productos)
                else:
                    ProductoIntegrador.mostrar_info("Saliendo del punto de venta.")
            else:
                ProductoIntegrador.mostrar_error("Opcion no valida")

    # --------------------------------------------------------------
    # Menú Inventario
    # --------------------------------------------------------------
    @staticmethod
    def agregar_stock(vproductos):
        ProductoIntegrador.mostrar_subtitulo("AGREGAR STOCK")
        print(ProductoIntegrador.mostrar_lista(vproductos))
        codigo = ProductoIntegrador.dialogo("Codigo del producto")
        pos = ProductoIntegrador.existe_producto(codigo, vproductos)
        if pos == -1:
            ProductoIntegrador.mostrar_error("Codigo no existe")
            return
        cantidad_str = ProductoIntegrador.leer_validado("Cantidad a agregar a " + vproductos[pos][1], 1)
        cant_add = int(cantidad_str)
        stock_actual = int(vproductos[pos][3])
        vproductos[pos][3] = str(stock_actual + cant_add)
        ProductoIntegrador.mostrar_exito("Nuevo stock: " + vproductos[pos][3])

    @staticmethod
    def menu_inventario(vproductos):
        opcion = ""
        while opcion != "3":
            ProductoIntegrador.mostrar_titulo("INVENTARIO")
            print("1. Listado de inventario")
            print("2. Agregar stock")
            print("3. Salir")
            ProductoIntegrador.linea_simple()
            opcion = ProductoIntegrador.dialogo("Opcion")
            if opcion is None:
                ProductoIntegrador.mostrar_error("Opcion incorrecta")
                continue
            if opcion == "1":
                ProductoIntegrador.mostrar_subtitulo("INVENTARIO ACTUAL")
                print(ProductoIntegrador.mostrar_lista(vproductos))
            elif opcion == "2":
                ProductoIntegrador.agregar_stock(vproductos)
            elif opcion == "3":
                ProductoIntegrador.mostrar_info("Saliendo del inventario...")
            else:
                ProductoIntegrador.mostrar_error("Opcion no valida")

    # --------------------------------------------------------------
    # Listado de Ventas
    # --------------------------------------------------------------
    @staticmethod
    def mostrar_lista_ventas(ventas):
        ProductoIntegrador.mostrar_titulo("HISTORIAL DE VENTAS")
        ult = ProductoIntegrador.obtener_ultima_posicion(ventas)
        if ult == -1:
            ProductoIntegrador.mostrar_info("No hay ventas registradas.")
            return
        separador = "+----------+-------+-----------------------------+----------+----------+"
        print(separador)
        print("| ID Ticket| Codigo| Producto                    | Precio   | Cantidad |")
        print(separador)
        for i in range(ult + 1):
            id_ticket = ProductoIntegrador.rellenar_espacios(ventas[i][0], 8)
            codigo = ProductoIntegrador.rellenar_espacios(ventas[i][1], 5)
            producto = ProductoIntegrador.rellenar_espacios(ventas[i][2], 27)
            precio = ProductoIntegrador.rellenar_espacios(ventas[i][3], 8)
            cantidad = ProductoIntegrador.rellenar_espacios(ventas[i][4], 8)
            print(f"| {id_ticket} | {codigo} | {producto} | {precio} | {cantidad} |")
        print(separador)

    @staticmethod
    def obtener_ultimo_valor_ventas(ventas):
        ult = ProductoIntegrador.obtener_ultima_posicion(ventas)
        if ult == -1:
            return "000"
        return ventas[ult][0]

    # --------------------------------------------------------------
    # Menú Principal
    # --------------------------------------------------------------
    @staticmethod
    def menu_principal(vproductos, vventas):
        opcion = ""
        while opcion != "5":
            ProductoIntegrador.mostrar_titulo("       SHINGU COFFEE SHOP  ")
            print("1. Gestion de Productos")
            print("2. Punto de Venta")
            print("3. Inventario")
            print("4. Listado de Ventas")
            print("5. Salir")
            ProductoIntegrador.linea_simple()
            opcion = ProductoIntegrador.dialogo("Opcion")
            if opcion is None:
                ProductoIntegrador.mostrar_error("Opcion incorrecta")
                continue
            if opcion == "1":
                ProductoIntegrador.menu_productos(vproductos)
            elif opcion == "2":
                ProductoIntegrador.menu_punto_venta(vventas, ProductoIntegrador.obtener_ultimo_valor_ventas(vventas), vproductos)
            elif opcion == "3":
                ProductoIntegrador.menu_inventario(vproductos)
            elif opcion == "4":
                ProductoIntegrador.mostrar_lista_ventas(vventas)
            elif opcion == "5":
                ProductoIntegrador.mostrar_exito("Gracias por usar Shingu Coffee POS. Hasta luego!")
            else:
                ProductoIntegrador.mostrar_error("Opcion no existe")

    # --------------------------------------------------------------
    # Main
    # --------------------------------------------------------------
    @staticmethod
    def main():
        ProductoIntegrador.productos = ProductoIntegrador.cargar_productos()
        ProductoIntegrador.ventas = ProductoIntegrador.crear_venta()
        ProductoIntegrador.menu_principal(ProductoIntegrador.productos, ProductoIntegrador.ventas)

if __name__ == "__main__":
    ProductoIntegrador.main()
