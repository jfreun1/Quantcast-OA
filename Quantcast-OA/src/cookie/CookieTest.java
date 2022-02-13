package cookie;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CookieTest {

	@Test
	void dateToIntTest() {
		//Make sure that the date's are converting as expected
		String date1 = "2018-12-08";
		int expected1= 20181208;
		assertEquals(Cookie.dateToInt(date1), expected1);
		
		String date2 = "1999-12-31";
		int expected2 = 19991231;
		assertEquals(Cookie.dateToInt(date2), expected2);
		
		String date3 = "2022-02-28";
		int expected3 = 20220228;
		assertEquals(Cookie.dateToInt(date3), expected3);
	}
	
	
	
	@Test
	void cookieOrder() {
		//make sure that if data(A) > date(B), then the intValue(A) > intValue(B)
		String dateA = "2022-02-28";
		String dateB = "2022-02-27";
		assertTrue(Cookie.dateToInt(dateA) > Cookie.dateToInt(dateB));
		
		dateA = "2022-02-02";
		dateB = "2022-02-01";
		assertTrue(Cookie.dateToInt(dateA) > Cookie.dateToInt(dateB));
		
		dateA = "2022-02-01";
		dateB = "2022-01-01";
		assertTrue(Cookie.dateToInt(dateA) > Cookie.dateToInt(dateB));
		
		dateA = "2022-02-02";
		dateB = "2021-02-02";
		assertTrue(Cookie.dateToInt(dateA) > Cookie.dateToInt(dateB));
		
	}

}
