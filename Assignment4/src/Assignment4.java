import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

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

		twoDimensionList.add(2, 1, "Test");

		Enumeration<String> days;

		Vector<String> dayNames = new Vector<String>();

		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");

		days = dayNames.elements();

		EnumerationToInteratorAdapter<String> iterator = new EnumerationToInteratorAdapter<String>(
				days);

		// while (iterator.hasNext()) {
		// System.out.println(iterator.next());
		// }

		StringFactory stringFactory  = new StringFactory();
		
		stringFactory.getString("Fausto");
		stringFactory.getString("Melissa");
		
		String fau = "Fau";
		String sto = "sto";
		System.out.println(stringFactory.getString("Fausto").getValue() == stringFactory.getString(fau+sto).getValue());
		
	}
}
