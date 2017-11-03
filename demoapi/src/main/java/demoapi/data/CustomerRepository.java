package demoapi.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import demoapi.data.entity.Customer;

public class CustomerRepository {

	private Map<Integer, Customer> customersData = new HashMap<>();
	
	public CustomerRepository(){
		this.init();
	}
	
	private void init(){
		Customer customer = null;
		for (int i = 0; i < 100; i++) {
			customer = DataHelper.createNewCustomer(i);
			customersData.put(customer.getId(), customer);
		}
		
	}
	
	
	
	
	
	public List<Customer> allCustomers(){
		return  new ArrayList<>(customersData.values()) ;
	}
	
	public Customer save(Customer customer){
		int newId = customersData.size();
		customer.setId(newId);
		customersData.put(newId, customer);
		return customer;		
	}
	
	public Customer update(Customer customer){
		customersData.put(customer.getId(), customer);
		return customer;		
	}
	
	public boolean delete(int id){
		customersData.remove(id);
		return true;		
	}
	
	public Customer findCustomer(int id){
		return  customersData.get(id);
	}
	
}
