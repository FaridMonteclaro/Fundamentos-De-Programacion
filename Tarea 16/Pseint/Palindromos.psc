Algoritmo Palindromos
	Definir n, i Como Entero
	Definir cadena Como Cadena
	Escribir "Ingresa la cantidad de cadenas: "
	Leer n
	
	Para i <- 1 Hasta n Hacer
		Leer cadena
		
		Si EsPalindromo(cadena) Entonces
			Escribir "SI"
		SiNo
			Escribir "NO"
		FinSi
	FinPara
FinAlgoritmo

Funcion resultado <- EsPalindromo(cadena)
	Definir resultado Como Logico
	Definir i, j Como Entero
	
	resultado <- Verdadero
	j <- Longitud(cadena) - 1
	
	Para i <- 0 Hasta Longitud(cadena) / 2 - 1 Hacer
		Si Subcadena(cadena, i, i) <> Subcadena(cadena, j, j) Entonces
			resultado <- Falso
		FinSi
		j <- j - 1
	FinPara
FinFuncion
