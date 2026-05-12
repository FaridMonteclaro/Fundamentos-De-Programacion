Algoritmo ExisteSuspenso
	Definir nota Como Entero
	Definir suspenso Como Logico
	Definir i Como Entero
	
	suspenso <- Falso
	
	Para i <- 1 Hasta 5 Hacer
		Escribir "Introduce nota (0 a 10): "
		Leer nota
		
		Si nota < 5 Entonces
			suspenso <- Verdadero
		FinSi
	FinPara
	
	Si suspenso Entonces
		Escribir "Hay alumnos suspensos"
	SiNo
		Escribir "No hay suspensos"
	FinSi
	
FinAlgoritmo
