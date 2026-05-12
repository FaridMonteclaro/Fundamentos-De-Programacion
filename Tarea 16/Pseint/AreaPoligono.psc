Algoritmo AreaPoligono
	Definir n, i, siguiente Como Entero
	Definir suma1, suma2, area Como Real
	Definir x, ye Como Entero
	
	Escribir "Ingresa la cantidad de vertices: "
	Leer n
	
	Dimension x[n]
	Dimension ye[n]
	
	Para i <- 0 Hasta n - 1 Hacer
		Escribir "Ingresa x y y del vertice ", i + 1, ": "
		Leer x[i], ye[i]
	FinPara
	
	suma1 <- 0
	suma2 <- 0
	
	Para i <- 0 Hasta n - 1 Hacer
		Si i = n - 1 Entonces
			siguiente <- 0
		SiNo
			siguiente <- i + 1
		FinSi
		
		suma1 <- suma1 + (x[i] * ye[siguiente])
		suma2 <- suma2 + (ye[i] * x[siguiente])
	FinPara
	
	area <- Abs(suma1 - suma2) / 2
	
	Escribir "El area del poligono es: ", area
FinAlgoritmo
