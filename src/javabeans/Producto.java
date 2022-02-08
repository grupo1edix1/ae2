package javabeans;

/**
 * <h2> Clase Producto </h2>
 * Clase que re�ne varios <b>m�todos de multiplicaci�n</b>: 
 * multiplicaci�n de 2 n�meros reales, 2 n�meros enteros, 3 n�meros reales y c�lculo de potencias.
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
	
	//Producto de dos n�meros reales, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
	/**
	 * 
	 * <p>M�todo que devuelve el resultado de multiplicar dos n�meros reales. Necesita dos par�metros de entrada que son n�meros reales
	 * (multiplicando y multiplicador) y devuelve el resultado de dicha multiplicacion.</p>
	 * 
	 * <p>Si algunos de los par�metros introducidos o el resultado final es un n�mero negativo el resultado nos devolver� el valor 0 
	 * y mostrar� un mensaje de error por consola.</p>
	 * 
	 * Tanto los par�metros como el resultado final no debe superar los 64 bits para evitar el error 
	 * por superar el l�mite del tipo double.
	 *  
	 * @param numReal1 n�mero real que representa el multiplicando. Tipo de dato double.
	 * @param numReal2 n�mero real que representa el multiplicador. Tipo de dato double.
	 * 
	 * @return devuelve el resultado de multiplicar de los dos n�meros reales. Tipo double.
	 */
	
	public double productoNumReales (double numReal1, double numReal2) {
		return numReal1 * numReal2;
	}
	
	//Producto de dos n�meros enteros, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
	/**
	 * 
	 * <p>M�todo que devuelve el resultado de multiplicar dos n�meros enteros. Necesita dos par�metros de entrada que son n�meros reales
	 * (multiplicando y multiplicador) y devuelve el resultado de dicha multiplicacion.</p>
	 * 
	 * <p>Si algunos de los par�metros introducidos o el resultado final es un n�mero negativo el resultado nos devolver� el valor 0 
	 * y mostrar� un mensaje de error por consola. </p>
	 * 
	 * Tanto los par�metros como el resultado final no debe sobrepasar el valor 2,147,483,647 para evitar el error.
	 * 
	 * @param numEntero1 n�mero real que representa el multiplicando. Tipo int.
	 * @param numEntero2 n�mero real que representa el multiplicador. Tipo int.
	 * 
	 * @return devuelve el resultado de la multiplicaci�n de los dos n�meros enteros. Tipo int.
	 */
	
	public int productoNumEnteros(int numEntero1, int numEntero2 ) {
		return numEntero1 * numEntero2;		
	}
	
	// Producto de tres n�meros reales, tendr� 3 par�metros de entrada y uno de salida que ser� la soluci�n.
	/**
	 * 
	 * <p>M�todo que devuelve el resultado de multiplicar dos n�meros enteros. Necesita tres par�metros de entrada que son n�meros reales
	 * (multiplicando y dos multiplicadores) y devuelve el resultado de dicha multiplicacion.</p>
	 * 
	 * <p>Si algunos de los par�metros introducidos o el resultado final es un n�mero negativo el resultado nos devolver� el valor 0 
	 * y mostrar� un mensaje de error por consola.</p>
	 * 
	 * Tanto los par�metros como el resultado final no debe superar los 64 bits para evitar el error 
	 * por superar el l�mite del tipo double.
	 * 
	 * @param numReal1 n�mero real que representa el multiplicando. Tipo de dato real.
	 * @param numReal2 n�mero real que representa el primer multiplicador. Tipo de dato double.
	 * @param numReal3 n�mero real que representa el segundo multiplicador. Tipo de dato double. 
	 * 
	 * @return devuelve el resultado de multiplicar los tres n�meros reales. Tipo double.
	 */
	
	public double productoTresNumReales(double numReal1, double numReal2, double numReal3) {
		return numReal1 * numReal2 * numReal3;
	}
	
	//Potencia, tendr� dos par�metro de entrada (base y exponente) y uno de salida que ser� la soluci�n.
	/**
	 * 
	 *<p>M�todo que devuelve el resultado de una potencia. Est� formado por dos par�metros de entrada: base y el exponente que forman la potencia 
	 * y dar� como resultado que es el resultado de la misma.</p>
	 *  
	 *<p>Al introducir como par�metro un n�mero negativo, devolver� 0 y nos lanzar� un error ya que no se admiten estos n�meros.</p>
	 * 
	 * Si el resultado final supera los 64 bits devolver� error por superar el l�mite del tipo double. 
	 * 
	 * @param base representa al n�mero que multiplicamos por s� mismo tantas veces como indique el 
	 * exponente. Tipo double.
	 * @param exponente representa el n�mero de veces que multiplicamos la base por s� misma. Tipo double.
	 * 
	 * @return devuelve el resultado de la potencia. Tipo double.
	 */
	
	public double potencia (double base, double exponente ) {
		return Math.pow(base, exponente);				
	}
	

}


