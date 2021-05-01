package com.bk.micro.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bk.micro.limitsservice.bean.LimitConfiguration;
import com.bk.micro.limitsservice.configuration.Configuration;;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration configuration;

	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration() {
		
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}
}
