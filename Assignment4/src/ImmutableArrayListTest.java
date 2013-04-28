import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ImmutableArrayListTest {

	ImmutableArrayList<String> ial;

	int arraySize = 2;

	@Before
	public void setUp() throws Exception {

		ArrayList<String> a = new ArrayList<String>();

		a.add("Fausto");
		a.add("Melissa");

		ial = new ImmutableArrayList<String>(a);

	}

	@Test
	public void testSize() {

		assertTrue(ial.size() == arraySize);
	}

	@Test
	public void testClear() {

		ial.clear();
		assertTrue(ial.size() == arraySize);
	}

	@Test
	public void testRemoveRange() {

		ial.removeRange(0, 2);
		assertTrue(ial.size() == arraySize);
	}

	@Test
	public void testGetInt() {
		assertTrue(ial.get(0) == "Fausto");

	}

	@Test
	public void testAddE() {
		ial.add("Manzanera");
		assertTrue(ial.size() == arraySize);
	}

	@Test
	public void testAddIntE() {
		ial.add(2,  "Manzanera");
		assertTrue(ial.size() == arraySize);
	}

	@Test
	public void testAddAllCollectionOfQextendsE() {
		ArrayList<String> a = new ArrayList<String>();

		a.add("Fausto");
		a.add("Melissa");
		
		ial.addAll(a);
		
		assertTrue(ial.size() == arraySize);
	}

	@Test
	public void testRemoveInt() {
		ial.remove(0);
		assertTrue(ial.size() == arraySize);
	}

	@Test
	public void testRemoveObject() {
		assertFalse( ial.remove("Fausto"));
		assertTrue(ial.size() == arraySize);
		
	}

	@Test
	public void testSetIntE() {
		ial.set(0, "Alexander");
		
		assertTrue(ial.get(0) == "Fausto");
	}

}
