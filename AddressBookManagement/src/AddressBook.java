import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

		Scanner sc = new Scanner(System.in);
		List<Person> personInfo = new ArrayList<>();
	
	//Created method to add a contact 
		
		public void addPerson() {	
		
		
			System.out.println("Enter first name: ");
	        String firstName = sc.next();
	        
	        System.out.println("Enter last name: ");
	        String lastName = sc.next();
	        
	        System.out.println("Enter address: ");
	        String address = sc.nextLine();
	        
	        System.out.println("Enter city: ");
	        String city = sc.next();
	        
	        System.out.println("Enter state: ");
	        String state = sc.next();
	        
	        System.out.println("Enter mobile number: ");
	        String mobileNumber = sc.next();
	        
	        System.out.println("Enter pincode: ");
	        String pincode = sc.next();
	        
	        System.out.println("Enter email: ");
	        String email = sc.nextLine();
	        
	        Person person = new Person(firstName, lastName, address, city, state, mobileNumber, pincode, email);
	        personInfo.add(person);		
	}

}
