import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ImmutableArrayListTest {

	ImmutableArrayList<String> immutableList;

	int arraySize = 2;

	@Before
	public void setUp() throws Exception {

		ArrayList<String> a = new ArrayList<String>();

		a.add("Fausto");
		a.add("Melissa");

		immutableList = new ImmutableArrayList<String>(a);

	}

	@Test
	public void testSize() {

		assertTrue(immutableList.size() == arraySize);
	}

	@Test
	public void testClear() {

		immutableList.clear();
		assertTrue(immutableList.size() == arraySize);
	}

	@Test
	public void testRemoveRange() {

		immutableList.removeRange(0, 2);
		assertTrue(immutableList.size() == arraySize);
	}

	@Test
	public void testGetInt() {
		assertTrue(immutableList.get(0) == "Fausto");

	}

	@Test
	public void testAddE() {
		immutableList.add("Manzanera");
		assertTrue(immutableList.size() == arraySize);
	}

	@Test
	public void testAddIntE() {
		immutableList.add(2,  "Manzanera");
		assertTrue(immutableList.size() == arraySize);
	}

	@Test
	public void testAddAllCollectionOfQextendsE() {
		ArrayList<String> a = new ArrayList<String>();

		a.add("Fausto");
		a.add("Melissa");
		
		immutableList.addAll(a);
		
		assertTrue(immutableList.size() == arraySize);
	}

	@Test
	public void testRemoveInt() {
		immutableList.remove(0);
		assertTrue(immutableList.size() == arraySize);
	}

	@Test
	public void testRemoveObject() {
		assertFalse( immutableList.remove("Fausto"));
		assertTrue(immutableList.size() == arraySize);
		
	}

	@Test
	public void testSetIntE() {
		immutableList.set(0, "Alexander");
		
		assertTrue(immutableList.get(0) == "Fausto");
	}

}
