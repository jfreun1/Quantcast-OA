package parse;

import cookie.Cookie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parser {
	
	static int ID = 0;
	static int DATE = 1;
	
	//reads the .csv and pares into a list of cookies
	public static List<Cookie> toList(String currTest) {
		String userDir = System.getProperty("user.dir");
		String path = userDir + "/Test Files/" + currTest;
		
		
		List<Cookie> values = new ArrayList<>();
		Scanner sc = null;
		try {
			sc = new Scanner(new File(path));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
			    
	    while (sc.hasNext()) {
	    	
	    	String[] currLine = sc.next().split(",", 2);
	    	currLine[DATE] = currLine[DATE].substring(0,10); //we only care about the date, not the exact timestamp
	    	values.add(new Cookie(currLine[ID], currLine[DATE]));
	    	
	    	
	    }
	   
	    
	    return values;
	}
	
	
	//parses the commandLine and returns an array of two elements representing the two arguments
	static int FILE = 0;
	//static int DATE = 1; (from before)
	public static String[] parseCommandLine(String[] args) {
		String[] result = new String[2];
	     //locate switches.
	     for(int i=0; i < args.length; i++) {
	       if(args[i].startsWith("-f")){
	    	   result[FILE] = args[++i];
	       } else if (args[i].startsWith("-d")) {
	    	   result[DATE] = args[++i];
	       }
	     }
		return result;
	}
}