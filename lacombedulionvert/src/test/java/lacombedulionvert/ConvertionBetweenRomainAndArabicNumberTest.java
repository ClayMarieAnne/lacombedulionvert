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
		assertTrue(convertionBetweenRomainAndArabicNumber.ConvertFromArabicToRomain(1).equals("XIV"));
	}
}
