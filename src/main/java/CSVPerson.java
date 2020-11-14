import com.opencsv.bean.CsvBindByName;

public class CSVPerson {
	@CsvBindByName(column = "AddressBook")
    private String addressBook;
	
	@CsvBindByName(column = "FirstName")
    private String fName;
	
	@CsvBindByName(column = "LastName")
    private String lName;
	
	@CsvBindByName(column = "Address")
    private String address;
	
	@CsvBindByName(column = "City")
    private String city;
	
	@CsvBindByName(column = "State")
    private String state;
	
	@CsvBindByName(column = "Zip")
    private String zip;
	
	@CsvBindByName(column = "Phone")
    private String phone;
	
	@CsvBindByName(column = "Email")
    private String email;
	
	public String getAddressBook() {
		return addressBook;
	}
	
	public void setAddressBook(String addressBook) {
		this.addressBook = addressBook;
	}
	
	public String getfName() {
		return fName;
	}
	
	public void setfName(String fName) {
		this.fName = fName;
	}
	
	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
