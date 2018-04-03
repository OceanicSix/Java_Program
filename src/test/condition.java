package test;

class conditionals {
    public static void test(int x) {
        if (x > 10) {
            System.out.println("x greater than 10");
        } else {
            System.out.println("x less than 10");
        }
    }


    public static void main(String[] arguments) {
        int i = 0;
        while (i < 3) {
            if (i == 1) {
                i++;
                continue;

            }
            System.out.println("Rule #" + i);
            i = i + 1;

        }
    }
}