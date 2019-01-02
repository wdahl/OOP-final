import java.util.ArrayList;

//model of companys in the state
public class Company {
	private String name; // name of company
	private ArrayList<Employee> employees; ///list of employees hired by the company
	private State state; //state that owns the company
	private ArrayList<Department> departments; //list of departments in the company
	private ArrayList<Invoice> invoices; //list of outstanding invoices for the company
	
	public Company() {
		name = null;
		employees = new ArrayList<>();
		state = null;
		departments = new ArrayList<>();
		invoices = new ArrayList<>();
	}
	
	public Company(String name, State state) {
		this.name = name;
		this.state = state;
		employees = new ArrayList<>();
		departments = new ArrayList<>();
		invoices = new ArrayList<>();
		state.addCompany(this);
	}
	
	public Company(String name, State state, ArrayList<Employee> employees, ArrayList<Department> departments) {
		this.name = name;
		this.state = state;
		this.employees = employees;
		this.departments = departments;
		invoices = new ArrayList<>();
		state.addCompany(this);
	}
	
	public Company(String name, State state, ArrayList<Employee> employees, ArrayList<Department> departments, ArrayList<Invoice> invoices) {
		this.name = name;
		this.state = state;
		this.employees = employees;
		this.departments = departments;
		this.invoices = invoices;
		state.addCompany(this);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
		state.addCompany(this);
	}
	public ArrayList<Department> getDepartments() {
		return departments;
	}
	public void setDepartments(ArrayList<Department> departments) {
		this.departments = departments;
	}
	public ArrayList<Invoice> getInvoices() {
		return invoices;
	}
	public void setInvoices(ArrayList<Invoice> invoices) {
		this.invoices = invoices;
	}
	
	public ArrayList<Department> addDepartment(Department department){
		departments.add(department);
		return departments;
	}
	
	public ArrayList<Department> removeDepartment(Department department){
		departments.remove(department);
		return departments;
	}
	
	public ArrayList<Employee> addEmployee(Employee employee){
		employees.add(employee);
		state.addEmployee(employee);
		if(!employee.getCompany().equals(this))
			employee.setCompany(this);
		return employees;
	}
	
	public ArrayList<Employee> removeEmployee(Employee employee){
		employees.remove(employee);
		if(state.getEmployees().contains(employee))
			state.removeEmployee(employee);
		return employees;
	}
	
	public String toString() {
		return state + " " + name;
	}
	
	public ArrayList<Invoice> addInvoice(Invoice invoice){
		invoices.add(invoice);
		return invoices;
	}
	
	public ArrayList<Invoice> removeInvoice(Invoice invoice){
		invoices.remove(invoice);
		return invoices;
	}
	
	//pays all emplpyees
	public void payEmployees() {
		Pay.payAll(employees);
	}
	
	//pays all the invoices
	public void payInvoices() {
		Pay.payAll(invoices);
	}
}
