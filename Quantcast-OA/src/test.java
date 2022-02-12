
import java.util.HashMap;
import java.util.List;

import cookie.Cookie;
import parse.Parser;
public class test {

	public static void main(String[] args) {
		System.out.println("Hello github! ");
		//We want a list of cookies.  
		List<Cookie>  parsedInput = Parser.toArray("/Test Files/defaultTest.csv");
		
		for (Cookie C : parsedInput) {
			System.out.println(C.toString());
		}
		

	}

}
