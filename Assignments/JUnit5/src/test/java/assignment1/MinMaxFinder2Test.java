package assignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class MinMaxFinder2Test {
	
	MinMaxFinder2 minmaxfinder1;
	
	@BeforeEach
	void init(){
		minmaxfinder1 = new MinMaxFinder2();
	}
@Nested
class minmaxfinderSingleObject{	
	
	@Test
	void testMinMaxWithSingleObjectAllPositive() {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		String actual = minmaxfinder1.findMinMax(array);
		assertEquals("max"+10+"min"+1,actual);
		
		
	}
@Test
void testMinMaxWithSingleObjectAllNegative() {
	int[] array = {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
	String actual = minmaxfinder1.findMinMax(array);
	assertEquals("max"+-1+"min"+-10,actual);
	
	
}
@Test
void testMinMaxWithSingleObjectAllpositiveWithZero() {
	int[] array = {0,1,2,3,4,5,6,7,8,9,10};
	String actual = minmaxfinder1.findMinMax(array);
	assertEquals("max"+10+"min"+0,actual);
	
	
}
@Test
void testMinMaxWithSingleObjectAllNegativeWithZero() {
	int[] array = {0,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
	String actual = minmaxfinder1.findMinMax(array);
	assertEquals("max"+0+"min"+-10,actual);
	
	
}
@Test
void testMinMaxWithSingleObjectPositiveAndNegative() {
	int[] array = {-1,2,3,4,-5,6,7,-8,9,-10};
	String actual = minmaxfinder1.findMinMax(array);
	assertEquals("max"+9+"min"+-10,actual);
	
	
}
}
}
