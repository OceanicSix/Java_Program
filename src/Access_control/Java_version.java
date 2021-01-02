package Access_control;

import java.io.*;
import java.security.*;

class TestPolicy {
    public static void main(String[] args) {
        String javaVersion = System.getProperty("java.version");
        System.err.println(javaVersion);

        //based on the "S:\IntelliJ IDEA Community Edition 2017.3.5\jre64\lib\security\java.policy" file
        // ,property "java.version" should only be able to read not write

        System.setProperty("java.version", "19");
        String javaNewVersion = System.getProperty("java.version");
        System.err.println(javaNewVersion);// because the security manager is disabled by default

    }
}