package javabeans;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RestaTest {

	 

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("*******************");
		System.out.println("COMENZANDO LAS PRUEBAS");
		// empezando con una variable a 500
		Resta.restaValorAcumulado(250);
		Resta.restaValorAcumulado(250);
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("FINALIZANDO LAS PRUEBAS");
		System.out.println("*******************");
	}

	@BeforeEach
	void setUp() throws Exception {
		
		System.out.println("comenzando un test");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("finalizando test");
	}

	@Test
	void testRestaDoubleDouble() {
		System.out.println("Realizando test");
		double resultadoEsperado=3.5;
		double resultadoReal=Resta.resta(6.5, 3);
		assertEquals(resultadoEsperado,resultadoReal);
		
	}
	
	@Test
	void testRestaDoubleResultadoMenor0() {
		System.out.println("comenzando un test");
		double resultadoEsperado=0;
		double resultadoReal=Resta.resta(3, 6.5);
		assertEquals(resultadoEsperado,resultadoReal);
	}
	@Test
	void testRestaDoubleMenor0() {
		System.out.println("comenzando un test");
		System.out.println("comenzando un test");
		double resultadoEsperado=0;
		double resultadoReal=Resta.resta(3, -6.5);
		assertEquals(resultadoEsperado,resultadoReal);
	}
	@Test
	void testRestaDoubleIgual0() {
		System.out.println("comenzando un test");
		double resultadoEsperado=0;
		double resultadoReal=Resta.resta(0, -20.0);
		assertEquals(resultadoEsperado,resultadoReal);
	}
	
	//Resta de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.

	@Test
	void testRestaIntInt() {
		System.out.println("comenzando un test");
		double resultadoEsperado=100;
		double resultadoReal=Resta.resta(200, 100);
		assertEquals(resultadoEsperado,resultadoReal);
	}
	
	@Test
	void testRestaIntResultadoMenor0() {
		System.out.println("comenzando un test");
		double resultadoEsperado=0;
		double resultadoReal=Resta.resta(100, 200);
		assertEquals(resultadoEsperado,resultadoReal);
	}
	
	@Test
	void testRestaIntMenor0() {
		System.out.println("comenzando un test");
		double resultadoEsperado=0;
		double resultadoReal=Resta.resta(-100, 50);
		assertEquals(resultadoEsperado,resultadoReal);
	}
	
	@Test
	void testRestaIntIgual0() {
		System.out.println("comenzando un test");
		double resultadoEsperado=0;
		double resultadoReal=Resta.resta(-100, 0);
		assertEquals(resultadoEsperado,resultadoReal);
	}
	
	//Resta de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la solución.

	@Test
	void testRestaDoublePositivo() {
		System.out.println("comenzando un test");
		double resultadoEsperado=13.3;
		double resultadoReal=Resta.resta(20.5, 2, 5.2);
		assertEquals(resultadoEsperado,resultadoReal);
	}
	
	@Test
	void testRestaDoubleNumeroPPN() {
		System.out.println("comenzando un test");
		double resultadoEsperado=0;
		double resultadoReal=Resta.resta(20.5, 2, -5.2);
		assertEquals(resultadoEsperado,resultadoReal);
	}
	
	@Test
	void testRestaDoubleDoublePNP() {
		System.out.println("comenzando un test");
		double resultadoEsperado=0;
		double resultadoReal=Resta.resta(2.5, -10, 8.2);
		assertEquals(resultadoEsperado,resultadoReal);
	}
	@Test
	void testRestaDoubleDoublePNN() {
		System.out.println("comenzando un test");
		double resultadoEsperado=0;
		double resultadoReal=Resta.resta(2.5, -10, -8.2);
		assertEquals(resultadoEsperado,resultadoReal);
	}
	@Test
	void testRestaDoubleResultadoNPP() {
		System.out.println("comenzando un test");
		double resultadoEsperado=0;
		double resultadoReal=Resta.resta(-2.5, 10, 8.2);
		assertEquals(resultadoEsperado,resultadoReal);
	}
	
	@Test
	void testRestaDoubleResultadoNPN() {
		System.out.println("comenzando un test");
		double resultadoEsperado=0;
		double resultadoReal=Resta.resta(-2.5, 10, -8.2);
		assertEquals(resultadoEsperado,resultadoReal);
	}
	@Test
	void testRestaDoubleResultadoNNP() {
		System.out.println("comenzando un test");
		double resultadoEsperado=0;
		double resultadoReal=Resta.resta(-2.5, -10, 8.2);
		assertEquals(resultadoEsperado,resultadoReal);
	}
	@Test
	void testRestaDoubleResultadoNNN() {
		System.out.println("comenzando un test");
		double resultadoEsperado=0;
		double resultadoReal=Resta.resta(-2.5, -10, -8.2);
		assertEquals(resultadoEsperado,resultadoReal);
	}
	//Resta con valor acumulado, tendrá un parámetro de entrada y la clase deberá de guardar el  valor acumulado.
	
	@Test
	void testRestaValorAcumuladoMenor0() {
		System.out.println("comenzando un test");
		double resultadoEsperado=0; 
		double resultadoReal=Resta.restaValorAcumulado(-1);
		assertEquals(resultadoEsperado,resultadoReal);
	}
	
	//valor global a 500
	@Test
	void testRestaValorAcumuladoPositivo() {
		System.out.println("comenzando un test");
		double resultadoEsperado=495; 
		double resultadoReal=Resta.restaValorAcumulado(5);
		assertEquals(resultadoEsperado,resultadoReal);
	}
	
	
}
