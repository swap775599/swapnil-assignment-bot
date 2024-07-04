package com.example.tradingbot;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WalletTracker {
    private final DatabaseManager dbManager;
    private static final Logger logger = LoggerFactory.getLogger(WalletTracker.class);

    public WalletTracker() {
        this.dbManager = new DatabaseManager();
    }

    public List<String> getWallets() {
        try {
            return dbManager.fetchWallets();
        } catch (DatabaseException e) {
            logger.error("Failed to fetch wallets: {}", e.getMessage());
            return null;
        }
    }

    public List<Transaction> getTransactions(String wallet) {
        try {
            return dbManager.fetchTransactions(wallet);
        } catch (BlockchainApiException e) {
            logger.error("Failed to fetch transactions for wallet {}: {}", wallet, e.getMessage());
            return null;
        }
    }
}
