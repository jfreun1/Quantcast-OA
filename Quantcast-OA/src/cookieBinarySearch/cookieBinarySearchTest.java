package cookieBinarySearch;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import cookie.Cookie;


import org.junit.jupiter.api.Test;

class cookieBinarySearchTest {

	@Test
	void binarySearchTest1() {
		List<Cookie> myList = new ArrayList<>();
		myList.add(new Cookie("A", "2018-05-02"));
		myList.add(new Cookie("B", "2018-04-03"));
		myList.add(new Cookie("C", "2018-03-02"));
		myList.add(new Cookie("D", "2018-02-22"));
		myList.add(new Cookie("E", "2017-11-02"));
		myList.add(new Cookie("F", "2012-01-02"));
		
		assertEquals(cookieBinarySearch.binarySearch(myList, "2012-01-02"), 5);
		assertEquals(cookieBinarySearch.binarySearch(myList, "2018-05-02"), 0);
		assertEquals(cookieBinarySearch.binarySearch(myList, "2018-05-01"), -1);
		assertEquals(cookieBinarySearch.binarySearch(myList, "2018-04-04"), -1);

		
	}
	
	@Test
	void binarySearchTest2() {
		
		//Testing if they are the same date
		List<Cookie> myList = new ArrayList<>();
		myList.add(new Cookie("A", "2018-05-02"));
		myList.add(new Cookie("B", "2018-05-02"));
		myList.add(new Cookie("C", "2018-05-02"));
		myList.add(new Cookie("D", "2018-05-02"));
		myList.add(new Cookie("E", "2018-05-02"));
		myList.add(new Cookie("F", "2018-05-02"));
		
		assertEquals(cookieBinarySearch.binarySearch(myList, "2018-05-02"), 0);
		assertEquals(cookieBinarySearch.binarySearch(myList, "2018-05-03"), -1);
		assertEquals(cookieBinarySearch.binarySearch(myList, "2018-05-01"), -1);
		assertEquals(cookieBinarySearch.binarySearch(myList, "2018-04-04"), -1);

	}
	
	@Test
	void binarySearchTest3() {
		
		//Testing if they are the same date
		List<Cookie> myList = new ArrayList<>();
		myList.add(new Cookie("A", "2018-05-04"));
		myList.add(new Cookie("B", "2018-05-04"));
		myList.add(new Cookie("C", "2018-05-04"));
		myList.add(new Cookie("D", "2018-05-04"));
		myList.add(new Cookie("E", "2018-05-04"));
		myList.add(new Cookie("F", "2018-05-04"));
		
		myList.add(new Cookie("G", "2018-05-03"));
		myList.add(new Cookie("H", "2018-05-03"));
		myList.add(new Cookie("I", "2018-05-03"));
		myList.add(new Cookie("J", "2018-05-03"));
		myList.add(new Cookie("K", "2018-05-03"));
		
		myList.add(new Cookie("L", "2018-05-02"));
		
		assertEquals(cookieBinarySearch.binarySearch(myList, "2018-05-02"), 11);
		assertEquals(cookieBinarySearch.binarySearch(myList, "2018-05-03"), 6);
		assertEquals(cookieBinarySearch.binarySearch(myList, "2018-05-04"), 0);
		assertEquals(cookieBinarySearch.binarySearch(myList, "2018-04-05"), -1);
		assertEquals(cookieBinarySearch.binarySearch(myList, "2019-04-02"), -1);


		
	}

}
