package com.example.tradingbot;

import com.example.tradingbot.service.TradingService;

public class App {
    public static void main(String[] args) {
        System.out.println("Trading Bot is running!");
        TradingService tradingService = new TradingService();
        tradingService.startBot();
    }
}

