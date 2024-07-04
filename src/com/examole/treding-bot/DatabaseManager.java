package com.example.tradingbot;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DatabaseManager {
    private static final Logger logger = LoggerFactory.getLogger(DatabaseManager.class);

    public List<String> fetchWallets() throws DatabaseException {
        logger.info("Fetching wallets...");
        return List.of("wallet1", "wallet2", "wallet3"); // Example wallets
    }

    public List<Transaction> fetchTransactions(String wallet) throws DatabaseException {
        logger.info("Fetching transactions for wallet: {}", wallet);
        return List.of(new Transaction(wallet, "SOL", 10, false)); // Example transactions
    }
}
