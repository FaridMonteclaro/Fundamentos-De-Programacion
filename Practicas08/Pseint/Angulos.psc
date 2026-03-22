Algoritmo Ejercicios_IF_Angulos
	Definir A, B, C Como Entero
	Definir Salida Como Caracter
	
	Escribir "Ingrese angulo A:"
	Leer A
	Escribir "Ingrese angulo B:"
	Leer B
	Escribir "Ingrese angulo C:"
	Leer C
	
	Si ((A+B+C)=(180) Y (A>0) Y (B>0) Y (C>0)) Entonces
		si ((A=90) o (B=90) o (C8=90))
			Salida<-"No es un triangulo, angulos incorrectos"
		SiNo
			si ((A<-B) Y (B=C)) Entonces
				Salida<- "Triangulo equilatero"
			SiNo
				si ((A> 90) o (B>90) o (C>90)) Entonces
					Salida <- "Triangulo Obtusangulo"
				SiNo
					Si ((A<90) Y (B<90) Y (C<90)) Entonces
						Salida<- "Triangulo Acutangulo"
						
					FinSi
				FinSi
			FinSi
		FinSi
	SiNo
		Salida<-"No es un triangulo, angulos incorrectos"
	FinSi
    Escribir Salida
FinAlgoritmo
