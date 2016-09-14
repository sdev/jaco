/**
 * Date: 2016 July 18
 */
package sdev.pattern;
/**
 * @author sdev
 *
 */
public class Singleton {

	private static Singleton instance = null; 
	/**
	 * @param args
	 */
	
	protected Singleton() {
		System.out.println("Creating New Instance");
	}
	
	public static Singleton getInstance(){
		if (instance != null) {
			System.out.println("Singleton create duplicate instance failed, return current instance instead!");
			return instance;
		}
		else {
			return instance = new Singleton();
		}
	}
}


