
public class AddressBookMain {
	
	//Main method displaying welcome message.
	
		public static void main(String[] args) {
			System.out.println("Welcome to address book program!");
			
			AddressBook addressbook = new AddressBook();
			addressbook.addPerson();
			addressbook.display();
		}
}
