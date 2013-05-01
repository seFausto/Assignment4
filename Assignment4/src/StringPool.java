
public class StringPool implements IStringPool{

	private final String value;
	
	public StringPool(String newString)
	{
		this.value = newString;		
	}
	
	public String getValue() {
		
		return this.value;
	}
}
