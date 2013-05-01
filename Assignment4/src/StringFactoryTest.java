import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StringFactoryTest {

	StringFactory sf;
	String fausto = "Fausto";
	String melissa = "Melissa";

	@Before
	public void setUp() throws Exception {
		sf = new StringFactory();

	}

	@Test
	public void testGetString() {
		assertTrue(sf.getString(fausto).getValue() == fausto);
		assertTrue(sf.getString(melissa).getValue() == melissa);
		
	}

}
