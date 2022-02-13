package max;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import cookie.Cookie;

import org.junit.jupiter.api.Test;

class MaxOccurenceTest {

	@Test
	void testEmpty() {
		List<Cookie> emptyList = MaxOccurence.maxOccurence(new ArrayList<Cookie>(), 0, "2022-02-12");
		assertEquals(emptyList.size(), 0);
		
	}
	
	@Test
	void itemNotInList() {
		List<Cookie> myList = new ArrayList<>();
		myList.add(new Cookie("A", "2018-05-02"));
		myList.add(new Cookie("B", "2018-04-03"));
		myList.add(new Cookie("C", "2018-03-02"));
		myList.add(new Cookie("D", "2018-02-22"));
		myList.add(new Cookie("E", "2017-11-02"));
		myList.add(new Cookie("F", "2012-01-02"));
		
		List<Cookie> result =  MaxOccurence.maxOccurence(new ArrayList<Cookie>(), 0, "2022-02-12");
		assertEquals(result.size(), 0);
		
		result =  MaxOccurence.maxOccurence(new ArrayList<Cookie>(), 0, "2018-05-03");
		assertEquals(result.size(), 0);
		
	}
	
	@Test
	void oneItemInTheList() {
		List<Cookie> myList = new ArrayList<>();
		myList.add(new Cookie("A", "2018-05-02"));
		myList.add(new Cookie("B", "2018-04-03"));
		myList.add(new Cookie("C", "2018-03-02"));
		myList.add(new Cookie("D", "2018-02-22"));
		myList.add(new Cookie("E", "2017-11-02"));
		myList.add(new Cookie("F", "2012-01-02"));
		
		List<Cookie> result =  MaxOccurence.maxOccurence(myList, 0, "2018-05-02");
		assertEquals(result.size(), 1);
		assertTrue(result.get(0).equals(new Cookie("A", "2018-05-02")));
	
		result = MaxOccurence.maxOccurence(myList, 5, "2012-01-02");
		assertEquals(result.size(), 1);
//		assertTrue(result.get(0).equals(new Cookie("F", "2012-01-02")));
		
		
	}

}
