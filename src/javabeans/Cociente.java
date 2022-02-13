package javabeans;

/**
 * <h2> Clase Cociente </h2>
 * Clase que reúne varios <b>métodos de multiplicación</b>: 
 * división de 2 números reales, de 2 números enteros, el inverso del número y raíz cuadrada.
 * 
 * 
 * @author Grupo_1
 * @version 1.0
 * @see Producto
 * @see Suma
 * @see Resta
 * 
 *
 */

public class Cociente {
	
	//División de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
	/**
	 * 
	 *<p>Método que devuelve el resultado de dividir dos números reales. Se requieren dos parámetros 
	 * de entrada que son números reales (dividendo y divisor), y devuelve el resultado de dicha 
	 * división.</p>
	 * 
	 *<p> Si el divisor, numReal2, es 0, el resultado nos dará un error.</p>
	 *   
	 * <p>Si cualquiera de los parámetros de entrada es menor que 0, devolverá como resultado 0 y mostrará un error por consola.</p>
	 * 
	 * <p>Tanto los parámetros como el resultado final no debe superar los 64 bits para evitar el error 
	 * por superar el límite del tipo double.</p>
	 * 
	 * 
	 * @param numReal1 representa el dividendo. Tipo double.
	 * @param numReal2 representa al divisor. Tipo double.
	 *  
	 * @return devuelve el resultado de la división entre los dos números reales. Tipo double.
	 */
	public static double cociente(double numReal1, double numReal2) {
		if (numReal1 <= 0 || numReal2 <=0)  {
			System.out.println("error");
			return 0;
		}
		else
		return numReal1 / numReal2;
		
	}
	
	//División de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
	
	/**
	 * 
	 *<p> Método que devuelve el resultado de dividir dos números enteros. Se requieren dos parámetros 
	 * de entrada que son números enteros (dividendo y divisor), y devuelve el resultado de dicha 
	 * división.</p>
	 * 
	 * <p>Si el divisor, numReal2, es 0, el resultado nos dará un error.</p>
	 *   
	 * <p>Si cualquiera de los parámetros de entrada es menor que 0, devolverá como resultado 0 y mostrará un error por consola.</p>
	 * 
	 * <p>Si el resultado no es un número entero positvo, se mostrará solo la parte entera despreciando el decimal.</p>
	 * 
	 * @param numEntero1 representa el dividendo. Tipo int.
	 * @param numEntero2 representa al divisor. Tipo int.
	 *  
	 * @return devuelve el resultado de la división entre los dos números enteros. Tipo int.
	 */
	
	public static int cociente(int numEntero1, int numEntero2) {

		if (numEntero1 <= 0 || numEntero2 <=0)  {
			System.out.println("error");
			return 0;
		}
		else
		return numEntero1 / numEntero2;
	}  
	
	//Inverso de un número real, tendrá un parámetro de entrada y uno de salida que será la solución.
	/**
	 * 
	 * <p>Método que calcula el inverso de un número real (1/x). Se requiere un parámetro de entrada (número real) y 
	 * devolverá el inverso de dicho número.</p>
	 * 
	 * <p>Si el parámetro de entrada es menor que 0, devolverá como resultado 0 y mostrará un error por consola.</p>
	 * 
	 * <p>Tanto los parámetros como el resultado final no debe superar los 64 bits para evitar el error 
	 * por superar el límite del tipo double.</p>
	 * 
	 * Si el parámetro de entrada es 0, devolverá un error al no poder calcularlo.
	 * 
	 * @param numReal1 representa al número real al cual queremos invertir la posición de los números.
	 *  
	 * @return devuelve el número invertido. Tipo double.
	 */
	
	public static double inverso(double numReal1) {
		
		
		if (numReal1 > 0) {
			return 1/numReal1;
		}
		else {
			System.out.println("no se puede realizar el cálculo");
			return 0 ;
		}
	}
	
	//Raíz de un número, tendrá un parámetro de entrada y uno de salida que será la solución.
	/**
	 * 
	 * <p>Método que devuelve la raiz cuadrada de un número. Se requiere un parámetro de entrada (radicando), devolverá como resultado 
	 * el cálculo de dicha raiz cuadrada.</p>
	 * 
	 * Si queremos calcular la raiz cuadrada de un número negativo nos lanzará un error. 
	 * 
	 * <p>Tanto el parámetro como el resultado final no debe superar los 64 bits para evitar el error 
	 * por superar el límite del tipo double.</p>
	 * 
	 * @param numero representa el radicando. Parámetro 
	 * de tipo double. 
	 * 
	 * @return devuelve el resultado de la raiz cuadrada. Tipo double.
	 */
	
	public static double raizCuadrada(double numero) {
		if (numero <=  0) {
			System.out.println("no se puede calcular la operacion");
			return 0;
		}
		else 
		return Math.sqrt(numero);
		
	}

}


