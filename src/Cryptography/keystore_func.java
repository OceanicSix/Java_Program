package Cryptography;

import java.io.FileInputStream;
import java.io.PipedReader;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;

public class keystore_func {
    public static void name() {

    }

    public static void main(String[] args) throws Exception{

        //load the key store
        FileInputStream is =new FileInputStream("C:\\Windows\\System32\\mystore.jks");
        KeyStore key_store=KeyStore.getInstance(KeyStore.getDefaultType());
        key_store.load(is,"123456".toCharArray()); //keystore's password

        //Get public key, will get (e,n)
        Certificate cert=key_store.getCertificate("ocean"); //ocean is alias
        PublicKey pub_key=cert.getPublicKey();
        System.out.println(pub_key);


        //Get private key
        PrivateKey pri_key=(PrivateKey)key_store.getKey("ocean","123456".toCharArray());//123456 is the
        // password used to protect the private key
        System.out.println(pri_key);


    }
}