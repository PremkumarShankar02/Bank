package com.bank.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entity.Bank;
import com.bank.service.BankService;

@RestController
@RequestMapping(value="/bank")
public class BankController {
	@Autowired
	BankService be;
	
	static Logger log=Logger.getLogger(BankController.class);
	
	@PostMapping(value="/insertall")
	public String insertBank(@RequestBody List<Bank> b) {
		PropertyConfigurator.configure("banklog.properties");
		log.info(be.insertBank(b));
		return be.insertBank(b);
	}
	@GetMapping(value="/getbranch/{a}")
	public String getBranchByIfsccode(@PathVariable int a) {
		PropertyConfigurator.configure("banklog.properties");
		log.error(be.getBranchByIfsccode(a));
		return be.getBranchByIfsccode(a);
	}

}
