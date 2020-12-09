package study.classs;

import java.util.Scanner;

public class scanner {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please type your name");
        String name = in.nextLine();
        System.out.println("your name is "+ name);

    }
}