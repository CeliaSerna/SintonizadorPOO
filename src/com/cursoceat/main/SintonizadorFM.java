package com.cursoceat.main;

public class SintonizadorFM {

	private double frecuencia;

	public SintonizadorFM(double frecuencia) {
		//validar la frecuencia
		if (frecuencia <80) {
			this.frecuencia=80;
		}else if(frecuencia>108){
			this.frecuencia= 108;
		}else {
		this.frecuencia = frecuencia;
	}
	}
	public SintonizadorFM() {
		this.frecuencia=80;
	}
	
	
	public double getFrecuencia() {
		return frecuencia;
	}
	//la opcion favorito le pasa al  valor de la frecuencia
	//y sobreescribe cualquier valor anterior que tenga
	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
		comprobarFrecuencia();
	}
	public double down() {//bajamos la frecuencia en 0.5
		this.frecuencia -= 0.5;
		//comprobar que la frecuencia entre 80 y 108
		comprobarFrecuencia();
		return this.frecuencia;
	}
	
	public double up() {//subimos la frecuencia en 0.5
		this.frecuencia += 0.5;
		//comprobar que la frecuencia entre 80 y 108
		comprobarFrecuencia();
		return this.frecuencia;
	}
	
	public void display() {
	System.out.println("Sintonizando "+this.frecuencia+" MHz");
	}
	
	private void comprobarFrecuencia() {
//con private solo puedo acceder al metodo desde la misma clase
		if(this.frecuencia<80) {
			this.frecuencia=108;
		}else if (this.frecuencia>108) {
			this.frecuencia=80;
		}
	}
	
	
	
}
