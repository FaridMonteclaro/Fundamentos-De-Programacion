Algoritmo Permutaciones
	Definir cadena Como Cadena
	Definir n, i Como Entero
	Definir actual Como Cadena
	Definir letras Como Cadena
	Definir usado Como Entero
	
	Escribir "Ingresa la cadena: "
	Leer cadena
	
	n <- Longitud(cadena)
	
	Dimension usado[n]
	Dimension letras[n]
	
	Para i <- 0 Hasta n - 1 Hacer
		letras[i] <- Subcadena(cadena, i, i)
		usado[i] <- 0
	FinPara
	
	OrdenarLetras(letras, n)
	actual <- ""
	
	GenerarPermutaciones(letras, usado, n, actual, 0)
FinAlgoritmo

SubProceso OrdenarLetras(letras Por Referencia, n)
	Definir i, j Como Entero
	Definir aux Como Cadena
	
	Para i <- 0 Hasta n - 2 Hacer
		Para j <- i + 1 Hasta n - 1 Hacer
			Si letras[i] > letras[j] Entonces
				aux <- letras[i]
				letras[i] <- letras[j]
				letras[j] <- aux

			FinSi
		FinPara
	FinPara
FinSubProceso

SubProceso GenerarPermutaciones(letras Por Referencia, usado Por Referencia, n, actual, nivel)
	Definir i Como Entero
	
	Si nivel = n Entonces
		Escribir actual

	SiNo
		Para i <- 0 Hasta n - 1 Hacer
			Si usado[i] = 0 Entonces
				Si i > 0 Y letras[i] = letras[i - 1] Y usado[i - 1] = 0 Entonces
					Escribir " "
				SiNo
					usado[i] <- 1
					GenerarPermutaciones(letras, usado, n, actual + letras[i], nivel + 1)
					usado[i] <- 0

				FinSi
			FinSi
		FinPara
	FinSi
FinSubProceso
