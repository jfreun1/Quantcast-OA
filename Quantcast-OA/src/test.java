
import java.util.List;

import cookieBinarySearch.cookieBinarySearch;
import cookie.Cookie;
import parse.Parser;
public class test {

	public static void main(String[] args) {
		System.out.println("Hello github! ");
		//We want a list of cookies.  
		List<Cookie>  parsedInput = Parser.toArray("/Test Files/defaultTest.csv");
		
		for (int i = 0; i < parsedInput.size(); i++ ) {
			System.out.println(i + ": " + parsedInput.get(i).toString());
		}
		
		
		System.out.println(cookieBinarySearch.binarySearch(parsedInput, "2018-12-05"));
		
		
		

	}

}
