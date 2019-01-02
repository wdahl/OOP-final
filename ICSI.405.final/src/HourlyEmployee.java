
//hourly employee extends employee and has a hourl rate
public class HourlyEmployee extends Employee {
	private double rate; // pay rate per hour
	private double hours = 0; // number of hours worked over a 2 week period

	public HourlyEmployee() {
		super();
		rate = 0.0;
	}
	
	public HourlyEmployee(String name, double rate) {
		super(name);
		this.rate = rate;
	}
	
	public HourlyEmployee(String name, double rate, String title, String phone, String location, Department department, String email, Company company) {
		super(name, title, phone, location, department, email, company);
		this.rate = rate;
	}
	
	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
	@Override
	//pays the hourly employee
	public void pay() {
		System.out.println("Paid " + this.getName() + "(" + this.getEmail() + ")" + " $" + (rate*hours));
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}
}
