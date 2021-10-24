package test;
import static org.junit.jupiter.api.Assertions.*;
import  org.junit.jupiter.api.Test;
import main.java.model.Contact;

public class ContactTest {
	@Test
	void testContact() {
		//String id, String first, String last, String phone, String address
		Contact newContact = new Contact("1234","Johnny","Johnny","5556134745","2019 Clippinger Street");
		//checks to make sure the contact is created correctly
		assertTrue(newContact.getID().equals("1234"));
		assertTrue(newContact.getFirstName().equals("Johnny"));
		assertTrue(newContact.getLastName().equals("Johnny"));
		assertTrue(newContact.getphoneNumber().equals("5556134745"));
		assertTrue(newContact.getAddress().equals("2019 Clippinger Street"));
	}
}
