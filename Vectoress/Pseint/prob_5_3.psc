Algoritmo prob_5_3











		Definir pos, ciclo, aux1, aux2, aux3 Como Entero
		Definir nombre, auxnombre Como Cadena
		Definir calificaciones Como Real
		Definir resultado, promedio, sumapromedio Como Real
		
		Dimension nombre[6]
		Dimension calificaciones[16]
		
		pos <- 1
		
		Para ciclo <- 1 Hasta 5 Hacer
			Escribir "Introduce el nombre del alumno ", ciclo, ": "
			Leer nombre[ciclo]
			
			Para aux1 <- 1 Hasta 3 Hacer
				Escribir "Calificacion del parcial ", aux1, " del alumno ", nombre[ciclo], ": "
				Leer calificaciones[pos]
				pos <- pos + 1
			FinPara
		FinPara
		
		Para ciclo <- 1 Hasta 5 Hacer
			pos <- 1
			
			Para aux1 <- 1 Hasta 4 Hacer
				Si nombre[aux1] > nombre[aux1 + 1] Entonces
					auxnombre <- nombre[aux1]
					nombre[aux1] <- nombre[aux1 + 1]
					nombre[aux1 + 1] <- auxnombre
					
					aux2 <- calificaciones[pos]
					aux3 <- calificaciones[pos + 1]
					resultado <- calificaciones[pos + 2]
					
					calificaciones[pos] <- calificaciones[pos + 3]
					calificaciones[pos + 1] <- calificaciones[pos + 4]
					calificaciones[pos + 2] <- calificaciones[pos + 5]
					
					calificaciones[pos + 3] <- aux2
					calificaciones[pos + 4] <- aux3
					calificaciones[pos + 5] <- resultado
				FinSi
				
				pos <- pos + 3
			FinPara
		FinPara
		
		pos <- 1
		sumapromedio <- 0
		
		Para ciclo <- 1 Hasta 5 Hacer
			resultado <- (calificaciones[pos] + calificaciones[pos + 1] + calificaciones[pos + 2]) / 3
			
			Escribir nombre[ciclo], " ", calificaciones[pos], " ", calificaciones[pos + 1], " ", calificaciones[pos + 2], " promedio ", resultado
			
			sumapromedio <- sumapromedio + resultado
			pos <- pos + 3
		FinPara
		
		promedio <- sumapromedio / 5
		Escribir "El promedio general es ", promedio
FinAlgoritmo
