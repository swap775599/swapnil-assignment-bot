package com.example.tradingbot.model;

public class Transaction {
    private String wallet;
    private String token;
    private double amount;

    public Transaction(String wallet, String token, double amount) {
        this.wallet = wallet;
        this.token = token;
        this.amount = amount;
    }

    // Getters and Setters
    public String getWallet() {
        return wallet;
    }

    public void setWallet(String wallet) {
        this.wallet = wallet;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
