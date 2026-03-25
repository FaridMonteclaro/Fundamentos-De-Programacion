Funcion opc <- MostrarMenu()
    Definir opc,opc1 Como Caracter
    Escribir 'Menu:'
    Escribir 'C.- Calcular área del círculo'
    Escribir 'T.- Calcular área del triángulo'
    Escribir 'R.- Calcular área del rectángulo'
    Escribir 'P.- Calcular área del trapecio'
    Escribir 'S.- Salir'
    Escribir 'Elige una opción: '
    Leer opc1
    opc <- Mayusculas(opc1)
FinFuncion

Funcion num <- PedirDato(mensaje)
    Definir num Como Real
    Escribir mensaje
    Leer num
FinFuncion

Funcion area <- CalcularAreaCirculo(radio)
    Definir area Como Real
    area <- Pi() * radio * radio
FinFuncion

Funcion area <- CalcularAreaTriangulo(base,altura)
    area <- (base * altura) / 2
FinFuncion

Funcion area <- CalcularAreaRectangulo(base,altura)
    area <- base * altura
FinFuncion

Funcion area <- CalcularAreaTrapecio(baseMayor,baseMenor,altura)
    area <- ((baseMayor + baseMenor) * altura) / 2
FinFuncion

Algoritmo CalculoAreasPSeInt2
    Definir opcion Como Caracter
    Definir radio,base,altura,baseMayor,baseMenor Como Real
    
    opcion <- MostrarMenu()
    Mientras opcion <> 'S' Hacer
        Segun opcion Hacer
            'C':
                radio <- PedirDato('Ingresa el radio del círculo: ')
                Escribir 'El área del círculo es: ', CalcularAreaCirculo(radio)
            'T':
                base <- PedirDato('Ingresa la base del triángulo: ')
                altura <- PedirDato('Ingresa la altura del triángulo: ')
                Escribir 'El área del triángulo es: ', CalcularAreaTriangulo(base,altura)
            'R':
                base <- PedirDato('Ingresa la base del rectángulo: ')
                altura <- PedirDato('Ingresa la altura del rectángulo: ')
                Escribir 'El área del rectángulo es: ', CalcularAreaRectangulo(base,altura)
            'P':
                baseMayor <- PedirDato('Ingresa la base mayor del trapecio: ')
                baseMenor <- PedirDato('Ingresa la base menor del trapecio: ')
                altura <- PedirDato('Ingresa la altura del trapecio: ')
                Escribir 'El área del trapecio es: ', CalcularAreaTrapecio(baseMayor,baseMenor,altura)
            'S':
                Escribir 'Saliendo del programa.'
            De Otro Modo:
                Escribir 'Opción inválida.'
        FinSegun
        opcion <- MostrarMenu()
    FinMientras
FinAlgoritmo
