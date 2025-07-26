package com.project.digitalWalletMicroservice.service;

import java.math.BigDecimal;


import com.project.digitalWalletMicroservice.model.Transaction;

public interface TransactionService {
	
	public Transaction transactionHistory(Long walletId,BigDecimal amount,String transactionType,Boolean isSucces);
	

}
