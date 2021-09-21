package Singleton;

public class BossCharacter {		
	private static BossCharacter boss = new BossCharacter(); 
	// private Bosscharacter(){}
	public static BossCharacter getBoss() {
		return boss;
	}
	public void bossAttack() {
		System.out.println("Boss attacked.");
	}
}
