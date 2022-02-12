package max;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import cookie.Cookie;;

public class MaxOccurence {
	
	//returns a list of all the max occurences
	//if the start time is bad or their are no occurences, we return an empty
	public static List<Cookie> maxOccurence(List<Cookie> list, int start, String date) {
		int endOfList = list.size();
		Map<Cookie, Integer> cookieOccurenceTable = new HashMap<>();
		if (start < 0) {
			return new ArrayList<>();
		}
		//add the occurences to a hashmap frequency table
		for (int i = start; i < endOfList && list.get(i).sameDate(date); i++) {
			if (cookieOccurenceTable.containsKey(list.get(i))) {
				int oldOccurence = cookieOccurenceTable.get(list.get(i));
				cookieOccurenceTable.put(list.get(i), oldOccurence+1);
			} else {
				cookieOccurenceTable.put(list.get(i), 1);
			}
		}
		
		//We need to find the max occurence in one pass
		int maxOccurence = 0;
		for (Integer occurence : cookieOccurenceTable.values()) {
			maxOccurence = Math.max(maxOccurence, occurence.intValue());
       }
		
		//then add everything that has that occurence to our list
		List<Cookie> listOfMaxCookies = new ArrayList<Cookie>();
		for (Entry<Cookie, Integer> pair : cookieOccurenceTable.entrySet()) {
			if (pair.getValue().equals(maxOccurence)) {
				listOfMaxCookies.add(pair.getKey());
			}
		}
		
		return listOfMaxCookies;
	}

}
