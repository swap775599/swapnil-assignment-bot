package com.example.tradingbot.util;

import com.example.tradingbot.model.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static List<String> fetchWalletsTradingHero() {
        // Fetch wallets that only trade HERO token
        List<String> wallets = new ArrayList<>();
        wallets.add("wallet1");
        wallets.add("wallet2");
        return wallets;
    }

    public static List<String> fetchNewHeroTokenWallets() {
        // Fetch new wallets that started trading HERO token
        List<String> newWallets = new ArrayList<>();
        newWallets.add("wallet3");
        return newWallets;
    }

    public static List<Transaction> fetchTransactions(String wallet) {
        // Fetch transactions for the given wallet
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

    public static long getLastTransactionTime(String wallet) {
        // Fetch the time of the last transaction for the wallet
        // Simplified logic: Assume the last transaction time for a wallet
        return System.currentTimeMillis() - (2 * 60 * 60 * 1000); // 2 hours ago
    }
}
