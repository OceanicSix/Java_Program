package Synchronization.Whole_sync;

class SynchronizedCounter {
    private int c = 0;

    public synchronized void increment() {
        //keyword synchronized for method ,then the method can only be accessed by one thread
        //at a time
        c++;
    }

    public synchronized void decrement() {
        c--;
    }

    public synchronized int value() {
        return c;
    }
}
