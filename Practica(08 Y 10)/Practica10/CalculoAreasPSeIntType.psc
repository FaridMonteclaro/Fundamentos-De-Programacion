Funcion opc <- MostrarMenu()
    Definir opc,opc1 Como Caracter
    Escribir 'Menu:'
    Escribir 'C.- Calcular área del círculo'
    Escribir 'T.- Calcular área del triángulo'
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

Algoritmo CalculoAreasPSeInt
    Definir opcion Como Caracter
    Definir radio,base,altura Como Real
    Repetir
        opcion <- MostrarMenu()
        Segun opcion Hacer
            'C':
                radio <- PedirDato('Ingresa el radio del círculo: ')
                Escribir 'El área del círculo es: ', CalcularAreaCirculo(radio)
            'T':
                base <- PedirDato('Ingresa la base del triángulo: ')
                altura <- PedirDato('Ingresa la altura del triángulo: ')
                Escribir 'El área del triángulo es: ', CalcularAreaTriangulo(base,altura)
            'S':
                Escribir 'Saliendo del programa.'
            De Otro Modo:
                Escribir 'Opción inválida.'
        FinSegun
    Hasta Que (opcion='s') O (opcion='S')
FinAlgoritmo
