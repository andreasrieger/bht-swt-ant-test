/**
 * 
 */
package calc;

/**
 * @author Andreas Rieger (s82456@beuth-hochschule.de)
 *
 */
public class Calculator {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 5;
		System.out.print("The sum of " + a + " and " + b + " is " + add(a, b) + ".");

	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public int div(int a, int b) {
		return a/b;
	}

}
