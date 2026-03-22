Algoritmo Algoritmos_Avanzados_tenis_11
	Definir A,B Como Entero
	
	Escribir "Puntos Jugador A:"
	Leer A
	Escribir "Puntos Jugador B:"
	Leer B
	
	Si A=6 Y B<=4 Entonces
		Escribir "Gana A"
	SiNo
		Si B=6 Y A<=4 Entonces
			Escribir "Gana B"
		SiNo
			Si A>=7 Y A-B>=2 Entonces
				Escribir "Gana A"
			SiNo
				Si B>=7 Y B-A>=2 Entonces
					Escribir "Gana B"
				SiNo
					Escribir "En juego"
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
