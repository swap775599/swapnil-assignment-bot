package com.example.tradingbot.model;

public class Transaction {
    private String token;        // Type of token involved in the transaction
    private String signature;    // Signature or identifier of the transaction
    private long timestamp;      // Timestamp when the transaction occurred
    private boolean processed;   // Flag indicating if the transaction has been processed by the bot

    public Transaction(String token, String signature, long timestamp, boolean processed) {
        this.token = token;
        this.signature = signature;
        this.timestamp = timestamp;
        this.processed = processed;
    }

    // Getter method for token
    public String getToken() {
        return token;
    }

    // Getter method for signature
    public String getSignature() {
        return signature;
    }

    // Getter method for timestamp
    public long getTimestamp() {
        return timestamp;
    }

    // Getter method for processed status
    public boolean isProcessed() {
        return processed;
    }

    // Setter method for processed status
    public void setProcessed(boolean processed) {
        this.processed = processed;
    }
}
