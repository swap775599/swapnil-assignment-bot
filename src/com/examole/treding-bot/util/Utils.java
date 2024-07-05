package com.example.tradingbot.util;

import com.example.tradingbot.model.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    /**
     * Fetches wallets that exclusively trade HERO token.
     *
     * @return List of wallet addresses trading HERO
     */
    public static List<String> fetchWalletsTradingHero() {
        // Simulated data - replace with actual database fetch logic
        List<String> wallets = new ArrayList<>();
        wallets.add("wallet1");
        wallets.add("wallet2");
        return wallets;
    }

    /**
     * Fetches new wallets that started trading HERO token.
     *
     * @return List of new wallet addresses trading HERO
     */
    public static List<String> fetchNewHeroTokenWallets() {
        // Simulated data - replace with actual database fetch logic
        List<String> newWallets = new ArrayList<>();
        newWallets.add("wallet3");
        return newWallets;
    }

    /**
     * Fetches transactions for a specific wallet.
     *
     * @param wallet Wallet address for which transactions are to be fetched
     * @return List of transactions for the given wallet
     */
    public static List<Transaction> fetchTransactions(String wallet) {
        // Simulated data - replace with actual database fetch logic
        List<Transaction> transactions = new ArrayList<>();
        if (wallet.equals("wallet1")) {
            transactions.add(new Transaction("SOL", "signature1", System.currentTimeMillis() - 60000, false));
            transactions.add(new Transaction("HERO", "signature2", System.currentTimeMillis() - 120000, false));
        } else if (wallet.equals("wallet2")) {
            transactions.add(new Transaction("SOL", "signature3", System.currentTimeMillis() - 180000, false));
            transactions.add(new Transaction("HERO", "signature4", System.currentTimeMillis() - 240000, false));
        }
        // Add more transactions for other wallets as needed
        return transactions;
    }

    /**
     * Fetches the time of the last transaction for a given wallet.
     *
     * @param wallet Wallet address for which last transaction time is to be fetched
     * @return Time of the last transaction (in milliseconds since epoch)
     */
    public static long getLastTransactionTime(String wallet) {
        // Simulated data - replace with actual database fetch logic
        // Simplified logic: Assume the last transaction time for a wallet
        return System.currentTimeMillis() - (2 * 60 * 60 * 1000); // 2 hours ago
    }
}
