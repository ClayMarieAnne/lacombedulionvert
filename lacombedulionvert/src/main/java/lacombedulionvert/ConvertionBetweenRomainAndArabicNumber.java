package lacombedulionvert;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Convertir les nombres de romain à arabe et inversement de 1 à 3 999
 */
public class ConvertionBetweenRomainAndArabicNumber {
	// Choix d'une map linked car respect l'ordre et combinaison clé/valeur
	Map<Integer, String> RomainConstant = new LinkedHashMap<Integer, String>();
	
	// To be continued...
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
	
	/**
	 * Converti un nombre arabe en nombre romain
	 * @param arabicNumber nombre arabe à convertir
	 * @return nombre converti en romain
	 */
	public String ConvertFromArabicToRomain(int arabicNumber) {
		// Ce n'est pas préciser dans l'énoncé si on doit considérer que l'utilisateur ne rentre que des entiers positif non null
		// gérer le cas entier null ou négatif si besoin
		// soit renvoi d'un message d'erreur à l'utilisateur le cas échéant 
		// soit création d'une exception custom à renvoyer plus haut en fonction de l'archi du projet
		
		// stringBuilder permet de construire une string sans faire de concaténation (recréer une string à chaque fois dans la mémoire)
		StringBuilder builder = new StringBuilder();
		int reste = arabicNumber; // cette variable n'était pas nécessaire à l'algo, j'aurais pu utiliser arabicNumber mais plus lisible pour la suite
		int quotient = 0;

		// alternatives de choix techniques de boucle: while/do iterator avec has next et next ou lambda foreach
		// Je préfère l'utilisation de boucle de base pour être le plus lisible et d'un point de vue perf (temps/mémoire) 
		// les autres ne semble pas plus intéressante
		for (Map.Entry<Integer, String> entry : this.RomainConstant.entrySet()) {
			quotient = reste / entry.getKey();
			for(int i = 0; i < quotient; i++) {
				builder.append(entry.getValue());
			}
			
			reste = reste % entry.getKey();
			
			// ça ne sert à rien de continuer à parcourir la liste si le résultat est déjà connu
			// mais le test peut être couteux comme il est fait à chaque fois...
			// A refacto en fonciton de l'utilisation
			if(reste == 0) {
				break;
			}
		}	
		
		return builder.toString();
	}

}
