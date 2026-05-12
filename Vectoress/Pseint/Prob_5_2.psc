Algoritmo Prob_5_2
    Definir generados, num, naleatorio, ciclop, cicloh, aux, datos Como Entero
    Definir movimiento Como Logico
    Dimension datos[11]
    
    generados <- 0
    num <- 0
    
    Mientras num < 10 Hacer
        naleatorio <- Aleatorio(0,40)
        generados <- generados + 1
        
        Si naleatorio MOD 2 = 0 Entonces
            num <- num + 1
            datos[num] <- naleatorio
        FinSi
    FinMientras
    
    Escribir "De ", generados, " numeros generados este es el arreglo con los 10 elementos pares:"
    Escribir datos[1], " ", datos[2], " ", datos[3], " ", datos[4], " ", datos[5], " ", datos[6], " ", datos[7], " ", datos[8], " ", datos[9], " ", datos[10]
    
    ciclop <- 1
    movimiento <- Verdadero
    
    Mientras (ciclop < 10) Y (movimiento = Verdadero) Hacer
        movimiento <- Falso
        
        Para cicloh <- 1 Hasta 9 Hacer
            Si datos[cicloh] > datos[cicloh + 1] Entonces
                aux <- datos[cicloh]
                datos[cicloh] <- datos[cicloh + 1]
                datos[cicloh + 1] <- aux
                movimiento <- Verdadero
            FinSi
        FinPara
        
        ciclop <- ciclop + 1
        
        Escribir datos[1], " ", datos[2], " ", datos[3], " ", datos[4], " ", datos[5], " ", datos[6], " ", datos[7], " ", datos[8], " ", datos[9], " ", datos[10]
    FinMientras
FinAlgoritmo
