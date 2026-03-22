Algoritmo Algoritmos_Avanzada_Circulos
	Definir x1,y1,x2,y2,r1,r2,dist2,suma2 Como Real
	
	Escribir "Ingrese x1:"
	Leer x1
	Escribir "Ingrese y1:"
	Leer y1
	Escribir "Ingrese r1:"
	Leer r1
	
	Escribir "Ingrese x2:"
	Leer x2
	Escribir "Ingrese y2:"
	Leer y2
	Escribir "Ingrese r2:"
	Leer r2
	
	dist2 = (x2-x1)^2 + (y2-y1)^2
	suma2 = (r1+r2)^2
	
	Si dist2 < suma2 Entonces
		Escribir "Traslapan"
	SiNo
		Si dist2 = suma2 Entonces
			Escribir "Tangentes"
		SiNo
			Escribir "No se tocan"
		FinSi
	FinSi
	
FinAlgoritmo
