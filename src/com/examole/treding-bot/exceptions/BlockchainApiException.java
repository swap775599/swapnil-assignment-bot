package com.example.tradingbot;

/**
 * Custom exception for handling errors related to blockchain API interactions.
 * Extends BotException to maintain compatibility with existing exception handling.
 */
public class BlockchainApiException extends BotException {

    /**
     * Constructs a new BlockchainApiException with the specified detail message.
     *
     * @param message the detail message (which is saved for later retrieval by the getMessage() method)
     */
    public BlockchainApiException(String message) {
        super(message);
    }
}
