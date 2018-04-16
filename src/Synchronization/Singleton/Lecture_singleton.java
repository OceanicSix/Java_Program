package Synchronization.Singleton;

 class Screen {
     // because there is only one copy of static method in memory for one class,all the
     //object will share this static method, so when this class is load and getScreen()
     //method is called, there is only one thread can access this static method.
	private static Screen theScreen = new Screen();

	public Object getScreen() {
		return theScreen;
	}
}
