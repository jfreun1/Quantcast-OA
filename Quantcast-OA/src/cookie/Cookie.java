package cookie;

public class Cookie {
	
	//A cookie has a cookID, a date, and the occurence.
	//Here, we define the occurence to be the number of cookies that appear in a given cookieID and date

	
	private String cookieID;
	private String date;

	public Cookie(String cookieID, String date) {
		this.cookieID = cookieID;
		this.date = date;
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
	
	//Returns true or false
	//Compares whether or not a cookie has a desired date
	public boolean sameDate(String givenDate) {
		return this.date.equals(givenDate);
	}
	
	//Overloading for any string
	public static int dateToInt(String date) {
		int year = Integer.parseInt(date.substring(0, 4));
		int month = Integer.parseInt(date.substring(5, 7));
		int day = Integer.parseInt(date.substring(8, 10));
		return (year*10000) + (month*100) + (day*1);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cookieID == null) ? 0 : cookieID.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cookie other = (Cookie) obj;
		if (cookieID == null) {
			if (other.cookieID != null)
				return false;
		} else if (!cookieID.equals(other.cookieID))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		return true;
	}

	public String getID() {
		return this.cookieID;
	}
	
	public String toString() {
		return cookieID + " " + date + " " + dateToInt(this.date);
	}
	

}

