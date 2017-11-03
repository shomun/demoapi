package demoapi.services.dto;

import demoapi.data.entity.Address;

public class CustomerDTO {

	private int id;
	private String firstName;
	private String lastName;
	private String gender;
	private String postalAddressLink;
	private String billingAddressLink;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPostalAddressLink() {
		return postalAddressLink;
	}
	public void setPostalAddressLink(String postalAddressLink) {
		this.postalAddressLink = postalAddressLink;
	}
	public String getBillingAddressLink() {
		return billingAddressLink;
	}
	
	public void setBillingAddressLink(String billingAddressLink) {
		this.billingAddressLink = billingAddressLink;
		
	}
	
	
	
}
