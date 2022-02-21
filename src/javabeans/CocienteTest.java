package javabeans;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class CocienteTest {

	@BeforeAll
	//Se ejecuta una sola vez al principio.
	static void setUpBeforeClass() throws Exception{
		System.out.println("*****************");
		System.out.println("comenzando las pruebas");
		
	}
	
	@AfterAll 
	//Este se ejecuta una vez al final del todo.
	static void tearDownAfterClass() throws Exception {
		System.out.println("finalizando de las pruebas");
		System.out.println("*********************");
		
	}
	
	@BeforeEach
	//Se ejecuta antes de cada @test tantas veces como @test hay.
	void setUp() throws Exception{
		System.out.println("Comenzando un test");
		
	}
	@AfterEach
	//se ejecuta despues de cada @test tantas veces como test hay.
	void tearDown() throws Exception{
		System.out.println("Finalizando test");
		
	}
	
	//Probando método: división con números reales.
	//División de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
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
	void testCociente_ConNumNegativos () {
		System.out.println("realizando test");
		double resultadoEsperado = 0 ;
		double resultadoReal = Cociente.cociente(-8, -4);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_DivisionNumPositivos () {
		System.out.println("realizando test");
		double resultadoEsperado = 2.1 ;
		double resultadoReal = Cociente.cociente(10.5, 5);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	
	@Test
	void testCociente_DividendoConCerosReales () {
		System.out.println("realizando test");
		double resultadoEsperado = 0 ;
		double resultadoReal = Cociente.cociente(25.5, 0);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_DivisorConCerosReales () {
		System.out.println("realizando test");
		double resultadoEsperado = 0 ;
		double resultadoReal = Cociente.cociente(0, 10);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_ConCerosReales () {
		System.out.println("realizando test");
		double resultadoEsperado = 0 ;
		double resultadoReal = Cociente.cociente(0, 0);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	//Probando método: división con números enteros.
	//División de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
	@Test
	void testCociente_DividendoNegativoEnteros () {
		System.out.println("realizando test");
		int resultadoEsperado = 0;
		int resultadoReal = Cociente.cociente(-20, 5);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_DivisorNegativosEnteros () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = Cociente.cociente(10, -2);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_DivisonConAmbosNumNegativosEnteros () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = Cociente.cociente(-5, -5);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_DivisionNumPositivosEnteros () {
		System.out.println("realizando test");
		double resultadoEsperado = 60 ;
		double resultadoReal = Cociente.cociente(120, 2);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_DividendoConCerosEnteros () {
		System.out.println("realizando test");
		double resultadoEsperado = 0 ;
		double resultadoReal = Cociente.cociente(0, 5);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_DivisorConCerosEnteros () {
		System.out.println("realizando test");
		double resultadoEsperado = 0 ;
		double resultadoReal = Cociente.cociente(100, 0);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_ConCerosEnteros () {
		System.out.println("realizando test");
		double resultadoEsperado = 0 ;
		double resultadoReal = Cociente.cociente(0, 0);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	
	//Probando método inverso
	//Inverso de un número real, tendrá un parámetro de entrada y uno de salida que será la solución.
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
	//Raíz de un número, tendrá un parámetro de entrada y uno de salida que será la solución.
	
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
	@Test
	void testCociente_raizCuadradaConCeros () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = Cociente.raizCuadrada(0);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	

}
