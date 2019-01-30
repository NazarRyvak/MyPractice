package pattern.strategy;

public class HourlySalary implements Salary {

	@Override
	public Double getSalary(int hour, double rate) {
		return hour * rate;
	}

}
