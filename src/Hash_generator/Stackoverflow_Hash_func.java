package Hash_generator;

import random_func.Salt_generator; // my own func to generate 4 digit salt

import java.security.MessageDigest;//used to do encryption
import java.security.NoSuchAlgorithmException;//used to do error handle

public class Stackoverflow_Hash_func {
    public static String con_salt_pass() {
        int[] salt = Salt_generator.generateSalt();

        //concatenation the salt + password

        // StringBuffer or StringBuilder is preferred to do String concatenation than direct use
        // "+"
        StringBuffer input = new StringBuffer("");
        String pass = "123";
        for (int i = 0; i < 4; i++) {
            input.append(salt[i]);
        }
        input.append(pass);
        System.out.println("plaintext is " + input);
        return input.toString();
    }

    public static String hash_pass(String salt_pass) {
        String final_pass = null;
        //cause the MessageDigest may create error so must do error handle. Otherwise can't compile
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            //salt_pass.getBytes() will retrieve content from salt_pass, return byte[] data type
            //md.digest will encrypt the content
            byte[] hash = md.digest(salt_pass.getBytes());
            StringBuilder a = new StringBuilder();
            for (int i = 0; i < hash.length; i++) {
                //convert byte[] data type to hex
                //print  hash[i] will print i's html format --see ASII table

                //& 0xff make all hex is positive number
                //+0x100 make all hash[i] & oxff  become 3digits
                //substring(1) strip first digit in the hex
                a.append(Integer.toString((hash[i] & 0xff)+0x100,16).substring(1));

            }
            System.out.println("final hash is " + a);
            final_pass = a.toString();

        }
        catch (NoSuchAlgorithmException e) {
            System.out.println("there is no such algorithm");
        }
        return final_pass;
    }

    public static void main(String[] args) {
        Stackoverflow_Hash_func.hash_pass(con_salt_pass());
    }
}