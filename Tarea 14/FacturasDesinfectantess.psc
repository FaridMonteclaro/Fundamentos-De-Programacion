Algoritmo FacturasDesinfectantess
	Definir i, codigo, facturas_mas600 Como Entero
	Definir litros, precio, importe, facturacion_total, litros_art1 Como Real
	
	facturacion_total <- 0
	litros_art1 <- 0
	facturas_mas600 <- 0
	
	Para i <- 1 Hasta 5 Hacer
		Escribir "Factura ", i
		
		Escribir "Codigo de producto: "
		Leer codigo
		
		Escribir "Cantidad (litros): "
		Leer litros
		
		Escribir "Precio (por litro): "
		Leer precio
		
		importe <- litros * precio
		facturacion_total <- facturacion_total + importe
		
		Si codigo = 1 Entonces
			litros_art1 <- litros_art1 + litros
		FinSi
		
		Si importe >= 600 Entonces
			facturas_mas600 <- facturas_mas600 + 1
		FinSi
	FinPara
	
	Escribir ""
	Escribir "Resumen de ventas"
	Escribir "La facturacion total es de: ", facturacion_total
	Escribir "Litros del articulo 1: ", litros_art1
	Escribir "Facturas superiores a 600: ", facturas_mas600
	
FinAlgoritmo
