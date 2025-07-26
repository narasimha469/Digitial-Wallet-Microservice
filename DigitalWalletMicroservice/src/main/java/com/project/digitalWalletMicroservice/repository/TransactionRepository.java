package com.project.digitalWalletMicroservice.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.digitalWalletMicroservice.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
	public List<Transaction> findByWalletId(Long walletId);
	
	

}
