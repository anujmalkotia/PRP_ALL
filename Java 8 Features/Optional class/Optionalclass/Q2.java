package Optionalclass;

import java.util.Optional;

public class Q2 {
	String address;
	String default_address = "India";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q2 obj = new Q2();
		Optional<String> n = Optional.ofNullable(obj.address);
		
		System.out.println(n.orElse(obj.default_address));
	}

}
