Algoritmo Contador
	Definir num, contador Como Entero
	
	contador <- 0
	
	Escribir "Introduce un numero: "
	Leer num
	
	Mientras num >= 0 Hacer
		
		contador <- contador + 1
		
		Escribir "Introduce otro numero: "
		Leer num
		
	FinMientras
	
	Escribir "Se han introducido ", contador, " numeros."
FinAlgoritmo
