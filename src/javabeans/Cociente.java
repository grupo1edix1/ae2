package javabeans;

/**
 * <h2> Clase Cociente </h2>
 * Clase que re�ne varios <b>m�todos de multiplicaci�n</b>: 
 * divisi�n de 2 n�meros reales, de 2 n�meros enteros, el inverso del n�mero y ra�z cuadrada.
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
	
	//Divisi�n de dos n�meros reales, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
	/**
	 * 
	 *<p>M�todo que devuelve el resultado de dividir dos n�meros reales. Se requieren dos par�metros 
	 * de entrada que son n�meros reales (dividendo y divisor), y devuelve el resultado de dicha 
	 * divisi�n.</p>
	 * 
	 *<p> Si el divisor, numReal2, es 0, el resultado nos dar� un error.</p>
	 *   
	 * <p>Si cualquiera de los par�metros de entrada es menor que 0, devolver� como resultado 0 y mostrar� un error por consola.</p>
	 * 
	 * <p>Tanto los par�metros como el resultado final no debe superar los 64 bits para evitar el error 
	 * por superar el l�mite del tipo double.</p>
	 * 
	 * 
	 * @param numReal1 representa el dividendo. Tipo double.
	 * @param numReal2 representa al divisor. Tipo double.
	 *  
	 * @return devuelve el resultado de la divisi�n entre los dos n�meros reales. Tipo double.
	 */
	public static double cociente(double numReal1, double numReal2) {
		if (numReal1 <= 0 || numReal2 <=0)  {
			System.out.println("error");
			return 0;
		}
		else
		return numReal1 / numReal2;
		
	}
	
	//Divisi�n de dos n�meros enteros, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
	
	/**
	 * 
	 *<p> M�todo que devuelve el resultado de dividir dos n�meros enteros. Se requieren dos par�metros 
	 * de entrada que son n�meros enteros (dividendo y divisor), y devuelve el resultado de dicha 
	 * divisi�n.</p>
	 * 
	 * <p>Si el divisor, numReal2, es 0, el resultado nos dar� un error.</p>
	 *   
	 * <p>Si cualquiera de los par�metros de entrada es menor que 0, devolver� como resultado 0 y mostrar� un error por consola.</p>
	 * 
	 * <p>Si el resultado no es un n�mero entero positvo, se mostrar� solo la parte entera despreciando el decimal.</p>
	 * 
	 * @param numEntero1 representa el dividendo. Tipo int.
	 * @param numEntero2 representa al divisor. Tipo int.
	 *  
	 * @return devuelve el resultado de la divisi�n entre los dos n�meros enteros. Tipo int.
	 */
	
	public static int cociente(int numEntero1, int numEntero2) {

		if (numEntero1 <= 0 || numEntero2 <=0)  {
			System.out.println("error");
			return 0;
		}
		else
		return numEntero1 / numEntero2;
	}  
	
	//Inverso de un n�mero real, tendr� un par�metro de entrada y uno de salida que ser� la soluci�n.
	/**
	 * 
	 * <p>M�todo que calcula el inverso de un n�mero real (1/x). Se requiere un par�metro de entrada (n�mero real) y 
	 * devolver� el inverso de dicho n�mero.</p>
	 * 
	 * <p>Si el par�metro de entrada es menor que 0, devolver� como resultado 0 y mostrar� un error por consola.</p>
	 * 
	 * <p>Tanto los par�metros como el resultado final no debe superar los 64 bits para evitar el error 
	 * por superar el l�mite del tipo double.</p>
	 * 
	 * Si el par�metro de entrada es 0, devolver� un error al no poder calcularlo.
	 * 
	 * @param numReal1 representa al n�mero real al cual queremos invertir la posici�n de los n�meros.
	 *  
	 * @return devuelve el n�mero invertido. Tipo double.
	 */
	
	public static double inverso(double numReal1) {
		
		
		if (numReal1 > 0) {
			return 1/numReal1;
		}
		else {
			System.out.println("no se puede realizar el c�lculo");
			return 0 ;
		}
	}
	
	//Ra�z de un n�mero, tendr� un par�metro de entrada y uno de salida que ser� la soluci�n.
	/**
	 * 
	 * <p>M�todo que devuelve la raiz cuadrada de un n�mero. Se requiere un par�metro de entrada (radicando), devolver� como resultado 
	 * el c�lculo de dicha raiz cuadrada.</p>
	 * 
	 * Si queremos calcular la raiz cuadrada de un n�mero negativo nos lanzar� un error. 
	 * 
	 * <p>Tanto el par�metro como el resultado final no debe superar los 64 bits para evitar el error 
	 * por superar el l�mite del tipo double.</p>
	 * 
	 * @param numero representa el radicando. Par�metro 
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


