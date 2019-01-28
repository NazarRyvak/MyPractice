package pattern.absractFactory;

public class ElfSquadronFactory extends SquadronFactory{

	@Override
	public Warrior createWarrior() {
		return new ElfWarrior();
	}

	@Override
	public Mage createMage() {
		return new ElfMage();
	}

	@Override
	public Priest createPriest() {
		return new ElfPriest();
	}

	@Override
	public Archer createArcher() {
		return new ElfArcher();
	}

}
