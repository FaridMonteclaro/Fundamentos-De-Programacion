Algoritmo NotasAlumnos
	Definir nota, aprobados, suspensos, condicionados Como Entero
	Definir i Como Entero
	
	aprobados <- 0
	suspensos <- 0
	condicionados <- 0
	
	Para i <- 1 Hasta 6 Hacer
		Escribir "Introduce nota entre 0 y 10: "
		Leer nota
		
		Si nota = 4 Entonces
			condicionados <- condicionados + 1
		SiNo
			Si nota >= 5 Entonces
				aprobados <- aprobados + 1
			SiNo
				suspensos <- suspensos + 1
			FinSi
		FinSi
	FinPara
	
	Escribir "Aprobados: ", aprobados
	Escribir "Suspensos: ", suspensos
	Escribir "Condicionados: ", condicionados
	
FinAlgoritmo
