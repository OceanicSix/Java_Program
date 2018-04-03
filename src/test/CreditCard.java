package test;

public class CreditCard {
    String cardNumber = "abc";
    double expenses = 0;

    void charge(double amount) {
        expenses = expenses + amount;
    }

    String getCardNumber(String password) {
        if (password.equals("secret!3*!")) {
            return cardNumber;
        }
        return "jerkface";
    }
}