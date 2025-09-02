package Customer;

public interface ICustomerDAO {
	public boolean add(String name, String phoneNumber);
	public Customer getPoint(String customerId);
	public Customer setPoint(String customerId);
	public boolean removeCustomer(String customerId);
}
