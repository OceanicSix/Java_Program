package random_func;

import java.util.Random;

public class ran_range {
    public static int rand_range(int min,int max) {
        Random rand = new Random();
        int ran_number = rand.nextInt(max-min+1)+min;
        return ran_number;
    }

    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println(rand_range(5,10));
        }
    }
}