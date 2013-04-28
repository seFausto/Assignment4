import java.util.ArrayList;

public class Assignment4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();

		a.add("Fausto");
		a.add("Melissa");
		a.add("Alexander");
		a.add("Manzanera");
		a.add("Aillaud");
		a.add("Ruvalcaba");
		a.add("Salman");

		ImmutableArrayList<String> immutableList = new ImmutableArrayList<String>(
				a);

		// System.out.println(immutableList.get(1));

		TwoDimensionalList<String> twoDimensionList = new TwoDimensionalList<String>(
				a, 3);

		twoDimensionList.add(2, 1, "tets");

		// System.out.println(twoDimensionList.get(1, 0));

		// for (int i = 0; i < twoDimensionList.size(); i++) {
		// System.out.println(twoDimensionList.get(i));
		// }
	}
}
