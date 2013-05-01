import java.util.HashMap;
import java.util.Map;

public class StringFactory {
	private Map<String, StringPool> strings = new HashMap<String, StringPool>();

	public StringPool getString(String value) {
		StringPool str = strings.get(value);

		if (str == null) {
			str = new StringPool(value);
			strings.put(value, str);
		}

		return str;
	}
	
	
	public void remove(String value)
	{
		strings.remove(value);
		
	}

	public int size() {
		return strings.size();
	}
}
