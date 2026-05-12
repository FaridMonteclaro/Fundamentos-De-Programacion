Algoritmo PuntosCercanos
	Definir n, i, j Como Entero
	Definir dx, dy, dist, minDist Como Entero
	Definir x, ye Como Entero
	
	Escribir "Ingresa la cantidad de puntos: "
	Leer n
	
	Dimension x[n]
	Dimension ye[n]
	
	Para i <- 0 Hasta n - 1 Hacer
		Escribir "Ingresa x y y del punto ", i + 1, ": "
		Leer x[i], ye[i]
	FinPara
	
	minDist <- 999999999
	
	Para i <- 0 Hasta n - 2 Hacer
		Para j <- i + 1 Hasta n - 1 Hacer
			dx <- x[j] - x[i]
			dy <- ye[j] - ye[i]
			dist <- dx * dx + dy * dy
			
			Si dist < minDist Entonces
				minDist <- dist
			FinSi
		FinPara
	FinPara
	
	Escribir "La distancia euclidiana al cuadrado minima es: ", minDist
FinAlgoritmo
