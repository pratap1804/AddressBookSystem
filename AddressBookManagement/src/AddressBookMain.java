import java.util.Scanner;

public class AddressBookMain {
	

	static Scanner sc = new Scanner(System.in);
	
	//Main method displaying welcome message.
	
		public static void main(String[] args) {
			System.out.println("Welcome to address book program!");
			
	//Created an object, asking user and accordingly calling methods.
			
			AddressBook addressBook = new AddressBook();
		    	System.out.println("Select any option to perform Operation of Person \n" 
		    							+" 1. To add a person: \n" + 
		    			                      	"2. To view already existed address book "+
		    			                      		"3. To add a new address book "+
		    											" 4. To edit Person's details: \n"+ 
		    												"5. To display person's information \n"+
		    													"6. To delete a contact ");
		    
						    int option = sc.nextInt();
						    switch (option) {
						    
							case 1:
								addressBook.addPerson();
								break;
								
							case 2:
								addressBook.displayAddressBook();
								break;
								
							case 3:
								addressBook.newAddressBook();
								break;
								
							case 4:
								addressBook.editPerson();
								break;
								
							case 5 :
								addressBook.display();
								break;
								
							case 6:
								addressBook.deletePerson();
								break;
								
							default :
								System.out.println("Available choice is from 1 to 4!");
								
						    }
	    			}	
		}
