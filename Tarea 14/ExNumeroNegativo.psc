Algoritmo ExNumeroNegativo
	Definir num Como Entero
	Definir hay_negativo Como Logico
	Definir i Como Entero
	
	hay_negativo <- Falso
	
	Para i <- 1 Hasta 10 Hacer
		Escribir "Introduce numero: "
		Leer num
		
		Si num < 0 Entonces
			hay_negativo <- Verdadero
		FinSi
	FinPara
	
	Si hay_negativo Entonces
		Escribir "Se ha introducido algun numero negativo"
	SiNo
		Escribir "No hay ningun numero negativo"
	FinSi
	
FinAlgoritmo
