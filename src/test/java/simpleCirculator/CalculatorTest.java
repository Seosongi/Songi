package simpleCirculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Circulator calc=new Circulator();
		calc.add(10, 20);
		assertEquals(30,calc.getResult());
	}

}
