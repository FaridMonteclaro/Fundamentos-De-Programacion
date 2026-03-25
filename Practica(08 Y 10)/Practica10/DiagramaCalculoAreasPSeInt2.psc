Algoritmo CalculoAreasPSeInt2
	Definir opcion Como Caracter
	Repetir
		MostrarMenu()
		Leer Opcion
		opcion = Mayuscula(opcion)
		Según opcion Hacer
			'c':
				Circulo()
			't':
				Triangulo()
			's':
				Escribir 'Saliendo del programa.'
			De Otro Modo:
				Escribir 'opcion invalida.'
		FinSegún
	Hasta Que (opcion='s') O (opcion='S')
FinAlgoritmo
