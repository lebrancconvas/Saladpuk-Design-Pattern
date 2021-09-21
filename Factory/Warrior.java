package Factory;

public class Warrior implements GameCharacter{
	@Override 
	public void attack() {
		System.out.println("Warrior attacked."); 
	}
}
