Algoritmo SumaExtremos
    Definir n, centenas, unidades, suma Como Entero
    Escribir "Ingresa un numero de 3 cifras:"
    Leer n
	
    centenas <- trunc(n / 100)
    unidades <- n MOD 10
    suma <- centenas + unidades
	
    Escribir "La suma de extremos es: ", suma
FinAlgoritmo
