package javabeans;

/**
 * <h2> Clase Resta </h2>
 * Clase que re�ne varios <b>m�todos de resta</b>: 
 * resta de 2 n�meros reales, de 2 n�meros enteros, de 3 n�meros reales y resta con acumulador.
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
	
	private double valorAcumulado = 0;

	//Resta de dos n�meros reales, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
	/**
	 * 
	 * <p>M�todo que devuelve la resta de de dos numeros reales. Necesita dos par�metros de entrada que son los n�meros 
	 * reales que se restar�n y que devolver�n un valor de salida que ser� el resultado de la resta. </p>
	 * 
	 * <p>Si cualquiera de los par�metros o el resultado final son menores o iguales que 0 entonces devolver� 0 y 
	 * un mensaje de error. </p>
	 * 
	 * <p>Tanto los par�metros como el resultado final no debe sobrepasar los 64 bits para evitar el error.</p>
	 *  
	 * @param numReal1 minuendo que representa un n�mero real (tipo double).
	 * @param numReal2 sustraendo que representa otro n�mero real (tipo double).
	 * 
	 * @return devuelve el resultado de la resta de los dos n�meros reales. Tipo double.
	 */
	
	public double restaNumReales(double numReal1, double numReal2) {
		return numReal1 - numReal2;
	}
	
	//Resta de dos n�meros enteros, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
	/**
	 * 
	 * <p>M�todo que devuelve la resta de dos n�meros enteros. Necesita dos par�metros de entrada que son los n�meros 
	 * enteros que se restar�n y que devolver�n un valor de salida que ser� el resultado de la resta.</p>
	 * 
	 * <p>Si cualquiera de los par�metros o el resultado final son menores o iguales que 0 entonces devolver� 0 y 
	 * un mensaje de error. </p>
	 * 
	 * Tanto los par�metros como el resultado final no debe sobrepasar el valor -2,147,483,647 para evitar el error.
	 * 
	 * @param numEntero1 minuendo que representa uno de los n�meros enteros (tipo int).
	 * @param numEntero2 sustraendo que representa otro n�mero entero (tipo int).
	 * 
	 * @return devuelve el resultado de la resta de los dos n�meros enteros. Tipo int. 
	 */
	
	public int restaNumEnteros (int numEntero1, int numEntero2) {
		return numEntero1 - numEntero2;
	}
	
	//Resta de tres n�meros reales, tendr� 3 par�metros de entrada y uno de salida que ser� la soluci�n.
	/**
	 * 
	 * <p>M�todo que devuelve la resta de tres n�meros reales. Necesita tres par�metros de entrada que son los n�meros 
	 * reales que se restar�n y que devolver�n un valor de salida que ser� el resultado de la resta. </p>
	 * 
	 * <p>Si cualquiera de los par�metros o el resultado final son menores o iguales que 0 entonces devolver� 0 y 
	 * un mensaje de error. </p>
	 * 
	 * Tanto los par�metros como el resultado final no debe superar los 64 bits para evitar el error 
	 * por superar el l�mite del tipo double.
	 * 
	 * @param numReal1 minuendo que representa uno de los n�meros reales (tipo double). 
	 * @param numReal2 primer sustraendo que representa otro n�mero reale (tipo double). 
	 * @param numReal3 segundo sustraendo que representa el tercer n�mero real (tipo double).
	 *  
	 * @return devuelve el resultado de restar los tres n�meros reales. Tipor double.
	 */
	
	public double restaTresNumReales (double numReal1, double numReal2, double numReal3) {
		return numReal1 - numReal2 - numReal3;	
	}
	
	/*Resta con valor acumulado, tendr� un par�metro de entrada y la clase deber� de guardar el 
	 * valor acumulado.
	 * */
	/**
	 * 
	 * <p>M�todo que devuelve el resultado de la resta de un n�mero real y el acumulado global.
	 * El valorAcumulado se actualizar� con el valor resultante.</p>
	 * 
	 * Tanto los par�metros como el resultado final no debe superar los 64 bits para evitar el error 
	 * por superar el l�mite del tipo double.
	 * 
	 * @param numReal1 par�metro de entrada que representa el minuendo (tipo double).
	 * 
	 * @return valor double resultado de la resta acumulada total.
	 */
	
	public double restaValorAcumulado (double numReal1) {
		this.valorAcumulado = this.valorAcumulado - numReal1;
		return valorAcumulado;
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
