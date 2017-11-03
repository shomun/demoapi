package demoapi.services;

import java.util.ArrayList;
import java.util.List;


import demoapi.data.CustomerRepository;
import demoapi.data.entity.Customer;
import demoapi.services.dto.CustomerDTO;
import demoapi.services.dto.CustomerDTOTransformer;

public class CustomerService implements Service<Customer,CustomerDTO>{

	private CustomerRepository customerRepo = new CustomerRepository();
	
	private CustomerDTOTransformer customerDTOTransformer = new CustomerDTOTransformer();
	
	
	

	@Override
	public List<CustomerDTO> list() {
		List<CustomerDTO> customerDTOs = new ArrayList<>(); 
		List<Customer> customers = customerRepo.allCustomers();
		for (Customer customer : customers) {
			customerDTOs.add(customerDTOTransformer.transform(customer));
		}
		return customerDTOs;
	}

	@Override
	public CustomerDTO create(Customer customer) {
		return customerDTOTransformer.transform(customerRepo.save(customer));
	}
	
	@Override
	public CustomerDTO update(Customer customer){
		return customerDTOTransformer.transform(customerRepo.update(customer));
	}
	
	public void delete(int id){
		customerRepo.delete(id);
	}

	@Override
	public CustomerDTO get(int id) {
		return customerDTOTransformer.transform(customerRepo.findCustomer(id));
	}

	

	
}
