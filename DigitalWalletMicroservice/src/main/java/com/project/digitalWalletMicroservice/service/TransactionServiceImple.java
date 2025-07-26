package com.project.digitalWalletMicroservice.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.digitalWalletMicroservice.globalException.InsufficientBalanceException;
import com.project.digitalWalletMicroservice.model.Transaction;
import com.project.digitalWalletMicroservice.repository.TransactionRepository;
@Service
public class TransactionServiceImple implements TransactionService  {
	
	@Autowired 
	TransactionRepository transactionRepository;
	
	
	public List<Transaction> findTransactionsByWalletId(Long walletId){
		List<Transaction> transactions = transactionRepository.findByWalletId(walletId);
		if(transactions.isEmpty()) {
			 throw new InsufficientBalanceException("No transactions for this walletId");
		}
		return transactions;
	}

	public Transaction transactionHistory(Long walletId,BigDecimal amount,String transactionType,Boolean isSuccess) {
		Transaction transaction = new Transaction();
		transaction.setWalletId(walletId);
		transaction.setAmount(amount);
		transaction.setTransactionType(transactionType);
		transaction.setStatus(isSuccess?"SUCCESS":"FAILURE");
		transaction.setTimestamp(LocalDateTime.now());
		
		return transactionRepository.save(transaction);
	}
	
	

	

}
