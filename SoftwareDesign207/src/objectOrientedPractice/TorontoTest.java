package objectOrientedPractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TorontoTest {

	@Test
	void testMayor() {
		Toronto the6 = new Toronto(416);
		assertEquals("John Tory", the6.getMayor());
	}
	
	@Test
	void testWeather() {
		Toronto the66 = new Toronto(76);
		assertEquals(76, the66.getWeather());
	}

}
