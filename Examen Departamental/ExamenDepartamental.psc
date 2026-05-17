Proceso ExamenDepartamental
	
    Definir N, i Como Entero
    Definir nombre Como Cadena
    Definir calif1, calif2 Como Real
    Definir valido Como Logico
    Definir nombres Como Cadena
    Definir nota1, nota2, promediosAlumnos Como Real
	
    Repetir
        Escribir "Ingrese el numero de alumnos: "
        Leer N
    Hasta Que N > 0
	
    Dimension nombres[N]
    Dimension nota1[N]
    Dimension nota2[N]
    Dimension promediosAlumnos[N]
	
    Para i <- 0 Hasta N-1 Con Paso 1 Hacer
		
        Escribir ""
        Escribir "--- Alumno ", i + 1, " ---"
		
        Repetir
            Escribir "Nombre: "
            Leer nombre
			
            valido <- Longitud(nombre) > 0
			
            Si valido = Falso Entonces
                Escribir "Error: El nombre no puede estar vacio"
            FinSi
			
        Hasta Que valido = Verdadero
		
        nombres[i] <- nombre
		
        Repetir
            Escribir "Calificacion 1 (1-100): "
            Leer calif1
			
            valido <- calif1 >= 1 Y calif1 <= 100
			
            Si valido = Falso Entonces
                Escribir "Error: Debe ser un numero entre 1 y 100"
            FinSi
			
        Hasta Que valido = Verdadero
		
        nota1[i] <- calif1
		
        Repetir
            Escribir "Calificacion 2 (1-100): "
            Leer calif2
			
            valido <- calif2 >= 1 Y calif2 <= 100
			
            Si valido = Falso Entonces
                Escribir "Error: Debe ser un numero entre 1 y 100"
            FinSi
			
        Hasta Que valido = Verdadero
		
        nota2[i] <- calif2
		
        promediosAlumnos[i] <- (nota1[i] + nota2[i]) / 2
		
    FinPara
	
    Escribir ""
    Escribir "-------------------------------------------"
    Escribir "               RESULTADOS                  "
    Escribir "-------------------------------------------"
	
    Escribir ""
    Escribir "Alumno             Nota1   Nota2   Promedio"
    Escribir "-------------------------------------------"
	
    Para i <- 0 Hasta N-1 Con Paso 1 Hacer
		
        Escribir Sin Saltar nombres[i], "        "
        Escribir Sin Saltar nota1[i], "        "
        Escribir Sin Saltar nota2[i], "        "
        Escribir promediosAlumnos[i]
		
    FinPara
	
    Escribir ""
    Escribir "-------------------------------------------"
	
    Escribir "Promedio general del grupo: ", promedioGeneral(promediosAlumnos, N)
	
    Escribir "Promedio de asignatura 1: ", promedioAsignatura(nota1, N)
	
    Escribir "Promedio de asignatura 2: ", promedioAsignatura(nota2, N)
	
    Escribir "-------------------------------------------"
	
FinProceso


Funcion promGral <- promedioGeneral(promedios, N)
	
    Definir promGral, suma Como Real
    Definir i Como Entero
	
    suma <- 0
	
    Para i <- 0 Hasta N-1 Con Paso 1 Hacer
        suma <- suma + promedios[i]
    FinPara
	
    promGral <- suma / N
	
FinFuncion


Funcion promAsig <- promedioAsignatura(notas, N)
	
    Definir promAsig, suma Como Real
    Definir i Como Entero
	
    suma <- 0
	
    Para i <- 0 Hasta N-1 Con Paso 1 Hacer
        suma <- suma + notas[i]
    FinPara
	
    promAsig <- suma / N
	
FinFuncion
