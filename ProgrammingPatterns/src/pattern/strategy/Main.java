package pattern.strategy;

public class Main {

	public static void main(String[] args) {

		Worker worker = new Worker("Vasya", Rate.CONST,10000.0);
		Worker worker1 = new Worker("Petro",Rate.HOURLY,75.0);
		System.out.println(worker.getSalary(150));

		System.out.println(worker1.getSalary(150));
	}

}
