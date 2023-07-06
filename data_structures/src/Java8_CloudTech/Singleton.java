package Java8_CloudTech;

public class Singleton {

	private static Singleton instance;
	
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		// TODO Auto-generated method stub
		
		if(instance == null) {
			
			synchronized(Singleton.class) {
				instance = new Singleton();
			}
		}
		
		return instance;
	}

}
