import java.util.*; 
  
class Q5 { 
    static String FirstAndLast(String str) 
    { 
  
        
        String[] arrOfStr = str.split(" "); 
  
        
        String res = ""; 
  
        
        for (String a : arrOfStr) { 
            res += a.substring(1, a.length() - 1) + " "; 
        } 
  
        return res; 
    } 
  
    
    public static void main(String args[]) 
    { 
        String str = "Geeks for Geeks"; 
        System.out.println(str); 
        System.out.println(FirstAndLast(str)); 
    } 
} 