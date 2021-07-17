
public class Person {

	//Declaring all instance variable
		
				String firstName;
				String lastName;
				String address;
				String city;
				String state;
				String mobileNumber;
				String pincode;
				String email;
		
	// Created constructor for each instance variable.
	
			public Person(String firstName, String lastName, String address, String city, String state, String mobileNumber, String pincode, String email) {
				this.firstName = firstName;
				this.lastName = lastName;
				this.address = address;
				this.city = city;
				this.state = state;
				this.mobileNumber = mobileNumber;
				this.pincode = pincode;
				this.email = email;
			}

	//Generated getters and setter for each instance variable.
	
			public String getFirstName() {
				return firstName;
			}
		
			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}
		
			public String getLastName() {
				return lastName;
			}
		
			public void setLastName(String lastName) {
				this.lastName = lastName;
			}
		
			public String getAddress() {
				return address;
			}
		
			public void setAddress(String address) {
				this.address = address;
			}
		
			public String getCity() {
				return city;
			}
		
			public void setCity(String city) {
				this.city = city;
			}
		
			public String getState() {
				return state;
			}
		
			public void setState(String state) {
				this.state = state;
			}
		
			public String getMobileNumber() {
				return mobileNumber;
			}
		
			public void setMobileNumber(String mobileNumber) {
				this.mobileNumber = mobileNumber;
			}
		
			public String getPincode() {
				return pincode;
			}
		
			public void setPincode(String pincode) {
				this.pincode = pincode;
			}
		
			public String getEmail() {
				return email;
			}
		
			public void setEmail(String email) {
				this.email = email;
			}

	// Generated toString method.
	
		@Override
		public String toString() 
		{
			return "Person [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
								+ ", state=" + state + ", mobileNumber=" + mobileNumber + ", pincode=" + pincode + ", email=" + email+ "]";
		}
		
	
}
