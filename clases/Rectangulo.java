package com.zubiri.geometria;

/*
 * Clase para obtener resultados de area y perimetro de un circulo.
 */
public class Rectangulo {
double altura;
double base;

 //metodo area
 public double area () {

	double area = 0;
	area = this.getBase() * this.getAltura();
	return area;
 }



 //metodo perimetro
 public double peri () {

	double peri = 0;
	peri = (this.getAltura() * 2) + (this.getBase() * 2);
	return peri;
 }

	public double getBase() {

		return this.base;
	}

	public void setBase(double base) {

		this.base = base;
	}

	public double getAltura() {

		return this.altura;
	}

	public void setAltura(double altura) {

		this.altura = altura;
	}
}
