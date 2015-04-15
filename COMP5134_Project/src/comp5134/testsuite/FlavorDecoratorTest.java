package comp5134.testsuite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import comp5134.model.FlavorDecorator;
import comp5134.model.IceCream;
import comp5134.model.IceCreamSale;

public class FlavorDecoratorTest {

	private IceCream ic ;

	@Before
	public void setup(){
		ic = new IceCreamSale();
		ic = new FlavorDecorator(ic,10);
	}

	@Test
	public void testConstructor() {

		ic = new FlavorDecorator(ic,10);
		assertTrue(ic instanceof FlavorDecorator);
	}

	@Test
	public void testGetTotalPrice(){
		int expected = 0;
		assertEquals(expected, ic.getTotalPrice());

		expected = 0;
		ic = new FlavorDecorator(ic,10);
		assertEquals(expected, ic.getTotalPrice());

		expected = 10;
		ic.addTotal();
		assertEquals(expected, ic.getTotalPrice());

	}


	@Test
	public void testIsHasFlavor(){
		assertTrue(ic.isHasFlavor());
	}



	@Test
	public void testAddTotal(){
		ic = new IceCreamSale();
		ic = new FlavorDecorator(ic,10);

		int expected = 10;
		ic.addTotal();
		assertEquals(expected, ic.getTotalPrice());


		ic = new IceCreamSale();
		ic = new FlavorDecorator(ic,150);
		expected = 150;
		ic.addTotal();
		assertEquals(expected, ic.getTotalPrice());
	}

}
