import java.util.Scanner;


/* Utilizamos classpath para definirle a java donde se encuentran los archivos que vamos a utilizar al compilar los programas. Lo escribiremos en la consola, y veremos que funciona. Tras eso, volveremos al classpath anterior con export CLASSPATH;

CLASSPATH=:/home/zubiri/proyectosjava/java4_operacionesGeometricas/clases;
*/

/*
 *Programa para visualizar en pantalla el resultado 
 * de las operaciones del circulo y rectangulo
 */
public class OperacionesGeometricas {

	public static void main (String args[]) {

	double radio, base, altura, resultadoPeri, resultadoArea;

	String resp = new String();

	Scanner preg = new Scanner(System.in);
	System.out.print("\n¿Que figura quieres calcular? (circulo, rectangulo): ");
	resp = preg.nextLine();

	if (resp.equals("rectangulo")){

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
