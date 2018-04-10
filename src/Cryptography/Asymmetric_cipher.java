package Cryptography;

import javax.crypto.Cipher;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

public class Asymmetric_cipher {
    public static void name() {

    }

    public static void main(String[] args) throws Exception{

        //Generate key pair
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(512);
        KeyPair pair = keyGen.generateKeyPair();
        PublicKey publicKey = pair.getPublic();
        PrivateKey privateKey = pair.getPrivate();


        //Encrypt
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] buf = cipher.doFinal("xyz".getBytes());
        System.out.println(new String(buf));


        //Decrypt
        Cipher cipher2 = Cipher.getInstance("RSA");
        cipher2.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] buf2 = cipher2.doFinal(buf);
        System.out.println(new String(buf2));



    }
}