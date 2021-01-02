package test;


import java.security.cert.TrustAnchor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

import java.io.*;

public class test {



    public static void main(String[] args) {
        try {
            FileReader a = new FileReader("test.txt");
            Scanner parser = new Scanner(a);
            while(parser.hasNextLine()) {
                String[] b = parser.nextLine().split(",");
                System.out.println(b[0]);
            }

        }
        catch (IOException e) {
            System.out.println("there is an error");
        }
    }
}

