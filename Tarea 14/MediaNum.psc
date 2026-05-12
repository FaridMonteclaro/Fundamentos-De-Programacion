Algoritmo MediaNum
	Definir num, suma, elementos Como Entero
	Definir media Como Real
	
	suma <- 0
	elementos <- 0
	
	Escribir "Introduce un numero: "
	Leer num
	
	Mientras num >= 0 Hacer
		
		suma <- suma + num
		elementos <- elementos + 1
		
		Escribir "Introduce otro numero: "
		Leer num
		
	FinMientras
	
	Si elementos = 0 Entonces
		Escribir "No es posible calcular la media."
	SiNo
		media <- suma / elementos
		Escribir "La media es: ", media
	FinSi
	
FinAlgoritmo
