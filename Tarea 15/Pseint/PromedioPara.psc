Algoritmo PromedioPara
    Definir suma, calif, resultado Como Real
    Definir ciclo Como Entero
    
    suma <- 0
    
    Para ciclo <- 1 Hasta 3 Con Paso 1 Hacer
        Escribir "Ingresa la calificacion ", ciclo, ": "
        Leer calif
        suma <- suma + calif
    FinPara
    
    resultado <- suma / 3
    
    Si resultado >= 7 Entonces
        Escribir "ALUMNO ACREDITADO"
    SiNo
        Escribir "ALUMNO NO ACREDITADO"
    FinSi
FinAlgoritmo
