import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class StringPoolTest {

	StringPool test;
	String fausto = "Fausto";
	@Before
	public void setUp() throws Exception {
		test = new StringPool("Fausto");
	}


	@Test
	public void testGetValue() {
		assertTrue(test.getValue() == fausto);
	}
}
