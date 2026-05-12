Algoritmo EdadesAlturasAlumnos
	Definir edad, cont_mayor18, cont_mayor175 Como Entero
	Definir suma_edad Como Entero
	Definir altura, suma_alt, media_edad, media_alt Como Real
	Definir i Como Entero
	
	suma_edad <- 0
	suma_alt <- 0
	cont_mayor18 <- 0
	cont_mayor175 <- 0
	
	Para i <- 1 Hasta 5 Hacer
		Escribir "Alumno ", i
		
		Escribir "Introduce edad: "
		Leer edad
		
		Escribir "Introduce altura: "
		Leer altura
		
		Si edad > 18 Entonces
			cont_mayor18 <- cont_mayor18 + 1
		FinSi
		
		Si altura > 1.75 Entonces
			cont_mayor175 <- cont_mayor175 + 1
		FinSi
		
		suma_edad <- suma_edad + edad
		suma_alt <- suma_alt + altura
	FinPara
	
	media_edad <- suma_edad / 5
	media_alt <- suma_alt / 5
	
	Escribir "La edad media es: ", media_edad
	Escribir "La altura media es: ", media_alt
	Escribir "Mayores de 18: ", cont_mayor18
	Escribir "Mayores de 1.75: ", cont_mayor175
	
FinAlgoritmo
