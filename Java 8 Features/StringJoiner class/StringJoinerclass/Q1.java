package StringJoinerclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("Java", "is", "OOP", "Language"));
		StringJoiner sj = new StringJoiner("," , "{" , "}"); 
		list.forEach(element -> sj.add(element));
		System.out.println(sj);
	}

}
