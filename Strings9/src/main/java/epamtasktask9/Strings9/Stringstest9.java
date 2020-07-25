package epamtasktask9.Strings9;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
 public class Stringstest9
{
	@Test
	public void test1() {
		Strings9 stringclass = new Strings9();
		String actual = stringclass.m("AA");
		assertEquals("",actual);
	}
	@Test
	public void test2() {
		Strings9 stringclass = new Strings9();
		String actual = stringclass.m("ACD");
		assertEquals("CD",actual);
	}
	@Test
	public void test3() {
		Strings9 stringclass = new Strings9();
		String actual = stringclass.m("BBCD");
		assertEquals("BBCD",actual);
	}
	@Test
	public void test4() {
		Strings9 stringclass = new Strings9();
		String actual = stringclass.m("BBA");
		assertEquals("BBA",actual);
	}
	@Test
	public void test5() {
		Strings9 stringclass = new Strings9();
		String actual = stringclass.m("AABAA");
		assertEquals("BAA",actual);
	}
	
	@Test
	public void test6() {
		Strings9 stringclass = new Strings9();
		String actual = stringclass.m("A");
		assertEquals("",actual);
	}
	@Test
	public void test7() {
		Strings9 stringclass = new Strings9();
		String actual = stringclass.m("");
		assertEquals("",actual);
	}
	
}
