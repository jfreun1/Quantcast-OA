package cookie;

public class Cookie {
	
	//A cookie has a cookID, a date, and the occurence.
	//Here, we define the occurence to be the number of cookies that appear in a given cookieID and date

	
	private String cookieID;
	private String date;
	private int occurences;

	public Cookie(String cookieID, String date) {
		this.cookieID = cookieID;
		this.date = date;
		this.occurences = 1;
	}
	
	//We can only increase the occurence of some element by one.
	public void increaseOccurence() {
		occurences++;
	}
	
	
	/*
	 * dateToInt()
	 * Give a cookie, we conver the String date to an integer.
	 * This will make it easier to use binary search later.
	 * Furthermore, this integer must maintain a well ordering property.
	 * That means, if dateA < dateB then dateToInt(dateA) < dateToInt(dateB);
	 */
	public int dateToInt() {
		return dateToInt(this.date);
	}
	
	//Overloading for any string
	public static int dateToInt(String date) {
		int year = Integer.parseInt(date.substring(0, 4));
		int month = Integer.parseInt(date.substring(5, 7));
		int day = Integer.parseInt(date.substring(8, 10));
		return (year*1000) + (month*100) + (day*10);
	}
	
	public String toString() {
		return cookieID + " " + date;
	}
	

}

