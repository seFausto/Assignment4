import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TwoDimensionalListTest {
	TwoDimensionalList<String> twoDimensionalList;
	int arraySize;

	@Before
	public void setUp() throws Exception {
		ArrayList<String> testArray = new ArrayList<String>();

		testArray.add("Fausto");
		testArray.add("Melissa");
		testArray.add("Alexander");
		testArray.add("Manzanera");
		testArray.add("Aillaud");
		testArray.add("Ruvalcaba");
		testArray.add("Salman");
		int columns = 3;
		twoDimensionalList = new TwoDimensionalList<String>(testArray, columns);
		arraySize = 7;
	}

	@Test
	public void testSize() {
		assertTrue(twoDimensionalList.size() == arraySize);
	}

	@Test
	public void testClear() {
		twoDimensionalList.clear();
		assertTrue(twoDimensionalList.size() == 0);
	}

	@Test
	public void testGetInt() {
		assertTrue(twoDimensionalList.get(5) == "Ruvalcaba");
	}

	@Test
	public void testGetIntInt() {
		assertTrue(twoDimensionalList.get(0, 2) == "Alexander");
	}

	@Test
	public void testAddE() {
		twoDimensionalList.add("Test");
		assertTrue(twoDimensionalList.size() == arraySize + 1);
	}

	@Test
	public void testAddIntIntE() {
		twoDimensionalList.add(2, 1, "Test");
		assertTrue(twoDimensionalList.size() == arraySize + 1);
	}

	@Test
	public void testAddAllCollectionOfQextendsE() {
		ArrayList<String> a = new ArrayList<String>();

		a.add("Muse");
		a.add("MGMT");

		twoDimensionalList.addAll(a);
		assertTrue(twoDimensionalList.size() == arraySize + 2);

	}

	@Test
	public void testRemoveInt() {
		twoDimensionalList.remove(6);
		assertTrue(twoDimensionalList.size() == arraySize - 1);
	}

	@Test
	public void testRemoveIntInt() {
		twoDimensionalList.remove(1, 1);
		assertTrue(twoDimensionalList.size() == arraySize - 1);
	}

	@Test
	public void testRemoveObject() {
		twoDimensionalList.remove("Fausto");
		assertTrue(twoDimensionalList.size() == arraySize -1);
	}


	@Test
	public void testSetIntE() {

		twoDimensionalList.set(3, "Appler");
		assertTrue(twoDimensionalList.get(3) == "Appler");
	}

	@Test
	public void testSetIntIntE() {
		twoDimensionalList.set(1,1, "Appler");
		assertTrue(twoDimensionalList.get(4) == "Appler");
	}

}
