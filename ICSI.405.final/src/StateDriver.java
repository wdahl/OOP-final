
public class StateDriver {
	public static void main(String[] args) {
		//creates the state
		State.setState("New York");
		State state = State.getState();
		
		//companies in the state
		Company its = new Company("Office of Info Tech Services", state);
		Company dmv = new Company("Dept. of Motor Vehicles", state);
		Company dtf = new Company("Dept. of Tax and Finance", state);
		
		//Deparmtnets in its
		Department eus = new Department("End User Services", its);
		Department dev = new Department("Development", its);
		Department net = new Department("Networking", its);
		
		//departments in dmv
		Department cus = new Department("Customer Service", dmv);
		Department mail = new Department("Mail Services", dmv);
		Department main = new Department("Maintence", dmv);
		
		//departments in dtf
		Department fin = new Department("Finance", dtf);
		Department audit = new Department("Auditing", dtf);
		Department tax = new Department("Tax", dtf);
		
		//employees of its
		HourlyEmployee will = new HourlyEmployee("Will", 20, "Intern", "555-555-5555", "Swan St.", eus, "William.Dahl@its.ny.gov", its);
		will.setHours(40);
		SalariedEmployee ant = new SalariedEmployee("Antonella", SalaryGrade.G18, "ITS 2", "555-555-5556", "Swan St.", dev, "Antonella@its.ny.gov", its);
		ContractEmployee john = new ContractEmployee("John", 75000, "", "555-555-5557", "Swan St.", net, "John@its.ny.gov", its);
		
		//employees of dmv
		HourlyEmployee sydney = new HourlyEmployee("Sydney", 22, "Intern", "555-555-5558", "Swan St.", cus, "Sydney@dmv.ny.gov", dmv);
		sydney.setHours(30);
		SalariedEmployee jen = new SalariedEmployee("Jen", SalaryGrade.G11, "ITS 1", "555-555-5559", "Swan St.", mail, "Jen@dmv.ny.gov", dmv);
		ContractEmployee james = new ContractEmployee("James", 30000, "", "555-555-5560", "Swan St.", main, "James@dmv.ny.gov", dmv);
		
		//employees of dtf
		HourlyEmployee sam = new HourlyEmployee("Sam", 30, "DTF 1", "555-555-5561", "Washington Ave.", fin, "Sam@dtf.ny.gov", dtf);
		sam.setHours(80);
		SalariedEmployee Jess = new SalariedEmployee("Jess", SalaryGrade.G20, "DTF 3", "555-555-5562", "Whasington Ave.", audit, "Jess@dtf.ny.gov", dtf);
		ContractEmployee Mike = new ContractEmployee("Mike", 60000, "", "555-555-5563", "Whasington Ave.", tax, "Mike@dtf.ny.gov", dtf);
		
		//moes invoices
		Invoice toshiba = new Invoice("Toshiba", 200000);
		Invoice hp = new Invoice("HP", 160000);
		Invoice dell = new Invoice("Dell", 120000);
		
		//adds the invoices to its outstanding invoces
		its.addInvoice(toshiba);
		its.addInvoice(hp);
		its.addInvoice(dell);
		
		System.out.println("Paying all Invoices:");
		its.payInvoices();
		System.out.println();
		
		System.out.println("Paying all Employees:");
		its.payEmployees();
		dmv.payEmployees();
		dtf.payEmployees();
		System.out.println();
		
		System.out.println("All State Employees info: ");
		for(Employee e: state.getEmployees()) {
			e.displayInfo();
		}
		System.out.println();
		
		System.out.println("Will has left the state:");
		state.removeEmployee(will);
		for(Employee e: state.getEmployees()) {
			e.displayInfo();
		}
		System.out.println();
		
		System.out.println("Paying " + its + "Employees");
		its.payEmployees();
		System.out.println();
		
		System.out.println("Sydney has swtiched from " + dmv + " to " + its);
		dmv.removeEmployee(sydney);
		its.addEmployee(sydney);
		sydney.setEmail("Sydney@its.ny.gov");
		sydney.setDepartment(eus);
		System.out.println();
		
		System.out.println("Paying " + dmv + " Employees:");
		dmv.payEmployees();
		System.out.println();
		
		System.out.println("Paying " + its + " Employees:");
		its.payEmployees();
		System.out.println();
		
		System.out.println(dtf + " is no longer a company:");
		System.out.println("All State Employees info: ");
		for(Employee e: state.getEmployees()) {
			e.displayInfo();
		}
	}
}
