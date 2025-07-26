# Digitial-Wallet-Microservice
This project is a Digital Wallet Microservice developed as part of the technical assignment for Damyant Fintech.  
It provides RESTful APIs that allow users to: 
1.Create wallets  
2.Add or deduct funds  
3.Retrieve wallet details  
4.View transaction history.  
The application uses MySQL as the database to persist wallet and transaction data.

Core Features to Implement:
1. Create Wallet
   POST /wallets
           Inputs: userId, initialBalance
           Output: Wallet details with generated walletId
   
2. Get Wallet Details
   GET /wallets/{walletId}
             Returns current balance and user info
   
3. Add Funds to Wallet
   POST /wallets/{walletId}/add
             Inputs: amount
              Updates the wallet balance

4. Deduct Funds from 
POST /wallets/{walletId}/deduct
            Inputs: amount
            Deducts from balance (ensure balance doesn't go negative)
   
5. Get Transaction History
GET /wallets/{walletId}/transactions
        Shows all credit/debit operations for a wallet


Tech Requirements:
1. Language: Java (version 17 or higher)
2. Framework: Spring Boot
3. Database: MySQL
4. Architecture: Microservice-style (single service is fine)
5. API Design: Follow RESTful principles
6. Build Tool: Maven 
