public class Q2 {

    public static void main(String[] args)
    {
        String str1 = "Hello ";
        String str2 = "World";
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2); 
       

        String str3 = str1.concat(str2);

       
        System.out.println("The concatenated string: " + str3.toLowerCase());
    }
}