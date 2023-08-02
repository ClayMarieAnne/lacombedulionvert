package lacombedulionvert;

public class ConvertionBetweenRomainAndArabicNumber {
	StringBuilder builder;
	private static int V = 5;
	private static int X = 10;
	
	public String ConvertFromArabicToRomain(int arabicNumber) {
		this.builder = new StringBuilder();

		if(50 <= arabicNumber) {
			builder.append("L");
			
			if(50 < arabicNumber) {
				this.ConvertWithL(arabicNumber - 50);
			}
		}	
		else {
			this.ConvertWithL(arabicNumber);
		}	
		
		return builder.toString();
	}

	private void ConvertWithL(int arabicNumber) {
		if(40 <= arabicNumber) {
			builder.append("XL");
			
			if(40 < arabicNumber) {
				this.ConvertWithXAndV(arabicNumber - 40);
			}
		}
		else if(arabicNumber > 13) {
			int quotient = arabicNumber / ConvertionBetweenRomainAndArabicNumber.X;
			
			for(int i = 0; i < quotient; i++) {
				this.builder.append("X");
			}
			
			int resteX = arabicNumber % ConvertionBetweenRomainAndArabicNumber.X;
			this.ConvertWithXAndV(resteX);
		}
		else {
			this.ConvertWithXAndV(arabicNumber);
		}
	}
	
	/**
	 * Les chiffres de 4 à 13 (avec ConvertWithI de 1 à 3 et de 11 à 13)
	 * @param arabicNumber le nombre en écriture arabe
	 */
	private void ConvertWithXAndV(int arabicNumber) {
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

	/**
	 * Les chiffres de 1 à 3 (qui s'écrivent uniquement avec des I)
	 * @param arabicNumber le nombre en écriture arabe
	 */
	private void ConvertWithI(int arabicNumber) {
		for(int i = 0; i < arabicNumber; i++) {
			builder.append("I");
		}
	}
}
