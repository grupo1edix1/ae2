package javabeans;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumaTest {

	//Inicializar a 5 el valor acumulado inicial
	@BeforeAll
	static void setUpBeforeClass() throws Exception{
		Suma.sumaValorAcumulado(3);
		Suma.sumaValorAcumulado(2);
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	//Test Suma(Double a, Double b):
	@Test
	void testSumaDoubleDouble() {
		
		assertEquals(4.5, Suma.suma(2.2,2.3));
	}
	
	@Test
	void testSumaDoubleDoubleNegPos() {
		assertEquals(0, Suma.suma(2, -2.0));
	}
	
	@Test
	void testSumaDoubleDoublePosNeg() {
		
		assertEquals(0, Suma.suma(-2.3 ,2.3));
	}
	
	@Test
	void testSumaDoubleDoubleNegNeg() {
		assertEquals(0, Suma.suma(-2.3,-2.5));
	}
	
	//Test Suma(Int a, Int b):
	@Test
	void testSumaIntInt() {
		
		assertEquals(4, Suma.suma(2,2));
	}

	@Test
	void testSumaIntIntNegPos() {
		
		assertEquals(0, Suma.suma(-2,2));
	}
	
	@Test
	void testSumaIntIntPosNeg() {
		
		assertEquals(0, Suma.suma(2,-2));
	}
	
	@Test
	void testSumaIntIntNegNeg() {
		
		assertEquals(0, Suma.suma(-2,-2));
	}
	
	//Test Suma(Double a, Double b, Double c):
	@Test
	void testSumaDoubleDoubleDouble() {
		
		assertEquals(6.9, Suma.suma(1.1, 2.5, 3.3));
	}
	
	@Test
	void testSumaDoubleDoubleDoublePosPosNeg() {
		
		assertEquals(0, Suma.suma(1.1, 2.2, -3.5));
	}
	
	@Test
	void testSumaDoubleDoubleDoublePosNegPos() {
		
		assertEquals(0, Suma.suma(1.1, -2.8, 3.6));
	}
	
	@Test
	void testSumaDoubleDoubleDoublePosNegNeg() {
		
		assertEquals(0, Suma.suma(1.8, -2.6, -3.7));
	}
	
	@Test
	void testSumaDoubleDoubleDoubleNegPosPos() {
		
		assertEquals(0, Suma.suma(-1.3, 2.8, 3.7));
	}
	
	@Test
	void testSumaDoubleDoubleDoubleNegPosNeg() {
		
		assertEquals(0, Suma.suma(-1.5, 2.5, -3.5));
	}
	
	@Test
	void testSumaDoubleDoubleDoubleNegNegPos() {
		
		assertEquals(0, Suma.suma(-1.8, -2.6, 3.7));
	}
	
	@Test
	void testSumaDoubleDoubleDoubleNegNegNeg() {
		
		assertEquals(0, Suma.suma(-1.5, -2.6, -3.8));
	}
	
	//Test SumaValorAcumulado(Double a):
	//Inicializada variable global previamente a 5 con la llamada a dos métodos
	@Test
	void testSumaValorAcumulado() {
		
		assertEquals(12, Suma.sumaValorAcumulado(7));
		
	}
	
	@Test
	void testSumaValorAcumuladoNegativo() {
		
		assertEquals(0, Suma.sumaValorAcumulado(-7));
	}

}
