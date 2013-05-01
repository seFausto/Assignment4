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

	public int getAllStrings() {
		return strings.size();
	}
}
