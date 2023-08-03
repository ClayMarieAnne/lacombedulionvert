package lacombedulionvert;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConvertionBetweenRomainAndArabicNumberTest {
	private ConvertionBetweenRomainAndArabicNumber convertionBetweenRomainAndArabicNumber = new ConvertionBetweenRomainAndArabicNumber();

	// Test le cas de I à IV (utilisation uniquement des I)
	@Test
	public void testSimpleI() {
		assertTrue(convertionBetweenRomainAndArabicNumber.ConvertFromArabicToRomain(1).equals("I"));
	}
	
	@Test
	public void testSimpleIII() {
		assertTrue(convertionBetweenRomainAndArabicNumber.ConvertFromArabicToRomain(3).equals("III"));
	}

	// Test avec le V en plus
	@Test
	public void testSimpleV() {
		assertTrue(convertionBetweenRomainAndArabicNumber.ConvertFromArabicToRomain(5).equals("V"));
	}
	
	@Test
	public void testSimpleIV() {
		assertTrue(convertionBetweenRomainAndArabicNumber.ConvertFromArabicToRomain(4).equals("IV"));
	}
	
	@Test
	public void testSimpleVI() {
		assertTrue(convertionBetweenRomainAndArabicNumber.ConvertFromArabicToRomain(6).equals("VI"));
	}

	@Test
	public void testSimpleVIII() {
		assertTrue(convertionBetweenRomainAndArabicNumber.ConvertFromArabicToRomain(8).equals("VIII"));
	}
	
	// Test avec le X en plus
	@Test
	public void testSimpleX() {
		assertTrue(convertionBetweenRomainAndArabicNumber.ConvertFromArabicToRomain(10).equals("X"));
	}
	
	@Test
	public void testSimpleIX() {
		assertTrue(convertionBetweenRomainAndArabicNumber.ConvertFromArabicToRomain(9).equals("IX"));
	}
	
	@Test
	public void testSimpleXI() {
		assertTrue(convertionBetweenRomainAndArabicNumber.ConvertFromArabicToRomain(11).equals("XI"));
	}
	
	@Test
	public void testSimpleXIII() {
		assertTrue(convertionBetweenRomainAndArabicNumber.ConvertFromArabicToRomain(13).equals("XIII"));
	}
	
	// Test X with previous
	@Test
	public void testSimpleXIV() {
		assertTrue(convertionBetweenRomainAndArabicNumber.ConvertFromArabicToRomain(14).equals("XIV"));
	}
	
	@Test
	public void testSimpleXV() {
		assertTrue(convertionBetweenRomainAndArabicNumber.ConvertFromArabicToRomain(15).equals("XV"));
	}
	
	@Test
	public void testSimpleXVI() {
		assertTrue(convertionBetweenRomainAndArabicNumber.ConvertFromArabicToRomain(16).equals("XVI"));
	}
	
	@Test
	public void testSimpleXVII() {
		assertTrue(convertionBetweenRomainAndArabicNumber.ConvertFromArabicToRomain(17).equals("XVII"));
	}
	
	@Test
	public void testSimpleXIX() {
		assertTrue(convertionBetweenRomainAndArabicNumber.ConvertFromArabicToRomain(19).equals("XIX"));
	}
	
	@Test
	public void testSimpleXX() {
		assertTrue(convertionBetweenRomainAndArabicNumber.ConvertFromArabicToRomain(20).equals("XX"));
	}
	
	@Test
	public void testSimpleXXI() {
		assertTrue(convertionBetweenRomainAndArabicNumber.ConvertFromArabicToRomain(21).equals("XXI"));
	}
	
	// Test le cas de 40 (apparition du L pour les 50)
	@Test
	public void testSimpleXL() {
		assertTrue(convertionBetweenRomainAndArabicNumber.ConvertFromArabicToRomain(40).equals("XL"));
	}
	
	@Test
	public void testSimpleXLV() {
		assertTrue(convertionBetweenRomainAndArabicNumber.ConvertFromArabicToRomain(45).equals("XLV"));
	}
	
	@Test
	public void testSimpleL() {
		assertTrue(convertionBetweenRomainAndArabicNumber.ConvertFromArabicToRomain(50).equals("L"));
	}
	
	@Test
	public void testSimpleLXXVII() {
		assertTrue(convertionBetweenRomainAndArabicNumber.ConvertFromArabicToRomain(77).equals("LXXVII"));
	}
	
	@Test
	public void testSimpleLXXXIV() {
		assertTrue(convertionBetweenRomainAndArabicNumber.ConvertFromArabicToRomain(84).equals("LXXXIV"));
	}
	
	// Test pour le 100 C
	@Test
	public void testSimpleC() {
		assertTrue(convertionBetweenRomainAndArabicNumber.ConvertFromArabicToRomain(100).equals("C"));
	}
	
	@Test
	public void testSimpleXC() {
		assertTrue(convertionBetweenRomainAndArabicNumber.ConvertFromArabicToRomain(90).equals("XC"));
	}
	
	@Test
	public void testSimpleXCIX() {
		assertTrue(convertionBetweenRomainAndArabicNumber.ConvertFromArabicToRomain(99).equals("XCIX"));
	}
	
	@Test
	public void testSimpleCCCXLIV() {
		assertTrue(convertionBetweenRomainAndArabicNumber.ConvertFromArabicToRomain(344).equals("CCCXLIV"));
	}
	
	// Test 500 
	@Test
	public void testSimpleD() {
		assertTrue(convertionBetweenRomainAndArabicNumber.ConvertFromArabicToRomain(500).equals("D"));
	}
}
