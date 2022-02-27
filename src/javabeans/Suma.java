package javabeans;

/**
 * <h2> Clase Suma </h2>
 * Clase que reúne varios <b>métodos de suma</b>: 
 * Suma de 2 números reales, de 2 números enteros, de 3 números reales y suma con acumulador.
 * 
 * @author Grupo_1
 * @version 1.0
 * 
 * @see Cociente
 * @see Producto
 * @see Resta
 *
 */

public class Suma {
	
	//Declaro acumulador
	
	private static double valorAcumulado = 0;
	

	//Suma de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
	/**
	 * <p>Método que devuelve el resultado de sumar dos números reales.Necesita dos parámetros de entrada que son los números 
	 * reales que se sumarán y que devolverá un valor de salida que será el resultado la suma.</p>
	 * 
	 * <p>Tanto los parámetros como el resultado final no debe superar los 64 bits para evitar el error 
	 * por superar el límite del tipo double.</p>
	 * 
	 * Si alguno de los sumandos es un número negativo devolverá 0 y nos lanzará un error. 
	 * 
	 * 
	 * 
	 * @param numReal1 primer sumando el cual es un número real (tipo double).
	 * @param numReal2 segundo sumando el cual es el otro número real (tipo double).
	 *  
	 * @return devuelve el resultado (tipo double) de la suma de los dos números reales.
	 */
	

	public static double suma (double numReal1, double numReal2) {


		
		if (numReal1 >= 0 && numReal2 >= 0 ) {
			return numReal1 + numReal2;
		}else
			System.out.println("error, número negativo");
		return 0;
		
	}
	
	//Suma de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
	/**
	 * 
	 * <p>Método que devuelve la suma de dos números enteros. Necesita dos parámetros de entrada que son los números 
	 * enteros que se sumarán y que devolverá un valor de salida que será el resultado la suma. </p>
	 * 
	 * <p>Si alguno de los sumandos es un número negativo devolverá 0 y nos lanzará un error.</p> 
	 * 
	 * Tanto los parámetros como el resultado final no debe sobrepasar el valor 2,147,483,647 para evitar el error.
	 * 
	 * @param numEntero1 primer sumando el cual es un número entero (tipo int).
	 * @param numEntero2 segundo sumando, el cual es el otro número entero (tipo int).
	 * 
	 * @return devuelve el resultado (tipo int) de la suma de los dos números enteros.
	 */
	
	public static int suma (int numEntero1, int numEntero2) {
		
		if (numEntero1 > 0 && numEntero2 > 0 ) {
			return numEntero1 + numEntero2;
		}else 
			System.out.println("error, número negativo");
		    return 0;
	
	}
	
	//Suma de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la solución.
	/**
	 * 
	 * <p>Método que devuelve la suma de tres números reales. Necesita tres parámetros de entrada que son los números 
	 * reales que se sumarán y que devolverá un valor de salida que será el resultado la suma. </p>
	 * 
	 * <p>Tanto los parámetros como el resultado final no debe superar los 64 bits para evitar el error
	 * por superar el límite del tipo double.</p>
	 * 
	 * Si alguno de los sumandos es un número negativo devolverá 0 y nos lanzará un error. 
	 * 
	 * @param numReal1 primer sumando, es un número real (tipo double).
	 * @param numReal2 segundo sumando, es un número real (tipo double)
	 * @param numReal3 tercer sumando y se trata de un número real (tipo double).
	 * 
	 * @return devuelve el resultado (tipo double) de la suma de tres números reales. 
	 */
	
	public static double suma(double numReal1, double numReal2, double numReal3) {
		
		if (numReal1 > 0 && numReal2 > 0 && numReal3 > 0) {
			return numReal1 + numReal2 + numReal3;
		}else 
			System.out.println("error, número negativo");
		    return 0;
		
	}
	
	/*Suma con valor acumulado, tendrá un parámetro de entrada y la clase deberá de guardar 
	 *el valor acumulado.
	 */
	
	/**
	 * 
	 * <p>Método que devuelve el resultado de la suma de un número real y el acumulado global.</p>
	 *
	 * <p>El valorAcumulado se actualizará con el valor resultante.</p>
	 * 
	 * <p>Tanto los parámetros como el resultado final no debe superar los 64 bits para evitar el error 
	 * por superar el límite del tipo double.</p>
	 * 
	 * @param numReal1 parámetro de entrada que representa el primer sumando (tipo double).
	 * 
	 * @return valor double resultado de la suma acumulada total. Tipo double.
	 */
	
	
	public static double sumaValorAcumulado (double numReal1) {
		
		if (numReal1 > 0) {
			
			valorAcumulado = numReal1 + valorAcumulado;
			return valorAcumulado;
			
		}else
			System.out.println("Error, el número tiene que ser mayor que 0");
		return 0;
		
		
	}
	
	//Getter//
	public static double getValorAcumulado() {
		return valorAcumulado;
	}
	
	//Setter//
	public static void setValorAcumulado(double valor) {
		valorAcumulado=valor;
	}
	
	
}

