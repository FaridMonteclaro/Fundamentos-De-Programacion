lgoritmo Algoritmos_Avanzada_Medallas
	Definir n1,n2,n3,prom Como Real
	
	Escribir "Nota 1:"
	Leer n1
	Escribir "Nota 2:"
	Leer n2
	Escribir "Nota 3:"
	Leer n3
	
	prom = (n1+n2+n3)/3
	
	Si prom>90 Y (n1=100 O n2=100 O n3=100) Entonces
		Escribir "Oro con Honores"
	SiNo
		Si prom>90 Entonces
			Escribir "Oro"
		SiNo
			Si prom>=80 Entonces
				Escribir "Plata"
			SiNo
				Escribir "Sin medalla"
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
