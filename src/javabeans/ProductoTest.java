package javabeans;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {
	
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
	
	//Probando método: producto de dos números reales

	@Test
	void testProducto_numRealesPositivos() {
		System.out.println("realizando test");
		double resultadoEsperado = 21;
		double resultadoReal = Producto.producto(10.5, 2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testProducto_numRealesNegativos() {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = Producto.producto(-20.2, 2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_numRealesNegativos_2() {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = Producto.producto(10, -5.5);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	///Probando método: producto de dos números enteros
	@Test
	void testProducto_numEnterosPositivos() {
		System.out.println("realizando test");
		int resultadoEsperado = 100;
		int resultadoReal = Producto.producto(20, 5);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_numEnterosNegativos() {
		System.out.println("realizando test");
		int resultadoEsperado = 0;
		int resultadoReal = Producto.producto(-10, 5);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_numEnterosNegativos_2() {
		System.out.println("realizando test");
		int resultadoEsperado = 0;
		int resultadoReal = Producto.producto(25, -10);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	//Probando método: producto de tres números reales
	@Test
	void testProducto_numRealesCon3FactoresPositivos () {
		System.out.println("realizando test");
		double resultadoEsperado = 10000;
		double resultadoReal = Producto.producto(20, 10, 50);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_numRealesCon3FactoresNegativos_1 () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = Producto.producto(-10, 10, 50);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_numRealesCon3FactoresNegativos_2 () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = Producto.producto(10, -20, 50);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_numRealesCon3FactoresNegativos_3 () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = Producto.producto(10, 20, -50);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_numRealesCon3FactoresNegativos_4 () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = Producto.producto(-10, -20, -50);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	//Probando potencia
	@Test
	void testProducto_potenciaPositivos () {
		System.out.println("realizando test");
		double resultadoEsperado = 10;
		double resultadoReal = Producto.potencia(5, 2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_potenciaNegativos_1 () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = Producto.potencia(-10, 2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testProducto_potenciaNegativos_2 () {
		System.out.println("realizando test");
		double resultadoEsperado = 0;
		double resultadoReal = Producto.potencia(10, -5);
		assertEquals(resultadoEsperado, resultadoReal);
	}
}
