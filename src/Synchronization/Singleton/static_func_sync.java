package Synchronization.Singleton;

class BillPughSingleton {

    private BillPughSingleton() {
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    //When the singleton class is loaded, SingletonHelper class is not loaded into memory
    // and only when someone calls the getInstance method, this class gets loaded
    // and creates the Singleton class instance.
    
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}