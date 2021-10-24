package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import  org.junit.jupiter.api.Test;

import main.java.model.Contact;
import main.java.model.ContactService;

public class ContactServiceTest {
	ContactService newService = new ContactService("1","0","0","1234567890","0");
	ArrayList<Contact> contactList = new ArrayList<>();
	@Test
	void testContactService() {
		//String id, String first, String last, String phone, String address
		ContactService newService = new ContactService("12345","Carn","Ivor","5558152808","201 lahsf");
		//checks to ensure that the service is created and the variable data is being correctly used
		assertTrue(newService.getID().equals("12345"));
		assertTrue(newService.getFirstName().equals("Carn"));
		assertTrue(newService.getLastName().equals("Ivor"));
		assertTrue(newService.getphoneNumber().equals("5558152808"));
		assertTrue(newService.getAddress().equals("201 lahsf"));
	}
	//testing if a contact will actually be added to the list by checking the id of the new service
	@Test
	void testAddContactToList() {
		newService.ID = newService.addContact("0000000");
		assertTrue(newService.getID().equals("0000000"));
	}
}