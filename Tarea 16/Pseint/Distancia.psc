Algoritmo Distancia
	Definir cadena1, cadena2 Como Cadena
	Definir i, j, costo, n, m Como Entero
	Definir dp Como Entero
	
	Escribir "Ingresa la primera cadena: "
	Leer cadena1
	
	Escribir "Ingresa la segunda cadena: "
	Leer cadena2
	
	n <- Longitud(cadena1)
	m <- Longitud(cadena2)
	
	Dimension dp[n + 1, m + 1]
	
	Para i <- 0 Hasta n Hacer
		dp[i, 0] <- i
	FinPara
	
	Para j <- 0 Hasta m Hacer
		dp[0, j] <- j
	FinPara
	
	Para i <- 1 Hasta n Hacer
		Para j <- 1 Hasta m Hacer
			Si Subcadena(cadena1, i - 1, i - 1) = Subcadena(cadena2, j - 1, j - 1) Entonces
				costo <- 0
			SiNo
				costo <- 1
			FinSi
			
			dp[i, j] <- MinimoDeTres(dp[i - 1, j] + 1, dp[i, j - 1] + 1, dp[i - 1, j - 1] + costo)
		FinPara
	FinPara
	
	Escribir "La distancia es: ", dp[n, m]
FinAlgoritmo


Funcion menor <- MinimoDeTres(a, b, c)
	Definir menor Como Entero
	
	menor <- a
	
	Si b < menor Entonces
		menor <- b
	FinSi
	
	Si c < menor Entonces
		menor <- c
	FinSi
FinFuncion
