import java.util.Scanner;

/*
 *Programa para visualizar en pantalla el resultado 
 * de las operaciones del circulo y rectangulo
 */
public class OperacionesGeometricas {

	public static void main (String args[]) {

	double radio, base, altura, resultadoPeri, resultadoArea;
	char resp;

	Scanner preg = new Scanner(System.in);
	System.out.print("\n¿Que figura quieres calcular? (circulo, rectangulo): ");
	resp = preg.nextString();

	if (resp = "rectangulo"){

		Rectangulo rectangulo = new Rectangulo();

		Scanner sc = new Scanner(System.in);
		System.out.print("\ningresa la base: ");
		base = sc.nextDouble();
		System.out.print("\ningresa la altura: ");
		altura = sc.nextDouble();
		
		rectangulo.setBase(base);
		rectangulo.setAltura(altura);

		resultadoArea = rectangulo.area();
		resultadoPeri = rectangulo.peri();

		System.out.println("\nEl area es: " + resultadoArea);
		System.out.println("\nEl perimetro es: " + resultadoPeri);
	}

	else {

		Circulo circulo = new Circulo();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\ningresa el radio: ");
		radio = sc.nextDouble();

		circulo.setRadio(radio);

		resultadoArea = circulo.area();
		resultadoPeri = circulo.peri();

		System.out.println("\nEl area es: " + resultadoArea);
		System.out.println("\nEl perimetro es: " + resultadoPeri);
		}

	}
}
