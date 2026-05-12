Algoritmo Frecuencias
	Definir cadena Como Cadena
	Definir i, j, maxFrecuencia, indiceMax, frecuencias Como Entero
	Definir letraMax, letras Como Cadena
	
	Dimension frecuencias[26]
	Dimension letras[26]
	Escribir " Ingresa una cadena: "
	letras[0] <- "a"
	letras[1] <- "b"
	letras[2] <- "c"
	letras[3] <- "d"
	letras[4] <- "e"
	letras[5] <- "f"
	letras[6] <- "g"
	letras[7] <- "h"
	letras[8] <- "i"
	letras[9] <- "j"
	letras[10] <- "k"
	letras[11] <- "l"
	letras[12] <- "m"
	letras[13] <- "n"
	letras[14] <- "o"
	letras[15] <- "p"
	letras[16] <- "q"
	letras[17] <- "r"
	letras[18] <- "s"
	letras[19] <- "t"
	letras[20] <- "u"
	letras[21] <- "v"
	letras[22] <- "w"
	letras[23] <- "x"
	letras[24] <- "y"
	letras[25] <- "z"
	
	Leer cadena

	Para i <- 0 Hasta 25 Hacer
		frecuencias[i] <- 0
	FinPara
	
	Para i <- 0 Hasta Longitud(cadena) - 1 Hacer
		Para j <- 0 Hasta 25 Hacer
			Si Subcadena(cadena, i, i) = letras[j] Entonces
				frecuencias[j] <- frecuencias[j] + 1
			FinSi
		FinPara
	FinPara
	
	maxFrecuencia <- frecuencias[0]
	indiceMax <- 0
	
	Para i <- 1 Hasta 25 Hacer
		Si frecuencias[i] > maxFrecuencia Entonces
			maxFrecuencia <- frecuencias[i]
			indiceMax <- i
		FinSi
	FinPara
	
	letraMax <- letras[indiceMax]
	
	Escribir letraMax, " ", maxFrecuencia
FinAlgoritmo
