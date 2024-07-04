package com.example.tradingbot.util;

import com.example.tradingbot.model.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static List<String> fetchWalletsTradingHero() {
        // Fetch wallets that only trade HERO token
        // Placeholder: Replace with actual logic
        List<String> wallets = new ArrayList<>();
        wallets.add("wallet1");
        wallets.add("wallet2");
        return wallets;
    }

    public static List<String> fetchNewHeroTokenWallets() {
        // Fetch new wallets that started trading HERO token
        // Placeholder: Replace with actual logic
        List<String> newWallets = new ArrayList<>();
        newWallets.add("wallet3");
        return newWallets;
    }

    public static List<Transaction> fetchTransactions(String wallet) {
        // Fetch transactions for the given wallet
        // Placeholder: Replace with actual logic
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("SOL", false));
        transactions.add(new Transaction("HERO", false));
        return transactions;
    }

    public static long getLastTransactionTime(String wallet) {
        // Fetch the time of the last transaction for the wallet
        // Placeholder: Replace with actual logic
        return System.currentTimeMillis() - (2 * 60 * 60 * 1000); // 2 hours ago
    }
}
