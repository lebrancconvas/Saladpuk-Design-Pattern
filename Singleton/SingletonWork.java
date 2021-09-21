package Singleton;

public class SingletonWork {
	public static void main(String[] args) {
		BossCharacter Namu = BossCharacter.getBoss();
		BossCharacter Mame = BossCharacter.getBoss();
		if(Namu == Mame) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		Namu.bossAttack();
		Mame.bossAttack(); 
	}	
}
