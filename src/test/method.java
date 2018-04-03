package test;

public class method {
    public static void newLines(){
        System.out.println("");
    }
    public static void threeLines(){
        newLines();newLines();newLines();
    }
    public static void main(String[] args){
        System.out.println("Line 1");
        threeLines();
        System.out.println("Line 2");
        NewLine.newLine();
    }

}
