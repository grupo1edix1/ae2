package javabeans;

/**
 * <h2> Clase Producto </h2>
 * Clase que reúne varios <b>métodos de multiplicación</b>: 
 * multiplicación de 2 números reales, 2 números enteros, 3 números reales y cálculo de potencias.
 * 
 * @author Grupo_1
 * @version 1.0
 * 
 * @see Cociente
 * @see Resta
 * @see Suma
 * 
 */

public class Producto {
	
	//Producto de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
	/**
	 * 
	 * <p>Método que devuelve el resultado de multiplicar dos números reales. Necesita dos parámetros de entrada que son números reales
	 * (multiplicando y multiplicador) y devuelve el resultado de dicha multiplicacion.</p>
	 * 
	 * <p>Si algunos de los parámetros introducidos o el resultado final es un número negativo el resultado nos devolverá el valor 0 
	 * y mostrará un mensaje de error por consola.</p>
	 * 
	 * Tanto los parámetros como el resultado final no debe superar los 64 bits para evitar el error 
	 * por superar el límite del tipo double.
	 *  
	 * @param numReal1 número real que representa el multiplicando. Tipo de dato double.
	 * @param numReal2 número real que representa el multiplicador. Tipo de dato double.
	 * 
	 * @return devuelve el resultado de multiplicar de los dos números reales. Tipo double.
	 */
	
	public double productoNumReales (double numReal1, double numReal2) {
		return numReal1 * numReal2;
	}
	
	//Producto de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
	/**
	 * 
	 * <p>Método que devuelve el resultado de multiplicar dos números enteros. Necesita dos parámetros de entrada que son números reales
	 * (multiplicando y multiplicador) y devuelve el resultado de dicha multiplicacion.</p>
	 * 
	 * <p>Si algunos de los parámetros introducidos o el resultado final es un número negativo el resultado nos devolverá el valor 0 
	 * y mostrará un mensaje de error por consola. </p>
	 * 
	 * Tanto los parámetros como el resultado final no debe sobrepasar el valor 2,147,483,647 para evitar el error.
	 * 
	 * @param numEntero1 número real que representa el multiplicando. Tipo int.
	 * @param numEntero2 número real que representa el multiplicador. Tipo int.
	 * 
	 * @return devuelve el resultado de la multiplicación de los dos números enteros. Tipo int.
	 */
	
	public int productoNumEnteros(int numEntero1, int numEntero2 ) {
		return numEntero1 * numEntero2;		
	}
	
	// Producto de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la solución.
	/**
	 * 
	 * <p>Método que devuelve el resultado de multiplicar dos números enteros. Necesita tres parámetros de entrada que son números reales
	 * (multiplicando y dos multiplicadores) y devuelve el resultado de dicha multiplicacion.</p>
	 * 
	 * <p>Si algunos de los parámetros introducidos o el resultado final es un número negativo el resultado nos devolverá el valor 0 
	 * y mostrará un mensaje de error por consola.</p>
	 * 
	 * Tanto los parámetros como el resultado final no debe superar los 64 bits para evitar el error 
	 * por superar el límite del tipo double.
	 * 
	 * @param numReal1 número real que representa el multiplicando. Tipo de dato real.
	 * @param numReal2 número real que representa el primer multiplicador. Tipo de dato double.
	 * @param numReal3 número real que representa el segundo multiplicador. Tipo de dato double. 
	 * 
	 * @return devuelve el resultado de multiplicar los tres números reales. Tipo double.
	 */
	
	public double productoTresNumReales(double numReal1, double numReal2, double numReal3) {
		return numReal1 * numReal2 * numReal3;
	}
	
	//Potencia, tendrá dos parámetro de entrada (base y exponente) y uno de salida que será la solución.
	/**
	 * 
	 *<p>Método que devuelve el resultado de una potencia. Está formado por dos parámetros de entrada: base y el exponente que forman la potencia 
	 * y dará como resultado que es el resultado de la misma.</p>
	 *  
	 *<p>Al introducir como parámetro un número negativo, devolverá 0 y nos lanzará un error ya que no se admiten estos números.</p>
	 * 
	 * Si el resultado final supera los 64 bits devolverá error por superar el límite del tipo double. 
	 * 
	 * @param base representa al número que multiplicamos por sí mismo tantas veces como indique el 
	 * exponente. Tipo double.
	 * @param exponente representa el número de veces que multiplicamos la base por sí misma. Tipo double.
	 * 
	 * @return devuelve el resultado de la potencia. Tipo double.
	 */
	
	public double potencia (double base, double exponente ) {
		return Math.pow(base, exponente);				
	}
	

}


