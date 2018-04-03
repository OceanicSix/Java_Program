package Hash_generator.my_hash_func;


import random_func.Salt_generator; // my own func to generate 4 digit salt

import java.security.MessageDigest;//used to do encryption
import java.security.NoSuchAlgorithmException;//used to do error handle

public class my_hash_func {
    public static String con_salt_pass(String pass) {
        int[] salt = Salt_generator.generateSalt();

        //concatenation the salt + password

        // StringBuffer or StringBuilder is preferred to do String concatenation than direct use
        // "+"
        StringBuffer input = new StringBuffer("");
//        String pass = "123";
        for (int i = 0; i < 4; i++) {
            input.append(salt[i]);
        }
        input.append(pass);
        System.out.println("plaintext is " + input);
        return input.toString();
    }

    public static String hash_pass(String salt_pass) {
        String final_pass = "";
        //cause the MessageDigest may create error so must do error handle. Otherwise can't compile
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            //salt_pass.getBytes() will retrieve content from salt_pass, return byte[] data type
            //md.digest will encrypt the content
            byte[] hash = md.digest(salt_pass.getBytes());
            for (int i = 0; i < hash.length; i++) {
                final_pass = final_pass + Integer.toString((hash[i] & 0xff) + 0x100, 16).substring(1);
                //System.out.println(Integer.toString((hash[i] & 0xff) + 0x100, 16).substring(1));
            }
            System.out.println("final hash is " + final_pass);


        }
        catch (NoSuchAlgorithmException e) {
            System.out.println("there is no such algorithm");
        }
        return final_pass;
    }

    public static void main(String[] args) {
        if (args.length == 1) {
            my_hash_func.hash_pass(con_salt_pass(args[0]));
            System.out.println("password is "+args[0]);
        }
    }
}