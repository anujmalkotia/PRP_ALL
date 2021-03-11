package MethodReference;

interface FactReference {
	int fact(int n);
}

public class Q1 {
	
	int factorial(int n) {
		int fact = 1;
		for(int i = 1; i <= n; i++){
			fact *= i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1 obj = new Q1();
		FactReference ref = obj :: factorial;
		System.out.println(ref.fact(5));
		System.out.println(ref.fact(8));
	}

}