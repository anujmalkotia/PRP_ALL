package MethodReference;

interface DigitReference {
	int countDigit( int n);
}

public class Q2 {
	
	static int digitCount(int n) {
		return (int)Math.log10(n) + 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitReference ref = Q2 :: digitCount;
		System.out.println(ref.countDigit(5342));
		System.out.println(ref.countDigit(32));
	}

}
