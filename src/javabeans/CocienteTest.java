package javabeans;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class CocienteTest {
	
	private Cociente c1; 

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
		c1 = new Cociente();
		System.out.println("Comenzando un test");
		
	}
	@AfterEach
	//se ejecuta despues de cada @test tantas veces como test hay.
	void tearDown() throws Exception{
		System.out.println("Finalizando test");
		
	}
	
	//Probando m�todo: divisi�n con n�meros reales.
	//Divisi�n de dos n�meros reales, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
	@Test
	void testCociente_conDividendoNegativo () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = c1.cociente(-5.5, 2);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_conDivisorNegativo () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = c1.cociente(8, -2);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_ConNumNegativos () {
		System.out.println("realizando test");
		double resultadoEsperado = 0 ;
		double resultadoReal = c1.cociente(-8, -4);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_DivisionNumPositivos () {
		System.out.println("realizando test");
		double resultadoEsperado = 2.1 ;
		double resultadoReal = c1.cociente(10.5, 5);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	
	@Test
	void testCociente_DividendoConCerosReales () {
		System.out.println("realizando test");
		double resultadoEsperado = 0 ;
		double resultadoReal = c1.cociente(25, 0);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_DivisorConCerosReales () {
		System.out.println("realizando test");
		double resultadoEsperado = 0 ;
		double resultadoReal = c1.cociente(0, 10);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_ConCerosReales () {
		System.out.println("realizando test");
		double resultadoEsperado = 0 ;
		double resultadoReal = c1.cociente(0, 0);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	//Probando m�todo: divisi�n con n�meros enteros.
	//Divisi�n de dos n�meros enteros, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
	@Test
	void testCociente_DividendoNegativoEnteros () {
		System.out.println("realizando test");
		int resultadoEsperado = 0;
		int resultadoReal = c1.cociente(-20, 5);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_DivisorNegativosEnteros () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = c1.cociente(10, -2);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_DivisonConAmbosNumNegativosEnteros () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = c1.cociente(-5, -5);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_DivisionNumPositivosEnteros () {
		System.out.println("realizando test");
		double resultadoEsperado = 60 ;
		double resultadoReal = c1.cociente(120, 2);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_DividendoConCerosEnteros () {
		System.out.println("realizando test");
		double resultadoEsperado = 0 ;
		double resultadoReal = c1.cociente(0, 5);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_DivisorConCerosEnteros () {
		System.out.println("realizando test");
		double resultadoEsperado = 0 ;
		double resultadoReal = c1.cociente(100, 0);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_ConCerosEnteros () {
		System.out.println("realizando test");
		double resultadoEsperado = 0 ;
		double resultadoReal =c1.cociente(0, 0);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	
	//Probando m�todo inverso
	//Inverso de un n�mero real, tendr� un par�metro de entrada y uno de salida que ser� la soluci�n.
	@Test
	void testCociente_inversonNumPositivos () {
		System.out.println("realizando test");
		double resultadoEsperado = 1/5.5 ;
		double resultadoReal = c1.inverso(5.5);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_inversoNumNegativos () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = c1.inverso(1/-5);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_inversonConCeros () {
		System.out.println("realizando test");
		double resultadoEsperado = 0 ;
		double resultadoReal = c1.inverso(0);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	
	//Probando m�todo raiz cuadrada
	//Ra�z de un n�mero, tendr� un par�metro de entrada y uno de salida que ser� la soluci�n.
	
	@Test
	void testCociente_raizCuadradaNumNegativo () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = c1.raizCuadrada(-10);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_raizCuadradaNumPositivo () {
		System.out.println("realizando test");
		double resultadoEsperado = 5;
		double resultadoReal = c1.raizCuadrada(25);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testCociente_raizCuadradaConCeros () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = c1.raizCuadrada(0);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	

}
