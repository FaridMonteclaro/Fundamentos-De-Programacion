Algoritmo CostoObraMientras

	Definir tmanodeobra, tmateriales, tservicios, tmaquinaria Como Real
	Definir nmanodeobra, nmateriales, nservicios, nmaquinaria Como Entero
	Definir insumo, costo, op Como Entero
	Definir vmmanodeobra, vmateriales, vservicios, vmaquinaria Como Real
	Definir seguir Como Caracter
	
	  tmanodeobra <- 0
	  tmateriales <- 0
  	tservicios <- 0
	  tmaquinaria <- 0
	
	  nmanodeobra <- 0
	  nmateriales <- 0
  	nservicios <- 0
	  nmaquinaria <- 0
	
	  vmmanodeobra <- 0
	  vmateriales <- 0
  	vservicios <- 0
  	vmaquinaria <- 0
	
	op <- 0
	
	Mientras op <> 5 Hacer
		
		insumo <- tmanodeobra + tmateriales + tservicios + tmaquinaria
		costo <- nmanodeobra + nmateriales + nservicios + nmaquinaria
		
		Escribir "------------------------------------"
		Escribir "Resumen actual"
		Escribir "Insumo de Mano de Obra = ", tmanodeobra, " conceptos ", nmanodeobra
		Escribir "Insumo de Materiales = ", tmateriales, " conceptos ", nmateriales
		Escribir "Insumo de Servicios = ", tservicios, " conceptos ", nservicios
		Escribir "Insumo de Maquinaria = ", tmaquinaria, " conceptos ", nmaquinaria
		Escribir "Total de Insumo de la Obra = ", insumo, " conceptos ", costo
		Escribir "------------------------------------"
		Escribir "Menu de opciones"
		Escribir "1.- Mano de Obra"
		Escribir "2.- Materiales"
		Escribir "3.- Servicios"
		Escribir "4.- Maquinaria"
		Escribir "5.- Salida"
		Escribir "Seleccione una opcion: "
		Leer op
		
		Segun op Hacer
			1:
				Repetir
					nmanodeobra <- nmanodeobra + 1
					Escribir "Seccion de Mano de Obra"
					Escribir "Valor del concepto: "
					Leer vmmanodeobra
					tmanodeobra <- tmanodeobra + vmmanodeobra
					Escribir "Desea seguir? (s/n): "
					Leer seguir
				Hasta Que seguir = "n" O seguir = "N"
				
			2:
				Repetir
					nmateriales <- nmateriales + 1
					Escribir "Seccion de Materiales"
					Escribir "Valor del concepto: "
					Leer vmateriales
					tmateriales <- tmateriales + vmateriales
					Escribir "Desea seguir? (s/n): "
					Leer seguir
				Hasta Que seguir = "n" O seguir = "N"
				
			3:
				Repetir
					nservicios <- nservicios + 1
					Escribir "Seccion de Servicios"
					Escribir "Valor del concepto: "
					Leer vservicios
					tservicios <- tservicios + vservicios
					Escribir "Desea seguir? (s/n): "
					Leer seguir
				Hasta Que seguir = "n" O seguir = "N"
				
			4:
				Repetir
					nmaquinaria <- nmaquinaria + 1
					Escribir "Seccion de Maquinaria"
					Escribir "Valor del concepto: "
					Leer vmaquinaria
					tmaquinaria <- tmaquinaria + vmaquinaria
					Escribir "Desea seguir? (s/n): "
					Leer seguir
				Hasta Que seguir = "n" O seguir = "N"
				
			5:
				Escribir "Salida"
				
			De Otro Modo:
				Escribir "Opcion desconocida"
		FinSegun
		
	FinMientras
	
FinAlgoritmo
