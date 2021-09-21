package Factory;

public class FactoryWork {
	public static void main(String[] args) {
		CharacterFactory gamechar = new CharacterFactory(); 

		GameCharacter Naduin = gamechar.getCharacter("WARRIOR");
		Naduin.attack(); 
		
		GameCharacter Manchury = gamechar.getCharacter("MAGE");
		Manchury.attack();
		
		Naduin.evade(); 
	}
}
