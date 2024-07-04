package com.example.tradingbot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TradingApi {
    private static final Logger logger = LoggerFactory.getLogger(TradingApi.class);

    public void buyHeroToken() {
        try {
            logger.info("Buying HERO token...");
        } catch (TradingApiException e) {
            logger.error("Failed to buy HERO token: {}", e.getMessage());
        }
    }

    public void sellHeroToken() {
        try {
            logger.info("Selling HERO token...");
        } catch (TradingApiException e) {
            logger.error("Failed to sell HERO token: {}", e.getMessage());
        }
    }
}
