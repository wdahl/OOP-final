
//Modle of the departments in a company
public class Department {
	private Company company; //the associated company
	private String name; //name of the department
	
	public Department() {
		company = null;
		name = null;
	}
	
	public Department(String name, Company company) {
		this.name = name;
		this.company = company;
		company.addDepartment(this);
	}
	
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
		company.addDepartment(this);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return company.toString() + " " + name;
	}
}
