package lacombedulionvert;

import java.util.LinkedHashMap;
import java.util.Map;

public class ConvertionBetweenRomainAndArabicNumber {
	Map<Integer, String> RomainConstant = new LinkedHashMap<Integer, String>();
	Map<Integer, String> RomainException = new LinkedHashMap<Integer, String>();
	StringBuilder builder;
	private static int V = 5;
	private static int X = 10;
	
	public ConvertionBetweenRomainAndArabicNumber(){
		this.RomainConstant.put(50, "L");
		this.RomainConstant.put(10, "X");
		this.RomainConstant.put(5, "V");
		this.RomainConstant.put(1, "I");
		
		this.RomainException.put(40, "XL");
		this.RomainException.put(9, "IX");
		this.RomainException.put(4, "IV");
	}
	
	public String ConvertFromArabicToRomain(int arabicNumber) {
		this.builder = new StringBuilder();
		int reste = arabicNumber;
		int quotient = 0;

		for (Map.Entry<Integer, String> entry : this.RomainConstant.entrySet()) {
			quotient = reste / entry.getKey();
			for(int i = 0; i < quotient; i++) {
				this.builder.append(entry.getValue());
			}
			
			reste = reste % entry.getKey();
			
			if(this.RomainException.containsKey(reste)) {
				this.builder.append(this.RomainException.get(reste));
				reste = 0;
			}
			
			if(reste == 0) {
				break;
			}
		}	
		
		return builder.toString();
	}

}
