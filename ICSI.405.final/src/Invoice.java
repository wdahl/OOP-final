
//Invoice class for holding the information assaocitated with invoices for a company
public class Invoice implements Pay<Invoice> {
	private String company; //company to pay
	private double amount; // amoun to pay
	
	public Invoice() {
		company = null;
		amount = 0.0;
	}
	
	public Invoice(String company, double amount) {
		this.company = company;
		this.amount = amount;
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	//pays the Invoice
	public void pay() {
		System.out.println("Paied $" + this);
	}
	
	public String toString() {
		return amount + " to " + company;
	}
}
