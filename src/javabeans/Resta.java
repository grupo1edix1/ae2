package javabeans;

/**
 * <h2> Clase Resta </h2>
 * Clase que reúne varios <b>métodos de resta</b>: 
 * resta de 2 números reales, de 2 números enteros, de 3 números reales y resta con acumulador.
 * 
 * @author Grupo_1
 * @version 1.0
 * 
 * @see Cociente
 * @see Producto
 * @see Suma
 *
 */

public class Resta {
	
	//Declaro atributo de la clase valorAcumulado
	
	private static double valorAcumulado = 1000;

	//Resta de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
	/**
	 * 
	 * <p>Método que devuelve la resta de de dos numeros reales. Necesita dos parámetros de entrada que son los números 
	 * reales que se restarán y que devolverán un valor de salida que será el resultado de la resta. </p>
	 * 
	 * <p>Si cualquiera de los parámetros o el resultado final son menores o iguales que 0 entonces devolverá 0 y 
	 * un mensaje de error. </p>
	 * 
	 * <p>Tanto los parámetros como el resultado final no debe sobrepasar los 64 bits para evitar el error.</p>
	 *  
	 * @param numReal1 minuendo que representa un número real (tipo double).
	 * @param numReal2 sustraendo que representa otro número real (tipo double).
	 * 
	 * @return devuelve el resultado de la resta de los dos números reales. Tipo double.
	 */
	
	public static double resta(double numReal1, double numReal2) {
		
		
		if ((numReal1 > 0 && numReal2 > 0) && (numReal1 - numReal2) > 0 ) {
			return numReal1 - numReal2;
		}else
			System.out.println("error, número negativo");
		return 0;
		
		
	}
	
	//Resta de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
	/**
	 * 
	 * <p>Método que devuelve la resta de dos números enteros. Necesita dos parámetros de entrada que son los números 
	 * enteros que se restarán y que devolverán un valor de salida que será el resultado de la resta.</p>
	 * 
	 * <p>Si cualquiera de los parámetros o el resultado final son menores o iguales que 0 entonces devolverá 0 y 
	 * un mensaje de error. </p>
	 * 
	 * Tanto los parámetros como el resultado final no debe sobrepasar el valor -2,147,483,647 para evitar el error.
	 * 
	 * @param numEntero1 minuendo que representa uno de los números enteros (tipo int).
	 * @param numEntero2 sustraendo que representa otro número entero (tipo int).
	 * 
	 * @return devuelve el resultado de la resta de los dos números enteros. Tipo int. 
	 */
	
	public static int resta (int numEntero1, int numEntero2) {
		
		if (numEntero1 > 0 && numEntero2 > 0 && (numEntero1 - numEntero2) > 0 ) {
			return numEntero1 - numEntero2;
		}else 
			System.out.println("error, número negativo");
		    return 0;
	}
	
	//Resta de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la solución.
	/**
	 * 
	 * <p>Método que devuelve la resta de tres números reales. Necesita tres parámetros de entrada que son los números 
	 * reales que se restarán y que devolverán un valor de salida que será el resultado de la resta. </p>
	 * 
	 * <p>Si cualquiera de los parámetros o el resultado final son menores o iguales que 0 entonces devolverá 0 y 
	 * un mensaje de error. </p>
	 * 
	 * Tanto los parámetros como el resultado final no debe superar los 64 bits para evitar el error 
	 * por superar el límite del tipo double.
	 * 
	 * @param numReal1 minuendo que representa uno de los números reales (tipo double). 
	 * @param numReal2 primer sustraendo que representa otro número reale (tipo double). 
	 * @param numReal3 segundo sustraendo que representa el tercer número real (tipo double).
	 *  
	 * @return devuelve el resultado de restar los tres números reales. Tipor double.
	 */
	
	public static double resta (double numReal1, double numReal2, double numReal3) {
	
		if (numReal1 > 0 && numReal2 > 0 && numReal3 > 0 && (numReal1 - numReal2 - numReal3) > 0) {
			return numReal1 - numReal2 - numReal3;
		}else 
			System.out.println("error, número negativo");
		    return 0;
	}
	
	/*Resta con valor acumulado, tendrá un parámetro de entrada y la clase deberá de guardar el 
	 * valor acumulado.
	 * */
	/**
	 * 
	 * <p>Método que devuelve el resultado de la resta de un número real y el acumulado global. </p> 
	 * 
	 * <p>El valorAcumulado comienza en 1000 y se actualizará con el valor resultante. En el caso de que el valor sea igual o menor 
	 * que 0 valor acumulado volverá a tener valor de 1000, se imprimirá un error por pantalla y el método devolverá 0. </p>
	 * 
	 * 
	 * 
	 * Tanto los parámetros como el resultado final no debe superar los 64 bits para evitar el error 
	 * por superar el límite del tipo double.
	 * 
	 * 
	 * 
	 * @param numReal1 parámetro de entrada que representa el minuendo (tipo double).
	 * 
	 * @return valor double resultado de la resta acumulada total.
	 */
	
	public static double restaValorAcumulado (double numReal1) {
		if (numReal1  >0) {
		valorAcumulado = valorAcumulado- numReal1;
		if (valorAcumulado <= 0) {
			valorAcumulado = 1000; 
			System.out.println("error el resultado es <0");
			return 0;
		
		}
		else	
		return valorAcumulado;
		}
		else {
			System.out.println("valor introducido < 0");
			return 0;
			
		}
	}
	
	//Getter//
	public double getValorAcumulado() {
		return valorAcumulado;
	}
	
	//Setter//
	public void setValorAcumulado(double valorAcumulado) {
		this.valorAcumulado=valorAcumulado;
	}
	
}
