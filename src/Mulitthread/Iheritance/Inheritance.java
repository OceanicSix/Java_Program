//Use extends method to implement the multithreads
package Mulitthread.Iheritance;

class PrintNumbers {
    static public void printNumbers() {
        for (int i = 0; i < 10; i++) {
            System.out.println(
                    Thread.currentThread().getId() +
                            ": " + i);
        }
    }
}

class Thread1 extends Thread {

    @Override // override the run method
    public void run() {
        System.out.println("Thread-1 ThreadId: " + Thread.currentThread().getId());
        // do our thing
        PrintNumbers.printNumbers();//each thread will do this thing

        // the super doesn't anything,
        // but just for the courtesy and good practice
        super.run();
    }

    static public void main(String[] args) {
        System.out.println("Main ThreadId: " + Thread.currentThread().getId());
        for (int i = 0; i < 3; i++) {
            new Thread1().start();//create another three threads
            // again, don't call run!, run start() will auto run function run()
            // (if you want a separate thread)
        }
        PrintNumbers.printNumbers();//main thread will do this thing
    }
}
