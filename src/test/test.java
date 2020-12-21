package test;


import java.security.cert.TrustAnchor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class test {
    private int a;
    private String b;



    public void name() {

    }
    public double calcSeries(int x,int n){
        double result;
        double interResult=0;
        for(int i=1;i<=n;i++){
            interResult+=Math.pow(i,2)/(i*x);
        }
        result = 1+interResult;
        return result;

    }

    public int[] sumPrevious(int [] ar){
        int [] result = new int [ar.length];
        for( int i = 0; i< ar.length;i++){
            int sum =0;
            for (int j =0;j<=i;j++){
                sum+=ar[j];
            }
            result [i]= sum;
        }
        return result;
    }

    public int backwardNumber ( int inputNumber){
        String result="";
        while (inputNumber*1.0/10>=0.1){
            int lastDigit= inputNumber%10;
            if (lastDigit%2==0)
                result+=lastDigit;
            inputNumber=inputNumber/10;
        }
        return Integer.parseInt(result);
    }

    public void testStatic (){
        int a = backwardNumber(12345);
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println(5+((1<10)?"ok":"not ok"));



}
    }
