package oct_25;

public class Arithmetic {
	
	/**
	 * Returns the sum of the first n integers.	 
	 **/
	public static int sumFirstN(int n) {
		return (n * (n + 1)) /2;
	}
	
	public static void main(String[] args) {
		System.out.println(Arithmetic.sumFirstN(10));
	}
}
