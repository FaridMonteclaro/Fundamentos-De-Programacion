Algoritmo Anagramas
	Definir n, i, j Como Entero
	Definir palabras, clave Como Cadena
	Definir usada Como Logico
	Escribir "Ingresa un numero N:"
	Leer n
	
	Dimension palabras[n]
	Dimension usada[n]
	
	Para i <- 0 Hasta n - 1 Hacer
		Leer palabras[i]
		usada[i] <- Falso
	FinPara
	
	Para i <- 0 Hasta n - 1 Hacer
		Si NO usada[i] Entonces
			clave <- Ordenar(palabras[i])
			
			Para j <- i Hasta n - 1 Hacer
				Si NO usada[j] Entonces
					Si Ordenar(palabras[j]) = clave Entonces
						Escribir Sin Saltar palabras[j], " "
						usada[j] <- Verdadero
					FinSi
				FinSi
			FinPara
			
			Escribir ""
		FinSi
	FinPara
FinAlgoritmo

Funcion res <- Ordenar(palabra)
	Definir i, j Como Entero
	Definir letras, aux Como Cadena
	Definir res como Cadena
	
	Dimension letras[Longitud(palabra)]
	
	Para i <- 0 Hasta Longitud(palabra)-1 Hacer
		letras[i] <- Subcadena(palabra, i, i)
	FinPara
	
	Para i <- 0 Hasta Longitud(palabra)-2 Hacer
		Para j <- i+1 Hasta Longitud(palabra)-1 Hacer
			Si letras[i] > letras[j] Entonces
				aux <- letras[i]
				letras[i] <- letras[j]
				letras[j] <- aux
			FinSi
		FinPara
	FinPara
	
	res <- ""
	Para i <- 0 Hasta Longitud(palabra)-1 Hacer
		res <- res + letras[i]
	FinPara
FinFuncion
