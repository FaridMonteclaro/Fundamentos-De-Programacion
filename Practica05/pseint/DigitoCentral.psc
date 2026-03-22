Algoritmo DigitoCentral
    Definir n, decenas Como Entero
    Escribir "Ingresa un numero de 3 cifras:"
    Leer n
	
    decenas <- trunc(n / 10) MOD 10
	
    Escribir "El digito de las decenas es: ", decenas
FinAlgoritmo
