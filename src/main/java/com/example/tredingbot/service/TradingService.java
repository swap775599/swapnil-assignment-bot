package com.example.tradingbot.service;

import com.example.tradingbot.model.Transaction;
import com.example.tradingbot.util.Utils;
import java.util.ArrayList;
import java.util.List;

public class TradingService {
    private static final String TARGET_TOKEN = "HERO";
    private List<Transaction> transactionHistory;

    public TradingService() {
        transactionHistory = new ArrayList<>();
    }

    public void startBot() {
        System.out.println("Starting the trading bot...");

        while (true) {
            try {
                List<Transaction> newTransactions = fetchWalletData();

                for (Transaction transaction : newTransactions) {
                    if (isRelevantTransaction(transaction)) {
                        handleTransaction(transaction);
                    }
                }

                Thread.sleep(5000); // 5 seconds
            } catch (InterruptedException e) {
                System.err.println("Bot interrupted: " + e.getMessage());
                break;
            }
        }
    }

    private List<Transaction> fetchWalletData() {
        List<Transaction> transactions = new ArrayList<>();

        transactions.add(new Transaction("wallet1", TARGET_TOKEN, 100));
        transactions.add(new Transaction("wallet2", "OTHER", 50));
        transactions.add(new Transaction("wallet3", TARGET_TOKEN, 200));

        System.out.println("Fetched transactions: " + transactions.size());
        return transactions;
    }

    private boolean isRelevantTransaction(Transaction transaction) {
        return TARGET_TOKEN.equals(transaction.getToken());
    }

    private void handleTransaction(Transaction transaction) {
        System.out.println("Handling transaction: " + transaction);

        if (transaction.getAmount() > 150) {
            System.out.println("Executing buy order for " + transaction.getAmount() + " " + transaction.getToken());
        } else {
            System.out.println("Executing sell order for " + transaction.getAmount() + " " + transaction.getToken());
        }

        transactionHistory.add(transaction);
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }
}
