
//Created a class to create different address book with different name.
	public class AddressBookName {
	
		// Declaring instance variable.		

		String addressBookName;
	

		//Generated constructor
	
		    public AddressBookName(String addressBookName) {
		        this.addressBookName = addressBookName;
		    }
		    
		// Generated getters and setters for address book. 
		    
		    public String getAddressBookName() {
		        return addressBookName;
		    }
		
		    public void setAddressBookName(String addressBookName) {
		        this.addressBookName = addressBookName;
		    }
		    
		// Generated to string method for address book.
		    
		    public String toString() {
		        return "Address Book Name: " + addressBookName ;
		    }
}
