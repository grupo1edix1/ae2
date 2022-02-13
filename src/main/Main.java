package main;
import javabeans.*;
import java.util.*;

/**
 *  <h2> Clase Main </h2>
 * Clase que implementa el funcionamiento de la calculadora. Se utiliza gracias a un men� por consola
 * en el cual se puede ir navegando para hacer las operaciones necesarias que vienen de las clases Suma, Resta, Producto y Cociente.
 * 
 * 
 * @author Grupo1
 * @version 1.0
 * @see Producto
 * @see Suma
 * @see Resta
 * @see Cociente
 */

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x=-1;
				
		
		while (x!=0) {
	
		System.out.println("//////////");
		System.out.println("Elige opci�n:");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Producto");
		System.out.println("4. Cociente");
		System.out.println("0. Salir");
		System.out.println("//////////");
		
		x=scan.nextInt();
		switch (x) {
		case 1:
		
		break;
		case 2:
			menuResta();
		break;
		case 3: 
		
		break;
		case 4: 
			
		break;
		case 0: 
		break;
		default: 
			System.out.println("No v�lido");
		break;
		}
		}
		scan.close();
	}
	

	
	
	/**
	 * M�todo para el men� de las operaciones de <b>Resta</b>. Elige entre varias opciones 
	 * y describe los p�rametros de entrada necesarios para la ejecuci�n de cada m�todo de la clase Resta.
	 * <br>
	 * El men� muestra las diferentes opciones y se navega al introducir n�meros enteros. Con 0 se sale 
	 * de este men� y cualquier valor no v�lido mostrar� un mensaje y volver� a mostrarse el men�.
	 */
	
	public static void menuResta() {
		Scanner scan= new Scanner(System.in);
		int x=-1;
		while (x!=0)
		{
			System.out.println("//////////");
			System.out.println("Elige opci�n:");
			System.out.println("1. Resta dos reales");
			System.out.println("2. Resta dos enteros");
			System.out.println("3. Resta de un n�mero");
			System.out.println("4. Resta acumulada");
			System.out.println("0. Salir");
			System.out.println("//////////");
			x = scan.nextInt();
			switch (x) {
			case 1: 
				System.out.println("Introduce dos reales positivos mayores que cero");
				double a = scan.nextDouble();
				double b = scan.nextDouble();
				System.out.println("Resultado: " + Resta.resta(a,b));
			break;
			case 2: 
				System.out.println("Introduce dos enteros positivos mayores que cero");
				int a1 = scan.nextInt();
				int b1 = scan.nextInt();
				System.out.println("Resultado: " + Resta.resta(a1,b1));
			break;
			case 3:
				System.out.println("\"Introduce tres reales positivos mayores que cero");
				double a2 = scan.nextDouble();
				double b2 = scan.nextDouble();
				double c2 = scan.nextDouble();
				System.out.println("Resultado: " + Resta.resta(a2,b2,c2));
			break;
			case 4: 
				System.out.println("Introduce un n�mero mayor que cero");
				double a3 = scan.nextDouble();
				System.out.println("Resultado: " + Resta.restaValorAcumulado(a3));
			break;
			case 0: 
				System.out.println("Salir");
			break;
			default: 
				System.out.println("Inv�ilido");
			break;
			
			}
		}
	}
	
	
	
	
		
			

}
