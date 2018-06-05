package test;

public class test_overflow {
    public static void name() {

    }

    public static void main(String[] args) {
        int value1 = 2147483647;
        System.out.println("Value 1: " + (value1 + 1));

        int value2 = -2147483648;
        System.out.println("Value 2: " + (value2 - 1));


    }
}