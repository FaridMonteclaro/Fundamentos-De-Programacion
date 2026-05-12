Algoritmo SumaCombinaciones
	Definir n, i, j, k, contador Como Entero
	Definir suma Como Entero
	Definir a Como Entero
	
	Escribir "Ingresa la cantidad de numeros: "
	Leer n
	
	Dimension a[n]
	
	Para i <- 0 Hasta n - 1 Hacer
		Escribir "Ingresa el numero ", i + 1, ": "
		Leer a[i]
	FinPara
	
	contador <- 0
	
	Para i <- 0 Hasta n - 3 Hacer
		Para j <- i + 1 Hasta n - 2 Hacer
			Para k <- j + 1 Hasta n - 1 Hacer
				suma <- a[i] + a[j] + a[k]
				
				Si suma MOD 3 = 0 Entonces
					contador <- contador + 1
				FinSi
			FinPara
		FinPara
	FinPara
	
	Escribir "Numero total de tripletes: ", contador
FinAlgoritmo
