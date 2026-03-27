Proceso Examen_Fundamentos_Unidad03_ArqueoCaja
	
	Definir fondoInicial    Como Real
	Definir totalVentas     Como Real
	Definir totalGastos     Como Real
	Definir efectivoReal    Como Real
	Definir opcion          Como Entero
	Definir textoBruto      Como Caracter
	
	fondoInicial  <- 0
	totalVentas   <- 0
	totalGastos   <- 0
	efectivoReal  <- 0
	
	Repetir
		MostrarMenu(opcion)
		
		Segun opcion Hacer
			1:
				Escribir "---------------------------"
				Escribir "-- Fondo de Caja Inicial --"
				Escribir "----------------------------"
				Repetir
					Escribir "Ingrese el monto del fondo inicial: "
					Leer textoBruto
					Si No ValidarNumero(textoBruto) Entonces
						Escribir "Entrada invalida. Solo numeros. Intente de nuevo."
					FinSi
				Hasta Que ValidarNumero(textoBruto)
				fondoInicial <- ConvertirANumero(textoBruto)
				Escribir "Fondo inicial registrado: $", fondoInicial
				Escribir ""
				
			2:
				RegistrarMovimientos("Ventas", totalVentas)
				
			3:
				RegistrarMovimientos("Gastos", totalGastos)
				
			4:
				Escribir "----------------------------"
				Escribir "-- Efectivo Real en Cajon --"
				Escribir "----------------------------"
				
				Repetir
					Escribir "Ingrese el efectivo fisico en el cajon: "
					Leer textoBruto
					Si No ValidarNumero(textoBruto) Entonces
						Escribir "Entrada invalida. Solo numeros. Intente de nuevo."
					FinSi
				Hasta Que ValidarNumero(textoBruto)
				efectivoReal <- ConvertirANumero(textoBruto)
				CalcularCorte(fondoInicial, totalVentas, totalGastos, efectivoReal)
				
			5:
				Escribir "Cerrando el sistema... Hasta luego!"
				
			De Otro Modo:
				
				Escribir "Opcion no valida. Seleccione del 1 al 5."
		FinSegun
		
	Hasta Que opcion = 5
	
FinProceso

SubProceso MostrarMenu(opcSalida Por Referencia)
	Definir textoBruto Como Caracter
	Definir opcValida  Como Logico
	Definir numOpcion  Como Real
	
	opcValida <- Falso
	
	Escribir "================================="
	Escribir "=== SISTEMA DE ARQUEO DE CAJA ==="
	Escribir "================================="
	Escribir "1. Ingresar Fondo de Caja Inicial"
	Escribir "2. Registrar Ventas del Turno"
	Escribir "3. Registrar Gastos / Retiros"
	Escribir "4. Realizar Corte de Caja"
	Escribir "5. Salir del Sistema"
	Repetir
		Escribir "======================="
		Escribir "Seleccione una opcion: "
		Escribir "======================="
		Leer textoBruto
		Si ValidarNumero(textoBruto) Entonces
			numOpcion <- ConvertirANumero(textoBruto)
			Si numOpcion >= 1 Y numOpcion <= 5 Entonces
				opcSalida <- numOpcion
				opcValida <- Verdadero
			SiNo
				Escribir "Opcion fuera de rango (1-5). Intente de nuevo."
			FinSi
		SiNo
			Escribir "Entrada invalida. Ingrese un numero del 1 al 5."
		FinSi
	Hasta Que opcValida
	
FinSubProceso


Funcion resultado <- ValidarNumero(texto)
	Definir resultado Como Logico
	Definir numero    Como Real
	Definir largo     Como Entero
	
	largo <- Longitud(texto)
	
	Si largo = 0 Entonces
		resultado <- Falso
	SiNo
		numero <- ConvertirANumero(texto)
		Si numero = 0 Y texto <> "0" Y texto <> "0.0" Y texto <> "00" Entonces
			resultado <- Falso
		SiNo
			Si numero >= 0 Entonces
				resultado <- Verdadero
			SiNo
				resultado <- Falso
			FinSi
		FinSi
	FinSi
	
FinFuncion

SubProceso RegistrarMovimientos(tipoMovimiento, totalAcumulado Por Referencia)
	Definir textoBruto      Como Caracter
	Definir cantMovimientos Como Entero
	Definir i               Como Entero
	Definir montoActual     Como Real
	
	totalAcumulado <- 0
	
	Escribir "----------------------"
	Escribir "-- Registrar ", tipoMovimiento, " --"
	
	Repetir
		Escribir "Cuantos movimientos de ", tipoMovimiento, " desea ingresar? "
		Leer textoBruto
		Si No ValidarNumero(textoBruto) Entonces
			Escribir "Entrada invalida. Ingrese un numero entero."
		FinSi
	Hasta Que ValidarNumero(textoBruto)
	
	cantMovimientos <- ConvertirANumero(textoBruto)
	
	Si cantMovimientos = 0 Entonces
		Escribir "Sin movimientos de ", tipoMovimiento, ". Total: $0"
	SiNo
		Para i <- 1 Hasta cantMovimientos Con Paso 1 Hacer
			Repetir
				Escribir "  Monto del movimiento ", i, ": $"
				Leer textoBruto
				Si No ValidarNumero(textoBruto) Entonces
					Escribir "  Entrada invalida. Solo numeros. Intente de nuevo."
				FinSi
			Hasta Que ValidarNumero(textoBruto)
			montoActual    <- ConvertirANumero(textoBruto)
			totalAcumulado <- totalAcumulado + montoActual
		FinPara
		Escribir "Total de ", tipoMovimiento, ": $", totalAcumulado
	FinSi
	Escribir ""
	
FinSubProceso


SubProceso CalcularCorte(fondoInicial, totalVentas, totalGastos, efectivoReal)
	Definir teoricoEnCaja Como Real
	Definir diferencia    Como Real
	
	teoricoEnCaja <- (fondoInicial + totalVentas) - totalGastos
	diferencia    <- efectivoReal - teoricoEnCaja
	
	Escribir "============================"
	Escribir "=== RESULTADO DEL ARQUEO ==="
	Escribir "Fondo Inicial  : $", fondoInicial
	Escribir "Total Ventas   : $", totalVentas
	Escribir "Total Gastos   : $", totalGastos
	Escribir "Teorico en Caja: $", teoricoEnCaja
	Escribir "Efectivo Real  : $", efectivoReal
	Escribir "============================"
	
	Si diferencia < 0 Entonces
		Escribir "RESULTADO: FALTANTE"
		Escribir "Diferencia: $", diferencia * (-1)
	SiNo
		Si diferencia > 0 Entonces
			Escribir "RESULTADO: SOBRANTE"
			Escribir "Diferencia: +$", diferencia
		SiNo
			Escribir "RESULTADO: CUADRADO"
			Escribir "Diferencia: $0"
		FinSi
	FinSi
FinSubProceso
