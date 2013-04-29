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

		twoDimensionList.add(2, 1, "tets");

		// System.out.println(twoDimensionList.get(1, 0));

		// for (int i = 0; i < twoDimensionList.size(); i++) {
		// System.out.println(twoDimensionList.get(i));
		// }
		
		
		
		Enumeration days;
		
		Vector<String> dayNames = new Vector<String>();
		
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		
		days = dayNames.elements();
		
		
//		
//		while (days.hasMoreElements())
//		{
//			System.out.println(days.nextElement());
//		}
//		
		
		EnumerationToInteratorAdapter iterator = new EnumerationToInteratorAdapter(days);
		
		
		while (iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		
		
		
	}
}
