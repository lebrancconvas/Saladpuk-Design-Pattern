package Factory;

public class CharacterFactory {
	public GameCharacter getCharacter(String characterClass){
		if(characterClass == null) {
			return null;
		}

		if(characterClass.equalsIgnoreCase("WARRIOR")) {
			return new Warrior();
		}

		else if(characterClass.equalsIgnoreCase("MAGE")) {
			return new Mage(); 
		}

		return null;
	}	
} 
