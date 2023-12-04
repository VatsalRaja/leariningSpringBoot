package com.vatsal.learnspringframwork.example.a2;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class BusinessCalculationService {
	DataService dataservice;
	
	@Autowired
	public BusinessCalculationService(DataService dataservice) {
		super();
		this.dataservice = dataservice;
	}
	
	public int findMax() {
		return Arrays.stream(dataservice.retrieveData()).max().orElse(0);
	}
	
}
