package com.example.tradingbot.service;

import com.example.tradingbot.model.Transaction;
import com.example.tradingbot.util.Utils;

import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class TradingService {
    private static final long TIMEOUT_PERIOD_MS = 3 * 60 * 60 * 1000; // 3 hours in milliseconds
    private Set<String> trackedWallets;
    private long lastCheckTime;

    public TradingService() {
        this.trackedWallets = new HashSet<>();
        this.lastCheckTime = System.currentTimeMillis();
    }

    public void startBot() {
        System.out.println("Starting the trading bot...");

        // Load initial set of wallets trading HERO
        trackedWallets.addAll(Utils.fetchWalletsTradingHero());

        // Main loop
        while (true) {
            long currentTime = System.currentTimeMillis();

            // Periodically check for new wallets and transactions
            if (currentTime - lastCheckTime > 60 * 1000) { // Check every minute
                lastCheckTime = currentTime;
                updateTrackedWallets();
                processWalletTransactions();
            }

            try {
                Thread.sleep(5000); // Sleep for 5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void updateTrackedWallets() {
        List<String> newWallets = Utils.fetchNewHeroTokenWallets();
        for (String wallet : newWallets) {
            if (!trackedWallets.contains(wallet)) {
                trackedWallets.add(wallet);
                System.out.println("Tracking new wallet: " + wallet);
            }
        }
    }

    private void processWalletTransactions() {
        for (String wallet : trackedWallets) {
            List<Transaction> transactions = Utils.fetchTransactions(wallet);

            for (Transaction transaction : transactions) {
                if (transaction.getToken().equals("SOL") && !transaction.isProcessed()) {
                    // Buy HERO before the user
                    if (buyHeroToken(wallet)) {
                        transaction.setProcessed(true);
                    }
                } else if (transaction.getToken().equals("HERO") && !transaction.isProcessed()) {
                    // Sell HERO after the user buys
                    if (sellHeroToken(wallet)) {
                        transaction.setProcessed(true);
                    }
                }
            }

            // Check for timeout
            long timeSinceLastTransaction = System.currentTimeMillis() - Utils.getLastTransactionTime(wallet);
            if (timeSinceLastTransaction > TIMEOUT_PERIOD_MS) {
                System.out.println("Timeout reached, selling HERO for wallet: " + wallet);
                sellHeroToken(wallet);
            }
        }
    }

    private boolean buyHeroToken(String wallet) {
        // Implement the logic to buy HERO token here
        System.out.println("Buying HERO token for wallet: " + wallet);
        // Simulate success
        return true;
    }

    private boolean sellHeroToken(String wallet) {
        // Implement the logic to sell HERO token here
        System.out.println("Selling HERO token for wallet: " + wallet);
        // Simulate success
        return true;
    }
}
