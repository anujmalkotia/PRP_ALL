import java.util.*;
 public class Q1B {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = in.nextInt();  
		System.out.print("Input the second number: ");
		int y = in.nextInt(); 
        System.out.print("The result is: "+test_last_digit(x, y,true));
		System.out.print("\n");
    }
   
    public static boolean test_last_digit(int p, int q, boolean xy)
     {
	     return (p % 10 == q % 10);
     }
}