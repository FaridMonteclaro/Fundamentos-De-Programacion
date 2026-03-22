Algoritmo Ejercicios_IF_Caballo
	Definir x1,y1,x2,y2,dx,dy Como Entero
	
	Escribir "Ingrese x1:"
	Leer x1
	Escribir "Ingrese y1:"
	Leer y1
	Escribir "Ingrese x2:"
	Leer x2
	Escribir "Ingrese y2:"
	Leer y2
	
	dx = Abs(x2 - x1)
	dy = Abs(y2 - y1)
	
	Si (dx=2 Y dy=1) O (dx=1 Y dy=2) Entonces
		Escribir "Movimiento Valido"
	SiNo
		Escribir "Invalido"
	FinSi
	
FinAlgoritmo
