package test;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("Line no.2");
        NewLine.newLine();
        NewLine a = new NewLine();

    }
}

class NewLine {
    public static void newLine() {
        System.out.println("1");
        int a = 1;
    }

    public static void threeLines() {
        newLine();
        newLine();
        newLine();
    }
//    public static void main(String[] arguments){
//        System.out.println("Line 1");
//        threeLines();
//        System.out.println("Line 2");
//    }
}


