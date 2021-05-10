package com.example.customerservice;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
class CustomerService {

	private final Map<Long, Customer> customerMap;
	
	public CustomerService() {
		customerMap = new HashMap<>();
		customerMap.put(1L, new Customer(1L, "John", "Kennedy"));
		customerMap.put(2L, new Customer(2L, "Richard", "Nixon"));
		customerMap.put(3L, new Customer(3L, "George", "Bush"));
	}

	Customer findCustomerById(Long id) {
		return customerMap.get(id);
	}
}
