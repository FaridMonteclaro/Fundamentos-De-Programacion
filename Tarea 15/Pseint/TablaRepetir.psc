Algoritmo TablaRepetir
    Definir num, ciclo Como Entero
    
    Escribir "Ingrese el numero de la tabla: "
    Leer num
    
    ciclo <- 1
    
    Repetir
        Escribir num, " * ", ciclo, " = ", num * ciclo
        ciclo <- ciclo + 1
    Hasta Que ciclo > 10
FinAlgoritmo
