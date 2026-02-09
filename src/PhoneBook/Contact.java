package PhoneBook;

public class Contact {
  private String name;
  private long contactNo;
  public Contact(String name, long contactNo) {
	super();
	this.name = name;
	this.contactNo = contactNo;
  }
  public String getName() {
	return name;
  }
  public long getContactNo() {
	return contactNo;
  }
  @Override
  public String toString() {
	return "Contact [name=" + name + ", contactNo=" + contactNo + "]";
  }
  
  
}
