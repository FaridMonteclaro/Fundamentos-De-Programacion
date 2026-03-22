Algoritmo TareasIF_Ciberseguridad_DireccionesIP_02
	
	Definir octeto Como Entero
	
	Escribir "Ingrese el primer octeto (0-255):"
	Leer octeto
	
	Si octeto = 127 Entonces
		Escribir "Direccion de Loopback"
	SiNo
		Si octeto >= 1 Y octeto <= 126 Entonces
			Escribir "Clase A"
		SiNo
			Si octeto >= 128 Y octeto <= 191 Entonces
				Escribir "Clase B"
			SiNo
				Si octeto >= 192 Y octeto <= 223 Entonces
					Escribir "Clase C"
				SiNo
					Escribir "Clase especial o reservada"
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
