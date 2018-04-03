package Mulitthread.anonymous_runnable;

class PrintNumbers {
    static public void printNumbers() {
        for (int i = 0; i < 10; i++) {
            System.out.println(
                    Thread.currentThread().getId() +
                            ": " + i);
        }
    }


    static public void main(String[] args) {
        System.out.println("Main ThreadId: " + Thread.currentThread().getId());
        new Thread(new Runnable() {
            //this way ,we don't need to name the thread like: class thread1 or thread2
            // And runnable is the interface, which can't be initialized
            @Override
            public void run() {
                System.out.println("Thread3 ThreadId: " + Thread.currentThread().getId());
                // do our thing
                PrintNumbers.printNumbers();
            }
        }).start(); // don't call run! ... and there are only two threads-- main thread and thread 3
        PrintNumbers.printNumbers();
    }
}

