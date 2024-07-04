package com.example.tradingbot.model;

public class Transaction {
    private String token;
    private String signature;
    private long timestamp;
    private boolean processed;

    public Transaction(String token, String signature, long timestamp, boolean processed) {
        this.token = token;
        this.signature = signature;
        this.timestamp = timestamp;
        this.processed = processed;
    }

    public String getToken() {
        return token;
    }

    public String getSignature() {
        return signature;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }
}
