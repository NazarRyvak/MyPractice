package pattern.absractFactory;

public abstract class SquadronFactory {

	public abstract Warrior createWarrior();
	
	public abstract Mage createMage();
	
	public abstract Priest createPriest();
	
	public abstract Archer createArcher();
}
