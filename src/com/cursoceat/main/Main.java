package com.cursoceat.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int opcion;

Scanner entrada = new Scanner(System.in);
//declarar objeto
SintonizadorFM sintonizarFm= new SintonizadorFM();
do {
	System.out.println(" ******* RADIO FM ******* ");
	System.out.println("                          ");
	System.out.println(" 1- Subir                 ");
	System.out.println(" 2- Bajar                 ");
	System.out.println(" 3. Indicar una favorita  ");
	System.out.println(" 4- Apagar radio          ");
	System.out.println("                          ");
	System.out.println(" ************************ ");
	opcion = entrada.nextInt();
	
	switch (opcion) {
	case 1-> {
		sintonizarFm.up();
		sintonizarFm.display();
	}
	case 2-> {
		sintonizarFm.down();
		sintonizarFm.display();
	}
	case 3-> {
		System.out.println("Escribe la frecuencia favorita");
		sintonizarFm.setFrecuencia(entrada.nextDouble());
		sintonizarFm.display();
	}
	case 4-> System.out.println(" ****** Apagando ******** ");
	
	default->{
	    System.out.println("Opción no válida ");
	}
	}

	}while(opcion!=4);
	
}
}
