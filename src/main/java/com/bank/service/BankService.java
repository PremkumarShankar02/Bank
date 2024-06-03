package com.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.bank.dao.BankDao;
import com.bank.entity.Bank;

@Service
public class BankService {
	@Autowired
	BankDao bd;
	
	public String insertBank(List<Bank> b) {
		return bd.insertBank(b);
	}
	public String getBranchByIfsccode(Integer a) {
		return bd.getBranchByIfsccode(a);
	}

}
