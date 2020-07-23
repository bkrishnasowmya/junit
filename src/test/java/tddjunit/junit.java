package tddjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class junit {

	@Test
	void test4char() {
		tddjuint junit = new tddjuint();
		String result = junit.remove("ABCD");
		assertEquals("BCD",result);
	}
	@Test
	void test1char() {
		tddjuint junit = new tddjuint();
		String result = junit.remove("AACD");
		assertEquals("CD",result);
	}
	@Test
	void test2char() {
		tddjuint junit = new tddjuint();
		String result = junit.remove("BACD");
		assertEquals("BCD",result);
	}
	@Test
	void test3char() {
		tddjuint junit = new tddjuint();
		String result = junit.remove("BBAA");
		assertEquals("BBAA",result);
	}
	@Test
	void test5char() {
		tddjuint junit = new tddjuint();
		String result = junit.remove("AABAA");
		assertEquals("BAA",result);
	}

}
