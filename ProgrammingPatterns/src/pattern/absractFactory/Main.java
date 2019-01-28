package pattern.absractFactory;

public class Main {

	public static void main(String[] args) {
		SquadronFactory elfFactory = new ElfSquadronFactory();
		SquadronFactory orkFactory = new OrkSquadronFactory();
		createSquadron(elfFactory);
		createSquadron(orkFactory);

	}

	public static void createSquadron(SquadronFactory factory) {
		Archer archer = factory.createArcher();
		Warrior warrior = factory.createWarrior();
		Priest priest = factory.createPriest();
		Mage mage = factory.createMage();
		archer.shoot();
		warrior.attack();
		priest.heal();
		mage.cast();
	}
}
