Algoritmo Ejercicios_IF_AñoDeOro
	Definir año Como Entero
	
	Escribir "Ingresa el año:"
	Leer año
	
	Si (año >= 2000) Y (año <= 3000) Entonces
		
		Si (año MOD 10 = 1) Entonces
			
			Si (año MOD 4 = 2) Entonces
				
				Si NO ((año MOD 400 = 0) O ((año MOD 4 = 0) Y (año MOD 100 <> 0))) Entonces
					
					Si (año > 1) Y (año MOD 2 <> 0) Y (año MOD 3 <> 0) Y (año MOD 5 <> 0) Y (año MOD 7 <> 0) Entonces
						
						Escribir "Año de Oro"
						
					SiNo
						Escribir "Año Ordinario"
					FinSi
					
				SiNo
					Escribir "Año Ordinario"
				FinSi
				
			SiNo
				Escribir "Año Ordinario"
			FinSi
			
		SiNo
			Escribir "Año Ordinario"
		FinSi
		
	SiNo
		Escribir "Año Ordinario"
	FinSi
	
FinAlgoritmo
