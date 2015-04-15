package comp5134.testsuite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import comp5134.model.IceCream;
import comp5134.model.IceCreamSale;

public class IceCreamSaleTest {

	private IceCream ic ;
	
	@Before
	public void setup(){
		ic = new IceCreamSale();
		
	}
	
	@Test
	public void testConstructor() {
		
		ic = new IceCreamSale();
		assertTrue(ic instanceof IceCreamSale);
	}

	
	@Test
	public void testAddTotal(){
		ic = new IceCreamSale();
		int expected = 0;
		ic.addTotal();
		assertEquals(expected, ic.getTotalPrice());
	}
	
	@Test
	public void testSetFlavor(){
		ic = new IceCreamSale();
		ic.setFlavor();
		assertTrue(!ic.isHasFlavor());
	}

}
