
import java.util.List;

import cookieBinarySearch.cookieBinarySearch;
import cookie.Cookie;
import parse.Parser;
import max.MaxOccurence;
public class MostActiveCookie {

	public static void main(String[] args) {
		
		String date = "2018-12-08";
		//We want a list of cookies.  
		List<Cookie>  parsedInput = Parser.toArray("defaultTest.csv");		
		
		int start = cookieBinarySearch.binarySearch(parsedInput, date);		
		
		List<Cookie> maxList = MaxOccurence.maxOccurence(parsedInput, start, date);
		if (maxList.isEmpty()) {
			System.out.println("No such date!");
		} else {
			for (Cookie C : maxList) {
				System.out.println(C.getID());
			}
		}
		
		

	}

}
