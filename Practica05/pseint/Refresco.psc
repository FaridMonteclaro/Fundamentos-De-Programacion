Algoritmo Refresco
    Definir R, packs, sobran Como Entero
    Escribir "Cantidad de refrescos (R):"
    Leer R
	
    packs <- trunc(R / 6)
    sobran <- R - (packs * 6)
	
    Escribir "Refrescos que sobran: ", sobran
FinAlgoritmo
