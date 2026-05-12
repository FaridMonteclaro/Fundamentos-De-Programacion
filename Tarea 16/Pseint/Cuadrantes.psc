Algoritmo Cuadrantes
	Definir n, i, x, ye Como Entero
	Definir origen, c1, c2, c3, c4, ejex, ejey Como Entero
	
	origen <- 0
	c1 <- 0
	c2 <- 0
	c3 <- 0
	c4 <- 0
	ejex <- 0
	ejey <- 0
	
	Escribir "Ingresa la cantidad de puntos: "
	Leer n
	
	Para i <- 1 Hasta n Hacer
		Escribir "Ingresa x y y del punto ", i, ": "
		Leer x, ye
		
		Si x = 0 Y ye = 0 Entonces
			origen <- origen + 1
		SiNo
			Si x = 0 Entonces
				ejey <- ejey + 1
			SiNo
				Si ye = 0 Entonces
					ejex <- ejex + 1
				SiNo
					Si x > 0 Y ye > 0 Entonces
						c1 <- c1 + 1
					SiNo
						Si x < 0 Y ye > 0 Entonces
							c2 <- c2 + 1
						SiNo
							Si x < 0 Y ye < 0 Entonces
								c3 <- c3 + 1
							SiNo
								Si x > 0 Y ye < 0 Entonces
									c4 <- c4 + 1
								FinSi
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinPara
	
	Escribir "Origen: ", origen
	Escribir "Cuadrante I: ", c1
	Escribir "Cuadrante II: ", c2
	Escribir "Cuadrante III: ", c3
	Escribir "Cuadrante IV: ", c4
	Escribir "Eje X: ", ejex
	Escribir "Eje Y: ", ejey
FinAlgoritmo
