import java.util.*;
public class Q10
{
public String nTwice(String str, int n) 
{
  return str.substring(0,n) + str.substring(str.length()- n, str.length());
}
public static void main (String[] args)
    {
      Main m= new Main();
      String str1 =  "Welcome";
	  int n1 =  3;
	  
      System.out.println("The given strings is: "+str1);
	  System.out.println("The given numbers is: "+n1);
      System.out.println("The new string is: "+m.nTwice(str1,n1));
	  }
}