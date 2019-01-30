package pattern.strategy;

public class Worker {

	private String fullName;
	
	private Rate rate;

	private Double salary;
	
	public Worker(String fullName,Rate rate, Double salary) {
		this.fullName = fullName;
		this.salary = salary;
		this.rate = rate;
	}

	public String getFullName() {
		return fullName;
	}
	
	public Double getSalary(int hour) {
		switch (rate) {
		case CONST:
			return new ConstSalary().getSalary(hour, salary);
		case HOURLY:
			return new HourlySalary().getSalary(hour, salary);
		default:
			return 0.0;
		}
	}

}
