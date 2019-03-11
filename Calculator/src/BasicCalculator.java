/**
 * 
 */

/**
 * @author I502650
 *
 */
public class BasicCalculator {

	/**
	 * 
	 */
	public BasicCalculator() {
		System.out.println("Hello!!, this is a constructor");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("main class");
        int a=9;
        int b=99;
       System.out.println(add(a,b));
		multiply(a,b);
	}

	private static int add(int a, int b) {
		return (a+b);
		
	}
	
	private static int multiply(int a, int b) {
		return (a*b);
		
	}

}
