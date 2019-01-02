
//A contract employee extends employee and has a yearly salary amount
public class ContractEmployee extends Employee{
	private double salary; //yearly salary
	
	public ContractEmployee() {
		super();
		salary = 0.0;
	}
	
	public ContractEmployee(String name, double salary) {
		super(name);
		this.salary = salary;
	}
	
	public ContractEmployee(String name, double salary, String title, String phone, String location, Department department, String email, Company company) {
		super(name, title, phone, location, department, email, company);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	//pays the contract employee thier salary diveed over 26 weeks
	public void pay() {
		System.out.println("Paid " +this.getName() + "(" + this.getEmail() + ")" + " $" + salary/26);
	}
	
}
