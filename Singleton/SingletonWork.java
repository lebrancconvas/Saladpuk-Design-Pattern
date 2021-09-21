package Singleton;

public class SingletonWork {
	public static void main(String[] args) {
		BossCharacter Namu = BossCharacter.getBoss();
		BossCharacter Mame = BossCharacter.getBoss();
		Boolean checkBoss = ((Namu == Mame) ? true : false);
		System.out.println(checkBoss); 
		Namu.bossAttack();
		Mame.bossAttack();  
	}	
}
