
//Salaried employees extends employee and has a salary grade
public class SalariedEmployee extends Employee{
	private SalaryGrade grade; //pay grade of the employees 
	
	public SalariedEmployee() {
		super();
		grade = SalaryGrade.G1;
	}
	
	public SalariedEmployee(String name, SalaryGrade grade) {
		super(name);
		this.grade = grade;
	}
	
	public SalariedEmployee(String name, SalaryGrade grade, String title, String phone, String location, Department department, String email, Company company) {
		super(name, title, phone, location, department, email, company);
		this.grade = grade;
	}

	public SalaryGrade getGrade() {
		return grade;
	}

	public void setGrade(SalaryGrade grade) {
		this.grade = grade;
	}
	
	@Override
	//pays the salaried employee their salary dived over 26 weeks with a two week pay period
	public void pay() {
		System.out.println("Paid " + this.getName() + "(" + this.getEmail() + ")" + " $" + (grade.getSalary()/26));
	}
}
