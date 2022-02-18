package javabeans;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class CocienteTest {

	@BeforeAll
	//se ejecuta una sola vez al ppio
	static void setUpBeforeClass() throws Exception{
		System.out.println("*****************");
		System.out.println("comenzando las pruebas");
		
	}
	
	@AfterAll 
	//eset se ejecuta una vez al final del todo
	static void tearDownAfterClass() throws Exception {
		System.out.println("finalizando de las pruebas");
		System.out.println("*********************");
		
	}
	
	@BeforeEach
	//se ejecuta antes de cada @test tantas veces como @test hay
	void setUp() throws Exception{
		System.out.println("Comenzando un test");
		
	}
	@AfterEach
	//se ejecuta despues de cada @test tantas veces como test hay
	void tearDown() throws Exception{
		System.out.println("Finalizando test");
		
	}
	
	//Probando método: división con números reales.	
	@Test
	void testCociente_conDividendoNegativo () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = Cociente.cociente(-5.5, 2);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_conDivisorNegativo () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = Cociente.cociente(8, -2);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_conNumNegativos () {
		System.out.println("realizando test");
		double resultadoEsperado = 0 ;
		double resultadoReal = Cociente.cociente(-8, -4);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_divisionNumPositivos () {
		System.out.println("realizando test");
		double resultadoEsperado = 2.1 ;
		double resultadoReal = Cociente.cociente(10.5, 5);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	
	//Probando método: división con números enteros.
	@Test
	void testCociente_dividendoNegativoEnteros () {
		System.out.println("realizando test");
		int resultadoEsperado = 0;
		int resultadoReal = Cociente.cociente(-20, 5);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_divisorNegativosEnteros () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = Cociente.cociente(10, -2);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_divisonConAmbosNumNegativosEnteros () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = Cociente.cociente(-5, -5);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_divisionNumPositivosEnteros () {
		System.out.println("realizando test");
		double resultadoEsperado = 60 ;
		double resultadoReal = Cociente.cociente(120, 2);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	
	//Probando método inverso
	@Test
	void testCociente_inversonNumPositivos () {
		System.out.println("realizando test");
		double resultadoEsperado = 1/5 ;
		double resultadoReal = Cociente.inverso(1/5);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_inversoNumNegativos () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = Cociente.inverso(1/-5);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	
	//Probando método raiz cuadrada
	@Test
	void testCociente_raizCuadradaNumNegativo () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = Cociente.raizCuadrada(-10);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_raizCuadradaNumPositivo () {
		System.out.println("realizando test");
		double resultadoEsperado = 5;
		double resultadoReal = Cociente.raizCuadrada(25);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	

}
