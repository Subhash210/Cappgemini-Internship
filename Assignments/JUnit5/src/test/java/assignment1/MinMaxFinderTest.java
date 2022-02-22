package assignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class MinMaxFinderTest {
	
	MinMaxFinder mmFind;
	
	@BeforeEach
	void init(){
		
	}
	@Nested
	class MaxMinFinder{
	@Test
	@DisplayName("Tesing for all positive values")
	void test1MaxMinFinder() {
		mmFind = new MinMaxFinder();
		int[] array1= {1,2,3,4,5,6,7,8,9};
		int[] actual =  mmFind.findMinMax(array1);
		int [] expected = {1,9};
		assertArrayEquals(expected,actual);
	}
	@Test
	@DisplayName("Tesing for all positive values and zero")
	void test2MaxMinFinder() {
		mmFind = new MinMaxFinder();
		int[] array1= {1,2,3,4,0,6,7,8,56};
		int[] actual =  mmFind.findMinMax(array1);
		int [] expected = {0,56};
		assertArrayEquals(expected,actual);
	}
	@Test
	@DisplayName("Tesing for Positive and Negative values")
	void test3MaxMinFinder() {
		mmFind = new MinMaxFinder();
		int[] array1= {-1,-2,3,4,5,6,7,8,9};
		int[] actual =  mmFind.findMinMax(array1);
		int [] expected = {-2,9};
		assertArrayEquals(expected,actual);
	}
	@Test
	@DisplayName("Tesing for only negative values")
	void test4MaxMinFinder() {
		mmFind = new MinMaxFinder();
		int[] array1= {-1,-2,-3,-4,-5,-6,-7,-8,-9};
		int[] actual =  mmFind.findMinMax(array1);
		int [] expected = {-9,-1};
		assertArrayEquals(expected,actual);
	}
	@Test
	@DisplayName("Tesing for Negative values with zero")
	void test5MaxMinFinder() {
		mmFind = new MinMaxFinder();
		int[] array1= {0,-2,-3,-4,-5,-6,-7,-8,-9};
		int[] actual =  mmFind.findMinMax(array1);
		int [] expected = {-9,0};
		assertArrayEquals(expected,actual);
	}
	}
	
}
