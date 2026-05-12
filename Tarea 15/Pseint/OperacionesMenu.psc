Algoritmo OperacionesMenu
    Definir opcio Como Entero
    Definir operando1, operando2, resultado Como Real
    
    opcio <- 0
    
    Mientras opcio <> 4 Hacer
        
        Escribir "Ingrese el valor del operando 1: "
        Leer operando1
        
        Escribir "Ingrese el valor del operando 2: "
        Leer operando2
        
        Escribir "----- MENU -----"
        Escribir "1.- Suma"
        Escribir "2.- Multiplicacion"
        Escribir "3.- Division"
        Escribir "4.- Salir"
        Escribir "Seleccione una opcion [1..4]: "
        Leer opcio
        
        Segun opcio Hacer
            1:
                resultado <- operando1 + operando2
                Escribir "El resultado de la suma es: ", resultado
            2:
                resultado <- operando1 * operando2
                Escribir "El resultado de la multiplicacion es: ", resultado
            3:
                Si operando2 <> 0 Entonces
                    resultado <- operando1 / operando2
                    Escribir "El resultado de la division es: ", resultado
                SiNo
                    Escribir "Error: no se puede dividir entre 0"
                FinSi
            4:
                Escribir "Saliendo..."
            De Otro Modo:
                Escribir "Opcion no reconocida"
        FinSegun
        
    FinMientras
FinAlgoritmo
