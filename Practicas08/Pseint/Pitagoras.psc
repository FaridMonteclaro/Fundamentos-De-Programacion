Algoritmo Algoritmos_Avanzada_Pitagoras
	Definir A,B,C Como Real
	
	Escribir "Ingrese A:"
	Leer A
	Escribir "Ingrese B:"
	Leer B
	Escribir "Ingrese C (mayor):"
	Leer C
	
	Si A^2 + B^2 = C^2 Entonces
		Escribir "Rectangulo"
	SiNo
		Si A^2 + B^2 > C^2 Entonces
			Escribir "Acutangulo"
		SiNo
			Escribir "Obtusangulo"
		FinSi
	FinSi
	
FinAlgoritmo
