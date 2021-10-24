package main.java.model;


public class Contact {
	public String ID;
	public String firstName;
	public String lastName;
	public String phoneNumber;
	public String address;
	//constructor sets the variables
	public Contact(String id, String first, String last, String phone, String address) {
		//error handling to ensure that the variable data is to our liking
		if(id.length() > 10 || id == null) {
			throw new IllegalArgumentException("Invalid Input.");
		}else if(first.length() > 10 || first == null) {
			throw new IllegalArgumentException("Invalid Input.");
		}else if(last.length() > 10 || last == null) {
			throw new IllegalArgumentException("Invalid Input.");
		}else if(phone.length() != 10 || phone == null) {
			throw new IllegalArgumentException("Invalid Input.");
		}else if(address.length() > 30 || address == null) {
			throw new IllegalArgumentException("Invalid Input.");
		}
		//variable data finally set
		this.ID = id;
		this.firstName = first;
		this.lastName = last;
		this.phoneNumber = phone;
		this.address = address;
	}
	//returns the id
	public String getID() {
		return ID;
	}
	//returns the first name
	public String getFirstName() {
		return firstName;
	}
	//returns the last name
	public String getLastName() {
		return lastName;
	}
	//returns the phone number
	public String getphoneNumber() {
		return phoneNumber;
	}
	//returns the address
	public String getAddress() {
		return address;
	}
}
