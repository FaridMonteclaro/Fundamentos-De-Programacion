Algoritmo Promedio

    Definir opc Como Caracter
    Definir suma, sumaPromedio, promedio, calif Como Real
    Definir ciclo, num Como Entero
    
    opc <- "s"
    sumaPromedio <- 0
    num <- 0
    
    Mientras opc = "s" O opc = "S" Hacer
        
        suma <- 0
        ciclo <- 0
        
        Mientras ciclo < 3 Hacer
            ciclo <- ciclo + 1
            Escribir "Ingresa la calificacion ", ciclo, ": "
            Leer calif
            suma <- suma + calif
        FinMientras
        
        promedio <- suma / 3
        
        Si promedio >= 7 Entonces
            Escribir "ALUMNO ACREDITADO"
        SiNo
            Escribir "ALUMNO NO ACREDITADO"
        FinSi
        
        sumaPromedio <- sumaPromedio + promedio
        num <- num + 1
        
        Escribir "Desea seguir? (s/n): "
        Leer opc
        
    FinMientras
    
    Si num > 0 Entonces
        Escribir "El promedio del grupo de ", num, " alumnos es: ", sumaPromedio / num
    FinSi
FinAlgoritmo
