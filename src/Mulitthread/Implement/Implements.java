package Mulitthread.Implement;

class PrintNumbers {
    static public void printNumbers() {
        for (int i = 0; i < 10; i++) {
            System.out.println(
                    Thread.currentThread().getId() +
                            ": " + i);
        }
    }
}


class Thread2 implements Runnable {
    // implement Runnable---Runnable is a interface,which can't be initialized
    @Override
    public void run() {
        System.out.println("Thread-2 ThreadId: " + Thread.currentThread().getId());
        // do our thing
        PrintNumbers.printNumbers();
    }


    static public void main(String[] args) {
        System.out.println("Main ThreadId: " + Thread.currentThread().getId());
        for (int i = 0; i < 3; i++) {
            new Thread(new Thread2()).start();// because thread2 is a runnable, so need to call thread to
            //construct the thread2,then start run()

            // again, don't call run!
            // (if you want a separate thread)
        }
        PrintNumbers.printNumbers();
    }
}
