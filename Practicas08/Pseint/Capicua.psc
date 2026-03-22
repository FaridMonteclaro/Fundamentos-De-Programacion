Algoritmo Capicua
	Definir num,d1,d2,d3,d4 Como Entero
	
	Escribir "Ingrese numero de 4 cifras:"
	Leer num
	
	d1 = num / 1000
	d2 = (num / 100) MOD 10
	d3 = (num / 10) MOD 10
	d4 = num MOD 10
	
	Si d1=d4 Y d2=d3 Entonces
		Escribir "Es Capicua"
	SiNo
		Escribir "No lo es"
	FinSi
FinAlgoritmo
