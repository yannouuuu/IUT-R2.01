package tpQU.tp02.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tpQU.tp02.WarriorCard;

public class WarriorCardTest {
	WarriorCard c1;
	WarriorCard c2;
	WarriorCard c3;
	WarriorCard c4;

	@BeforeAll
	public static void beforeAllTests() {System.out.println("Start test series");}
	@AfterAll
	public static void afterAllTests() {System.out.println("End test series");}
	@BeforeEach
	public void beforeATest() {
		c1 = new WarriorCard("w1", 10, 10);
		c2 = new WarriorCard("w1", 5, 5);
		c3 = new WarriorCard("w2", 20, 20);
		c4 = c1;
	}
	@AfterEach
	public void afterATest() {System.out.println("--------- end of a test---------");}
	@Test
	public void testEquals() {
		System.out.println("testEquals");
		assertTrue(c1.equals(c1));
		assertTrue(c1.equals(c2));
		assertFalse(c1.equals(c3));
		assertTrue(c1.equals(c4));
	}
	@Test
	public void testToString() {
		System.out.println("testToString");
		assertEquals("w1[S=10,A=10]", c1.toString());
		assertEquals("w2[S=20,A=20]", c3.toString());
	}

}