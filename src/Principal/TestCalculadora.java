package Principal;

import javabeans.Suma;

public class TestCalculadora {

	public static void main(String[] args) {
		
		
		
		System.out.println("M�todo suma n�meros reales : "  + Suma.suma(5, 10.5));
		System.out.println("M�todo suma n�meros enteros : " + Suma.suma(30, 125));
		System.out.println("M�todo suma de tres n�meros reales : " + Suma.suma(25, 11.20, 125.5));
		System.out.println("M�todo valor acumulado suma : " + Suma.sumaValorAcumulado(80.5));

	}

}
