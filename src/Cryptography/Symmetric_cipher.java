package Cryptography;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;


public class Symmetric_cipher {
    public static void name() {

    }

    public static void main(String[] args) throws Exception{

        //Key generation
        KeyGenerator newkey= KeyGenerator.getInstance("AES"); //AES , DES , BlowFish, RC4
        newkey.init(128);
        SecretKey key=newkey.generateKey();
        System.out.println(key);


        //Encrypt

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] buf = cipher.doFinal("xyz".getBytes());
        System.out.println(new String(buf));


        //Decrypt
        Cipher cipher2 = Cipher.getInstance("AES");
        cipher2.init(Cipher.DECRYPT_MODE, key);
        byte[] buf2 = cipher2.doFinal(buf);
        System.out.println(new String(buf2));



    }
}