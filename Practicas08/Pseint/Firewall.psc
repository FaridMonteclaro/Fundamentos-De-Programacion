Algoritmo TareasIF_Ciberseguridad_Firewall
	Definir ip, protocolo Como Cadena
	Definir puerto Como Entero
	
	Escribir "Ingrese IP:"
	Leer ip
	
	Escribir "Ingrese Puerto:"
	Leer puerto
	
	Escribir "Ingrese Protocolo (TCP/UDP):"
	Leer protocolo
	
	Si ip = "192.168.1.50" Entonces
		Escribir "Tráfico Bloqueado"
	SiNo
		Si (puerto = 80 O puerto = 443) Y protocolo = "TCP" Entonces
			Escribir "Tráfico Permitido"
		SiNo
			Si puerto = 53 Y protocolo = "UDP" Entonces
				Escribir "Tráfico Permitido"
			SiNo
				Escribir "Tráfico Bloqueado"
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
