Algoritmo SubConjuntos
	Definir n, k, i Como Entero
	Definir letras Como Cadena
	Definir actual Como Cadena
	Escribir "Ingresa N y K: "
	Leer n, k
	
	Dimension letras[n]
	
	Para i <- 0 Hasta n - 1 Hacer
		Leer letras[i]
	FinPara
	
	actual <- ""
	
	GenerarSubconjuntos(letras, n, k, 0, 0, actual)
FinAlgoritmo

SubProceso GenerarSubconjuntos(letras Por Referencia, n, k, inicio, nivel, actual)
	Definir i, limite Como Entero
	
	Si nivel = k Entonces
		Escribir actual
	SiNo
		limite <- n - (k - nivel)
		
		Para i <- inicio Hasta limite Hacer
			GenerarSubconjuntos(letras, n, k, i + 1, nivel + 1, actual + letras[i])
		FinPara
	FinSi
FinSubProceso
