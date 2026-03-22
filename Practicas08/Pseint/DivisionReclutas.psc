Algoritmo Ejercicios_IF_DivisionReclutas
	Definir edad, fuerza Como Entero
	Definir vision Como Real
	
	Escribir "Ingrese edad:"
	Leer edad
	Escribir "Ingrese fuerza (0-100):"
	Leer fuerza
	Escribir "Ingrese vision (0.0-1.0):"
	Leer vision
	
	Si edad>=18 Y edad<=25 Entonces
		Si fuerza>80 Y vision>=0.8 Entonces
			Escribir "Fuerzas Especiales"
		SiNo
			Si fuerza>50 Entonces
				Escribir "Infanteria"
			SiNo
				Escribir "No apto"
			FinSi
		FinSi
	SiNo
		Si edad>25 Y vision>=0.9 Entonces
			Escribir "Estratega"
		SiNo
			Escribir "No apto"
		FinSi
	FinSi
	
FinAlgoritmo
