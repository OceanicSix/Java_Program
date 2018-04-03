package test;



class Baby1 {
    int servings = 0;

    void feed(int a) {
       servings = servings + a;
        System.out.println(servings);

    }

    void poop() {
        System.out.println("All better!");
        servings = 0;
    }



    public static void main(String[] args) {
        Baby1 q = new Baby1();
        Baby1 w = new Baby1();
        q.feed(10);
        w.feed(1);
    }
}