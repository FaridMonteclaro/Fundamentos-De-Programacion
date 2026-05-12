Algoritmo PromedioMientras
    Definir suma, ciclo, calif Como Real
    
    suma <- 0
    ciclo <- 0
    
    Mientras ciclo < 3 Hacer
        ciclo <- ciclo + 1
        Escribir "Ingresa la calificacion ", ciclo, ": "
        Leer calif
        suma <- suma + calif
    FinMientras
    
    resultado <- suma / 3
    
    Si resultado >= 7 Entonces
        Escribir "ALUMNO ACREDITADO"
    SiNo
        Escribir "ALUMNO NO ACREDITADO"
    FinSi
FinAlgoritmo
