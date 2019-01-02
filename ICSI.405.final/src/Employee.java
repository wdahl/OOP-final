
//Model of every employee in the state, implements Pay<Employee>
public class Employee implements Pay<Employee>{
	private String name; // nam eof employee
	private String title; //title of the employee
	private String phone; //phone number for the employee
	private String location; //whaere the employee works
	private Department department;//department they work in
	private String email;//the employees email address (also act as a unique identifyer for the employee
	private Company company; // the company that employes the employee
	
	public Employee() {
		name = null;
		title = null;
		phone = null;
		location = null;
		department = null;
		email = null;
		company = null;
	}
	
	public Employee(String name) {
		this.name = name;
		title = null;
		phone = null;
		location = null;
		department = null;
		email = null;
		company = null;
	}
	
	public Employee(String name, String title, String phone, String location, Department department, String email, Company company) {
		this.name = name;
		this.title = title;
		this.phone = phone;
		this.location = location;
		this.department = department;
		this.email = email;
		this.company = company;
		company.addEmployee(this);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
		if(!company.getEmployees().contains(this))
			company.addEmployee(this);
	}
	
	//pays the employee
	public void pay() {
		System.out.println("Paid " + name);
	}
	
	public String toString() {
		return name + " (" + email + ")";
	}
	
	//displays all fo the employees information
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Title: "+ title);
		System.out.println("Phone: " + phone);
		System.out.println("Location: " + location);
		System.out.println("Department: " + department.getName());
		System.out.println("Email: " + email);
		System.out.println("Company: " + company.getName());
	}
}
