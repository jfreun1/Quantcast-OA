import java.util.List;

import cookieBinarySearch.cookieBinarySearch;
import cookie.Cookie;
import parse.Parser;
import max.MaxOccurence;
public class MostActiveCookie {

	static int FILE = 0;
	static int DATE = 1;
	public static void main(String[] args) {
		//First, we parse the commandLine
		String[] commandLine = Parser.parseCommandLine(args);
		String file = commandLine[FILE];
		String date = commandLine[DATE];
		//Second, we pare our .csv file
		List<Cookie>  parsedInput = Parser.toList(file);		
		
		
		//Third, we find the start date (if it exists)
		int start = cookieBinarySearch.binarySearch(parsedInput, date);		
		
		//The, we get the maxOccurence within that range, if it exists
		List<Cookie> maxList = MaxOccurence.maxOccurence(parsedInput, start, date);
		
		//Print out the list of maximum cookies
		if (maxList.isEmpty()) {
			System.out.println("No such date!");
		} else {
			for (Cookie C : maxList) {
				System.out.println(C.getID());
			}
		}
		
		

	}

}
