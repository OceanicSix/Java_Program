package test;

public class Malicious {
    public static void main(String[] args) {
        maliciousMethod(new CreditCard());
    }

    static void maliciousMethod(CreditCard card) {
        card.expenses = 0;
        System.out.println(card.cardNumber);
        System.out.println(card.expenses);
    }
}