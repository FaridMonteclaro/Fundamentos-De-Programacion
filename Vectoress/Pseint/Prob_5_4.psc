Algoritmo Prob_5_4




    Definir op, ciclo, ciclo2 Como Entero
    Definir AA, BB Como Logico
    Definir A, B, C Como Real
    
    Dimension A[5]
    Dimension B[5]
    Dimension C[5]
    
    op <- 0
    AA <- Falso
    BB <- Falso
    
    Mientras op <> 6 Hacer
        Escribir "Menu de Opciones Operaciones de Matrices"
        Escribir "1.- Agregar elementos matriz A"
        Escribir "2.- Agregar elementos matriz B"
        Escribir "3.- Suma de matrices"
        Escribir "4.- Resta de matrices"
        Escribir "5.- Multiplicacion de matrices"
        Escribir "6.- Salida"
        Escribir ""
        Escribir "Que opcion deseas:"
        Leer op
        
        Segun op Hacer
            1:
                Escribir "Ingresa el valor para la posicion 1,1 de la matriz A:"
                Leer A[1]
                Escribir "Ingresa el valor para la posicion 1,2 de la matriz A:"
                Leer A[2]
                Escribir "Ingresa el valor para la posicion 2,1 de la matriz A:"
                Leer A[3]
                Escribir "Ingresa el valor para la posicion 2,2 de la matriz A:"
                Leer A[4]
                AA <- Verdadero
                
            2:
                Escribir "Ingresa el valor para la posicion 1,1 de la matriz B:"
                Leer B[1]
                Escribir "Ingresa el valor para la posicion 1,2 de la matriz B:"
                Leer B[2]
                Escribir "Ingresa el valor para la posicion 2,1 de la matriz B:"
                Leer B[3]
                Escribir "Ingresa el valor para la posicion 2,2 de la matriz B:"
                Leer B[4]
                BB <- Verdadero
                
            3:
                Si (AA = Verdadero) Y (BB = Verdadero) Entonces
                    Para ciclo <- 1 Hasta 4 Hacer
                        C[ciclo] <- A[ciclo] + B[ciclo]
                    FinPara
                    
                    Escribir "La suma de las dos matrices es:"
                    Escribir "| ", C[1], " ", C[2], " |"
                    Escribir "| ", C[3], " ", C[4], " |"
                SiNo
                    Escribir "Lo siento, una de las dos matrices o las dos no tienen datos"
                FinSi
                
            4:
                Si (AA = Verdadero) Y (BB = Verdadero) Entonces
                    Para ciclo <- 1 Hasta 4 Hacer
                        C[ciclo] <- A[ciclo] - B[ciclo]
                    FinPara
                    
                    Escribir "La resta de las dos matrices es:"
                    Escribir "| ", C[1], " ", C[2], " |"
                    Escribir "| ", C[3], " ", C[4], " |"
                SiNo
                    Escribir "Lo siento, una de las dos matrices o las dos no tienen datos"
                FinSi
                
            5:
                Si (AA = Verdadero) Y (BB = Verdadero) Entonces
                    C[1] <- (A[1] * B[1]) + (A[2] * B[3])
                    C[2] <- (A[1] * B[2]) + (A[2] * B[4])
                    C[3] <- (A[3] * B[1]) + (A[4] * B[3])
                    C[4] <- (A[3] * B[2]) + (A[4] * B[4])
                    
                    Escribir "La multiplicacion de las dos matrices es:"
                    Escribir "| ", C[1], " ", C[2], " |"
                    Escribir "| ", C[3], " ", C[4], " |"
                SiNo
                    Escribir "Lo siento, una de las dos matrices o las dos no tienen datos"
                FinSi
                
            6:
                Escribir "Adios, que tengas un buen dia"
                
            De Otro Modo:
                Escribir "No existe esta opcion"
        FinSegun
    FinMientras
FinAlgoritmo
