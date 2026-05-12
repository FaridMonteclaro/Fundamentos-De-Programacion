Algoritmo MediaPosNeg
	Definir num, cont_pos, cont_neg, cont_ceros Como Entero
	Definir suma_pos, suma_neg Como Entero
	Definir media_pos, media_neg Como Real
	Definir i Como Entero
	
	cont_pos <- 0
	cont_neg <- 0
	cont_ceros <- 0
	suma_pos <- 0
	suma_neg <- 0
	
	Para i <- 1 Hasta 10 Hacer
		Escribir "Introduce numero: "
		Leer num
		
		Si num = 0 Entonces
			cont_ceros <- cont_ceros + 1
		SiNo
			Si num > 0 Entonces
				cont_pos <- cont_pos + 1
				suma_pos <- suma_pos + num
			SiNo
				cont_neg <- cont_neg + 1
				suma_neg <- suma_neg + num
			FinSi
		FinSi
	FinPara
	
	Escribir "Cantidad de ceros: ", cont_ceros
	
	Si cont_pos = 0 Entonces
		Escribir "No se puede calcular la media de los positivos"
	SiNo
		media_pos <- suma_pos / cont_pos
		Escribir "Media de los positivos: ", media_pos
	FinSi
	
	Si cont_neg = 0 Entonces
		Escribir "No se puede calcular la media de los negativos"
	SiNo
		media_neg <- suma_neg / cont_neg
		Escribir "Media de los negativos: ", media_neg
	FinSi
	
FinAlgoritmo
