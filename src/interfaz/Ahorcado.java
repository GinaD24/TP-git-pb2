package interfaz;

import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Integer a;
		Integer b;
		Integer opcion;
		Integer resultado = null;
		do {
			System.out.println(
					"Ingrese su operación /n 1 para sumar /n 2 para restar /n 3 para multiplicar /n 4 para dividir");
			opcion = teclado.nextInt();
		} while (opcion < 1 && opcion > 4);
		System.out.println("Ingrese el primer numero");
		a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		b = teclado.nextInt();

		switch (opcion) {

		case 1:
			resultado = sumar(a, b);
			break;

		case 2:
			resultado = resta(a,b);
			break;

		case 3:
			resultado = multiplicar(a, b);
			break;
			
		case 4:
			resultado = dividir(a, b);
			break;

		default:
			System.out.println("Ingrese un numero valido.");;

		}
		teclado.close();
		System.out.println("El resultado es " + resultado.toString());
	}

	private static int sumar(Integer a, Integer b) {
		return a + b;
	}

	private static int resta(Integer a, Integer b) {
		return a - b;
	}
	private static int multiplicar(Integer a, Integer b) {
		return a * b;
	}
	private static int dividir(Integer a, Integer b) {
		return a / b;
	}
}
