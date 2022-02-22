package assignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class Question4Test {
	Question4 question4;
	
	@BeforeAll
	void beforeAll(){
		System.out.println("Runs first before anything in this class");
	}
	
	@AfterAll
	void afterAll() {
		System.out.println("Runs After running all the methods in this class");
	}
	
	@BeforeEach  //can be used to create instance for testing class as it runs before every method of this class
	void init() {
		question4 = new Question4();
	}
	@AfterEach
	void init1() {
		System.out.println("It runs after every method in this class");
	}
	
	@Test
	void testAddition() {
		assertAll(
				() -> assertEquals(6,question4.addition(2, 4)),
				() -> assertEquals(1,question4.addition(6, -5)),
				() -> assertEquals(-9,question4.addition(-4, -5)),
				() -> assertEquals(-117,question4.addition(6, -123)),
				() -> assertEquals(-6,question4.addition(-6, 0))
				);	
	}
	
	@Test
	void testSubtraction() {
		assertAll(
					() -> assertEquals(-5,question4.subtraction(-4, 1)),
					() -> assertEquals(-1,question4.subtraction(-56, -55)),
					() -> assertEquals(-20,question4.subtraction(12, 32)),
					() -> assertEquals(5,question4.subtraction(4, -1)),
					() -> assertEquals(-56,question4.subtraction(0, 56))
				);
	}

}
