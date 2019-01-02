import java.util.Collection;

//Interface for paying Invoices and Employees
public interface Pay<T> {
	abstract void pay();
	
	//pays all invoices or employees in a Collection
	public static <T extends Pay<T>> void payAll(Collection<T> items) {
		for(T e: items) {
			e.pay();
		}
	}
}
