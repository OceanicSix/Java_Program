package test;

public class NewLine1 {
    public static void newLine() {
        System.out.println("1");
    }

    public static void threeLines() {
        newLine();
        newLine();
        newLine();
    }
    public static void main(String[] arguments) {
        System.out.println("Line 1");
        threeLines();
        System.out.println("Line 2");
    }
}