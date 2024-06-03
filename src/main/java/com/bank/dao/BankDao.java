package com.bank.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.entity.Bank;
import com.bank.repositary.BankRepositary;

@Repository
public class BankDao {
	@Autowired
    BankRepositary br;
	
	public String insertBank(List<Bank> b) {

          br.saveAll(b);
          return "Bank Details Updated Successfully";
	}
	public String getBranchByIfsccode(Integer a) {
		return br.getBranchByIfsccode(a);
	}
	
}
