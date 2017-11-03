package demoapi.data;

import demoapi.data.entity.Address;
import demoapi.data.entity.Customer;

public class DataHelper {

	public enum Gender{
		MALE("male"),FEMALE("female");
		private String value;
		
		Gender(String value){
			this.value = value;
		}
		
		public String toString(){
			return value;
		}
	};
	
	public static Customer createNewCustomer(int id){
		Customer customer = new Customer();
		customer.setId(id);
		customer.setFirstName(id+"_Monirul_"+ id);
		customer.setLastName(id+"_Islam_"+ id);
		customer.setGender(((id % 3)== 0) ? Gender.MALE.value : Gender.FEMALE.value);
		customer.setBillingAddressId(id);
		customer.setPostalAddressId(id);
		return customer;
	}
	
	public static Address createNewAddress(int id){
		Address address = new Address();
		address.setId(id);
		address.setStreet(id+" Pitt street");
		address.setCity("Sydnet");
		address.setPotcode(2000);
		return address;
	}
	
}
