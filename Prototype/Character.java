package Prototype; 
class Character {
	public static void main(String[] args) {
	  Warrior ramsa = new Warrior(1,"ramsa");
	  ramsa.sword = "Buster Sword"; 
	  ramsa.callClass();
	  ramsa.attack();
	  
	  Mage montblanc = new Mage(2,"Monblanc");
	  montblanc.wand = "Olywander Wand";
	  montblanc.callClass();
	  montblanc.attack();  
	}
  }
  
  class JobClass {
	int id;
	String name;
	public JobClass(){}
	public JobClass(int id, String name) {
	  this.id = id;
	  this.name = name;
	}
	public void callClass() {
	  System.out.println("Class Appear.");
	}
  }
  
  class Warrior extends JobClass {
	String sword;
	public Warrior(int id, String name) {
	  this.id = id;
	  this.name = name;
	}
	public void attack() {
	  System.out.printf("Warrior attacked with %s\n", sword);
	}
  }
  
  class Mage extends JobClass {
	String wand;
	public Mage(int id, String name) {
	  this.id = id;
	  this.name = name; 
	}
	public void attack() {
	 System.out.printf("Mage attacked with %s\n", wand);  
	}
  }