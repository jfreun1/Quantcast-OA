package parse;

import cookie.Cookie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Parser {
	
	static int ID = 0;
	static int DATE = 1;

	public static List<Cookie> toArray(String currTest) {
		String userDir = System.getProperty("user.dir");
		String path = userDir + currTest;
		
		
		List<Cookie> values = new ArrayList<>();
		Scanner sc = null;
		try {
			sc = new Scanner(new File(path));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
			    
	    while (sc.hasNext()) {
	    	String[] currLine = sc.next().split(",", 2);
	    	currLine[DATE] = currLine[DATE].substring(0,10);
	    	
	    	values.add(new Cookie(currLine[ID], currLine[DATE]));
	    	
	    	
	    }
	   
	    
	    return values;
	}
}