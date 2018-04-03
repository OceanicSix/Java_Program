package test;

public class test {
    public static void name() {

    }

    public static void main(String[] args) {
        String a = "123abc";
        int t = 255;
        byte[] b = a.getBytes();
        for (int i = 0; i <2; i++) {
            System.out.println(b[i]);
            String c = Integer.toString(b[i], 16);
            System.out.println(c);
        }
    }
}