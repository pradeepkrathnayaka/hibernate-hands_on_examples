package com.rmpksoft.hbtest;

import javax.inject.Inject;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.rmpksoft.hbtest.service.CustomerService;

public class CustomerOperations {
	
	CustomerService customerService;

	@Inject
	public CustomerOperations(CustomerService customerService) {
		this.customerService = customerService;
	}

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new AppInjector());
		CustomerService app = injector.getInstance(CustomerService.class);
		
	}

}
