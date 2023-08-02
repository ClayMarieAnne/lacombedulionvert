package lacombedulionvert;

public class ConvertionBetweenRomainAndArabicNumber {
	StringBuilder builder;
	private static int V = 5;
	private static int X = 10;

	public String ConvertFromArabicToRomain(int arabicNumber) {
		this.builder = new StringBuilder();
		
		if(arabicNumber < 13) {
			int quotient = arabicNumber / ConvertionBetweenRomainAndArabicNumber.X;
			
			for(int i = 0; i < quotient; i++) {
				this.builder.append("X");
			}
			
			int resteX = arabicNumber % ConvertionBetweenRomainAndArabicNumber.X;
			this.ConvertBase(resteX);
		}
		else {
			this.ConvertBase(arabicNumber);
		}		
		
		return builder.toString();
	}
	
	private void ConvertBase(int arabicNumber) {
		if(0 < arabicNumber && arabicNumber < 4) {
			this.ConvertWithI(arabicNumber);
		}
		else if(arabicNumber == 4) {
			builder.append("IV");
		}
		else if(ConvertionBetweenRomainAndArabicNumber.V <= arabicNumber && arabicNumber < 9) {
			builder.append("V");
			
			if(ConvertionBetweenRomainAndArabicNumber.V < arabicNumber) {
				this.ConvertWithI(arabicNumber - ConvertionBetweenRomainAndArabicNumber.V);
			}
		}
		else if(arabicNumber == 9) {
			builder.append("IX");
		}			
		else if(ConvertionBetweenRomainAndArabicNumber.X <= arabicNumber) {
			builder.append("X");
			
			if(ConvertionBetweenRomainAndArabicNumber.X < arabicNumber) {
				this.ConvertWithI(arabicNumber - ConvertionBetweenRomainAndArabicNumber.X);
			}
		}
	}

	private void ConvertWithI(int arabicNumber) {
		for(int i = 0; i < arabicNumber; i++) {
			builder.append("I");
		}
	}
}
