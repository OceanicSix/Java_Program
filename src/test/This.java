package test;

class Baby {
    int servings = 10;

    void feed(int servings) {
        this.servings = this.servings + servings;
        System.out.println(this.servings);
        System.out.println(servings);
    }

    void poop() {
        System.out.println("All better!");
        servings = 0;
    }



    public static void main(String[] args) {
        Baby q = new Baby();
        Baby w = new Baby();
        q.feed(10);
        w.feed(1);
    }
}