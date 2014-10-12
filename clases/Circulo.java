
public class Circulo {

	static final double PI = 3.1415;
	double radio, resultadoPeri, resultadoArea;

 public double peri () {

	double result = 0;
	resultadoPeri = 2 * PI * radio;
	return resultadoPeri;
 }



 public double area () {

	double result = 0;
	resultadoArea = PI * radio * radio;
	return resultadoArea;
 }
	public double getRadio() {

		return radio;

	}



	public void setRadio(double rad) {

		radio = rad;

	}
}

