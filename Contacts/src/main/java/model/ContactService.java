package main.java.model;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactService extends Contact{
	public ContactService(String id, String first, String last, String phone, String address) {
		super(id, first, last, phone, address);
		// TODO Auto-generated constructor stub
	}

	Scanner n = new Scanner(System.in);
	String input;
	ArrayList<Contact> list = new ArrayList<Contact>();
	ContactService newService;
	
	//adds a new contact to the contact list
	public void addContact() {
		System.out.println("Insert the customer ID.");
		input = n.next();
		newService.ID = input;
		
		System.out.println("Insert the first name.");
		input = n.next(); 
		
		System.out.println("Insert the last name.");
		input = n.next();
		newService.lastName = input;
		
		System.out.println("Insert the phone number.");
		input = n.next();
		newService.phoneNumber = input;
		
		System.out.println("Insert the address.");
		input = n.nextLine();
		newService.address = input;
		
		list.add(newService);
		
	}
	//used for testing purposes
	public String addContact(String id) {
		return id;
	}
	
	//removes a contact from the list based on the id
	public void removeContact(String id) {
		for(int i = 0; i < list.size(); i++) {
			if(id == list.get(i).ID) {
				list.remove(i);
				System.out.println("Contact removed");
				break;
			}
		}
	}
	
	//edits a contact based on the id
	public void editContact(String id) {
		for(int i = 0; i < list.size(); i++) {
			if(id == list.get(i).ID) {
				System.out.println("What would you like to edit? (f)irst name, (l)ast name, (p)hone number, or (a)ddress?");
				String input = n.next();
				
				if(input == "f") {
					System.out.println("Insert the new first name.");
					input = n.next();
					newService.firstName = input;
				}else if(input == "l") {
					System.out.println("Insert the new last name.");
					input = n.next();
					newService.lastName = input;
				}else if(input == "p") {
					System.out.println("Insert the phone number.");
					input = n.next();
					newService.phoneNumber = input;
				}else if(input == "a") {
					System.out.println("Insert the address");
					input = n.nextLine();
					newService.address = input;
				}
				break;
			}else {
				System.out.println("ID not found");
			}
		}
	}
	
	
}

