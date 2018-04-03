package random_func;

import java.util.Random;

public class Salt_generator {
    public static int[] generateSalt() {
        int[] salt = new int[4];
        Random randomGenerator = new Random();
        for (int i = 0; i < 4; i++)
            salt[i] = randomGenerator.nextInt(10);
        return salt;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println(Salt_generator.generateSalt()[i]);
        }
    }
}