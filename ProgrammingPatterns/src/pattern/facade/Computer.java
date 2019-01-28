package pattern.facade;

public class Computer {
	private Power power = new Power();
	
	private DVDrom dvdRom = new DVDrom();
	
	private HDD hdd = new HDD();
	
	public void copy() {
		power.on();
		dvdRom.load();
		hdd.copyFromDVD(dvdRom);
	}
	
}
