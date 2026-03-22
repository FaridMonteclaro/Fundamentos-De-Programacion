Algoritmo TareasIF_Ciberseguridad_ClaseIP
	
	Definir octeto Como Entero
	
	Escribir "Ingrese el primer octeto:"
	Leer octeto
	
	Si octeto >= 1 Y octeto <= 127 Entonces
		Si octeto = 10 Entonces
			Escribir "Clase A - Privada"
		SiNo
			Escribir "Clase A - Publica"
		FinSi
		
	SiNo
		Si octeto >= 128 Y octeto <= 191 Entonces
			Si octeto = 172 Entonces
				Escribir "Clase B - Privada"
			SiNo
				Escribir "Clase B - Publica"
			FinSi
			
		SiNo
			Si octeto >= 192 Y octeto <= 223 Entonces
				Si octeto = 192 Entonces
					Escribir "Clase C - Privada"
				SiNo
					Escribir "Clase C - Publica"
				FinSi
			SiNo
				Escribir "Fuera de rango"
			FinSi
		FinSi
	FinSi
FinAlgoritmo
