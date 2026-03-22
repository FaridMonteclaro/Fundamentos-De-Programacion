Algoritmo Algoritmos_Avanzada_Clima
	Definir temp,hum Como Real
	
	Escribir "Temperatura:"
	Leer temp
	Escribir "Humedad:"
	Leer hum
	
	Si temp>30 Y hum>80 Entonces
		Escribir "Sofocante"
	SiNo
		Si temp<15 Y hum>80 Entonces
			Escribir "Frio Humedo"
		SiNo
			Escribir "Clima Normal"
		FinSi
	FinSi
	
FinAlgoritmo
