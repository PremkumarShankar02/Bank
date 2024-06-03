package com.bank.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bank.entity.Bank;

public interface BankRepositary extends JpaRepository<Bank, Integer> {
	
	@Query(value="select branch from bank_details where ifsccode=?", nativeQuery =true)
	public String getBranchByIfsccode(Integer a);

}
