package pattern.strategy;

public class ConstSalary implements Salary{

	@Override
	public Double getSalary(int hour, double rate) {
		if (hour >= 150) {
			return rate;
		} else {
			return rate * hour / 150;
		}
	}
}
