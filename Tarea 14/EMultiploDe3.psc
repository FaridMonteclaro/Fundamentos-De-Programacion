Algoritmo EMultiploDe3
	Definir num Como Entero
	Definir multiplo3 Como Logico
	Definir i Como Entero
	
	multiplo3 <- Falso
	
	Para i <- 1 Hasta 5 Hacer
		Escribir "Introduce numero: "
		Leer num
		
		Si num % 3 = 0 Entonces
			multiplo3 <- Verdadero
		FinSi
	FinPara
	
	Si multiplo3 Entonces
		Escribir "Hay multiplos de 3"
	SiNo
		Escribir "No existen multiplos de 3"
	FinSi
	
FinAlgoritmo
