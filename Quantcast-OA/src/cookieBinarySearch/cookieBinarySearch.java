package cookieBinarySearch;

import java.util.List;

import cookie.Cookie;

public class cookieBinarySearch {

	//returns the index of the cookie date we are looking for, returns -1 if the date does not exist
	//this returns the "left" most item in the array.
	//This way, it becomes easy to find the max.
	public static int binarySearch(List<Cookie> list, String date) {
		int desiredDate = Cookie.dateToInt(date);
		int left = 0;
		int right = list.size() - 1;
		while (left < right) {
			int mid = left + (right - left) / 2;
//			if (list.get(mid).dateToInt() == desiredDate) {
//				return mid;
//			}
				
			if (list.get(mid).dateToInt() <= desiredDate) {
				right = mid-1;
			} else {
				left = mid+1;
			}
		}
		
		if (list.get(left).dateToInt() == desiredDate) {
			return left;
		}
		
		
		return -1;
	}

}
