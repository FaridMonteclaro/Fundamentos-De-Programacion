Algoritmo TareasIF_Ciberseguridad_Password
	
	Definir long Como Entero
	Definir tieneMayus, tieneNum, tieneEspecial Como Logico
	Definir contador Como Entero
	
	Escribir "Longitud:"
	Leer long
	
	Escribir "Tiene Mayuscula? (Verdadero/Falso):"
	Leer tieneMayus
	
	Escribir "Tiene Numero? (Verdadero/Falso):"
	Leer tieneNum
	
	Escribir "Tiene Especial? (Verdadero/Falso):"
	Leer tieneEspecial
	
	contador = 0
	
	Si tieneMayus Entonces
		contador = contador + 1
	FinSi
	
	Si tieneNum Entonces
		contador = contador + 1
	FinSi
	
	Si tieneEspecial Entonces
		contador = contador + 1
	FinSi
	
	Si long < 8 Entonces
		Escribir "Insegura"
	SiNo
		Si contador = 3 Entonces
			Escribir "Muy Fuerte"
		SiNo
			Si contador = 2 Entonces
				Escribir "Fuerte"
			SiNo
				Escribir "Debil"
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
