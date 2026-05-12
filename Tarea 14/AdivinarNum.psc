Algoritmo AdivinarNum
	Definir n, num Como Entero
	
	Escribir "Introduce el numero secreto: "
	Leer n
	
	Escribir "Introduce un numero: "
	Leer num
	
	Mientras num <> n Hacer
		
		Si num < n Entonces
			Escribir "Mayor"
		SiNo
			Escribir "Menor"
		FinSi
		
		Escribir "Introduce otro numero: "
		Leer num
		
	FinMientras
	
	Escribir "¡Acertaste!"
FinAlgoritmo
