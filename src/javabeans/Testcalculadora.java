package javabeans;

public class Testcalculadora {

	public static void main(String[] args) {
		
		System.out.println("Metodo resta numeros reales: " + Resta.resta(15, 8));
		System.out.println("Metodo resta numeros enteros: " + Resta.resta(9, 5));
		System.out.println("Metodo resta de tres numeros reales: " + Resta.resta(20, 1, 9));
        System.out.println("Metodo valor acumulado de lar resta: " + Resta.restaValorAcumulado(2));
	}

}
