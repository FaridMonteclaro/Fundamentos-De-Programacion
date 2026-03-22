Algoritmo TareasIF_Ciberseguridad_QoS
	
	Definir tipo Como Cadena
	Definir latencia Como Entero
	
	Escribir "Tipo de trafico (Voz/Video/Descarga):"
	Leer tipo
	
	Escribir "Latencia en ms:"
	Leer latencia
	
	Si tipo = "Voz" O tipo = "Video" Entonces
		Si latencia < 50 Entonces
			Escribir "Prioridad Alta"
		SiNo
			Escribir "Prioridad Media"
		FinSi
	SiNo
		Si tipo = "Descarga" Entonces
			Si latencia < 150 Entonces
				Escribir "Prioridad Baja"
			SiNo
				Escribir "Prioridad Minima"
			FinSi
		SiNo
			Escribir "Tipo no reconocido"
		FinSi
	FinSi
	
FinAlgoritmo
