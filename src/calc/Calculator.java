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

	/* performing an addition between two integers */
	public static int add(int a, int b) { return a+b; }

	/* subtracting one integers from another one */
	public static int sub(int a, int b) { return a-b; }

	/* performing a multiplication between two integers */
	public static int mul(int a, int b) { return a*b; }

	/* deviding one integer by another one */
	public static int div(int a, int b) {
		return a/b;
	}

}