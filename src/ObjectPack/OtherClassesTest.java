package ObjectPack;

public class OtherClassesTest {
public static void main(String[] args) {
		
		Ninja ninja1 = new Ninja();
		Ninja ninja2 = new Ninja();
		Samurai samurai1 = new Samurai();
		Samurai samurai2 = new Samurai();
		Wizard wizard1 = new Wizard();
		Wizard wizard2 = new Wizard();
		System.out.println();
		
		
		System.out.println(" ------- wizard1 fireballs ninja1 ------- ");
		wizard1.attack(ninja1);
		ninja1.displayHealth();
		System.out.println();
		
		
		System.out.println(" ------- wizard2 heals ninja1 ------- ");
		wizard2.heal(ninja1);
		ninja1.displayHealth();
		System.out.println();
		
		
		System.out.println(" ------- ninja2 steals from samurai2 ------- ");
		ninja2.steal(samurai2);
		samurai2.displayHealth();
		ninja2.displayHealth();
		System.out.println();
		
		
		System.out.println(" ------- ninja1 runs away ------- ");
		ninja1.runAway();
		ninja1.displayHealth();
		System.out.println();
		
		
		System.out.println(" ------- samurai1 kills wizard1 ------- ");
		samurai1.deathBlow(wizard1);
		wizard1.displayHealth();
		samurai1.displayHealth();
		System.out.println();
		
		
		System.out.println(" ------- samurai1 meditates ------- ");
		samurai1.meditate();
		samurai1.displayHealth();
		System.out.println();
		
		System.out.println(" ------- how many samurai? ------- ");
		System.out.println(samurai2.howMany());
	}
}
