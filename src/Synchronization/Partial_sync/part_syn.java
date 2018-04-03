package Synchronization.Partial_sync;

class SynchronizedCounter {
    public void addName(String name) {
        String lastName;
        int nameCount = 0;
        synchronized (this) {
            // just synchronize following two lines, so it will be efficient
            //compared to sync whole function

            lastName = name;
            nameCount++;
        }
        //nameList.add(name);
    }
}