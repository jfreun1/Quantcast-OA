
import java.util.List;

import cookieBinarySearch.cookieBinarySearch;
import cookie.Cookie;
import parse.Parser;
import max.MaxOccurence;
public class test {

	public static void main(String[] args) {
		
		String date = "2018-12-08";
		System.out.println("Hello github! ");
		//We want a list of cookies.  
		List<Cookie>  parsedInput = Parser.toArray("defaultTest.csv");
		
		for (int i = 0; i < parsedInput.size(); i++ ) {
			System.out.println(i + ": " + parsedInput.get(i).toString());
		}
		
		
		int start = cookieBinarySearch.binarySearch(parsedInput, date);
		System.out.println(start);
		
		List<Cookie> maxList = MaxOccurence.maxOccurence(parsedInput, start, date);
		if (maxList.isEmpty()) {
			System.out.println("No such date!");
		} else {
			for (Cookie C : maxList) {
				System.out.println(C.toString());
			}
		}
		
		

	}

}
