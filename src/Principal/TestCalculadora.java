package Principal;

import javabeans.Suma;

public class TestCalculadora {

	public static void main(String[] args) {
		
		
		
		System.out.println("Método suma números reales : "  + Suma.suma(5, 10.5));
		System.out.println("Método suma números enteros : " + Suma.suma(30, 125));
		System.out.println("Método suma de tres números reales : " + Suma.suma(25, 11.20, 125.5));
		System.out.println("Método valor acumulado suma : " + Suma.sumaValorAcumulado(80.5));

	}

}
