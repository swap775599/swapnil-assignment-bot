package com.example.tradingbot;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * WalletTracker class manages the tracking of wallets and their associated transactions.
 * It interacts with a database to fetch wallet information and transactions.
 */
public class WalletTracker {

    // DatabaseManager instance for interacting with the database
    private final DatabaseManager dbManager;

    // Logger for logging information and error messages
    private static final Logger logger = LoggerFactory.getLogger(WalletTracker.class);

    /**
     * Constructor for WalletTracker.
     * Initializes the DatabaseManager instance.
     */
    public WalletTracker() {
        this.dbManager = new DatabaseManager();
    }

    /**
     * Fetches a list of wallets from the database.
     *
     * @return A list of wallet identifiers, or null if there is an error.
     */
    public List<String> getWallets() {
        try {
            // Attempt to fetch wallets from the database
            return dbManager.fetchWallets();
        } catch (DatabaseException e) {
            // Log an error message if fetching wallets fails
            logger.error("Failed to fetch wallets: {}", e.getMessage());
            return null;
        }
    }

    /**
     * Fetches a list of transactions for a specified wallet.
     *
     * @param wallet The identifier of the wallet.
     * @return A list of Transaction objects for the specified wallet, or null if there is an error.
     */
    public List<Transaction> getTransactions(String wallet) {
        try {
            // Attempt to fetch transactions for the specified wallet
            return dbManager.fetchTransactions(wallet);
        } catch (BlockchainApiException e) {
            // Log an error message if fetching transactions fails
            logger.error("Failed to fetch transactions for wallet {}: {}", wallet, e.getMessage());
            return null;
        }
    }
}

