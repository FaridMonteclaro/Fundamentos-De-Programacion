Algoritmo TareasIF_Ciberseguridad_Sensores
	
	Definir a,b,c,prom Como Real
	
	Escribir "Lectura 1:"
	Leer a
	
	Escribir "Lectura 2:"
	Leer b
	
	Escribir "Lectura 3:"
	Leer c
	
	Si Abs(a-b) > 20 O Abs(a-c) > 20 O Abs(b-c) > 20 Entonces
		Escribir "Error de Sensor"
	SiNo
		prom = (a+b+c)/3
		
		Si prom > 80 Entonces
			Escribir "Alerta de Incendio"
		SiNo
			Si prom > 60 Entonces
				Escribir "Alerta de Sobrecalentamiento"
			SiNo
				Escribir "Estado Normal"
			FinSi
		FinSi
	FinSi
FinAlgoritmo
