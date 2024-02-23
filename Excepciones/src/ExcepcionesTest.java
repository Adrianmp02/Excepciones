import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExcepcionesTest {

	@Test
	void testOutOfBounds() {
		int[] numeros = new int[5];
		assertThrows(IndexOutOfBoundsException.class, ()->{System.out.println(numeros[6]);});
	}

	@SuppressWarnings("null")
	@Test
	void testNullPointerException() {
		Integer a = null;
		
		assertThrows(NullPointerException.class, ()->{a.equals(3);});
	}
	
	@Test
	void testDivision1() throws AdrianExcepcion {
		int n1 = 10;
		int n2 = 5;
		
		assertEquals(2, Prueba.division(n1, n2));
	}
	
	@Test
	void testDivision2() throws AdrianExcepcion {
		
		int n1 = 20;
		int n2 = 0;
		
		assertThrows(AdrianExcepcion.class, ()-> Prueba.division(n1, n2));
	}
	
	@Test
	void testFactorialNegativo() throws AdrianExcepcion {
		
		assertThrows(AdrianExcepcion.class, ()-> Prueba.factorial(-2));
		
	}
	
	@Test
	void testFactorialFueraRango() throws AdrianExcepcion {
		
		assertThrows(AdrianExcepcion.class, ()-> Prueba.factorial(15));
		
	}
	
	@Test
	void testFactorialCero() throws AdrianExcepcion {
		
		assertEquals(1, Prueba.factorial(0));
		
	}
	
	@Test
	void testFactorialUno() throws AdrianExcepcion {
		
		assertEquals(1, Prueba.factorial(1));
		
	}
	
	@Test
	void testFactorialLimite() throws AdrianExcepcion {
		
		assertEquals(40320, Prueba.factorial(8));
		
	}
}
