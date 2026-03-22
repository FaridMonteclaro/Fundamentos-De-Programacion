Algoritmo Algoritmos_Avanzada_Rectangulo
	Definir x1,y1,x2,y2,px,py Como Real
	
	Escribir "Ingrese x1:"
	Leer x1
	Escribir "Ingrese y1:"
	Leer y1
	Escribir "Ingrese x2:"
	Leer x2
	Escribir "Ingrese y2:"
	Leer y2
	Escribir "Ingrese px:"
	Leer px
	Escribir "Ingrese py:"
	Leer py
	
	Si px>x1 Y px<x2 Y py>y1 Y py<y2 Entonces
		
		Si px=x1 O px=x2 O py=y1 O py=y2 Entonces
			Escribir "Borde"
		SiNo
			Escribir "Dentro"
		FinSi
		
	SiNo
		Escribir "Fuera"
	FinSi
	
FinAlgoritmo
