Algoritmo PromedioRepetir

    Definir sumaPromedio, suma, resultado, promedio, calif Como Real
    Definir ciclo, num Como Entero
    Definir opc Como Caracter
    
    sumaPromedio <- 0
    num <- 0
    opc <- "s"
    
    Repetir
        
        num <- num + 1
        suma <- 0
        ciclo <- 0
        
        Repetir
            ciclo <- ciclo + 1
            Escribir "Ingresa la calificacion ", ciclo, ": "
            Leer calif
            suma <- suma + calif
        Hasta Que ciclo = 3
        
        resultado <- suma / 3
        
        Si resultado >= 7 Entonces
            Escribir "ALUMNO ACREDITADO"
        SiNo
            Escribir "ALUMNO NO ACREDITADO"
        FinSi
        
        sumaPromedio <- sumaPromedio + resultado
        
        Escribir "Desea seguir? (s/n): "
        Leer opc
        
    Hasta Que opc = "n" O opc = "N"
    
    Si num > 0 Entonces
        promedio <- sumaPromedio / num
        Escribir "El promedio del grupo de ", num, " alumnos es: ", promedio
    FinSi
FinAlgoritmo
