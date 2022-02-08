package javabeans;

/**
 * <h2> Clase Suma </h2>
 * Clase que re�ne varios <b>m�todos de suma</b>: 
 * Suma de 2 n�meros reales, de 2 n�meros enteros, de 3 n�meros reales y suma con acumulador.
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
	
	private double valorAcumulado = 0;
	

	//Suma de dos n�meros reales, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
	/**
	 * <p>M�todo que devuelve el resultado de sumar dos n�meros reales.Necesita dos par�metros de entrada que son los n�meros 
	 * reales que se sumar�n y que devolver� un valor de salida que ser� el resultado la suma.</p>
	 * 
	 * <p>Tanto los par�metros como el resultado final no debe superar los 64 bits para evitar el error 
	 * por superar el l�mite del tipo double.</p>
	 * 
	 * Si alguno de los sumandos es un n�mero negativo devolver� 0 y nos lanzar� un error. 
	 * 
	 * 
	 * 
	 * @param numReal1 primer sumando el cual es un n�mero real (tipo double).
	 * @param numReal2 segundo sumando el cual es el otro n�mero real (tipo double).
	 *  
	 * @return devuelve el resultado (tipo double) de la suma de los dos n�meros reales.
	 */
	
	public double sumaNumReales (double numReal1, double numReal2) {
		return numReal1 + numReal2;	
	}
	
	//Suma de dos n�meros enteros, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
	/**
	 * 
	 * <p>M�todo que devuelve la suma de dos n�meros enteros. Necesita dos par�metros de entrada que son los n�meros 
	 * enteros que se sumar�n y que devolver� un valor de salida que ser� el resultado la suma. </p>
	 * 
	 * <p>Si alguno de los sumandos es un n�mero negativo devolver� 0 y nos lanzar� un error.</p> 
	 * 
	 * Tanto los par�metros como el resultado final no debe sobrepasar el valor 2,147,483,647 para evitar el error.
	 * 
	 * @param numEntero1 primer sumando el cual es un n�mero entero (tipo int).
	 * @param numEntero2 segundo sumando, el cual es el otro n�mero entero (tipo int).
	 * 
	 * @return devuelve el resultado (tipo int) de la suma de los dos n�meros enteros.
	 */
	
	public int sumaNumEnteros (int numEntero1, int numEntero2) {
		return numEntero1 + numEntero2;
	
	}
	
	//Suma de tres n�meros reales, tendr� 3 par�metros de entrada y uno de salida que ser� la soluci�n.
	/**
	 * 
	 * <p>M�todo que devuelve la suma de tres n�meros reales. Necesita tres par�metros de entrada que son los n�meros 
	 * reales que se sumar�n y que devolver� un valor de salida que ser� el resultado la suma. </p>
	 * 
	 * <p>Tanto los par�metros como el resultado final no debe superar los 64 bits para evitar el error
	 * por superar el l�mite del tipo double.</p>
	 * 
	 * Si alguno de los sumandos es un n�mero negativo devolver� 0 y nos lanzar� un error. 
	 * 
	 * @param numReal1 primer sumando, es un n�mero real (tipo double).
	 * @param numReal2 segundo sumando, es un n�mero real (tipo double)
	 * @param numReal3 tercer sumando y se trata de un n�mero real (tipo double).
	 * 
	 * @return devuelve el resultado (tipo double) de la suma de tres n�meros reales. 
	 */
	
	public double sumaTresNumReales(double numReal1, double numReal2, double numReal3) {
		
		return numReal1 + numReal2 + numReal3;
		
	}
	
	/*Suma con valor acumulado, tendr� un par�metro de entrada y la clase deber� de guardar 
	 *el valor acumulado.
	 */
	
	/**
	 * 
	 * <p>M�todo que devuelve el resultado de la suma de un n�mero real y el acumulado global.</p>
	 *
	 * <p>El valorAcumulado se actualizar� con el valor resultante.</p>
	 * 
	 * <p>Tanto los par�metros como el resultado final no debe superar los 64 bits para evitar el error 
	 * por superar el l�mite del tipo double.</p>
	 * 
	 * @param numReal1 par�metro de entrada que representa el primer sumando (tipo double).
	 * 
	 * @return valor double resultado de la suma acumulada total. Tipo double.
	 */
	
	
	public double sumaValorAcumulado (double numReal1) {
		this.valorAcumulado = this.valorAcumulado + numReal1;
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

