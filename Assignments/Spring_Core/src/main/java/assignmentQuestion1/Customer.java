package assignmentQuestion1;

public class Customer {

	private int customerId;
	private String customerName;
	private long customerContact;
	private Address customerAddress;

	public Customer(int customerId, String customerName, long customerContact, Address customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;

	}

	public void details() {
		System.out.println("CustomerID: \t\t " + this.customerId + "\nCustomer Name: \t\t " + this.customerName
				+ "\nCustomer Contact:   \t " + this.customerContact + "\nAddress of the Customer: "
				+ this.customerAddress.getStreet() + "\n\t\t\t " + this.customerAddress.getCity() + "-"
				+ this.customerAddress.getZip() + "\n\t\t\t " + this.customerAddress.getState() + "\n\t\t\t "
				+ this.customerAddress.getCountry());

	}

	public Address getCustomerAddress() {
		return customerAddress;
	}

	public long getCustomerContact() {
		return customerContact;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}

	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
