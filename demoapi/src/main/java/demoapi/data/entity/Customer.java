package demoapi.data.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Customer {

	private int id;
	private String firstName;
	private String lastName;
	private String gender;
//	private Address postalAddress;
//	private Address billingAddress;
	
	private int billingAddressId;
	private int postalAddressId;
	
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
//	public Address getPostalAddress() {
//		return postalAddress;
//	}
//	public void setPostalAddress(Address postalAddress) {
//		this.postalAddress = postalAddress;
//	}
//	public Address getBillingAddress() {
//		return billingAddress;
//	}
//	public void setBillingAddress(Address billingAddress) {
//		this.billingAddress = billingAddress;
//	}
//	
	public int getBillingAddressId() {
		return billingAddressId;
	}
	public void setBillingAddressId(int billingAddressId) {
		this.billingAddressId = billingAddressId;
	}
	public int getPostalAddressId() {
		return postalAddressId;
	}
	public void setPostalAddressId(int postalAddressId) {
		this.postalAddressId = postalAddressId;
	}
	
	
}
