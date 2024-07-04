package com.example.tradingbot;

public class Transaction {
    private String wallet;
    private String token;
    private int amount;
    private boolean boughtHero;

    public Transaction(String wallet, String token, int amount, boolean boughtHero) {
        this.wallet = wallet;
        this.token = token;
        this.amount = amount;
        this.boughtHero = boughtHero;
    }

    public String getWallet() {
        return wallet;
    }

    public String getToken() {
        return token;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isBoughtHero() {
        return boughtHero;
    }
}
