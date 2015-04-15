package comp5134.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ FlavorDecoratorTest.class, IceCreamSaleTest.class,
		ToppingDecoratorTest.class })
public class AllTests {

}
