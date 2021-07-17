import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressBook {

		Scanner sc = new Scanner(System.in);
		List<Person> personInfo = new ArrayList<>();
		ArrayList<AddressBookName> addressbooklist = new ArrayList<AddressBookName>();
	
		// Created method to make new address book with different names.
		
		public void newAddressBook() {
			
			System.out.println("Enter AddressBook Name");
		    String addressBookName = sc.next();
		    
		    AddressBookName address = new AddressBookName(addressBookName);
		    
		    addressbooklist.add(address);
		    System.out.println(addressbooklist.toString());
		}
		
		// Created method to display all the address books
		
		public void openAddressBook() {  
			
			displayAddressBook();
	        System.out.println("Enter name to Open  AddressBook");
	        String addressBookName = sc.next();
	        
	        for (AddressBookName addressBook : addressbooklist) {
	            if (addressBookName.equals(addressBook.getAddressBookName())) {
	                System.out.println("Address Book " + addressBook.getAddressBookName() + " is opened: ");
	            }
	        }
	    }
		
		 public void displayAddressBook() {
		        System.out.println("Display List of all AddressBook");
		        for (int index = 0; index < addressbooklist.size(); index++) {
		            System.out.println(addressbooklist.get(index));
		        }
		    }
		
	//Created method to add a contact 
		
		public void addPerson() {
			
			System.out.println("Enter how many people you want to add to the address book? ");
			int numberOfPeople = sc.nextInt();
			
			for(int index=0; index<numberOfPeople; index++) {
				
				try {
					
					System.out.println("Enter first name: ");
			        String firstName = sc.next();
			        Pattern myPattern1 = Pattern.compile("^[A-Z]{1}[a-zA-Z]{2,}");
			        Matcher myMatcher1 = myPattern1.matcher(firstName);
	        
					System.out.println("Enter last name: ");
			        String lastName = sc.next();
			        Pattern myPattern2 = Pattern.compile("^[A-Z]{1}[a-zA-Z]{2,}");
			        Matcher myMatcher2 = myPattern2.matcher(lastName);
		       
		    	   	System.out.println("Enter address: ");
			        String address = sc.next();
			        Pattern myPattern3 = Pattern.compile("^[a-zA-Z]{5,}");
			        Matcher myMatcher3 = myPattern3.matcher(address);
		      
		        	System.out.println("Enter city: ");
				    String city = sc.next();
				    Pattern myPattern4 = Pattern.compile("^[a-zA-Z]{5,}");
				    Matcher myMatcher4 = myPattern4.matcher(city);
			      
		        	System.out.println("Enter state: ");
			        String state = sc.next();
			        Pattern myPattern5 = Pattern.compile("^[a-zA-Z]{5,}");
				    Matcher myMatcher5 = myPattern5.matcher(state);
		     
		        	System.out.println("Enter mobile number: ");
				    String mobileNumber = sc.next();
				    Pattern myPattern6 = Pattern.compile("^[0-9]{10}");
					Matcher myMatcher6 = myPattern6.matcher(mobileNumber);
		        
			        System.out.println("Enter pincode: ");
			        String pincode = sc.next();
			        Pattern myPattern7 = Pattern.compile("^[0-9]{6}");
					Matcher myMatcher7 = myPattern7.matcher(pincode);
			        
			        System.out.println("Enter email: ");
			        String email = sc.next();
			        Pattern myPattern8 = Pattern.compile("^[a-z0-9]{3,}(\\.[a-z0-9]{3,})*@[a-z]{3,}[a-z]{2,4}(\\.[a-z]{2,4})*");
					Matcher myMatcher8 = myPattern8.matcher(email);
	        
					Person person = new Person(firstName, lastName, address, city, state, mobileNumber, pincode, email);
					personInfo.add(person);
					System.out.println(personInfo);
	        
				}
				catch(Exception ex) 
				{
					System.out.println("Enter all details within the restrcitions!");
				}
		}
		
	}
		
	//Display method to display person's details previously entered.
		
		public void display() {
			
				System.out.println("Person's information: ");
				
				for(int i=0; i<personInfo.size(); i++) {
					System.out.println(personInfo.get(i));
			}
		
		}
		
		//Method to edit any person's information already present in the list.
		
		public void editPerson() {
			
			System.out.println("Enter first Name to edit person's details: ");
	        String firstName = sc.next();
	        
	        for ( int i=0; i< personInfo.size(); i++) {
	        	
	        	Person person = (Person)personInfo.get(i);
	        	
				if(firstName.equals(person.getFirstName())) {
					System.out.println("Select option to edit details: \n " +"1. Last name: \n" + "2. Address: \n" + "3. City: \n" 
											+"4. State: \n" +"5. Mobile number: \n"+ "6. Pincode: \n"+ "7. Email:");
					try {
						int option = sc.nextInt();
						
						switch (option) {
					
						case 1:
							System.out.println("Enter last name: ");
							String lastName = sc.next();
							Pattern myPattern2 = Pattern.compile("^[A-Z]{1}[a-zA-Z]{2,}");
					        Matcher myMatcher2 = myPattern2.matcher(lastName);
							person.setLastName(lastName);
							break;
							
						case 2:
							System.out.println("Enter address: ");
							String address = sc.next();
							 Pattern myPattern3 = Pattern.compile("^[a-zA-Z]{5,}");
						     Matcher myMatcher3 = myPattern3.matcher(address);
							person.setAddress(address);
							break;
							
					    case 3 :
					    	System.out.println("Enter city: ");
					    	String city = sc.next();
					    	 Pattern myPattern4 = Pattern.compile("^[a-zA-Z]{5,}");
							 Matcher myMatcher4 = myPattern4.matcher(city);
					    	person.setCity(city);
					    	break;
					    	
					    case 4:
					    	System.out.println("Enter state: ");
					    	String state = sc.next();
					    	Pattern myPattern5 = Pattern.compile("^[a-zA-Z]{5,}");
						    Matcher myMatcher5 = myPattern5.matcher(state);
					    	person.setState(state);
					    	break;
					    	
					    case 5 :
					    	System.out.println("Enter new Phone Number");
					    	String mobileNumber = sc.next();
					    	Pattern myPattern6 = Pattern.compile("^[0-9]{10}");
							Matcher myMatcher6 = myPattern6.matcher(mobileNumber);
					    	person.setMobileNumber(mobileNumber);
		                    break;
		                    
					    case 6:
					    	System.out.println("Enter pincode: ");
					    	String pincode = sc.next();
					    	Pattern myPattern7 = Pattern.compile("^[0-9]{6}");
							Matcher myMatcher7 = myPattern7.matcher(pincode);
					    	person.setPincode(pincode);
					    	break;
					    	
					    case 7:
						    System.out.println("Enter email: ");
						    String email = sc.next();
						    Pattern myPattern8 = Pattern.compile("^[a-z0-9]{3,}(\\.[a-z0-9]{3,})*@[a-z]{3,}[a-z]{2,4}(\\.[a-z]{2,4})*");
							Matcher myMatcher8 = myPattern8.matcher(email);
						    person.setEmail(email);
						    break;
					    		      
					    default :
					    	System.out.println("Incorrect Choice");				
						}			     
					}catch(Exception ex) {
						System.out.println("Enter all details within the resrtiction!");
					}
				}
				else 
					System.out.println("Entered first name does not exist!");
	        }			
		}
		
		//Method to delete a contact from the address book
		
		public void deletePerson() {
			
				System.out.println("Enter first name to delete its contact: ");
				String firstName = sc.next();
				
				for (int i=0; i< personInfo.size(); i++) {
					
					Person person = (Person)personInfo.get(i);
					if(firstName.equals(person.getLastName())) {
						System.out.println(personInfo.get(i));
						personInfo.remove(i);
						System.out.println("Record Deleted");
				}
			}
		}
		
			@Override  
			protected void finalize() {   
				sc.close(); 
	    } 
}