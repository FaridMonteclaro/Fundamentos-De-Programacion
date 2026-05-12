Algoritmo FactorNumero
	Definir num, i Como Entero
	Definir factorial Como Entero
	
	Escribir "Introduce un numero: "
	Leer num
	
	factorial <- 1
	
	Para i <- num Hasta 1 Con Paso -1 Hacer
		factorial <- factorial * i
	FinPara
	
	Escribir "El factorial de ", num, " es: ", factorial
FinAlgoritmo
