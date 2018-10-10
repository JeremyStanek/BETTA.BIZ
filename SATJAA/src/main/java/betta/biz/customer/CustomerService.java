package betta.biz.customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomers() {
	     List<Customer> customers = new ArrayList<>();
	     customerRepository.findAll()
	      .forEach(customers::add);
	      return customers;
	}
	
	public Optional<Customer> getCustomer(String id) {
		return customerRepository.findById(id);
	}

	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	public void updateCustomer(String id, Customer customer) {
		customerRepository.save(customer);
	}

	public void deleteCustomer(String id) {
		customerRepository.deleteById(id);
		
	}
}
