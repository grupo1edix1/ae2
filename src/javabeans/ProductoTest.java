package javabeans;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {
	
	private Producto p1;
	
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
		p1 = new Producto();
		System.out.println("Comenzando un test");
		
	}
	@AfterEach
	//Se ejecuta despu�s de cada @test tantas veces como test hay.
	void tearDown() throws Exception{
		System.out.println("Finalizando test");
		
	}
	
	//Probando m�todo: producto de dos n�meros reales.
	//Producto de dos n�meros reales, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.

	@Test
	void testProducto_NumRealesPositivos() {
		System.out.println("realizando test");
		double resultadoEsperado = 21;
		double resultadoReal = p1.producto(10.5, 2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testProducto_NumRealesNegativos() {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = p1.producto(-20.2, 2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_NumRealesNegativos_2() {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = p1.producto(10, -5.5);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_PrimerFactorCero() {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = p1.producto(0, 2.2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_SegundoFactorCero() {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = p1.producto(25, 0);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_Ceros() {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = p1.producto(0, 0);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	///Probando m�todo: producto de dos n�meros enteros.
	//Producto de dos n�meros enteros, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
	@Test
	void testProducto_NumEnterosPositivos() {
		System.out.println("realizando test");
		int resultadoEsperado = 100;
		int resultadoReal = p1.producto(20, 5);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_NumEnterosNegativos() {
		System.out.println("realizando test");
		int resultadoEsperado = 0;
		int resultadoReal = p1.producto(-10, 5);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_NumEnterosNegativos_2() {
		System.out.println("realizando test");
		int resultadoEsperado = 0;
		int resultadoReal = p1.producto(25, -10);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_PrimeFactorConCero() {
		System.out.println("realizando test");
		int resultadoEsperado = 0;
		int resultadoReal = p1.producto(0, 10);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_SegunFactorConCero() {
		System.out.println("realizando test");
		int resultadoEsperado = 0;
		int resultadoReal = p1.producto(50, 0);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_ConCeros1() {
		System.out.println("realizando test");
		int resultadoEsperado = 0;
		int resultadoReal = p1.producto(0, 0);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	//Probando m�todo: producto de tres n�meros reales.
	// Producto de tres n�meros reales, tendr� 3 par�metros de entrada y uno de salida que ser� la soluci�n.
	@Test
	void testProducto_NumRealesCon3FactoresPositivos () {
		System.out.println("realizando test");
		double resultadoEsperado = 10000;
		double resultadoReal = p1.producto(20, 10, 50);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_NumRealesCon3FactoresNegativos_1 () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = p1.producto(-10, 10, 50);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_NumRealesCon3FactoresNegativos_2 () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = p1.producto(10, -20, 50);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_NumRealesCon3FactoresNegativos_3 () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = p1.producto(10, 20, -50);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_NumRealesCon3FactoresNegativos_4 () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = p1.producto(-10, -20, -50);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_PrimerFactorConCero() {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = p1.producto(0, 25, 35.5);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_SegundoFactorConCero() {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = p1.producto(25.5, 0, 10);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_TercerFactorConCero() {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = p1.producto(25.5, 12.5, 0);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_TodosConCeros() {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = p1.producto(0, 0, 0);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	//Probando potencia.
	//Potencia, tendr� dos par�metro de entrada (base y exponente) y uno de salida que ser� la soluci�n.
	@Test
	void testProducto_PotenciaPositivos () {
		System.out.println("realizando test");
		double resultadoEsperado = 25;
		double resultadoReal = p1.potencia(5, 2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_PotenciaExponenteCero () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = p1.potencia(5, 0);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_BaseCero () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = p1.potencia(0, 10);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_ConCeros () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = p1.potencia(0, 0);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_PotenciaBaseNegativos () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = p1.potencia(-10, 2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_PotenciaExponenteNegativo () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = p1.potencia(10, -5);
		assertEquals(resultadoEsperado, resultadoReal);
	}
}
