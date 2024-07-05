# Trading Bot Project

## Overview
This project implements a trading bot that monitors specific cryptocurrency wallets. The bot buys and sells tokens based on the transactions of these wallets to capitalize on potential price movements.

## Project Structure
- **Main.java**: The entry point of the application. It initializes and starts the trading bot.
- **TradingService.java**: Contains the core logic for tracking wallets and handling token trades.
- **Utils.java**: Utility class with methods for fetching wallets and transactions.
- **Transaction.java**: Model class representing a transaction.
- **WalletTracker.java**: Manages the list of wallets to track and retrieves their transactions.
- **TradingApi.java**: Placeholder for methods that interact with the trading exchange to buy and sell tokens.

## How It Works
1. **Monitor Wallets**: The bot keeps an eye on wallets that only trade a specific token (e.g., HERO).
2. **Track Solana Purchases**: When a monitored wallet buys Solana (SOL), it suggests they might be preparing to buy HERO.
3. **Preemptive Buy**: The bot buys HERO before the monitored wallet does, anticipating a price increase.
4. **Immediate Sell**: As soon as the monitored wallet buys HERO, the bot sells its HERO holdings for a profit.
5. **Timeout Handling**: If the wallet doesn't buy HERO within a set period (e.g., 2-3 hours), the bot sells its HERO to avoid potential losses.

## Configuration
- **Timeout Period**: Set in `TradingService.java` as `TIMEOUT_PERIOD_MS`. Adjust the value to change the waiting period before selling HERO if the monitored wallet doesn't buy it.
- **Check Interval**: The bot checks for new transactions every minute by default. Adjust the sleep duration in the `while` loop in `TradingService.java` to change this interval.

## Setup
1. **Clone the Repository**: Download the project to your local machine.
2. **Update Dependencies**: Ensure all dependencies are up-to-date and configured correctly in your build tool (e.g., Maven, Gradle).
3. **Compile and Run**: Use your IDE or build tool to compile the project and run `Main.java`.

## Customization
- **Trading Logic**: Modify `buyHeroToken` and `sellHeroToken` methods in `TradingService.java` to integrate with your actual trading platform.
- **Wallet Fetching**: Update `Utils.java` methods to fetch wallets and transactions from your specific data sources or APIs.

## Testing
- **Run Tests**: Thoroughly test the bot to ensure it behaves as expected in various scenarios. Check edge cases and verify that the timeout handling and transaction processing work correctly.
- **Simulated Trading**: Consider running the bot in a simulated environment or with test data before using it with real funds.

## Notes
- **Risk Management**: Ensure you have proper risk management strategies in place. Trading involves significant risks, and this bot is provided as a tool to assist in automated trading.
- **Continuous Monitoring**: Regularly monitor the bot's activity and performance to make adjustments as needed based on market conditions and trading outcomes.

## Support
For any issues or questions, please contact the project maintainer
Swapnil Raibole 
+91-9322010868
swapnilraibole107@gmail.com

