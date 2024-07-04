package com.example.tradingbot.model;

public class Transaction {
    private String token;
    private boolean processed;

    public Transaction(String token, boolean processed) {
        this.token = token;
        this.processed = processed;
    }

    public String getToken() {
        return token;
    }

    public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }
}

    public boolean isBoughtHero() {
        return boughtHero;
    }
}
