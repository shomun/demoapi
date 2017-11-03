package demoapi.data;

import java.util.HashMap;
import java.util.Map;

import demoapi.data.entity.Address;

public class AddressRepository {

	
	private Map<Integer, Address> addressesData = new HashMap<>();
	
	public AddressRepository(){
		this.init();
	}
	
	private void init(){
		Address address = null;
		for (int i = 0; i < 100; i++) {
			address = DataHelper.createNewAddress(i);
			addressesData.put(address.getId(), address);
		}
		
	}
	
	
	
	public Address save(Address address){
		int newId = addressesData.size();
		address.setId(newId);
		addressesData.put(newId, address);
		return address;		
	}
	
	public Address update(Address address){
		addressesData.put(address.getId(), address);
		return address;		
	}
	
	public boolean delete(int id){
		addressesData.remove(id);
		return true;		
	}
	
	public Address findCustomer(int id){
		return  addressesData.get(id);
	}
	
}
