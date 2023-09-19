package Calc1809;

import java.text.DecimalFormat;
import java.util.*;

//Jose Ramon Taviro
public class Calculadora {

	static Scanner sc = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("#.00");
	
	static double valor1;
	static double valor2;

	public static double Sumar(double valor1, double valor2) {
		double resultado = 0;

		resultado = valor1 + valor2;

		System.out.println("El resultado de " + valor1 + " mas " + valor2 + " es: " + df.format(resultado));

		return resultado;
	}

	public static double Restar(double valor1, double valor2) {
		double resultado = 0;

		resultado = valor1 - valor2;
		if (resultado != 0) {
			System.out.println("El resultado de " + valor1 + " menos " + valor2 + " es: " + df.format(resultado));			
		} else {
			System.out.println("El resultado de " + valor1 + " menos " + valor2 + " es: " + "0");
		}

		return resultado;
	}

	public static double Multipicar(double valor1, double valor2) {
		double resultado = 0;

		resultado = valor1 * valor2;
		System.out.println("El resultado de " + valor1 + " por " + valor2 + " es: " + df.format(resultado));
		return resultado;
	}

	public static double Dividir(double valor1, double valor2) {
		double resultado = 0;

		resultado = valor1 / valor2;
		System.out.println("El resultado de " + valor1 + " entre " + valor2 + " es: " + df.format(resultado));
		return resultado;
	}

	public static void Menu() {
		//Me falta que al meter caracteres en opcion, te vuelva a pedir la opcion.
		int opcion = 0;
		System.out.println("Elige la operacion a realizar: ");
		System.out.println("1. Suma, 2. Resta 3. Multiplicacion 4. Dividir 0. Salir");
		
		
		try {
			opcion = sc.nextInt();			
		} catch (Exception e) {
			System.err.println("Has insertado caracteres vuelve a intentarlo");
			System.out.println("1. Suma, 2. Resta 3. Multiplicacion 4. Dividir 0. Salir");
			opcion = sc.nextInt();
		}
		
		
		
		if(opcion <= 4) {
		
			System.out.print("Diga el primer valor de la operacion: ");
			valor1 = sc.nextDouble();
			
			System.out.print("Diga el segundo valor de la operacion: ");
			valor2 = sc.nextDouble();
		
		
			switch (opcion) {
			case 1: {
				Sumar(valor1, valor2);
				break;
			}
			case 2: {
				Restar(valor1, valor2);
				break;
			}

			case 3: {
				Multipicar(valor1, valor2);
				break;
			}

			case 4: {
				Dividir(valor1, valor2);
				break;
			}
			case 0: {
				System.exit(0);
				break;
			}
			}
			
			
		}else {
			System.out.println("Vuelve a intentarlo");
			Menu();
		}
			
		


		

	}

	public static void main(String[] args) {
		Menu();
	}

}
