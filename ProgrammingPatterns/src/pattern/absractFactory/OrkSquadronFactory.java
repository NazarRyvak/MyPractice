package pattern.absractFactory;

public class OrkSquadronFactory extends SquadronFactory{

	@Override
	public Warrior createWarrior() {
		return new OrkWarrior();
	}

	@Override
	public Mage createMage() {
		return new OrkMage();
	}

	@Override
	public Priest createPriest() {
		return new OrkPriest();
	}

	@Override
	public Archer createArcher() {
		return new OrkArcher();
	}

}
