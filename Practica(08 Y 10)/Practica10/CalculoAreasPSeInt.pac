Funcion opc <- MostrarMenu()
    Definir opc Como Caracter
    Escribir 'Menu:'
    Escribir 'c.- Calcular área del círculo'
    Escribir 't.- Calcular área del triángulo'
    Escribir 's.- Salir'
    Escribir 'Elige una opción:'
    Leer opc
FinFuncion
Funcion num <- PedirDato(mensaje)
    Definir num Como Real
    Escribir mensaje
    Leer num
FinFuncion
Funcion area <- CalcularAreaCirculo(radio)
    Definir area Como Real
    area <- PI()*radio*radio
FinFuncion
Funcion area <- CalcularAreaTriangulo(base,altura)
    Definir area Como Real
    area <- (base*altura)/2
FinFuncion
Algoritmo CalculoAreasPSeInt
    Definir opcion Como Caracter
    Repetir
        opcion <- MostrarMenu()
        Segun opcion Hacer
            'c','C':
                Definir radio Como Real
                radio <- PedirDato('Ingresa el radio del círculo: ')
                Definir areaCirculo Como Real
                areaCirculo <- CalcularAreaCirculo(radio)
                Escribir 'El área del círculo es: ', areaCirculo
            't','T':
                Definir base, altura Como Real
                base <- PedirDato('Ingresa la base del triángulo: ')
                altura <- PedirDato('Ingresa la altura del triángulo: ')
                Definir areaTriangulo Como Real
                areaTriangulo <- CalcularAreaTriangulo(base, altura)
                Escribir 'El área del triángulo es: ', areaTriangulo
            's','S':
                Escribir 'Saliendo del programa.'
            De Otro Modo:
                Escribir 'Opción inválida.'
        FinSegun
    Hasta Que (opcion='s') O (opcion='S')
FinAlgoritmo
