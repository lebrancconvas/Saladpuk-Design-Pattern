package Factory;

public class Mage implements GameCharacter{
	@Override 
	public void attack() {
		System.out.println("Mage attacked.");
	}
	
	public void evade() {
		System.out.println("Mage evaded.");
	}
}
