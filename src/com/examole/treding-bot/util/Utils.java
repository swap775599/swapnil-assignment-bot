package com.example.tradingbot.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Utils {

    private static final Logger logger = LoggerFactory.getLogger(Utils.class);

    // Method to log information
    public static void logInfo(String message) {
        logger.info(message);
    }

    // Method to log errors
    public static void logError(String message, Exception e) {
        logger.error(message, e);
    }

    // Method to convert a string to a double, with error handling
    public static double parseDouble(String value, double defaultValue) {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            logError("Failed to parse double from value: " + value, e);
            return defaultValue;
        }
    }

    // Method to validate if a string is not empty
    public static boolean isNotEmpty(String value) {
        return value != null && !value.trim().isEmpty();
    }

    // Example method to calculate percentage
    public static double calculatePercentage(double part, double whole) {
        if (whole == 0) {
            logError("Division by zero error in calculatePercentage", new ArithmeticException("Division by zero"));
            return 0;
        }
        return (part / whole) * 100;
    }

    // Method to validate an email address (example of input validation)
    public static boolean isValidEmail(String email) {
        return email != null && email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }
}
