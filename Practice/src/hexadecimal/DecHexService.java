package hexadecimal;

public class DecHexService {
	
	private final String HEXA_VALUE = "0123456789ABCDEF";
	
	public String getConvertedValue(String value) {
		if(value.startsWith("0x"))
			return hex2Dec(value);
		else
			return dec2Hex(value);
	}
	
	private String dec2Hex(String value) {
		int decimal = Integer.parseInt(value);
		String hex = "";
		
		if(decimal == 0)
			return "0x0";
		
		while(decimal > 0) {
			hex = HEXA_VALUE.charAt(decimal%16) + hex;
			decimal /= 16;
		}
		
		return "0x"+hex;
	}
	
	private String hex2Dec(String value) {
		value = value.replace("0x", "");
		
		int length = value.length();
		int decimal = 0;
		
		for(int i=0; i<length; i++)
			decimal += HEXA_VALUE.indexOf(value.charAt(i)) * Math.pow(16, length-1-i);
		
		return ""+decimal;
	}
}
