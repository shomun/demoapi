package demoapi.services.dto;

import demoapi.data.entity.Customer;

public class CustomerDTOTransformer implements DTOTransformer<Customer, CustomerDTO> {

	@Override
	public CustomerDTO transform(Customer customer) {
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setId(customer.getId());
		customerDTO.setFirstName(customer.getFirstName());
		customerDTO.setLastName(customer.getLastName());
		customerDTO.setGender(customer.getGender());
		customerDTO.setBillingAddressLink("https://localhost:8081/addresses/"+customer.getBillingAddressId());
		customerDTO.setPostalAddressLink("https://localhost:8081/addresses/"+customer.getPostalAddressId());
		return customerDTO;
	}

}
