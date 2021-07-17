import java.util.Scanner;

public class AddressBookMain {
	

	static Scanner sc = new Scanner(System.in);
	
	//Main method displaying welcome message.
	
		public static void main(String[] args) {
			System.out.println("Welcome to address book program!");
			
	//Created an object, asking user and accordingly calling methods.
			
			AddressBook addressbook = new AddressBook();
		    	System.out.println("Select any option to perform Operation of Person \n" 
		    							+" 1. To add a person: \n" + 
		    								" 2. To edit Person's details: \n"
		    										+ "3. To display person's information \n"+
		    												"4. To delete a contact ");
		    
						    int option = sc.nextInt();
						    switch (option) {
						    
							case 1 :
								addressbook.addPerson();
								break;
								
							case 2 :
								addressbook.editPerson();
								break;
								
							case 3 :
								addressbook.display();
								break;
								
							case 4:
								addressbook.deletePerson();
								break;
								
							default :
								System.out.println("Available choice is from 1 to 4!");
								
						    }
	    			}	
		}
