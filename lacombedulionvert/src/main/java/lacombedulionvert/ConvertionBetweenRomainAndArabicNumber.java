package lacombedulionvert;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Convertir les nombres de romain à arabe et inversement de 1 à 3 999
 */
public class ConvertionBetweenRomainAndArabicNumber {
	Map<Integer, String> RomainConstant = new LinkedHashMap<Integer, String>();
	
	public ConvertionBetweenRomainAndArabicNumber(){
		this.RomainConstant.put(1000, "M");
		this.RomainConstant.put(900, "CM");
		this.RomainConstant.put(500, "D");
		this.RomainConstant.put(400, "CD");
		this.RomainConstant.put(100, "C");
		this.RomainConstant.put(90, "XC");
		this.RomainConstant.put(50, "L");
		this.RomainConstant.put(40, "XL");
		this.RomainConstant.put(10, "X");
		this.RomainConstant.put(9, "IX");
		this.RomainConstant.put(5, "V");
		this.RomainConstant.put(4, "IV");
		this.RomainConstant.put(1, "I");
	}
	
	public String ConvertFromArabicToRomain(int arabicNumber) {
		StringBuilder builder = new StringBuilder();
		int reste = arabicNumber;
		int quotient = 0;

		for (Map.Entry<Integer, String> entry : this.RomainConstant.entrySet()) {
			quotient = reste / entry.getKey();
			for(int i = 0; i < quotient; i++) {
				builder.append(entry.getValue());
			}
			
			reste = reste % entry.getKey();
			
			if(reste == 0) {
				break;
			}
		}	
		
		return builder.toString();
	}

}
