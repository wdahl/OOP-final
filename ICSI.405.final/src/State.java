import java.util.ArrayList;

//model of The state
public class State {
	private String name; //name of the state
	private ArrayList<Company> companies; //list of companys owned by the state
	private ArrayList<Employee> employees; //list of all employees of the state
	private static State state = null; //their can only be one instance of the state
	
	private State() {
		name = null;
		companies = null;
		employees = null;
	}
	
	private State(String name) {
		this.name = name;
		companies = new ArrayList<>();
		employees = new ArrayList<>();
	}
	
	private State(String name, ArrayList<Company> companies) {
		this.name = name;
		this.companies = companies;
		employees = new ArrayList<>();
	}
	
	private State(String name, ArrayList<Company> companies, ArrayList<Employee> employees) {
		this.name = name;
		this.companies = companies;
		this.employees = employees;
	}
	
	public static void setState() {
		state = new State();
	}
	
	public static void setState(String name) {
		state = new State(name);
	}
	
	public static void setState(String name, ArrayList<Company> companies) {
		state = new State(name, companies);
	}
	
	public void setState(String name, ArrayList<Company> companies, ArrayList<Employee> employees) {
		state = new State(name, companies, employees);
	}
	
	public static State getState() {
		if(state == null) {
			state = new State();
		}
		return state;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Company> getCompanies() {
		return companies;
	}
	public void setCompanies(ArrayList<Company> companies) {
		this.companies = companies;
	}
	public ArrayList<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	
	//adds company to the list of comapnies owned by the state
	public ArrayList<Company> addCompany(Company company){
		companies.add(company);
		return companies;
	}
	
	//removes a company from the list of companies owned by the state
	public ArrayList<Company> removeCompany(Company company){
		companies.remove(company);
		for(Employee e: employees) {
			if(e.getCompany().equals(company)) {
				removeEmployee(e);
			}
		}
		return companies;
	}
	
	//adds an employee tot he list of employees employeed by the state
	public ArrayList<Employee> addEmployee(Employee employee){
		employees.add(employee);
		return employees;
	}
	
	//removes the employee from the list of employees of the state
	public ArrayList<Employee> removeEmployee(Employee employee){
		employees.remove(employee);
		if(employee.getCompany().getEmployees().contains(employee))
			employee.getCompany().removeEmployee(employee);
		return employees;
	}
	
	public String toString() {
		return name;
	}
}
