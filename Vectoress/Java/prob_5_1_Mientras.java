Algoritmo Prob_5_1_Mientras
    Definir opc Como Caracter
    Definir num, ciclo, alumno, aprobados, reprobados Como Entero
    Definir suma, resultado, sumapromedio, calif Como Real
    Dimension calif[11]
    
    opc <- "S"
    num <- 0
    sumapromedio <- 0
    
    Mientras opc = "S" O opc = "s" Hacer
        num <- num + 1
        suma <- 0
        
        Para ciclo <- 1 Hasta 3 Hacer
            Escribir "Ingresa la calificacion del parcial ", ciclo, " del alumno ", num, ": "
            Leer calif[ciclo]
            suma <- suma + calif[ciclo]
        FinPara
        
        resultado <- suma / 3
        
        Si resultado >= 7 Entonces
            Escribir "El alumno numero ", num, " su promedio es ", resultado, " y acreditó la materia"
        SiNo
            Escribir "El alumno numero ", num, " su promedio es ", resultado, " y no acreditó la materia"
        FinSi
        
        sumapromedio <- sumapromedio + resultado
        
        Escribir "Deseas capturar otro alumno? (S/N): "
        Leer opc
    FinMientras
    
    Si num > 0 Entonces
        Escribir "El promedio del grupo de ", num, " alumnos es: ", sumapromedio / num
    SiNo
        Escribir "No se capturaron alumnos"
    FinSi
FinAlgoritmo
