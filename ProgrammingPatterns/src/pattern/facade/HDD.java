package pattern.facade;

public class HDD {

	public void copyFromDVD(DVDrom dvd) {
		if (dvd.hasData()) {
			System.out.println("OK");
		}else {
			System.out.println("Error!!!Put the DVD disk");
		}
	}
}
