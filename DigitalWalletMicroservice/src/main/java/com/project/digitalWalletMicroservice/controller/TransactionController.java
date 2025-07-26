package com.project.digitalWalletMicroservice.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.digitalWalletMicroservice.model.Transaction;
import com.project.digitalWalletMicroservice.service.TransactionServiceImple;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionServiceImple transactionService;

    @GetMapping("/wallets/{walletId}")
    public List<Transaction> getTransactionsByWalletId(@PathVariable Long walletId) {
        return transactionService.findTransactionsByWalletId(walletId);
    }

    
    @PostMapping("/transactions")
    public Transaction recordTransaction( @RequestParam Long walletId, @RequestParam BigDecimal amount,@RequestParam String transactionType, @RequestParam Boolean isSuccess
    ) {
        return transactionService.transactionHistory(walletId, amount, transactionType, isSuccess);
    }
}
